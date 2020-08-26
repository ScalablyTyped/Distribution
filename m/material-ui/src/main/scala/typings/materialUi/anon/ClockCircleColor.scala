package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClockCircleColor extends js.Object {
  var accentColor: js.UndefOr[String] = js.native
  var clockCircleColor: js.UndefOr[String] = js.native
  var clockColor: js.UndefOr[String] = js.native
  var color: js.UndefOr[String] = js.native
  var headerColor: js.UndefOr[String] = js.native
  var selectColor: js.UndefOr[String] = js.native
  var selectTextColor: js.UndefOr[String] = js.native
  var textColor: js.UndefOr[String] = js.native
}

object ClockCircleColor {
  @scala.inline
  def apply(): ClockCircleColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClockCircleColor]
  }
  @scala.inline
  implicit class ClockCircleColorOps[Self <: ClockCircleColor] (val x: Self) extends AnyVal {
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
    def setAccentColor(value: String): Self = this.set("accentColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccentColor: Self = this.set("accentColor", js.undefined)
    @scala.inline
    def setClockCircleColor(value: String): Self = this.set("clockCircleColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClockCircleColor: Self = this.set("clockCircleColor", js.undefined)
    @scala.inline
    def setClockColor(value: String): Self = this.set("clockColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClockColor: Self = this.set("clockColor", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setHeaderColor(value: String): Self = this.set("headerColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderColor: Self = this.set("headerColor", js.undefined)
    @scala.inline
    def setSelectColor(value: String): Self = this.set("selectColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectColor: Self = this.set("selectColor", js.undefined)
    @scala.inline
    def setSelectTextColor(value: String): Self = this.set("selectTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectTextColor: Self = this.set("selectTextColor", js.undefined)
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
  }
  
}

