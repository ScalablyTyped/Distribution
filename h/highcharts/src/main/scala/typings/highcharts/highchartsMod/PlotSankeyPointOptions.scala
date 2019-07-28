package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotSankeyPointOptions extends js.Object {
  /**
    * (Highcharts) Events for each single point.
    */
  var events: js.UndefOr[PlotSankeyPointEventsOptions] = js.undefined
}

object PlotSankeyPointOptions {
  @scala.inline
  def apply(events: PlotSankeyPointEventsOptions = null): PlotSankeyPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[PlotSankeyPointOptions]
  }
}

