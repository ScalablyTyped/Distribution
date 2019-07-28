package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotSankeyStatesInactiveOptions extends js.Object {
  /**
    * (Highcharts) Animation when not hovering over the marker.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject | PlotSankeyStatesInactiveAnimationOptions] = js.undefined
  /**
    * (Highcharts) Opacity for the links between nodes in the sankey diagram in
    * inactive mode.
    */
  var linkOpacity: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Opacity of series elements (dataLabels, line, area). Set to
    * 1 to disable inactive state.
    */
  var opacity: js.UndefOr[Double] = js.undefined
}

object PlotSankeyStatesInactiveOptions {
  @scala.inline
  def apply(
    animation: Boolean | AnimationOptionsObject | PlotSankeyStatesInactiveAnimationOptions = null,
    linkOpacity: Int | Double = null,
    opacity: Int | Double = null
  ): PlotSankeyStatesInactiveOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (linkOpacity != null) __obj.updateDynamic("linkOpacity")(linkOpacity.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotSankeyStatesInactiveOptions]
  }
}

