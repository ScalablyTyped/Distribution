package typings
package atIonicUtilsDashFsLib.utilsDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-fs", JSImport.Namespace)
@js.native
object utilsDashFsModMembers extends js.Object {
  val access: js.Function2[/* arg1 */ java.lang.String, /* arg2 */ scala.Double, stdLib.Promise[scala.Unit]] = js.native
  val mkdir: js.Function2[/* arg1 */ java.lang.String, /* arg2 */ scala.Double, stdLib.Promise[scala.Unit]] = js.native
  val open: js.Function2[
    /* arg1 */ java.lang.String, 
    /* arg2 */ java.lang.String, 
    stdLib.Promise[scala.Double]
  ] = js.native
  val readDir: js.Function1[/* arg1 */ java.lang.String, stdLib.Promise[js.Array[java.lang.String]]] = js.native
  val readFile: js.Function2[
    /* arg1 */ java.lang.String, 
    /* arg2 */ ReadFileOptions, 
    stdLib.Promise[java.lang.String]
  ] = js.native
  val stat: js.Function1[/* arg1 */ java.lang.String, stdLib.Promise[nodeLib.fsMod.Stats]] = js.native
  val unlink: js.Function1[/* arg1 */ java.lang.String, stdLib.Promise[scala.Unit]] = js.native
  val writeFile: js.Function3[
    /* arg1 */ java.lang.String, 
    /* arg2 */ js.Any, 
    /* arg3 */ WriteFileOptions, 
    stdLib.Promise[scala.Unit]
  ] = js.native
  def cacheFileChecksum(p: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def cacheFileChecksum(p: java.lang.String, checksum: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def compilePaths(filePath: java.lang.String): js.Array[java.lang.String] = js.native
  def copyDirectory(source: java.lang.String, destination: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def copyDirectory(source: java.lang.String, destination: java.lang.String, options: ncpLib.ncpMod.Options): stdLib.Promise[scala.Unit] = js.native
  def copyFile(fileName: java.lang.String, target: java.lang.String): stdLib.Promise[js.Object] = js.native
  def copyFile(fileName: java.lang.String, target: java.lang.String, mode: scala.Double): stdLib.Promise[js.Object] = js.native
  def fileToString(filePath: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def findBaseDirectory(dir: java.lang.String, file: java.lang.String): stdLib.Promise[js.UndefOr[java.lang.String]] = js.native
  def getFileChecksum(filePath: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def getFileChecksums(p: java.lang.String): stdLib.Promise[js.Tuple2[java.lang.String, js.UndefOr[java.lang.String]]] = js.native
  def isDir(p: java.lang.String): stdLib.Promise[scala.Boolean] = js.native
  def mkdirp(p: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def mkdirp(p: java.lang.String, mode: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def mkdirpSync(p: java.lang.String): scala.Unit = js.native
  def mkdirpSync(p: java.lang.String, mode: scala.Double): scala.Unit = js.native
  def pathAccessible(filePath: java.lang.String, mode: scala.Double): stdLib.Promise[scala.Boolean] = js.native
  def pathExists(filePath: java.lang.String): stdLib.Promise[scala.Boolean] = js.native
  def readDirSafe(dir: java.lang.String): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def readDirp(dir: java.lang.String): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def readDirp(dir: java.lang.String, hasFilterWalkerOptions: ReadDirROptions): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def readJsonFile(filePath: java.lang.String): stdLib.Promise[ScalablyTyped.runtime.StringDictionary[_]] = js.native
  def readJsonFile(filePath: java.lang.String, options: ReadFileOptions): stdLib.Promise[ScalablyTyped.runtime.StringDictionary[_]] = js.native
  def removeDirectory(dir: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def statSafe(p: java.lang.String): stdLib.Promise[js.UndefOr[nodeLib.fsMod.Stats]] = js.native
  def tmpfilepath(): java.lang.String = js.native
  def tmpfilepath(prefix: java.lang.String): java.lang.String = js.native
  def walk(p: java.lang.String): Walker = js.native
  def walk(p: java.lang.String, options: WalkerOptions): Walker = js.native
  def writeJsonFile(
    filePath: java.lang.String,
    json: ScalablyTyped.runtime.StringDictionary[js.Any],
    options: WriteFileOptions
  ): stdLib.Promise[scala.Unit] = js.native
  def writeStreamToFile(stream: nodeLib.NodeJSNs.ReadableStream, destination: java.lang.String): stdLib.Promise[_] = js.native
}

