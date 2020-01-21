package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotRsiPointOptions extends js.Object {
  /**
    * (Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotRsiPointEventsOptions] = js.undefined
}

object PlotRsiPointOptions {
  @scala.inline
  def apply(events: PlotRsiPointEventsOptions = null): PlotRsiPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotRsiPointOptions]
  }
}

