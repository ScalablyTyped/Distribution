package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckedColor extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.native
  var borderColor: js.UndefOr[String] = js.native
  var checkedColor: js.UndefOr[String] = js.native
  var disabledColor: js.UndefOr[String] = js.native
  var labelColor: js.UndefOr[String] = js.native
  var labelDisabledColor: js.UndefOr[String] = js.native
  var requiredColor: js.UndefOr[String] = js.native
  var size: js.UndefOr[Double] = js.native
}

object CheckedColor {
  @scala.inline
  def apply(): CheckedColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckedColor]
  }
  @scala.inline
  implicit class CheckedColorOps[Self <: CheckedColor] (val x: Self) extends AnyVal {
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
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setCheckedColor(value: String): Self = this.set("checkedColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckedColor: Self = this.set("checkedColor", js.undefined)
    @scala.inline
    def setDisabledColor(value: String): Self = this.set("disabledColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledColor: Self = this.set("disabledColor", js.undefined)
    @scala.inline
    def setLabelColor(value: String): Self = this.set("labelColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelColor: Self = this.set("labelColor", js.undefined)
    @scala.inline
    def setLabelDisabledColor(value: String): Self = this.set("labelDisabledColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelDisabledColor: Self = this.set("labelDisabledColor", js.undefined)
    @scala.inline
    def setRequiredColor(value: String): Self = this.set("requiredColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequiredColor: Self = this.set("requiredColor", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

