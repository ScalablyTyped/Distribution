package typings.hummusRecipe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextOptions extends js.Object {
  var align: js.UndefOr[String] = js.native
  var color: js.UndefOr[String | js.Array[Double]] = js.native
  var font: js.UndefOr[String] = js.native
  var highlight: js.UndefOr[Boolean] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var rotation: js.UndefOr[Double] = js.native
  var rotationOrigin: js.UndefOr[js.Array[Double]] = js.native
  var size: js.UndefOr[Double] = js.native
  var strikeOut: js.UndefOr[Boolean] = js.native
  var textBox: js.UndefOr[TextBox] = js.native
  var underline: js.UndefOr[Boolean] = js.native
}

object TextOptions {
  @scala.inline
  def apply(): TextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextOptions]
  }
  @scala.inline
  implicit class TextOptionsOps[Self <: TextOptions] (val x: Self) extends AnyVal {
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
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setColorVarargs(value: Double*): Self = this.set("color", js.Array(value :_*))
    @scala.inline
    def setColor(value: String | js.Array[Double]): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setHighlight(value: Boolean): Self = this.set("highlight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlight: Self = this.set("highlight", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    @scala.inline
    def setRotationOriginVarargs(value: Double*): Self = this.set("rotationOrigin", js.Array(value :_*))
    @scala.inline
    def setRotationOrigin(value: js.Array[Double]): Self = this.set("rotationOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotationOrigin: Self = this.set("rotationOrigin", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStrikeOut(value: Boolean): Self = this.set("strikeOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrikeOut: Self = this.set("strikeOut", js.undefined)
    @scala.inline
    def setTextBox(value: TextBox): Self = this.set("textBox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextBox: Self = this.set("textBox", js.undefined)
    @scala.inline
    def setUnderline(value: Boolean): Self = this.set("underline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderline: Self = this.set("underline", js.undefined)
  }
  
}

