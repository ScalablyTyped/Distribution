package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorXAxisDateTimeLabelFormatsOptions extends js.Object {
  var day: js.UndefOr[String | NavigatorXAxisDateTimeLabelFormatsDayOptions] = js.undefined
  var hour: js.UndefOr[String | NavigatorXAxisDateTimeLabelFormatsHourOptions] = js.undefined
  var millisecond: js.UndefOr[String | NavigatorXAxisDateTimeLabelFormatsMillisecondOptions] = js.undefined
  var minute: js.UndefOr[String | NavigatorXAxisDateTimeLabelFormatsMinuteOptions] = js.undefined
  var month: js.UndefOr[String | NavigatorXAxisDateTimeLabelFormatsMonthOptions] = js.undefined
  var second: js.UndefOr[String | NavigatorXAxisDateTimeLabelFormatsSecondOptions] = js.undefined
  var week: js.UndefOr[String | NavigatorXAxisDateTimeLabelFormatsWeekOptions] = js.undefined
  var year: js.UndefOr[String | NavigatorXAxisDateTimeLabelFormatsYearOptions] = js.undefined
}

object NavigatorXAxisDateTimeLabelFormatsOptions {
  @scala.inline
  def apply(
    day: String | NavigatorXAxisDateTimeLabelFormatsDayOptions = null,
    hour: String | NavigatorXAxisDateTimeLabelFormatsHourOptions = null,
    millisecond: String | NavigatorXAxisDateTimeLabelFormatsMillisecondOptions = null,
    minute: String | NavigatorXAxisDateTimeLabelFormatsMinuteOptions = null,
    month: String | NavigatorXAxisDateTimeLabelFormatsMonthOptions = null,
    second: String | NavigatorXAxisDateTimeLabelFormatsSecondOptions = null,
    week: String | NavigatorXAxisDateTimeLabelFormatsWeekOptions = null,
    year: String | NavigatorXAxisDateTimeLabelFormatsYearOptions = null
  ): NavigatorXAxisDateTimeLabelFormatsOptions = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (millisecond != null) __obj.updateDynamic("millisecond")(millisecond.asInstanceOf[js.Any])
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (second != null) __obj.updateDynamic("second")(second.asInstanceOf[js.Any])
    if (week != null) __obj.updateDynamic("week")(week.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorXAxisDateTimeLabelFormatsOptions]
  }
}

