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
    val __obj = js.Dynamic.literal(hex = hex, hslString = hslString, hsla = hsla, hslaString = hslaString, rgbString = rgbString, rgba = rgba, rgbaString = rgbaString)
  
    __obj.asInstanceOf[Color]
  }
}

