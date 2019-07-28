package typings.materialDashUi

import typings.materialDashUi.underscoreUnderscoreMaterialUINs.UtilsNs.ColorManipulatorNs.MuiColorObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-ui/utils/colorManipulator", JSImport.Namespace)
@js.native
object utilsColorManipulatorMod extends js.Object {
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

