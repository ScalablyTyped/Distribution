package typings.luxon.mod

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
    day: js.UndefOr[Double] = js.undefined,
    hour: js.UndefOr[Double] = js.undefined,
    millisecond: js.UndefOr[Double] = js.undefined,
    minute: js.UndefOr[Double] = js.undefined,
    month: js.UndefOr[Double] = js.undefined,
    ordinal: js.UndefOr[Double] = js.undefined,
    second: js.UndefOr[Double] = js.undefined,
    weekNumber: js.UndefOr[Double] = js.undefined,
    weekYear: js.UndefOr[Double] = js.undefined,
    weekday: js.UndefOr[Double] = js.undefined,
    year: js.UndefOr[Double] = js.undefined
  ): DateObjectUnits = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(day)) __obj.updateDynamic("day")(day.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hour)) __obj.updateDynamic("hour")(hour.get.asInstanceOf[js.Any])
    if (!js.isUndefined(millisecond)) __obj.updateDynamic("millisecond")(millisecond.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minute)) __obj.updateDynamic("minute")(minute.get.asInstanceOf[js.Any])
    if (!js.isUndefined(month)) __obj.updateDynamic("month")(month.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ordinal)) __obj.updateDynamic("ordinal")(ordinal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(second)) __obj.updateDynamic("second")(second.get.asInstanceOf[js.Any])
    if (!js.isUndefined(weekNumber)) __obj.updateDynamic("weekNumber")(weekNumber.get.asInstanceOf[js.Any])
    if (!js.isUndefined(weekYear)) __obj.updateDynamic("weekYear")(weekYear.get.asInstanceOf[js.Any])
    if (!js.isUndefined(weekday)) __obj.updateDynamic("weekday")(weekday.get.asInstanceOf[js.Any])
    if (!js.isUndefined(year)) __obj.updateDynamic("year")(year.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateObjectUnits]
  }
}

