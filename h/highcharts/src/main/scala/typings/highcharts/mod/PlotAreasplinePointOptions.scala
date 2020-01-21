package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotAreasplinePointOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotAreasplinePointEventsOptions] = js.undefined
}

object PlotAreasplinePointOptions {
  @scala.inline
  def apply(events: PlotAreasplinePointEventsOptions = null): PlotAreasplinePointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotAreasplinePointOptions]
  }
}

