package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotTrendlinePointOptions extends js.Object {
  /**
    * (Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotTrendlinePointEventsOptions] = js.undefined
}

object PlotTrendlinePointOptions {
  @scala.inline
  def apply(events: PlotTrendlinePointEventsOptions = null): PlotTrendlinePointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[PlotTrendlinePointOptions]
  }
}

