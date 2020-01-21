package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotEmaPointOptions extends js.Object {
  /**
    * (Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotEmaPointEventsOptions] = js.undefined
}

object PlotEmaPointOptions {
  @scala.inline
  def apply(events: PlotEmaPointEventsOptions = null): PlotEmaPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotEmaPointOptions]
  }
}

