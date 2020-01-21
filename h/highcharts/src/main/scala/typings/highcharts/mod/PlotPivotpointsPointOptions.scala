package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPivotpointsPointOptions extends js.Object {
  /**
    * (Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotPivotpointsPointEventsOptions] = js.undefined
}

object PlotPivotpointsPointOptions {
  @scala.inline
  def apply(events: PlotPivotpointsPointEventsOptions = null): PlotPivotpointsPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotPivotpointsPointOptions]
  }
}

