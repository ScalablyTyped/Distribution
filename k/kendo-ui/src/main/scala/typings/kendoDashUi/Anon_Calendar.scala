package typings.kendoDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Calendar extends js.Object {
  var calendar: Anon_
  var calendars: Anon_Standard
  var name: String
  var numberFormat: Anon_Currency
}

object Anon_Calendar {
  @scala.inline
  def apply(calendar: Anon_, calendars: Anon_Standard, name: String, numberFormat: Anon_Currency): Anon_Calendar = {
    val __obj = js.Dynamic.literal(calendar = calendar.asInstanceOf[js.Any], calendars = calendars.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], numberFormat = numberFormat.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Calendar]
  }
}

