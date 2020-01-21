package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotSmaPointOptions extends js.Object {
  /**
    * (Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotSmaPointEventsOptions] = js.undefined
}

object PlotSmaPointOptions {
  @scala.inline
  def apply(events: PlotSmaPointEventsOptions = null): PlotSmaPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotSmaPointOptions]
  }
}

