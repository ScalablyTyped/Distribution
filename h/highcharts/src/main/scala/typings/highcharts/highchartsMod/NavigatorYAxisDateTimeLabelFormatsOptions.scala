package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorYAxisDateTimeLabelFormatsOptions extends js.Object {
  var day: js.UndefOr[NavigatorYAxisDateTimeLabelFormatsDayOptions] = js.undefined
  var hour: js.UndefOr[NavigatorYAxisDateTimeLabelFormatsHourOptions] = js.undefined
  var millisecond: js.UndefOr[NavigatorYAxisDateTimeLabelFormatsMillisecondOptions] = js.undefined
  var minute: js.UndefOr[NavigatorYAxisDateTimeLabelFormatsMinuteOptions] = js.undefined
  var month: js.UndefOr[NavigatorYAxisDateTimeLabelFormatsMonthOptions] = js.undefined
  var second: js.UndefOr[NavigatorYAxisDateTimeLabelFormatsSecondOptions] = js.undefined
  var week: js.UndefOr[NavigatorYAxisDateTimeLabelFormatsWeekOptions] = js.undefined
  var year: js.UndefOr[NavigatorYAxisDateTimeLabelFormatsYearOptions] = js.undefined
}

object NavigatorYAxisDateTimeLabelFormatsOptions {
  @scala.inline
  def apply(
    day: NavigatorYAxisDateTimeLabelFormatsDayOptions = null,
    hour: NavigatorYAxisDateTimeLabelFormatsHourOptions = null,
    millisecond: NavigatorYAxisDateTimeLabelFormatsMillisecondOptions = null,
    minute: NavigatorYAxisDateTimeLabelFormatsMinuteOptions = null,
    month: NavigatorYAxisDateTimeLabelFormatsMonthOptions = null,
    second: NavigatorYAxisDateTimeLabelFormatsSecondOptions = null,
    week: NavigatorYAxisDateTimeLabelFormatsWeekOptions = null,
    year: NavigatorYAxisDateTimeLabelFormatsYearOptions = null
  ): NavigatorYAxisDateTimeLabelFormatsOptions = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day)
    if (hour != null) __obj.updateDynamic("hour")(hour)
    if (millisecond != null) __obj.updateDynamic("millisecond")(millisecond)
    if (minute != null) __obj.updateDynamic("minute")(minute)
    if (month != null) __obj.updateDynamic("month")(month)
    if (second != null) __obj.updateDynamic("second")(second)
    if (week != null) __obj.updateDynamic("week")(week)
    if (year != null) __obj.updateDynamic("year")(year)
    __obj.asInstanceOf[NavigatorYAxisDateTimeLabelFormatsOptions]
  }
}

