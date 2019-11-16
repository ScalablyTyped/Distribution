package typings.jestDashConfig

import typings.atJestTypes.buildConfigMod.Argv
import typings.atJestTypes.buildConfigMod.GlobalConfig
import typings.atJestTypes.buildConfigMod.InitialOptions
import typings.atJestTypes.buildConfigMod.Path
import typings.atJestTypes.buildConfigMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-config/build/normalize", JSImport.Namespace)
@js.native
object buildNormalizeMod extends js.Object {
  def default(options: InitialOptions, argv: Argv): Anon_HasDeprecationWarnings = js.native
  def default(options: InitialOptions, argv: Argv, configPath: Null, projectIndex: Double): Anon_HasDeprecationWarnings = js.native
  def default(options: InitialOptions, argv: Argv, configPath: Path): Anon_HasDeprecationWarnings = js.native
  def default(options: InitialOptions, argv: Argv, configPath: Path, projectIndex: Double): Anon_HasDeprecationWarnings = js.native
  type AllOptions = ProjectConfig with GlobalConfig
}

