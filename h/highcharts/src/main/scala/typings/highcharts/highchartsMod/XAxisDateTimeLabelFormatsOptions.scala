package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAxisDateTimeLabelFormatsOptions extends js.Object {
  var day: js.UndefOr[String | XAxisDateTimeLabelFormatsDayOptions] = js.undefined
  var hour: js.UndefOr[String | XAxisDateTimeLabelFormatsHourOptions] = js.undefined
  var millisecond: js.UndefOr[String | XAxisDateTimeLabelFormatsMillisecondOptions] = js.undefined
  var minute: js.UndefOr[String | XAxisDateTimeLabelFormatsMinuteOptions] = js.undefined
  var month: js.UndefOr[String | XAxisDateTimeLabelFormatsMonthOptions] = js.undefined
  var second: js.UndefOr[String | XAxisDateTimeLabelFormatsSecondOptions] = js.undefined
  var week: js.UndefOr[String | XAxisDateTimeLabelFormatsWeekOptions] = js.undefined
  var year: js.UndefOr[String | XAxisDateTimeLabelFormatsYearOptions] = js.undefined
}

object XAxisDateTimeLabelFormatsOptions {
  @scala.inline
  def apply(
    day: String | XAxisDateTimeLabelFormatsDayOptions = null,
    hour: String | XAxisDateTimeLabelFormatsHourOptions = null,
    millisecond: String | XAxisDateTimeLabelFormatsMillisecondOptions = null,
    minute: String | XAxisDateTimeLabelFormatsMinuteOptions = null,
    month: String | XAxisDateTimeLabelFormatsMonthOptions = null,
    second: String | XAxisDateTimeLabelFormatsSecondOptions = null,
    week: String | XAxisDateTimeLabelFormatsWeekOptions = null,
    year: String | XAxisDateTimeLabelFormatsYearOptions = null
  ): XAxisDateTimeLabelFormatsOptions = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (millisecond != null) __obj.updateDynamic("millisecond")(millisecond.asInstanceOf[js.Any])
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (second != null) __obj.updateDynamic("second")(second.asInstanceOf[js.Any])
    if (week != null) __obj.updateDynamic("week")(week.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[XAxisDateTimeLabelFormatsOptions]
  }
}

