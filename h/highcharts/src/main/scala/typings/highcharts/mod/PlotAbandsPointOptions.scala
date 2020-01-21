package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotAbandsPointOptions extends js.Object {
  /**
    * (Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotAbandsPointEventsOptions] = js.undefined
}

object PlotAbandsPointOptions {
  @scala.inline
  def apply(events: PlotAbandsPointEventsOptions = null): PlotAbandsPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotAbandsPointOptions]
  }
}

