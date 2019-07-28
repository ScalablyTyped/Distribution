package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAxisDateTimeLabelFormatsOptions extends js.Object {
  var day: js.UndefOr[XAxisDateTimeLabelFormatsDayOptions] = js.undefined
  var hour: js.UndefOr[XAxisDateTimeLabelFormatsHourOptions] = js.undefined
  var millisecond: js.UndefOr[XAxisDateTimeLabelFormatsMillisecondOptions] = js.undefined
  var minute: js.UndefOr[XAxisDateTimeLabelFormatsMinuteOptions] = js.undefined
  var month: js.UndefOr[XAxisDateTimeLabelFormatsMonthOptions] = js.undefined
  var second: js.UndefOr[XAxisDateTimeLabelFormatsSecondOptions] = js.undefined
  var week: js.UndefOr[XAxisDateTimeLabelFormatsWeekOptions] = js.undefined
  var year: js.UndefOr[XAxisDateTimeLabelFormatsYearOptions] = js.undefined
}

object XAxisDateTimeLabelFormatsOptions {
  @scala.inline
  def apply(
    day: XAxisDateTimeLabelFormatsDayOptions = null,
    hour: XAxisDateTimeLabelFormatsHourOptions = null,
    millisecond: XAxisDateTimeLabelFormatsMillisecondOptions = null,
    minute: XAxisDateTimeLabelFormatsMinuteOptions = null,
    month: XAxisDateTimeLabelFormatsMonthOptions = null,
    second: XAxisDateTimeLabelFormatsSecondOptions = null,
    week: XAxisDateTimeLabelFormatsWeekOptions = null,
    year: XAxisDateTimeLabelFormatsYearOptions = null
  ): XAxisDateTimeLabelFormatsOptions = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day)
    if (hour != null) __obj.updateDynamic("hour")(hour)
    if (millisecond != null) __obj.updateDynamic("millisecond")(millisecond)
    if (minute != null) __obj.updateDynamic("minute")(minute)
    if (month != null) __obj.updateDynamic("month")(month)
    if (second != null) __obj.updateDynamic("second")(second)
    if (week != null) __obj.updateDynamic("week")(week)
    if (year != null) __obj.updateDynamic("year")(year)
    __obj.asInstanceOf[XAxisDateTimeLabelFormatsOptions]
  }
}

