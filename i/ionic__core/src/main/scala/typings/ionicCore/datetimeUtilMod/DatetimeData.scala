package typings.ionicCore.datetimeUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatetimeData extends js.Object {
  var day: js.UndefOr[Double] = js.undefined
  var hour: js.UndefOr[Double] = js.undefined
  var millisecond: js.UndefOr[Double] = js.undefined
  var minute: js.UndefOr[Double] = js.undefined
  var month: js.UndefOr[Double] = js.undefined
  var second: js.UndefOr[Double] = js.undefined
  var tzOffset: js.UndefOr[Double] = js.undefined
  var year: js.UndefOr[Double] = js.undefined
}

object DatetimeData {
  @scala.inline
  def apply(
    day: Int | Double = null,
    hour: Int | Double = null,
    millisecond: Int | Double = null,
    minute: Int | Double = null,
    month: Int | Double = null,
    second: Int | Double = null,
    tzOffset: Int | Double = null,
    year: Int | Double = null
  ): DatetimeData = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (millisecond != null) __obj.updateDynamic("millisecond")(millisecond.asInstanceOf[js.Any])
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (second != null) __obj.updateDynamic("second")(second.asInstanceOf[js.Any])
    if (tzOffset != null) __obj.updateDynamic("tzOffset")(tzOffset.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatetimeData]
  }
}

