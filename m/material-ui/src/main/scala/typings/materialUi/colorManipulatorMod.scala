package typings.materialUi

import typings.materialUi.MaterialUI.Utils.ColorManipulator.MuiColorObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorManipulatorMod {
  
  @JSImport("material-ui/utils/colorManipulator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def convertColorToString(color: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertColorToString")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def convertHexToRGB(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertHexToRGB")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def darken(color: String, coefficient: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("darken")(color.asInstanceOf[js.Any], coefficient.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def decomposeColor(color: String): MuiColorObject = ^.asInstanceOf[js.Dynamic].applyDynamic("decomposeColor")(color.asInstanceOf[js.Any]).asInstanceOf[MuiColorObject]
  
  @scala.inline
  def emphasize(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("emphasize")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def emphasize(color: String, coefficient: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("emphasize")(color.asInstanceOf[js.Any], coefficient.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def fade(color: String, value: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fade")(color.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getContrastRatio(foreground: String, background: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getContrastRatio")(foreground.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getLuminance(color: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getLuminance")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def lighten(color: String, coefficient: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("lighten")(color.asInstanceOf[js.Any], coefficient.asInstanceOf[js.Any])).asInstanceOf[String]
}
