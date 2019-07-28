package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotNetworkgraphPointOptions extends js.Object {
  /**
    * (Highcharts) Events for each single point.
    */
  var events: js.UndefOr[PlotNetworkgraphPointEventsOptions] = js.undefined
}

object PlotNetworkgraphPointOptions {
  @scala.inline
  def apply(events: PlotNetworkgraphPointEventsOptions = null): PlotNetworkgraphPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[PlotNetworkgraphPointOptions]
  }
}

