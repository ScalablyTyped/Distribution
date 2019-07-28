package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPcPointOptions extends js.Object {
  /**
    * (Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotPcPointEventsOptions] = js.undefined
}

object PlotPcPointOptions {
  @scala.inline
  def apply(events: PlotPcPointEventsOptions = null): PlotPcPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[PlotPcPointOptions]
  }
}

