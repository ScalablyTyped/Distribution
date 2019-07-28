package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotStreamgraphStatesInactiveOptions extends js.Object {
  /**
    * (Highcharts, Highstock) The animation for entering the inactive state.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject | PlotStreamgraphStatesInactiveAnimationOptions] = js.undefined
  /**
    * (Highcharts, Highstock) Opacity of series elements (dataLabels, line,
    * area). Set to 1 to disable inactive state.
    */
  var opacity: js.UndefOr[Double] = js.undefined
}

object PlotStreamgraphStatesInactiveOptions {
  @scala.inline
  def apply(
    animation: Boolean | AnimationOptionsObject | PlotStreamgraphStatesInactiveAnimationOptions = null,
    opacity: Int | Double = null
  ): PlotStreamgraphStatesInactiveOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotStreamgraphStatesInactiveOptions]
  }
}

