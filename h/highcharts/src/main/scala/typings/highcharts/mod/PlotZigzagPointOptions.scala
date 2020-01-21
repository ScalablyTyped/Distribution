package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotZigzagPointOptions extends js.Object {
  /**
    * (Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotZigzagPointEventsOptions] = js.undefined
}

object PlotZigzagPointOptions {
  @scala.inline
  def apply(events: PlotZigzagPointEventsOptions = null): PlotZigzagPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotZigzagPointOptions]
  }
}

