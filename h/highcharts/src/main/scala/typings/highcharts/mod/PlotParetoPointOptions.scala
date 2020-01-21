package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotParetoPointOptions extends js.Object {
  /**
    * (Highcharts) Events for each single point.
    */
  var events: js.UndefOr[PlotParetoPointEventsOptions] = js.undefined
}

object PlotParetoPointOptions {
  @scala.inline
  def apply(events: PlotParetoPointEventsOptions = null): PlotParetoPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotParetoPointOptions]
  }
}

