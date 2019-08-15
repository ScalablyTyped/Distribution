package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartParallelAxesDateTimeLabelFormatsOptions extends js.Object {
  var day: js.UndefOr[String | ChartParallelAxesDateTimeLabelFormatsDayOptions] = js.undefined
  var hour: js.UndefOr[String | ChartParallelAxesDateTimeLabelFormatsHourOptions] = js.undefined
  var millisecond: js.UndefOr[String | ChartParallelAxesDateTimeLabelFormatsMillisecondOptions] = js.undefined
  var minute: js.UndefOr[String | ChartParallelAxesDateTimeLabelFormatsMinuteOptions] = js.undefined
  var month: js.UndefOr[String | ChartParallelAxesDateTimeLabelFormatsMonthOptions] = js.undefined
  var second: js.UndefOr[String | ChartParallelAxesDateTimeLabelFormatsSecondOptions] = js.undefined
  var week: js.UndefOr[String | ChartParallelAxesDateTimeLabelFormatsWeekOptions] = js.undefined
  var year: js.UndefOr[String | ChartParallelAxesDateTimeLabelFormatsYearOptions] = js.undefined
}

object ChartParallelAxesDateTimeLabelFormatsOptions {
  @scala.inline
  def apply(
    day: String | ChartParallelAxesDateTimeLabelFormatsDayOptions = null,
    hour: String | ChartParallelAxesDateTimeLabelFormatsHourOptions = null,
    millisecond: String | ChartParallelAxesDateTimeLabelFormatsMillisecondOptions = null,
    minute: String | ChartParallelAxesDateTimeLabelFormatsMinuteOptions = null,
    month: String | ChartParallelAxesDateTimeLabelFormatsMonthOptions = null,
    second: String | ChartParallelAxesDateTimeLabelFormatsSecondOptions = null,
    week: String | ChartParallelAxesDateTimeLabelFormatsWeekOptions = null,
    year: String | ChartParallelAxesDateTimeLabelFormatsYearOptions = null
  ): ChartParallelAxesDateTimeLabelFormatsOptions = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (millisecond != null) __obj.updateDynamic("millisecond")(millisecond.asInstanceOf[js.Any])
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (second != null) __obj.updateDynamic("second")(second.asInstanceOf[js.Any])
    if (week != null) __obj.updateDynamic("week")(week.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartParallelAxesDateTimeLabelFormatsOptions]
  }
}

