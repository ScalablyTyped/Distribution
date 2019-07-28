package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotGanttPointOptions extends js.Object {
  /**
    * (Gantt) Events for each single point.
    */
  var events: js.UndefOr[PlotGanttPointEventsOptions] = js.undefined
}

object PlotGanttPointOptions {
  @scala.inline
  def apply(events: PlotGanttPointEventsOptions = null): PlotGanttPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[PlotGanttPointOptions]
  }
}

