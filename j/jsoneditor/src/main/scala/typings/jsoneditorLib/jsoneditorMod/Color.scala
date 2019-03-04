package typings
package jsoneditorLib.jsoneditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var hex: java.lang.String
  var hslString: java.lang.String
  var hsla: js.Array[scala.Double]
  var hslaString: java.lang.String
  var rgbString: java.lang.String
  var rgba: js.Array[scala.Double]
  var rgbaString: java.lang.String
}

object Color {
  @scala.inline
  def apply(
    hex: java.lang.String,
    hslString: java.lang.String,
    hsla: js.Array[scala.Double],
    hslaString: java.lang.String,
    rgbString: java.lang.String,
    rgba: js.Array[scala.Double],
    rgbaString: java.lang.String
  ): Color = {
    val __obj = js.Dynamic.literal(hex = hex, hslString = hslString, hsla = hsla, hslaString = hslaString, rgbString = rgbString, rgba = rgba, rgbaString = rgbaString)
  
    __obj.asInstanceOf[Color]
  }
}

