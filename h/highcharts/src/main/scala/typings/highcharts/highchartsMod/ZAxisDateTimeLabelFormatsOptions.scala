package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZAxisDateTimeLabelFormatsOptions extends js.Object {
  var day: js.UndefOr[String | ZAxisDateTimeLabelFormatsDayOptions] = js.undefined
  var hour: js.UndefOr[String | ZAxisDateTimeLabelFormatsHourOptions] = js.undefined
  var millisecond: js.UndefOr[String | ZAxisDateTimeLabelFormatsMillisecondOptions] = js.undefined
  var minute: js.UndefOr[String | ZAxisDateTimeLabelFormatsMinuteOptions] = js.undefined
  var month: js.UndefOr[String | ZAxisDateTimeLabelFormatsMonthOptions] = js.undefined
  var second: js.UndefOr[String | ZAxisDateTimeLabelFormatsSecondOptions] = js.undefined
  var week: js.UndefOr[String | ZAxisDateTimeLabelFormatsWeekOptions] = js.undefined
  var year: js.UndefOr[String | ZAxisDateTimeLabelFormatsYearOptions] = js.undefined
}

object ZAxisDateTimeLabelFormatsOptions {
  @scala.inline
  def apply(
    day: String | ZAxisDateTimeLabelFormatsDayOptions = null,
    hour: String | ZAxisDateTimeLabelFormatsHourOptions = null,
    millisecond: String | ZAxisDateTimeLabelFormatsMillisecondOptions = null,
    minute: String | ZAxisDateTimeLabelFormatsMinuteOptions = null,
    month: String | ZAxisDateTimeLabelFormatsMonthOptions = null,
    second: String | ZAxisDateTimeLabelFormatsSecondOptions = null,
    week: String | ZAxisDateTimeLabelFormatsWeekOptions = null,
    year: String | ZAxisDateTimeLabelFormatsYearOptions = null
  ): ZAxisDateTimeLabelFormatsOptions = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (millisecond != null) __obj.updateDynamic("millisecond")(millisecond.asInstanceOf[js.Any])
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (second != null) __obj.updateDynamic("second")(second.asInstanceOf[js.Any])
    if (week != null) __obj.updateDynamic("week")(week.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZAxisDateTimeLabelFormatsOptions]
  }
}

