package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorXAxisDateTimeLabelFormatsOptions extends js.Object {
  var day: js.UndefOr[NavigatorXAxisDateTimeLabelFormatsDayOptions] = js.undefined
  var hour: js.UndefOr[NavigatorXAxisDateTimeLabelFormatsHourOptions] = js.undefined
  var millisecond: js.UndefOr[NavigatorXAxisDateTimeLabelFormatsMillisecondOptions] = js.undefined
  var minute: js.UndefOr[NavigatorXAxisDateTimeLabelFormatsMinuteOptions] = js.undefined
  var month: js.UndefOr[NavigatorXAxisDateTimeLabelFormatsMonthOptions] = js.undefined
  var second: js.UndefOr[NavigatorXAxisDateTimeLabelFormatsSecondOptions] = js.undefined
  var week: js.UndefOr[NavigatorXAxisDateTimeLabelFormatsWeekOptions] = js.undefined
  var year: js.UndefOr[NavigatorXAxisDateTimeLabelFormatsYearOptions] = js.undefined
}

object NavigatorXAxisDateTimeLabelFormatsOptions {
  @scala.inline
  def apply(
    day: NavigatorXAxisDateTimeLabelFormatsDayOptions = null,
    hour: NavigatorXAxisDateTimeLabelFormatsHourOptions = null,
    millisecond: NavigatorXAxisDateTimeLabelFormatsMillisecondOptions = null,
    minute: NavigatorXAxisDateTimeLabelFormatsMinuteOptions = null,
    month: NavigatorXAxisDateTimeLabelFormatsMonthOptions = null,
    second: NavigatorXAxisDateTimeLabelFormatsSecondOptions = null,
    week: NavigatorXAxisDateTimeLabelFormatsWeekOptions = null,
    year: NavigatorXAxisDateTimeLabelFormatsYearOptions = null
  ): NavigatorXAxisDateTimeLabelFormatsOptions = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day)
    if (hour != null) __obj.updateDynamic("hour")(hour)
    if (millisecond != null) __obj.updateDynamic("millisecond")(millisecond)
    if (minute != null) __obj.updateDynamic("minute")(minute)
    if (month != null) __obj.updateDynamic("month")(month)
    if (second != null) __obj.updateDynamic("second")(second)
    if (week != null) __obj.updateDynamic("week")(week)
    if (year != null) __obj.updateDynamic("year")(year)
    __obj.asInstanceOf[NavigatorXAxisDateTimeLabelFormatsOptions]
  }
}

