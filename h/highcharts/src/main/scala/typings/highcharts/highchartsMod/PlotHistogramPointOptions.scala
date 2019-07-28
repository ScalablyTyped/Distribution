package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotHistogramPointOptions extends js.Object {
  /**
    * (Highcharts) Events for each single point.
    */
  var events: js.UndefOr[PlotHistogramPointEventsOptions] = js.undefined
}

object PlotHistogramPointOptions {
  @scala.inline
  def apply(events: PlotHistogramPointEventsOptions = null): PlotHistogramPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[PlotHistogramPointOptions]
  }
}

