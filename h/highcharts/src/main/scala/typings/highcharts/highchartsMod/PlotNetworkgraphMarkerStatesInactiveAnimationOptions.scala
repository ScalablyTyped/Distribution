package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotNetworkgraphMarkerStatesInactiveAnimationOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
}

object PlotNetworkgraphMarkerStatesInactiveAnimationOptions {
  @scala.inline
  def apply(duration: Int | Double = null): PlotNetworkgraphMarkerStatesInactiveAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotNetworkgraphMarkerStatesInactiveAnimationOptions]
  }
}

