package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotNetworkgraphStatesInactiveAnimationOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
}

object PlotNetworkgraphStatesInactiveAnimationOptions {
  @scala.inline
  def apply(duration: Int | Double = null): PlotNetworkgraphStatesInactiveAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotNetworkgraphStatesInactiveAnimationOptions]
  }
}

