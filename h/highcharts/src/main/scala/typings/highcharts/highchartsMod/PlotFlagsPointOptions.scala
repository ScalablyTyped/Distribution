package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotFlagsPointOptions extends js.Object {
  /**
    * (Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotFlagsPointEventsOptions] = js.undefined
}

object PlotFlagsPointOptions {
  @scala.inline
  def apply(events: PlotFlagsPointEventsOptions = null): PlotFlagsPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotFlagsPointOptions]
  }
}

