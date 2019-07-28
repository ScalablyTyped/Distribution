package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateInputMessages extends js.Object {
  var day: js.UndefOr[String] = js.undefined
  var dayperiod: js.UndefOr[String] = js.undefined
  var hour: js.UndefOr[String] = js.undefined
  var minute: js.UndefOr[String] = js.undefined
  var month: js.UndefOr[String] = js.undefined
  var second: js.UndefOr[String] = js.undefined
  var weekday: js.UndefOr[String] = js.undefined
  var year: js.UndefOr[String] = js.undefined
}

object DateInputMessages {
  @scala.inline
  def apply(
    day: String = null,
    dayperiod: String = null,
    hour: String = null,
    minute: String = null,
    month: String = null,
    second: String = null,
    weekday: String = null,
    year: String = null
  ): DateInputMessages = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day)
    if (dayperiod != null) __obj.updateDynamic("dayperiod")(dayperiod)
    if (hour != null) __obj.updateDynamic("hour")(hour)
    if (minute != null) __obj.updateDynamic("minute")(minute)
    if (month != null) __obj.updateDynamic("month")(month)
    if (second != null) __obj.updateDynamic("second")(second)
    if (weekday != null) __obj.updateDynamic("weekday")(weekday)
    if (year != null) __obj.updateDynamic("year")(year)
    __obj.asInstanceOf[DateInputMessages]
  }
}

