package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotAreasplinerangePointOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotAreasplinerangePointEventsOptions] = js.undefined
}

object PlotAreasplinerangePointOptions {
  @scala.inline
  def apply(events: PlotAreasplinerangePointEventsOptions = null): PlotAreasplinerangePointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotAreasplinerangePointOptions]
  }
}

