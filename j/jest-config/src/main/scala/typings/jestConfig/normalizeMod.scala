package typings.jestConfig

import typings.jestConfig.anon.HasDeprecationWarnings
import typings.jestTypes.configMod.Argv
import typings.jestTypes.configMod.GlobalConfig
import typings.jestTypes.configMod.InitialOptions
import typings.jestTypes.configMod.Path
import typings.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-config/build/normalize", JSImport.Namespace)
@js.native
object normalizeMod extends js.Object {
  
  def default(initialOptions: InitialOptions, argv: Argv): HasDeprecationWarnings = js.native
  def default(
    initialOptions: InitialOptions,
    argv: Argv,
    configPath: js.UndefOr[scala.Nothing],
    projectIndex: Double
  ): HasDeprecationWarnings = js.native
  def default(initialOptions: InitialOptions, argv: Argv, configPath: Null, projectIndex: Double): HasDeprecationWarnings = js.native
  def default(initialOptions: InitialOptions, argv: Argv, configPath: Path): HasDeprecationWarnings = js.native
  def default(initialOptions: InitialOptions, argv: Argv, configPath: Path, projectIndex: Double): HasDeprecationWarnings = js.native
  
  type AllOptions = ProjectConfig with GlobalConfig
}
