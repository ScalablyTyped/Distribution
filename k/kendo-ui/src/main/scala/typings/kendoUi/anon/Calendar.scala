package typings.kendoUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Calendar extends js.Object {
  var calendar: _empty
  var calendars: Standard
  var name: String
  var numberFormat: Currency
}

object Calendar {
  @scala.inline
  def apply(calendar: _empty, calendars: Standard, name: String, numberFormat: Currency): Calendar = {
    val __obj = js.Dynamic.literal(calendar = calendar.asInstanceOf[js.Any], calendars = calendars.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], numberFormat = numberFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calendar]
  }
}

