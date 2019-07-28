package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotFunnelPointOptions extends js.Object {
  /**
    * (Highcharts) Events for each single point.
    */
  var events: js.UndefOr[PlotFunnelPointEventsOptions] = js.undefined
}

object PlotFunnelPointOptions {
  @scala.inline
  def apply(events: PlotFunnelPointEventsOptions = null): PlotFunnelPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[PlotFunnelPointOptions]
  }
}

