package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object contains all the properties of the Fill color setting of the Tools panel or of a selected shape. To retrieve a Fill object, use document.getCustomFill().
  */
@js.native
trait FlashFill extends js.Object {
  
  var bitmapIsClipped: Boolean = js.native
  
  var bitmapPath: String = js.native
  
  /** Property; the color of the fill, in one of the following formats:
    * - A string in the format "#RRGGBB" or "#RRGGBBAA"
    * - A hexadecimal number in the format 0xRRGGBB
    * - An integer that represents the decimal equivalent of a hexadecimal number
    */
  var color: js.Any = js.native
  
  /** Property; an array of colors in the gradient, expressed as integers. This property is available only if the value of the fill.style property is either "radialGradient" or "linearGradient". See fill.style */
  var colorArray: js.Array[_] = js.native
  
  var focalPoint: Double = js.native
  
  var linearRGB: Boolean = js.native
  
  var matrix: FlashMatrix = js.native
  
  var overflow: String = js.native
  
  var posArray: js.Array[Double] = js.native
  
  var style: String = js.native
}
object FlashFill {
  
  @scala.inline
  def apply(
    bitmapIsClipped: Boolean,
    bitmapPath: String,
    color: js.Any,
    colorArray: js.Array[_],
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
  implicit class FlashFillOps[Self <: FlashFill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBitmapIsClipped(value: Boolean): Self = this.set("bitmapIsClipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitmapPath(value: String): Self = this.set("bitmapPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: js.Any): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorArrayVarargs(value: js.Any*): Self = this.set("colorArray", js.Array(value :_*))
    
    @scala.inline
    def setColorArray(value: js.Array[_]): Self = this.set("colorArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocalPoint(value: Double): Self = this.set("focalPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinearRGB(value: Boolean): Self = this.set("linearRGB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatrix(value: FlashMatrix): Self = this.set("matrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflow(value: String): Self = this.set("overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosArrayVarargs(value: Double*): Self = this.set("posArray", js.Array(value :_*))
    
    @scala.inline
    def setPosArray(value: js.Array[Double]): Self = this.set("posArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
  }
}
