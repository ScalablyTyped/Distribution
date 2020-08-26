package typings.jsoneditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Color extends js.Object {
  var hex: String = js.native
  var hslString: String = js.native
  var hsla: js.Array[Double] = js.native
  var hslaString: String = js.native
  var rgbString: String = js.native
  var rgba: js.Array[Double] = js.native
  var rgbaString: String = js.native
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
  @scala.inline
  implicit class ColorOps[Self <: Color] (val x: Self) extends AnyVal {
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
    def setHex(value: String): Self = this.set("hex", value.asInstanceOf[js.Any])
    @scala.inline
    def setHslString(value: String): Self = this.set("hslString", value.asInstanceOf[js.Any])
    @scala.inline
    def setHslaVarargs(value: Double*): Self = this.set("hsla", js.Array(value :_*))
    @scala.inline
    def setHsla(value: js.Array[Double]): Self = this.set("hsla", value.asInstanceOf[js.Any])
    @scala.inline
    def setHslaString(value: String): Self = this.set("hslaString", value.asInstanceOf[js.Any])
    @scala.inline
    def setRgbString(value: String): Self = this.set("rgbString", value.asInstanceOf[js.Any])
    @scala.inline
    def setRgbaVarargs(value: Double*): Self = this.set("rgba", js.Array(value :_*))
    @scala.inline
    def setRgba(value: js.Array[Double]): Self = this.set("rgba", value.asInstanceOf[js.Any])
    @scala.inline
    def setRgbaString(value: String): Self = this.set("rgbaString", value.asInstanceOf[js.Any])
  }
  
}

