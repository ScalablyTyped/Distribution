package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPiePointOptions extends js.Object {
  /**
    * (Highcharts) Events for each single point.
    */
  var events: js.UndefOr[PlotPiePointEventsOptions] = js.undefined
}

object PlotPiePointOptions {
  @scala.inline
  def apply(events: PlotPiePointEventsOptions = null): PlotPiePointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotPiePointOptions]
  }
}

