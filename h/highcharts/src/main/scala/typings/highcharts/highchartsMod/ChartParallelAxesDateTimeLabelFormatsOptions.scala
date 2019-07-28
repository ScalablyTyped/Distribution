package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartParallelAxesDateTimeLabelFormatsOptions extends js.Object {
  var day: js.UndefOr[ChartParallelAxesDateTimeLabelFormatsDayOptions] = js.undefined
  var hour: js.UndefOr[ChartParallelAxesDateTimeLabelFormatsHourOptions] = js.undefined
  var millisecond: js.UndefOr[ChartParallelAxesDateTimeLabelFormatsMillisecondOptions] = js.undefined
  var minute: js.UndefOr[ChartParallelAxesDateTimeLabelFormatsMinuteOptions] = js.undefined
  var month: js.UndefOr[ChartParallelAxesDateTimeLabelFormatsMonthOptions] = js.undefined
  var second: js.UndefOr[ChartParallelAxesDateTimeLabelFormatsSecondOptions] = js.undefined
  var week: js.UndefOr[ChartParallelAxesDateTimeLabelFormatsWeekOptions] = js.undefined
  var year: js.UndefOr[ChartParallelAxesDateTimeLabelFormatsYearOptions] = js.undefined
}

object ChartParallelAxesDateTimeLabelFormatsOptions {
  @scala.inline
  def apply(
    day: ChartParallelAxesDateTimeLabelFormatsDayOptions = null,
    hour: ChartParallelAxesDateTimeLabelFormatsHourOptions = null,
    millisecond: ChartParallelAxesDateTimeLabelFormatsMillisecondOptions = null,
    minute: ChartParallelAxesDateTimeLabelFormatsMinuteOptions = null,
    month: ChartParallelAxesDateTimeLabelFormatsMonthOptions = null,
    second: ChartParallelAxesDateTimeLabelFormatsSecondOptions = null,
    week: ChartParallelAxesDateTimeLabelFormatsWeekOptions = null,
    year: ChartParallelAxesDateTimeLabelFormatsYearOptions = null
  ): ChartParallelAxesDateTimeLabelFormatsOptions = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day)
    if (hour != null) __obj.updateDynamic("hour")(hour)
    if (millisecond != null) __obj.updateDynamic("millisecond")(millisecond)
    if (minute != null) __obj.updateDynamic("minute")(minute)
    if (month != null) __obj.updateDynamic("month")(month)
    if (second != null) __obj.updateDynamic("second")(second)
    if (week != null) __obj.updateDynamic("week")(week)
    if (year != null) __obj.updateDynamic("year")(year)
    __obj.asInstanceOf[ChartParallelAxesDateTimeLabelFormatsOptions]
  }
}

