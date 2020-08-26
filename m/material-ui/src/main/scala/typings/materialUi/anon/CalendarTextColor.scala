package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarTextColor extends js.Object {
  var calendarTextColor: js.UndefOr[String] = js.native
  var calendarYearBackgroundColor: js.UndefOr[String] = js.native
  var color: js.UndefOr[String] = js.native
  var headerColor: js.UndefOr[String] = js.native
  var selectColor: js.UndefOr[String] = js.native
  var selectTextColor: js.UndefOr[String] = js.native
  var textColor: js.UndefOr[String] = js.native
}

object CalendarTextColor {
  @scala.inline
  def apply(): CalendarTextColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarTextColor]
  }
  @scala.inline
  implicit class CalendarTextColorOps[Self <: CalendarTextColor] (val x: Self) extends AnyVal {
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
    def setCalendarTextColor(value: String): Self = this.set("calendarTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalendarTextColor: Self = this.set("calendarTextColor", js.undefined)
    @scala.inline
    def setCalendarYearBackgroundColor(value: String): Self = this.set("calendarYearBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalendarYearBackgroundColor: Self = this.set("calendarYearBackgroundColor", js.undefined)
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

