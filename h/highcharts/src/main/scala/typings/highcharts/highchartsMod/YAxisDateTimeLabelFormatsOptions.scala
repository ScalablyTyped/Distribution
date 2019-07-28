package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YAxisDateTimeLabelFormatsOptions extends js.Object {
  var day: js.UndefOr[YAxisDateTimeLabelFormatsDayOptions] = js.undefined
  var hour: js.UndefOr[YAxisDateTimeLabelFormatsHourOptions] = js.undefined
  var millisecond: js.UndefOr[YAxisDateTimeLabelFormatsMillisecondOptions] = js.undefined
  var minute: js.UndefOr[YAxisDateTimeLabelFormatsMinuteOptions] = js.undefined
  var month: js.UndefOr[YAxisDateTimeLabelFormatsMonthOptions] = js.undefined
  var second: js.UndefOr[YAxisDateTimeLabelFormatsSecondOptions] = js.undefined
  var week: js.UndefOr[YAxisDateTimeLabelFormatsWeekOptions] = js.undefined
  var year: js.UndefOr[YAxisDateTimeLabelFormatsYearOptions] = js.undefined
}

object YAxisDateTimeLabelFormatsOptions {
  @scala.inline
  def apply(
    day: YAxisDateTimeLabelFormatsDayOptions = null,
    hour: YAxisDateTimeLabelFormatsHourOptions = null,
    millisecond: YAxisDateTimeLabelFormatsMillisecondOptions = null,
    minute: YAxisDateTimeLabelFormatsMinuteOptions = null,
    month: YAxisDateTimeLabelFormatsMonthOptions = null,
    second: YAxisDateTimeLabelFormatsSecondOptions = null,
    week: YAxisDateTimeLabelFormatsWeekOptions = null,
    year: YAxisDateTimeLabelFormatsYearOptions = null
  ): YAxisDateTimeLabelFormatsOptions = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day)
    if (hour != null) __obj.updateDynamic("hour")(hour)
    if (millisecond != null) __obj.updateDynamic("millisecond")(millisecond)
    if (minute != null) __obj.updateDynamic("minute")(minute)
    if (month != null) __obj.updateDynamic("month")(month)
    if (second != null) __obj.updateDynamic("second")(second)
    if (week != null) __obj.updateDynamic("week")(week)
    if (year != null) __obj.updateDynamic("year")(year)
    __obj.asInstanceOf[YAxisDateTimeLabelFormatsOptions]
  }
}

