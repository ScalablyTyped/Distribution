package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This object contains all the properties of the Fill color setting of the Tools panel or of a selected shape. To retrieve a Fill object, use document.getCustomFill().
  */
trait FlashFill extends js.Object {
  var bitmapIsClipped: Boolean
  var bitmapPath: String
  /** Property; the color of the fill, in one of the following formats:
  	 * - A string in the format "#RRGGBB" or "#RRGGBBAA"
  	 * - A hexadecimal number in the format 0xRRGGBB
  	 * - An integer that represents the decimal equivalent of a hexadecimal number
  	 */
  var color: js.Any
  /** Property; an array of colors in the gradient, expressed as integers. This property is available only if the value of the fill.style property is either "radialGradient" or "linearGradient". See fill.style */
  var colorArray: js.Array[_]
  var focalPoint: Double
  var linearRGB: Boolean
  var matrix: FlashMatrix
  var overflow: String
  var posArray: js.Array[Double]
  var style: String
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
}

