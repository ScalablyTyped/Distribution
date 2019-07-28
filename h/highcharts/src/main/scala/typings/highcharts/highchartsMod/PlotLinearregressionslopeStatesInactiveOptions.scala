package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotLinearregressionslopeStatesInactiveOptions extends js.Object {
  /**
    * (Highstock) The animation for entering the inactive state.
    */
  var animation: js.UndefOr[
    Boolean | AnimationOptionsObject | PlotLinearregressionslopeStatesInactiveAnimationOptions
  ] = js.undefined
  /**
    * (Highstock) Opacity of series elements (dataLabels, line, area). Set to 1
    * to disable inactive state.
    */
  var opacity: js.UndefOr[Double] = js.undefined
}

object PlotLinearregressionslopeStatesInactiveOptions {
  @scala.inline
  def apply(
    animation: Boolean | AnimationOptionsObject | PlotLinearregressionslopeStatesInactiveAnimationOptions = null,
    opacity: Int | Double = null
  ): PlotLinearregressionslopeStatesInactiveOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotLinearregressionslopeStatesInactiveOptions]
  }
}

