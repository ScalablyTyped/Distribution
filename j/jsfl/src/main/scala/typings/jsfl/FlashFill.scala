package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object contains all the properties of the Fill color setting of the Tools panel or of a selected shape. To retrieve a Fill object, use document.getCustomFill().
  */
trait FlashFill extends StObject {
  
  var bitmapIsClipped: Boolean
  
  var bitmapPath: String
  
  /** Property; the color of the fill, in one of the following formats:
    * - A string in the format "#RRGGBB" or "#RRGGBBAA"
    * - A hexadecimal number in the format 0xRRGGBB
    * - An integer that represents the decimal equivalent of a hexadecimal number
    */
  var color: Any
  
  /** Property; an array of colors in the gradient, expressed as integers. This property is available only if the value of the fill.style property is either "radialGradient" or "linearGradient". See fill.style */
  var colorArray: js.Array[Any]
  
  var focalPoint: Double
  
  var linearRGB: Boolean
  
  var matrix: FlashMatrix
  
  var overflow: String
  
  var posArray: js.Array[Double]
  
  var style: String
}
object FlashFill {
  
  inline def apply(
    bitmapIsClipped: Boolean,
    bitmapPath: String,
    color: Any,
    colorArray: js.Array[Any],
    focalPoint: Double,
    linearRGB: Boolean,
    matrix: FlashMatrix,
    overflow: String,
    posArray: js.Array[Double],
    style: String
  ): FlashFill = {
    val __obj = js.Dynamic.literal(bitmapIsClipped = bitmapIsClipped.asInstanceOf[js.Any], bitmapPath = bitmapPath.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], colorArray = colorArray.asInstanceOf[js.Any], focalPoint = focalPoint.asInstanceOf[js.Any], linearRGB = linearRGB.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], posArray = posArray.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashFill]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlashFill] (val x: Self) extends AnyVal {
    
    inline def setBitmapIsClipped(value: Boolean): Self = StObject.set(x, "bitmapIsClipped", value.asInstanceOf[js.Any])
    
    inline def setBitmapPath(value: String): Self = StObject.set(x, "bitmapPath", value.asInstanceOf[js.Any])
    
    inline def setColor(value: Any): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorArray(value: js.Array[Any]): Self = StObject.set(x, "colorArray", value.asInstanceOf[js.Any])
    
    inline def setColorArrayVarargs(value: Any*): Self = StObject.set(x, "colorArray", js.Array(value*))
    
    inline def setFocalPoint(value: Double): Self = StObject.set(x, "focalPoint", value.asInstanceOf[js.Any])
    
    inline def setLinearRGB(value: Boolean): Self = StObject.set(x, "linearRGB", value.asInstanceOf[js.Any])
    
    inline def setMatrix(value: FlashMatrix): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    inline def setOverflow(value: String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setPosArray(value: js.Array[Double]): Self = StObject.set(x, "posArray", value.asInstanceOf[js.Any])
    
    inline def setPosArrayVarargs(value: Double*): Self = StObject.set(x, "posArray", js.Array(value*))
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
