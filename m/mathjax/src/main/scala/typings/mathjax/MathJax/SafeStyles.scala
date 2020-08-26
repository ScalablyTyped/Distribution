package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SafeStyles extends js.Object {
  var backgroundColor: js.UndefOr[Boolean] = js.native
  var border: js.UndefOr[Boolean] = js.native
  var color: js.UndefOr[Boolean] = js.native
  var cursor: js.UndefOr[Boolean] = js.native
  var fontFamily: js.UndefOr[Boolean] = js.native
  var fontSize: js.UndefOr[Boolean] = js.native
  var fontStyle: js.UndefOr[Boolean] = js.native
  var fontWeight: js.UndefOr[Boolean] = js.native
  var margin: js.UndefOr[Boolean] = js.native
  var opacity: js.UndefOr[Boolean] = js.native
  var outline: js.UndefOr[Boolean] = js.native
  var padding: js.UndefOr[Boolean] = js.native
  var textShadow: js.UndefOr[Boolean] = js.native
}

object SafeStyles {
  @scala.inline
  def apply(): SafeStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SafeStyles]
  }
  @scala.inline
  implicit class SafeStylesOps[Self <: SafeStyles] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: Boolean): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBorder(value: Boolean): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setColor(value: Boolean): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setCursor(value: Boolean): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def setFontFamily(value: Boolean): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setFontSize(value: Boolean): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setFontStyle(value: Boolean): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    @scala.inline
    def setFontWeight(value: Boolean): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    @scala.inline
    def setMargin(value: Boolean): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setOpacity(value: Boolean): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setOutline(value: Boolean): Self = this.set("outline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutline: Self = this.set("outline", js.undefined)
    @scala.inline
    def setPadding(value: Boolean): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setTextShadow(value: Boolean): Self = this.set("textShadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextShadow: Self = this.set("textShadow", js.undefined)
  }
  
}

