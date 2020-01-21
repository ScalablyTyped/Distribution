package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotTreemapPointOptions extends js.Object {
  /**
    * (Highcharts) Events for each single point.
    */
  var events: js.UndefOr[PlotTreemapPointEventsOptions] = js.undefined
}

object PlotTreemapPointOptions {
  @scala.inline
  def apply(events: PlotTreemapPointEventsOptions = null): PlotTreemapPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotTreemapPointOptions]
  }
}

