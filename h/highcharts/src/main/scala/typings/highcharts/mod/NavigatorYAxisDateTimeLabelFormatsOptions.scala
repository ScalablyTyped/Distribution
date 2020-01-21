package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorYAxisDateTimeLabelFormatsOptions extends js.Object {
  var day: js.UndefOr[String | NavigatorYAxisDateTimeLabelFormatsDayOptions] = js.undefined
  var hour: js.UndefOr[String | NavigatorYAxisDateTimeLabelFormatsHourOptions] = js.undefined
  var millisecond: js.UndefOr[String | NavigatorYAxisDateTimeLabelFormatsMillisecondOptions] = js.undefined
  var minute: js.UndefOr[String | NavigatorYAxisDateTimeLabelFormatsMinuteOptions] = js.undefined
  var month: js.UndefOr[String | NavigatorYAxisDateTimeLabelFormatsMonthOptions] = js.undefined
  var second: js.UndefOr[String | NavigatorYAxisDateTimeLabelFormatsSecondOptions] = js.undefined
  var week: js.UndefOr[String | NavigatorYAxisDateTimeLabelFormatsWeekOptions] = js.undefined
  var year: js.UndefOr[String | NavigatorYAxisDateTimeLabelFormatsYearOptions] = js.undefined
}

object NavigatorYAxisDateTimeLabelFormatsOptions {
  @scala.inline
  def apply(
    day: String | NavigatorYAxisDateTimeLabelFormatsDayOptions = null,
    hour: String | NavigatorYAxisDateTimeLabelFormatsHourOptions = null,
    millisecond: String | NavigatorYAxisDateTimeLabelFormatsMillisecondOptions = null,
    minute: String | NavigatorYAxisDateTimeLabelFormatsMinuteOptions = null,
    month: String | NavigatorYAxisDateTimeLabelFormatsMonthOptions = null,
    second: String | NavigatorYAxisDateTimeLabelFormatsSecondOptions = null,
    week: String | NavigatorYAxisDateTimeLabelFormatsWeekOptions = null,
    year: String | NavigatorYAxisDateTimeLabelFormatsYearOptions = null
  ): NavigatorYAxisDateTimeLabelFormatsOptions = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (millisecond != null) __obj.updateDynamic("millisecond")(millisecond.asInstanceOf[js.Any])
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (second != null) __obj.updateDynamic("second")(second.asInstanceOf[js.Any])
    if (week != null) __obj.updateDynamic("week")(week.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorYAxisDateTimeLabelFormatsOptions]
  }
}

