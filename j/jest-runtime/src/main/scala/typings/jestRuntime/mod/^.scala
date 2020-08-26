package typings.jestRuntime.mod

import typings.jestEnvironment.mod.JestEnvironment
import typings.jestHasteMap.mod.ModuleMap
import typings.jestRuntime.anon.Console
import typings.jestRuntime.anon.Recordcacheconfigdebugver
import typings.jestTypes.configMod.Argv
import typings.jestTypes.configMod.ProjectConfig
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-runtime", JSImport.Namespace)
@js.native
class ^ protected () extends Runtime {
  def this(config: ProjectConfig, environment: JestEnvironment, resolver: typings.jestResolve.mod.^) = this()
  def this(
    config: ProjectConfig,
    environment: JestEnvironment,
    resolver: typings.jestResolve.mod.^,
    cacheFS: Record[String, String]
  ) = this()
  def this(
    config: ProjectConfig,
    environment: JestEnvironment,
    resolver: typings.jestResolve.mod.^,
    cacheFS: js.UndefOr[scala.Nothing],
    coverageOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ShouldInstrumentOptions */ js.Any
  ) = this()
  def this(
    config: ProjectConfig,
    environment: JestEnvironment,
    resolver: typings.jestResolve.mod.^,
    cacheFS: Record[String, String],
    coverageOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ShouldInstrumentOptions */ js.Any
  ) = this()
}

@JSImport("jest-runtime", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var shouldInstrument: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof shouldInstrument */ js.Any = js.native
  def createContext(config: ProjectConfig, options: Console): js.Promise[typings.jestRuntime.typesMod.Context] = js.native
  def createHasteMap(config: ProjectConfig): typings.jestHasteMap.mod.^ = js.native
  def createHasteMap(config: ProjectConfig, options: HasteMapOptions): typings.jestHasteMap.mod.^ = js.native
  def createResolver(config: ProjectConfig, moduleMap: ModuleMap): typings.jestResolve.mod.^ = js.native
  def getCLIOptions(): Recordcacheconfigdebugver = js.native
  def runCLI(): js.Promise[Unit] = js.native
  def runCLI(args: js.UndefOr[scala.Nothing], info: js.Array[String]): js.Promise[Unit] = js.native
  def runCLI(args: Argv): js.Promise[Unit] = js.native
  def runCLI(args: Argv, info: js.Array[String]): js.Promise[Unit] = js.native
}

