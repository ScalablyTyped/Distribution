package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotBoxplotPointOptions extends js.Object {
  /**
    * (Highcharts) Events for each single point.
    */
  var events: js.UndefOr[PlotBoxplotPointEventsOptions] = js.undefined
}

object PlotBoxplotPointOptions {
  @scala.inline
  def apply(events: PlotBoxplotPointEventsOptions = null): PlotBoxplotPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotBoxplotPointOptions]
  }
}

