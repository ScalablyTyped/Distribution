package typings.jestRuntime.mod

import typings.jestEnvironment.mod.JestEnvironment
import typings.jestHasteMap.mod.ModuleMap
import typings.jestRuntime.anon.Console
import typings.jestRuntime.anon.Recordcacheconfigdebugver
import typings.jestTransform.typesMod.ShouldInstrumentOptions
import typings.jestTypes.configMod.Argv
import typings.jestTypes.configMod.Path
import typings.jestTypes.configMod.ProjectConfig
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    coverageOptions: ShouldInstrumentOptions
  ) = this()
  def this(
    config: ProjectConfig,
    environment: JestEnvironment,
    resolver: typings.jestResolve.mod.^,
    cacheFS: Record[String, String],
    coverageOptions: ShouldInstrumentOptions
  ) = this()
  def this(
    config: ProjectConfig,
    environment: JestEnvironment,
    resolver: typings.jestResolve.mod.^,
    cacheFS: js.UndefOr[scala.Nothing],
    coverageOptions: js.UndefOr[scala.Nothing],
    testPath: Path
  ) = this()
  def this(
    config: ProjectConfig,
    environment: JestEnvironment,
    resolver: typings.jestResolve.mod.^,
    cacheFS: js.UndefOr[scala.Nothing],
    coverageOptions: ShouldInstrumentOptions,
    testPath: Path
  ) = this()
  def this(
    config: ProjectConfig,
    environment: JestEnvironment,
    resolver: typings.jestResolve.mod.^,
    cacheFS: Record[String, String],
    coverageOptions: js.UndefOr[scala.Nothing],
    testPath: Path
  ) = this()
  def this(
    config: ProjectConfig,
    environment: JestEnvironment,
    resolver: typings.jestResolve.mod.^,
    cacheFS: Record[String, String],
    coverageOptions: ShouldInstrumentOptions,
    testPath: Path
  ) = this()
}
@JSImport("jest-runtime", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def createContext(config: ProjectConfig, options: Console): js.Promise[typings.jestRuntime.typesMod.Context] = js.native
  
  def createHasteMap(config: ProjectConfig): typings.jestHasteMap.mod.^ = js.native
  def createHasteMap(config: ProjectConfig, options: HasteMapOptions): typings.jestHasteMap.mod.^ = js.native
  
  def createResolver(config: ProjectConfig, moduleMap: ModuleMap): typings.jestResolve.mod.^ = js.native
  
  def getCLIOptions(): Recordcacheconfigdebugver = js.native
  
  def runCLI(): js.Promise[Unit] = js.native
  def runCLI(args: js.UndefOr[scala.Nothing], info: js.Array[String]): js.Promise[Unit] = js.native
  def runCLI(args: Argv): js.Promise[Unit] = js.native
  def runCLI(args: Argv, info: js.Array[String]): js.Promise[Unit] = js.native
  
  var shouldInstrument: js.Function3[
    /* filename */ Path, 
    /* options */ ShouldInstrumentOptions, 
    /* config */ ProjectConfig, 
    Boolean
  ] = js.native
}
