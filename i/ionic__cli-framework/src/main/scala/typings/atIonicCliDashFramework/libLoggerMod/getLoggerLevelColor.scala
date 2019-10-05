package typings.atIonicCliDashFramework.libLoggerMod

import typings.atIonicCliDashFramework.libColorsMod.ColorFunction
import typings.atIonicCliDashFramework.libColorsMod.Colors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/logger", "getLoggerLevelColor")
@js.native
object getLoggerLevelColor extends js.Object {
  def apply(colors: Colors): js.UndefOr[ColorFunction] = js.native
  def apply(colors: Colors, level: LoggerLevelWeight): js.UndefOr[ColorFunction] = js.native
}

