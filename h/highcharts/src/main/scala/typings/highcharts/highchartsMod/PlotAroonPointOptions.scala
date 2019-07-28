package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotAroonPointOptions extends js.Object {
  /**
    * (Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotAroonPointEventsOptions] = js.undefined
}

object PlotAroonPointOptions {
  @scala.inline
  def apply(events: PlotAroonPointEventsOptions = null): PlotAroonPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[PlotAroonPointOptions]
  }
}

