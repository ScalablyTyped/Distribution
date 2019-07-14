/**
 * Generates bloop project files for all libraries which compiles
 *  for the current version of ScalablyTyped.
 *
 * After generation you can say something like this:
 *  `ls .bloop/ -1|cut -d. -f1|xargs bloop compile --pipeline`
 *  to compile all libraries.
 *
 * Note: This script is written with ammonite 1.6.9 for scala *2.12*.
 *
 * 2.12 is necessary to use bloop libraries. If you follow the default
 *  instructions on ammonite.io you'll get 2.13, you'll need to change
 *  the version number in the installation command yourself.
 */

import $ivy.`ch.epfl.scala::bloop-backend:1.3.2`, bloop.io.AbsolutePath
import $ivy.`ch.epfl.scala::bloop-config:1.3.2`, bloop.config
import $ivy.`ch.epfl.scala::bloop-frontend:1.3.2`, bloop._
import ammonite.ops._

import concurrent.ExecutionContext.Implicits.global
import collection.mutable

object utils {
  val Quote = '"'.toString

  def unquote(str: String) =
    if (str.startsWith(Quote) && str.endsWith(Quote)) str.drop(1).dropRight(1) else str

  def quote(str: String) =
    if (str.startsWith(Quote) && str.endsWith(Quote)) str else s"$Quote$str$Quote"
}

import utils._

class FileLayout(val base: os.Path) {
  val bloop = base / ".bloop"

  /* luckily it's not as if we're leaking implementation details in the public json file */
  val allLibraries: Seq[os.Path] = {
    val arr = ujson.read(os.read(os.pwd / "summary.json"))("successes").arr
    arr.map {
      case ujson.Obj(x) =>
        if (x.get("TsIdentLibrarySimple").isDefined) x("TsIdentLibrarySimple")("value").str
        else s"${x("TsIdentLibraryScoped")("scope").str}__${x("TsIdentLibraryScoped")("nameOpt").str}"
    }.map(x => x.replaceAllLiterally(".", "_dot_")).sorted.map(pathFor)
  }

  def libNameFor(p: os.Path): String =
    if (p.segments.contains("facades")) s"${p.last}-facade" else p.last

  def pathFor(libName: String) = {
    if (libName.endsWith("-facade")) base / 'facades / libName.dropRight("-facade".length)
    else base / libName.take(1) / libName
  }
}

trait Versions {
  val scalaVersion: String
  val binVersion: String
  val scalaJsVersion: String
  val scalaJsBinVersion: String

  final def s(artifact: String): String =
    s"${artifact}_$binVersion"

  final def sjs(artifact: String): String =
    s"${artifact}_sjs${scalaJsBinVersion}_$binVersion"

  lazy val scala = Dep("org.scala-lang", "scala-compiler", "scala-compiler", scalaVersion)
  lazy val scalaJs = Dep("org.scala-js", "scalajs-library", s("scalajs-library"), scalaJsVersion)
  lazy val scalaJsCompiler = Dep("org.scala-js", "scalajs-compiler", s"scalajs-compiler_${scalaVersion}", scalaJsVersion)
  lazy val runtime = Dep("com.olvind", "scalablytyped-runtime", sjs("scalablytyped-runtime"), "2.1.0")

  val scalacOptions: List[String]
}

object version212 extends Versions {
  val scalaVersion = "2.12.8"
  val scalaJsVersion = "0.6.28"
  val binVersion = "2.12"
  val scalaJsBinVersion = "0.6"
  val scalacOptions = List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
}

/* everything except facades should compile under 2.12 and scala.js 1.0.0-M8 */
object version212_scalajs_1 extends Versions {
  val scalaVersion = "2.12.8"
  val scalaJsVersion = "1.0.0-M8"
  val binVersion = "2.12"
  val scalaJsBinVersion = "1.0.0-M8"
  val scalacOptions = List("-g:notailcalls")
}

/* everything except japgolly facades should compile under 2.13 */
object version213 extends Versions {
  val scalaVersion = "2.13.0"
  val scalaJsVersion = "0.6.28"
  val binVersion = "2.13"
  val scalaJsBinVersion = "0.6"
  val scalacOptions = List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
}

val version = version212

case class Dep(org: String, name: String, artifact: String, version: String)

/**
 * @param scalaVersion  not used
 * @param scalacOptions not used
 */
case class Project(libDir: os.Path, self: Dep, scalaVersion: String, deps: Seq[Dep], scalacOptions: Seq[String])

object Project {
  def parseSbtProjectIn(libDir: os.Path): Project = {
    val lines = os.read(libDir / "build.sbt").split("\n")
    val v = lines.map(_.split(":=|\\+\\+=|\\+=")).collect { case Array(key, value) => key.trim -> unquote(value.trim) }.toMap

    val deps = lines.map(_.split("%").filter(_.nonEmpty)).collect {
      case Array(org, n, v) =>
        val name = unquote(n.trim)
        Dep(unquote(org.trim), name, version.sjs(name), unquote(v.trim.dropRight(1)))
    }
    val scalacOptions = v("scalacOptions").dropWhile(_ != '"').dropRight(1).split(",").map(str => unquote(str.trim))

    val name = v("name")
    Project(libDir, Dep(v("organization"), name, version.sjs(name), v("version")), v("scalaVersion"), deps, scalacOptions)
  }
}

object Resolve {
  val bloopLogger = logging.BloopLogger.at(
    name = "logger",
    out = System.out,
    err = System.err,
    isVerbose = true,
    colorOutput = true,
    filter = logging.DebugFilter.All
  )

  private val cache = mutable.Map.empty[Dep, Array[AbsolutePath]]

  def apply(dep: Dep) =
    cache.getOrElseUpdate(
      dep,
      DependencyResolution.resolve(dep.org, dep.artifact, dep.version, bloopLogger)
    )
}

val scalaCompilerJars: Array[AbsolutePath] =
  Resolve(version.scala)

val globalClasspath: Array[AbsolutePath] =
  Array(
    scalaCompilerJars.collect { case path if path.underlying.toString.contains("scala-library") => path },
    Resolve(version.scalaJs),
    Resolve(version.runtime)
  ).flatten

val scalaJsCompilerJar =
  Resolve(version.scalaJsCompiler).collectFirst { case f if f.syntax.contains("scalajs-compiler") => f }.head

def bloopFileFor(layout: FileLayout, p: Project): config.Config.File = {
  def classesDirFor(path: os.Path) =
    (path / 'target / s"scala-${version.binVersion}" / 'classes).toNIO

  val (internal, external) = p.deps.partition(_.org == "org.scalablytyped")

  val classpath = {
    val fromGlobal = globalClasspath.map(_.underlying)
    val fromExternal = external.flatMap(Resolve.apply).map(_.underlying)
    val fromInternal = internal.map(d => classesDirFor(layout.pathFor(d.name)))
    fromGlobal.toList ++ fromExternal ++ fromInternal
  }
  config.Config.File(
    "1.3.2",
    config.Config.Project(
      name = p.self.name,
      directory = p.libDir.toNIO,
      sources = (p.libDir / 'src / 'main / 'scala).toNIO :: Nil,
      dependencies = internal.map(_.name).toList,
      classpath = classpath,
      out = (p.libDir / 'target).toNIO,
      classesDir = classesDirFor(p.libDir),
      resources = None,
      scala = Some(
        config.Config.Scala(
          organization = version.scala.org,
          name = version.scala.name,
          version = version.scala.version,
          options = List("-Xplugin:" + scalaJsCompilerJar.syntax) ++ version.scalacOptions,
          jars = scalaCompilerJars.toList.map(_.underlying),
          analysis = None,
          setup = None,
        ),
      ),
      java = None,
      sbt = None,
      test = None,
      platform = None,
      resolution = None,
    ),
  )
}

val layout = new FileLayout(os.pwd)
println(s"Generating files for ${layout.allLibraries.length} libraries")

os.remove.all(layout.bloop)
os.makeDir(layout.bloop)

layout.allLibraries.map {
  libPath =>
    val project = Project.parseSbtProjectIn(libPath)
    val bloopConfig = bloopFileFor(layout, project)
    config.write(bloopConfig, (layout.bloop / (layout.libNameFor(libPath) + ".json")).toNIO)
}
