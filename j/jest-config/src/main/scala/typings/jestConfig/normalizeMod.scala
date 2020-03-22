package typings.jestConfig

import typings.jestTypes.configMod.Argv
import typings.jestTypes.configMod.GlobalConfig
import typings.jestTypes.configMod.InitialOptions
import typings.jestTypes.configMod.Path
import typings.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-config/build/normalize", JSImport.Namespace)
@js.native
object normalizeMod extends js.Object {
  def default(initialOptions: InitialOptions, argv: Argv): AnonHasDeprecationWarnings = js.native
  def default(initialOptions: InitialOptions, argv: Argv, configPath: Null, projectIndex: Double): AnonHasDeprecationWarnings = js.native
  def default(initialOptions: InitialOptions, argv: Argv, configPath: Path): AnonHasDeprecationWarnings = js.native
  def default(initialOptions: InitialOptions, argv: Argv, configPath: Path, projectIndex: Double): AnonHasDeprecationWarnings = js.native
  type AllOptions = ProjectConfig with GlobalConfig
}

