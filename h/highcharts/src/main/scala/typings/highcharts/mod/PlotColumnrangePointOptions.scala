package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotColumnrangePointOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotColumnrangePointEventsOptions] = js.undefined
}

object PlotColumnrangePointOptions {
  @scala.inline
  def apply(events: PlotColumnrangePointEventsOptions = null): PlotColumnrangePointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotColumnrangePointOptions]
  }
}

