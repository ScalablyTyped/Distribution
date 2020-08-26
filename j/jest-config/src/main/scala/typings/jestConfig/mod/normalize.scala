package typings.jestConfig.mod

import typings.jestConfig.anon.HasDeprecationWarnings
import typings.jestTypes.configMod.Argv
import typings.jestTypes.configMod.InitialOptions
import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-config", "normalize")
@js.native
object normalize extends js.Object {
  def apply(initialOptions: InitialOptions, argv: Argv): HasDeprecationWarnings = js.native
  def apply(
    initialOptions: InitialOptions,
    argv: Argv,
    configPath: js.UndefOr[scala.Nothing],
    projectIndex: Double
  ): HasDeprecationWarnings = js.native
  def apply(initialOptions: InitialOptions, argv: Argv, configPath: Null, projectIndex: Double): HasDeprecationWarnings = js.native
  def apply(initialOptions: InitialOptions, argv: Argv, configPath: Path): HasDeprecationWarnings = js.native
  def apply(initialOptions: InitialOptions, argv: Argv, configPath: Path, projectIndex: Double): HasDeprecationWarnings = js.native
}

