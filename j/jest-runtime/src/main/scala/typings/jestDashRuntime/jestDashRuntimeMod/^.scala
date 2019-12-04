package typings.jestDashRuntime.jestDashRuntimeMod

import typings.atJestEnvironment.atJestEnvironmentMod.JestEnvironment
import typings.atJestTypes.buildConfigMod.Argv
import typings.atJestTypes.buildConfigMod.Path
import typings.atJestTypes.buildConfigMod.ProjectConfig
import typings.jestDashHasteDashMap.jestDashHasteDashMapMod.ModuleMap
import typings.jestDashRuntime.Anon_Console
import typings.jestDashRuntime.jestDashRuntimeStrings.cache
import typings.jestDashRuntime.jestDashRuntimeStrings.config
import typings.jestDashRuntime.jestDashRuntimeStrings.debug
import typings.jestDashRuntime.jestDashRuntimeStrings.version
import typings.jestDashRuntime.jestDashRuntimeStrings.watchman
import typings.std.Record
import typings.yargs.yargsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-runtime", JSImport.Namespace)
@js.native
class ^ protected () extends Runtime {
  def this(
    config: ProjectConfig,
    environment: JestEnvironment,
    resolver: typings.jestDashResolve.jestDashResolveMod.^
  ) = this()
  def this(
    config: ProjectConfig,
    environment: JestEnvironment,
    resolver: typings.jestDashResolve.jestDashResolveMod.^,
    cacheFS: CacheFS
  ) = this()
  def this(
    config: ProjectConfig,
    environment: JestEnvironment,
    resolver: typings.jestDashResolve.jestDashResolveMod.^,
    cacheFS: CacheFS,
    coverageOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ShouldInstrumentOptions */ js.Any
  ) = this()
}

@JSImport("jest-runtime", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var ScriptTransformer: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ScriptTransformer */ js.Any = js.native
  def createContext(config: ProjectConfig, options: Anon_Console): js.Promise[typings.jestDashRuntime.buildTypesMod.Context] = js.native
  def createHasteMap(config: ProjectConfig): typings.jestDashHasteDashMap.jestDashHasteDashMapMod.^ = js.native
  def createHasteMap(config: ProjectConfig, options: HasteMapOptions): typings.jestDashHasteDashMap.jestDashHasteDashMapMod.^ = js.native
  def createResolver(config: ProjectConfig, moduleMap: ModuleMap): typings.jestDashResolve.jestDashResolveMod.^ = js.native
  def getCLIOptions(): Record[cache | config | debug | version | watchman, Options] = js.native
  def runCLI(): Unit = js.native
  def runCLI(args: Argv): Unit = js.native
  def runCLI(args: Argv, info: js.Array[String]): Unit = js.native
  def shouldInstrument(
    filename: Path,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ShouldInstrumentOptions */ js.Any,
    config: ProjectConfig
  ): Boolean = js.native
}

