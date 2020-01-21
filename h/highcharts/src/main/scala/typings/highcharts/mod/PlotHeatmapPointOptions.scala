package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotHeatmapPointOptions extends js.Object {
  /**
    * (Highcharts, Highmaps) Events for each single point.
    */
  var events: js.UndefOr[PlotHeatmapPointEventsOptions] = js.undefined
}

object PlotHeatmapPointOptions {
  @scala.inline
  def apply(events: PlotHeatmapPointEventsOptions = null): PlotHeatmapPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotHeatmapPointOptions]
  }
}

