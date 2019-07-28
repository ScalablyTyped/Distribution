package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotAreaPointOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotAreaPointEventsOptions] = js.undefined
}

object PlotAreaPointOptions {
  @scala.inline
  def apply(events: PlotAreaPointEventsOptions = null): PlotAreaPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[PlotAreaPointOptions]
  }
}

