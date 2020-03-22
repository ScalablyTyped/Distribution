package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisDateTimeLabelFormatsOptions extends js.Object {
  var day: js.UndefOr[String | AxisDateTimeLabelFormatsOptionsObject] = js.undefined
  var hour: js.UndefOr[String | AxisDateTimeLabelFormatsOptionsObject] = js.undefined
  var millisecond: js.UndefOr[String | AxisDateTimeLabelFormatsOptionsObject] = js.undefined
  var minute: js.UndefOr[String | AxisDateTimeLabelFormatsOptionsObject] = js.undefined
  var month: js.UndefOr[String | AxisDateTimeLabelFormatsOptionsObject] = js.undefined
  var second: js.UndefOr[String | AxisDateTimeLabelFormatsOptionsObject] = js.undefined
  var week: js.UndefOr[String | AxisDateTimeLabelFormatsOptionsObject] = js.undefined
  var year: js.UndefOr[String | AxisDateTimeLabelFormatsOptionsObject] = js.undefined
}

object AxisDateTimeLabelFormatsOptions {
  @scala.inline
  def apply(
    day: String | AxisDateTimeLabelFormatsOptionsObject = null,
    hour: String | AxisDateTimeLabelFormatsOptionsObject = null,
    millisecond: String | AxisDateTimeLabelFormatsOptionsObject = null,
    minute: String | AxisDateTimeLabelFormatsOptionsObject = null,
    month: String | AxisDateTimeLabelFormatsOptionsObject = null,
    second: String | AxisDateTimeLabelFormatsOptionsObject = null,
    week: String | AxisDateTimeLabelFormatsOptionsObject = null,
    year: String | AxisDateTimeLabelFormatsOptionsObject = null
  ): AxisDateTimeLabelFormatsOptions = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (millisecond != null) __obj.updateDynamic("millisecond")(millisecond.asInstanceOf[js.Any])
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (second != null) __obj.updateDynamic("second")(second.asInstanceOf[js.Any])
    if (week != null) __obj.updateDynamic("week")(week.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisDateTimeLabelFormatsOptions]
  }
}

