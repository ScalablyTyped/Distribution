package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotFunnel3dPointOptions extends js.Object {
  /**
    * (Highcharts) Events for each single point.
    */
  var events: js.UndefOr[PlotFunnel3dPointEventsOptions] = js.undefined
}

object PlotFunnel3dPointOptions {
  @scala.inline
  def apply(events: PlotFunnel3dPointEventsOptions = null): PlotFunnel3dPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotFunnel3dPointOptions]
  }
}

