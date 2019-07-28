package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZAxisDateTimeLabelFormatsOptions extends js.Object {
  var day: js.UndefOr[ZAxisDateTimeLabelFormatsDayOptions] = js.undefined
  var hour: js.UndefOr[ZAxisDateTimeLabelFormatsHourOptions] = js.undefined
  var millisecond: js.UndefOr[ZAxisDateTimeLabelFormatsMillisecondOptions] = js.undefined
  var minute: js.UndefOr[ZAxisDateTimeLabelFormatsMinuteOptions] = js.undefined
  var month: js.UndefOr[ZAxisDateTimeLabelFormatsMonthOptions] = js.undefined
  var second: js.UndefOr[ZAxisDateTimeLabelFormatsSecondOptions] = js.undefined
  var week: js.UndefOr[ZAxisDateTimeLabelFormatsWeekOptions] = js.undefined
  var year: js.UndefOr[ZAxisDateTimeLabelFormatsYearOptions] = js.undefined
}

object ZAxisDateTimeLabelFormatsOptions {
  @scala.inline
  def apply(
    day: ZAxisDateTimeLabelFormatsDayOptions = null,
    hour: ZAxisDateTimeLabelFormatsHourOptions = null,
    millisecond: ZAxisDateTimeLabelFormatsMillisecondOptions = null,
    minute: ZAxisDateTimeLabelFormatsMinuteOptions = null,
    month: ZAxisDateTimeLabelFormatsMonthOptions = null,
    second: ZAxisDateTimeLabelFormatsSecondOptions = null,
    week: ZAxisDateTimeLabelFormatsWeekOptions = null,
    year: ZAxisDateTimeLabelFormatsYearOptions = null
  ): ZAxisDateTimeLabelFormatsOptions = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day)
    if (hour != null) __obj.updateDynamic("hour")(hour)
    if (millisecond != null) __obj.updateDynamic("millisecond")(millisecond)
    if (minute != null) __obj.updateDynamic("minute")(minute)
    if (month != null) __obj.updateDynamic("month")(month)
    if (second != null) __obj.updateDynamic("second")(second)
    if (week != null) __obj.updateDynamic("week")(week)
    if (year != null) __obj.updateDynamic("year")(year)
    __obj.asInstanceOf[ZAxisDateTimeLabelFormatsOptions]
  }
}

