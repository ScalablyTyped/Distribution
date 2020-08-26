package typings.kendoUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Calendars extends js.Object {
  var calendar: js.UndefOr[_empty] = js.native
  var calendars: js.UndefOr[`0`] = js.native
  var name: js.UndefOr[String] = js.native
  var numberFormat: js.UndefOr[Currency] = js.native
}

object Calendars {
  @scala.inline
  def apply(): Calendars = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Calendars]
  }
  @scala.inline
  implicit class CalendarsOps[Self <: Calendars] (val x: Self) extends AnyVal {
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
    def setCalendar(value: _empty): Self = this.set("calendar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalendar: Self = this.set("calendar", js.undefined)
    @scala.inline
    def setCalendars(value: `0`): Self = this.set("calendars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalendars: Self = this.set("calendars", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNumberFormat(value: Currency): Self = this.set("numberFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberFormat: Self = this.set("numberFormat", js.undefined)
  }
  
}

