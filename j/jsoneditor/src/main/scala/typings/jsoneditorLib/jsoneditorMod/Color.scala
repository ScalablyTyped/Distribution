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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hex")(hex)
    __obj.updateDynamic("hslString")(hslString)
    __obj.updateDynamic("hsla")(hsla)
    __obj.updateDynamic("hslaString")(hslaString)
    __obj.updateDynamic("rgbString")(rgbString)
    __obj.updateDynamic("rgba")(rgba)
    __obj.updateDynamic("rgbaString")(rgbaString)
    __obj.asInstanceOf[Color]
  }
}

