package typings.atIonicCliDashFramework.libMod

import typings.atIonicCliDashFramework.libColorsMod.ColorFunction
import typings.atIonicCliDashFramework.libColorsMod.Colors
import typings.atIonicCliDashFramework.libLoggerMod.LoggerLevelWeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib", "getLoggerLevelColor")
@js.native
object getLoggerLevelColor extends js.Object {
  def apply(colors: Colors): js.UndefOr[ColorFunction] = js.native
  def apply(colors: Colors, level: LoggerLevelWeight): js.UndefOr[ColorFunction] = js.native
}

