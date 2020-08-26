package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisabledColor extends js.Object {
  var color: js.UndefOr[String] = js.native
  var disabledColor: js.UndefOr[String] = js.native
  var disabledTextColor: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[Double] = js.native
  var fontWeight: js.UndefOr[Double] = js.native
  var primaryColor: js.UndefOr[String] = js.native
  var primaryTextColor: js.UndefOr[String] = js.native
  var secondaryColor: js.UndefOr[String] = js.native
  var secondaryTextColor: js.UndefOr[String] = js.native
  var textColor: js.UndefOr[String] = js.native
}

object DisabledColor {
  @scala.inline
  def apply(): DisabledColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisabledColor]
  }
  @scala.inline
  implicit class DisabledColorOps[Self <: DisabledColor] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDisabledColor(value: String): Self = this.set("disabledColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledColor: Self = this.set("disabledColor", js.undefined)
    @scala.inline
    def setDisabledTextColor(value: String): Self = this.set("disabledTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledTextColor: Self = this.set("disabledTextColor", js.undefined)
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setFontWeight(value: Double): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    @scala.inline
    def setPrimaryColor(value: String): Self = this.set("primaryColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryColor: Self = this.set("primaryColor", js.undefined)
    @scala.inline
    def setPrimaryTextColor(value: String): Self = this.set("primaryTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryTextColor: Self = this.set("primaryTextColor", js.undefined)
    @scala.inline
    def setSecondaryColor(value: String): Self = this.set("secondaryColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondaryColor: Self = this.set("secondaryColor", js.undefined)
    @scala.inline
    def setSecondaryTextColor(value: String): Self = this.set("secondaryTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondaryTextColor: Self = this.set("secondaryTextColor", js.undefined)
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
  }
  
}

