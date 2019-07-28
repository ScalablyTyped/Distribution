package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotStreamgraphPointOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotStreamgraphPointEventsOptions] = js.undefined
}

object PlotStreamgraphPointOptions {
  @scala.inline
  def apply(events: PlotStreamgraphPointEventsOptions = null): PlotStreamgraphPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[PlotStreamgraphPointOptions]
  }
}

