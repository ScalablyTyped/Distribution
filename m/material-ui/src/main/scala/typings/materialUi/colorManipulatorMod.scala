package typings.materialUi

import typings.materialUi.MaterialUI.Utils.ColorManipulator.MuiColorObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorManipulatorMod {
  
  @JSImport("material-ui/utils/colorManipulator", "convertColorToString")
  @js.native
  def convertColorToString(color: js.Any): String = js.native
  
  @JSImport("material-ui/utils/colorManipulator", "convertHexToRGB")
  @js.native
  def convertHexToRGB(color: String): String = js.native
  
  @JSImport("material-ui/utils/colorManipulator", "darken")
  @js.native
  def darken(color: String, coefficient: Double): String = js.native
  
  @JSImport("material-ui/utils/colorManipulator", "decomposeColor")
  @js.native
  def decomposeColor(color: String): MuiColorObject = js.native
  
  @JSImport("material-ui/utils/colorManipulator", "emphasize")
  @js.native
  def emphasize(color: String): String = js.native
  @JSImport("material-ui/utils/colorManipulator", "emphasize")
  @js.native
  def emphasize(color: String, coefficient: Double): String = js.native
  
  @JSImport("material-ui/utils/colorManipulator", "fade")
  @js.native
  def fade(color: String, value: Double): String = js.native
  
  @JSImport("material-ui/utils/colorManipulator", "getContrastRatio")
  @js.native
  def getContrastRatio(foreground: String, background: String): Double = js.native
  
  @JSImport("material-ui/utils/colorManipulator", "getLuminance")
  @js.native
  def getLuminance(color: String): Double = js.native
  
  @JSImport("material-ui/utils/colorManipulator", "lighten")
  @js.native
  def lighten(color: String, coefficient: Double): String = js.native
}
