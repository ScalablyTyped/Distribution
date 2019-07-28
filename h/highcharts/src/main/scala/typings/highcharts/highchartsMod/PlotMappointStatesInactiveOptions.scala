package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMappointStatesInactiveOptions extends js.Object {
  /**
    * (Highmaps) The animation for entering the inactive state.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject | PlotMappointStatesInactiveAnimationOptions] = js.undefined
  /**
    * (Highmaps) Opacity of series elements (dataLabels, line, area). Set to 1
    * to disable inactive state.
    */
  var opacity: js.UndefOr[Double] = js.undefined
}

object PlotMappointStatesInactiveOptions {
  @scala.inline
  def apply(
    animation: Boolean | AnimationOptionsObject | PlotMappointStatesInactiveAnimationOptions = null,
    opacity: Int | Double = null
  ): PlotMappointStatesInactiveOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotMappointStatesInactiveOptions]
  }
}

