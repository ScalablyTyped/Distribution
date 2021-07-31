package typings.materialUiCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorManipulatorMod {
  
  @JSImport("@material-ui/core/styles/colorManipulator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def convertHexToRGB(hex: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertHexToRGB")(hex.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def darken(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("darken")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def darken(color: String, coefficient: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("darken")(color.asInstanceOf[js.Any], coefficient.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def decomposeColor(color: String): ColorObject = ^.asInstanceOf[js.Dynamic].applyDynamic("decomposeColor")(color.asInstanceOf[js.Any]).asInstanceOf[ColorObject]
  
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
  def lighten(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("lighten")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def lighten(color: String, coefficient: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("lighten")(color.asInstanceOf[js.Any], coefficient.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def recomposeColor(color: ColorObject): String = ^.asInstanceOf[js.Dynamic].applyDynamic("recomposeColor")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def rgbToHex(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("rgbToHex")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.rgb
    - typings.materialUiCore.materialUiCoreStrings.rgba
    - typings.materialUiCore.materialUiCoreStrings.hsl
    - typings.materialUiCore.materialUiCoreStrings.hsla
  */
  trait ColorFormat extends StObject
  object ColorFormat {
    
    @scala.inline
    def hsl: typings.materialUiCore.materialUiCoreStrings.hsl = "hsl".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.hsl]
    
    @scala.inline
    def hsla: typings.materialUiCore.materialUiCoreStrings.hsla = "hsla".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.hsla]
    
    @scala.inline
    def rgb: typings.materialUiCore.materialUiCoreStrings.rgb = "rgb".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.rgb]
    
    @scala.inline
    def rgba: typings.materialUiCore.materialUiCoreStrings.rgba = "rgba".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.rgba]
  }
  
  trait ColorObject extends StObject {
    
    var `type`: ColorFormat
    
    var values: (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
  }
  object ColorObject {
    
    @scala.inline
    def apply(
      `type`: ColorFormat,
      values: (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
    ): ColorObject = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorObject]
    }
    
    @scala.inline
    implicit class ColorObjectMutableBuilder[Self <: ColorObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: ColorFormat): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
}
