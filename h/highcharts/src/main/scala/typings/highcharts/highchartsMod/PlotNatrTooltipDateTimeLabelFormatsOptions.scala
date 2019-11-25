package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotNatrTooltipDateTimeLabelFormatsOptions extends js.Object {
  var day: js.UndefOr[String] = js.undefined
  var hour: js.UndefOr[String] = js.undefined
  var millisecond: js.UndefOr[String] = js.undefined
  var minute: js.UndefOr[String] = js.undefined
  var month: js.UndefOr[String] = js.undefined
  var second: js.UndefOr[String] = js.undefined
  var week: js.UndefOr[String] = js.undefined
  var year: js.UndefOr[String] = js.undefined
}

object PlotNatrTooltipDateTimeLabelFormatsOptions {
  @scala.inline
  def apply(
    day: String = null,
    hour: String = null,
    millisecond: String = null,
    minute: String = null,
    month: String = null,
    second: String = null,
    week: String = null,
    year: String = null
  ): PlotNatrTooltipDateTimeLabelFormatsOptions = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (millisecond != null) __obj.updateDynamic("millisecond")(millisecond.asInstanceOf[js.Any])
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (second != null) __obj.updateDynamic("second")(second.asInstanceOf[js.Any])
    if (week != null) __obj.updateDynamic("week")(week.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotNatrTooltipDateTimeLabelFormatsOptions]
  }
}

