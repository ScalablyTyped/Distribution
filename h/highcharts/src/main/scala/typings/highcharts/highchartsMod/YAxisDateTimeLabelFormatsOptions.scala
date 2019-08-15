package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YAxisDateTimeLabelFormatsOptions extends js.Object {
  var day: js.UndefOr[String | YAxisDateTimeLabelFormatsDayOptions] = js.undefined
  var hour: js.UndefOr[String | YAxisDateTimeLabelFormatsHourOptions] = js.undefined
  var millisecond: js.UndefOr[String | YAxisDateTimeLabelFormatsMillisecondOptions] = js.undefined
  var minute: js.UndefOr[String | YAxisDateTimeLabelFormatsMinuteOptions] = js.undefined
  var month: js.UndefOr[String | YAxisDateTimeLabelFormatsMonthOptions] = js.undefined
  var second: js.UndefOr[String | YAxisDateTimeLabelFormatsSecondOptions] = js.undefined
  var week: js.UndefOr[String | YAxisDateTimeLabelFormatsWeekOptions] = js.undefined
  var year: js.UndefOr[String | YAxisDateTimeLabelFormatsYearOptions] = js.undefined
}

object YAxisDateTimeLabelFormatsOptions {
  @scala.inline
  def apply(
    day: String | YAxisDateTimeLabelFormatsDayOptions = null,
    hour: String | YAxisDateTimeLabelFormatsHourOptions = null,
    millisecond: String | YAxisDateTimeLabelFormatsMillisecondOptions = null,
    minute: String | YAxisDateTimeLabelFormatsMinuteOptions = null,
    month: String | YAxisDateTimeLabelFormatsMonthOptions = null,
    second: String | YAxisDateTimeLabelFormatsSecondOptions = null,
    week: String | YAxisDateTimeLabelFormatsWeekOptions = null,
    year: String | YAxisDateTimeLabelFormatsYearOptions = null
  ): YAxisDateTimeLabelFormatsOptions = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (millisecond != null) __obj.updateDynamic("millisecond")(millisecond.asInstanceOf[js.Any])
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (second != null) __obj.updateDynamic("second")(second.asInstanceOf[js.Any])
    if (week != null) __obj.updateDynamic("week")(week.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[YAxisDateTimeLabelFormatsOptions]
  }
}

