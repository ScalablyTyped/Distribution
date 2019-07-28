package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotXrangePointOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) Events for each single point.
    */
  var events: js.UndefOr[PlotXrangePointEventsOptions] = js.undefined
}

object PlotXrangePointOptions {
  @scala.inline
  def apply(events: PlotXrangePointEventsOptions = null): PlotXrangePointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[PlotXrangePointOptions]
  }
}

