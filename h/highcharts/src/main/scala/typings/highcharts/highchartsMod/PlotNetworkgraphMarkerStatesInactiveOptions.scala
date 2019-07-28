package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotNetworkgraphMarkerStatesInactiveOptions extends js.Object {
  /**
    * (Highcharts) Animation when not hovering over the node.
    */
  var animation: js.UndefOr[
    Boolean | AnimationOptionsObject | PlotNetworkgraphMarkerStatesInactiveAnimationOptions
  ] = js.undefined
  /**
    * (Highcharts) Opacity of inactive markers.
    */
  var opacity: js.UndefOr[Double] = js.undefined
}

object PlotNetworkgraphMarkerStatesInactiveOptions {
  @scala.inline
  def apply(
    animation: Boolean | AnimationOptionsObject | PlotNetworkgraphMarkerStatesInactiveAnimationOptions = null,
    opacity: Int | Double = null
  ): PlotNetworkgraphMarkerStatesInactiveOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotNetworkgraphMarkerStatesInactiveOptions]
  }
}

