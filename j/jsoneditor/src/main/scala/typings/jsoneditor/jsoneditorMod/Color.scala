package typings.jsoneditor.jsoneditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var hex: String
  var hslString: String
  var hsla: js.Array[Double]
  var hslaString: String
  var rgbString: String
  var rgba: js.Array[Double]
  var rgbaString: String
}

object Color {
  @scala.inline
  def apply(
    hex: String,
    hslString: String,
    hsla: js.Array[Double],
    hslaString: String,
    rgbString: String,
    rgba: js.Array[Double],
    rgbaString: String
  ): Color = {
    val __obj = js.Dynamic.literal(hex = hex.asInstanceOf[js.Any], hslString = hslString.asInstanceOf[js.Any], hsla = hsla.asInstanceOf[js.Any], hslaString = hslaString.asInstanceOf[js.Any], rgbString = rgbString.asInstanceOf[js.Any], rgba = rgba.asInstanceOf[js.Any], rgbaString = rgbaString.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Color]
  }
}

