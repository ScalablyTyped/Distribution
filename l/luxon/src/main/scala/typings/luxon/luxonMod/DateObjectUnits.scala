package typings.luxon.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateObjectUnits extends js.Object {
  var day: js.UndefOr[Double] = js.undefined
  var hour: js.UndefOr[Double] = js.undefined
  var millisecond: js.UndefOr[Double] = js.undefined
  var minute: js.UndefOr[Double] = js.undefined
  var month: js.UndefOr[Double] = js.undefined
  var ordinal: js.UndefOr[Double] = js.undefined
  var second: js.UndefOr[Double] = js.undefined
  var weekNumber: js.UndefOr[Double] = js.undefined
  var weekYear: js.UndefOr[Double] = js.undefined
  var weekday: js.UndefOr[Double] = js.undefined
  var year: js.UndefOr[Double] = js.undefined
}

object DateObjectUnits {
  @scala.inline
  def apply(
    day: Int | Double = null,
    hour: Int | Double = null,
    millisecond: Int | Double = null,
    minute: Int | Double = null,
    month: Int | Double = null,
    ordinal: Int | Double = null,
    second: Int | Double = null,
    weekNumber: Int | Double = null,
    weekYear: Int | Double = null,
    weekday: Int | Double = null,
    year: Int | Double = null
  ): DateObjectUnits = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (millisecond != null) __obj.updateDynamic("millisecond")(millisecond.asInstanceOf[js.Any])
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (ordinal != null) __obj.updateDynamic("ordinal")(ordinal.asInstanceOf[js.Any])
    if (second != null) __obj.updateDynamic("second")(second.asInstanceOf[js.Any])
    if (weekNumber != null) __obj.updateDynamic("weekNumber")(weekNumber.asInstanceOf[js.Any])
    if (weekYear != null) __obj.updateDynamic("weekYear")(weekYear.asInstanceOf[js.Any])
    if (weekday != null) __obj.updateDynamic("weekday")(weekday.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateObjectUnits]
  }
}

