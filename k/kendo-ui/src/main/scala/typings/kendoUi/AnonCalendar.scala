package typings.kendoUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCalendar extends js.Object {
  var calendar: Anon
  var calendars: AnonStandard
  var name: String
  var numberFormat: AnonCurrency
}

object AnonCalendar {
  @scala.inline
  def apply(calendar: Anon, calendars: AnonStandard, name: String, numberFormat: AnonCurrency): AnonCalendar = {
    val __obj = js.Dynamic.literal(calendar = calendar.asInstanceOf[js.Any], calendars = calendars.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], numberFormat = numberFormat.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCalendar]
  }
}

