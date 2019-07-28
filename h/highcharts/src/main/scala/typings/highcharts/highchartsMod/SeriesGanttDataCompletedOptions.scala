package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesGanttDataCompletedOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) The amount of the progress indicator,
    * ranging from 0 (not started) to 1 (finished).
    */
  var amount: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The fill of the progress indicator.
    * Defaults to a darkened variety of the main color.
    */
  var fill: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
}

object SeriesGanttDataCompletedOptions {
  @scala.inline
  def apply(amount: Int | Double = null, fill: ColorString | GradientColorObject | PatternObject = null): SeriesGanttDataCompletedOptions = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesGanttDataCompletedOptions]
  }
}

