package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotIkhTooltipDateTimeLabelFormatsOptions extends js.Object {
  var day: js.UndefOr[String] = js.undefined
  var hour: js.UndefOr[String] = js.undefined
  var millisecond: js.UndefOr[String] = js.undefined
  var minute: js.UndefOr[String] = js.undefined
  var month: js.UndefOr[String] = js.undefined
  var second: js.UndefOr[String] = js.undefined
  var week: js.UndefOr[String] = js.undefined
  var year: js.UndefOr[String] = js.undefined
}

object PlotIkhTooltipDateTimeLabelFormatsOptions {
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
  ): PlotIkhTooltipDateTimeLabelFormatsOptions = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day)
    if (hour != null) __obj.updateDynamic("hour")(hour)
    if (millisecond != null) __obj.updateDynamic("millisecond")(millisecond)
    if (minute != null) __obj.updateDynamic("minute")(minute)
    if (month != null) __obj.updateDynamic("month")(month)
    if (second != null) __obj.updateDynamic("second")(second)
    if (week != null) __obj.updateDynamic("week")(week)
    if (year != null) __obj.updateDynamic("year")(year)
    __obj.asInstanceOf[PlotIkhTooltipDateTimeLabelFormatsOptions]
  }
}

