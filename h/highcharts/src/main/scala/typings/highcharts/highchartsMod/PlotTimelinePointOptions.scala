package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotTimelinePointOptions extends js.Object {
  /**
    * (Highcharts) Events for each single point.
    */
  var events: js.UndefOr[PlotTimelinePointEventsOptions] = js.undefined
}

object PlotTimelinePointOptions {
  @scala.inline
  def apply(events: PlotTimelinePointEventsOptions = null): PlotTimelinePointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[PlotTimelinePointOptions]
  }
}

