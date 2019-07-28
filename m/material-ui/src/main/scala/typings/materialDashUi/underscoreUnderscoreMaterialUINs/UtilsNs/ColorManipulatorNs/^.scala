package typings.materialDashUi.underscoreUnderscoreMaterialUINs.UtilsNs.ColorManipulatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__MaterialUI.Utils.ColorManipulator")
@js.native
object ^ extends js.Object {
  def convertColorToString(color: js.Any): String = js.native
  def convertHexToRGB(color: String): String = js.native
  def darken(color: String, coefficient: Double): String = js.native
  def decomposeColor(color: String): MuiColorObject = js.native
  def emphasize(color: String): String = js.native
  def emphasize(color: String, coefficient: Double): String = js.native
  def fade(color: String, value: Double): String = js.native
  def getContrastRatio(foreground: String, background: String): Double = js.native
  def getLuminance(color: String): Double = js.native
  def lighten(color: String, coefficient: Double): String = js.native
}

