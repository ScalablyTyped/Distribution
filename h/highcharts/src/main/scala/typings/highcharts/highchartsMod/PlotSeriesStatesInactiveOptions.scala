package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotSeriesStatesInactiveOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The animation for entering the
    * inactive state.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject | PlotSeriesStatesInactiveAnimationOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Opacity of series elements
    * (dataLabels, line, area). Set to 1 to disable inactive state.
    */
  var opacity: js.UndefOr[Double] = js.undefined
}

object PlotSeriesStatesInactiveOptions {
  @scala.inline
  def apply(
    animation: Boolean | AnimationOptionsObject | PlotSeriesStatesInactiveAnimationOptions = null,
    opacity: Int | Double = null
  ): PlotSeriesStatesInactiveOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotSeriesStatesInactiveOptions]
  }
}

