package typings
package kendoDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CalendarCalendars extends js.Object {
  var calendar: js.UndefOr[`Anon_`] = js.undefined
  var calendars: js.UndefOr[Anon_StandardAnon] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var numberFormat: js.UndefOr[Anon_Currency] = js.undefined
}

object Anon_CalendarCalendars {
  @scala.inline
  def apply(
    calendar: `Anon_` = null,
    calendars: Anon_StandardAnon = null,
    name: java.lang.String = null,
    numberFormat: Anon_Currency = null
  ): Anon_CalendarCalendars = {
    val __obj = js.Dynamic.literal()
    if (calendar != null) __obj.updateDynamic("calendar")(calendar)
    if (calendars != null) __obj.updateDynamic("calendars")(calendars)
    if (name != null) __obj.updateDynamic("name")(name)
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat)
    __obj.asInstanceOf[Anon_CalendarCalendars]
  }
}

