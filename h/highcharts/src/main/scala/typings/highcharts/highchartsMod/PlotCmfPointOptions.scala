package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotCmfPointOptions extends js.Object {
  /**
    * (Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotCmfPointEventsOptions] = js.undefined
}

object PlotCmfPointOptions {
  @scala.inline
  def apply(events: PlotCmfPointEventsOptions = null): PlotCmfPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[PlotCmfPointOptions]
  }
}

