package typings
package intlDashMessageformatLib.intlDashMessageformatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateFormat extends js.Object {
  var day: java.lang.String
  var month: java.lang.String
  var weekday: java.lang.String
  var year: java.lang.String
}

object DateFormat {
  @scala.inline
  def apply(day: java.lang.String, month: java.lang.String, weekday: java.lang.String, year: java.lang.String): DateFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("day")(day)
    __obj.updateDynamic("month")(month)
    __obj.updateDynamic("weekday")(weekday)
    __obj.updateDynamic("year")(year)
    __obj.asInstanceOf[DateFormat]
  }
}

