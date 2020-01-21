package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotAtrPointOptions extends js.Object {
  /**
    * (Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotAtrPointEventsOptions] = js.undefined
}

object PlotAtrPointOptions {
  @scala.inline
  def apply(events: PlotAtrPointEventsOptions = null): PlotAtrPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotAtrPointOptions]
  }
}

