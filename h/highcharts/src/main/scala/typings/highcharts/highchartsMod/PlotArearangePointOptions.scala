package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotArearangePointOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotArearangePointEventsOptions] = js.undefined
}

object PlotArearangePointOptions {
  @scala.inline
  def apply(events: PlotArearangePointEventsOptions = null): PlotArearangePointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[PlotArearangePointOptions]
  }
}

