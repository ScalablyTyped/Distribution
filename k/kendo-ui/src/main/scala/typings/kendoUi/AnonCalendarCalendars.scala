package typings.kendoUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCalendarCalendars extends js.Object {
  var calendar: js.UndefOr[Anon] = js.undefined
  var calendars: js.UndefOr[AnonStandardAnon] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var numberFormat: js.UndefOr[AnonCurrency] = js.undefined
}

object AnonCalendarCalendars {
  @scala.inline
  def apply(
    calendar: Anon = null,
    calendars: AnonStandardAnon = null,
    name: String = null,
    numberFormat: AnonCurrency = null
  ): AnonCalendarCalendars = {
    val __obj = js.Dynamic.literal()
    if (calendar != null) __obj.updateDynamic("calendar")(calendar.asInstanceOf[js.Any])
    if (calendars != null) __obj.updateDynamic("calendars")(calendars.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCalendarCalendars]
  }
}

