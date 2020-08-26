package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteIconColor extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.native
  var deleteIconColor: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[Double] = js.native
  var fontWeight: js.UndefOr[Double] = js.native
  var shadow: js.UndefOr[String] = js.native
  var textColor: js.UndefOr[String] = js.native
}

object DeleteIconColor {
  @scala.inline
  def apply(): DeleteIconColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteIconColor]
  }
  @scala.inline
  implicit class DeleteIconColorOps[Self <: DeleteIconColor] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setDeleteIconColor(value: String): Self = this.set("deleteIconColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteIconColor: Self = this.set("deleteIconColor", js.undefined)
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setFontWeight(value: Double): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    @scala.inline
    def setShadow(value: String): Self = this.set("shadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
  }
  
}

