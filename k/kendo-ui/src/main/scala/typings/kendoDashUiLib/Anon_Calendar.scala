package typings
package kendoDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Calendar extends js.Object {
  var calendar: `Anon_`
  var calendars: Anon_Standard
  var name: java.lang.String
  var numberFormat: Anon_Currency
}

object Anon_Calendar {
  @scala.inline
  def apply(calendar: `Anon_`, calendars: Anon_Standard, name: java.lang.String, numberFormat: Anon_Currency): Anon_Calendar = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("calendar")(calendar)
    __obj.updateDynamic("calendars")(calendars)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("numberFormat")(numberFormat)
    __obj.asInstanceOf[Anon_Calendar]
  }
}

