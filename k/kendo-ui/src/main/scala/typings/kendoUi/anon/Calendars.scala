package typings.kendoUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Calendars extends js.Object {
  var calendar: js.UndefOr[_empty] = js.undefined
  var calendars: js.UndefOr[`0`] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var numberFormat: js.UndefOr[Currency] = js.undefined
}

object Calendars {
  @scala.inline
  def apply(calendar: _empty = null, calendars: `0` = null, name: String = null, numberFormat: Currency = null): Calendars = {
    val __obj = js.Dynamic.literal()
    if (calendar != null) __obj.updateDynamic("calendar")(calendar.asInstanceOf[js.Any])
    if (calendars != null) __obj.updateDynamic("calendars")(calendars.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calendars]
  }
}

