package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This object contains all the properties of the Fill color setting of the Tools panel or of a selected shape. To retrieve a Fill object, use document.getCustomFill().
  */
trait FlashFill extends js.Object {
  var bitmapIsClipped: scala.Boolean
  var bitmapPath: java.lang.String
  /** Property; the color of the fill, in one of the following formats:
  	 * - A string in the format "#RRGGBB" or "#RRGGBBAA"
  	 * - A hexadecimal number in the format 0xRRGGBB
  	 * - An integer that represents the decimal equivalent of a hexadecimal number
  	 */
  var color: js.Any
  /** Property; an array of colors in the gradient, expressed as integers. This property is available only if the value of the fill.style property is either "radialGradient" or "linearGradient". See fill.style */
  var colorArray: js.Array[_]
  var focalPoint: scala.Double
  var linearRGB: scala.Boolean
  var matrix: FlashMatrix
  var overflow: java.lang.String
  var posArray: js.Array[scala.Double]
  var style: java.lang.String
}

