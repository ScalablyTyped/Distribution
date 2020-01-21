package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotScatterPointOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotScatterPointEventsOptions] = js.undefined
}

object PlotScatterPointOptions {
  @scala.inline
  def apply(events: PlotScatterPointEventsOptions = null): PlotScatterPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotScatterPointOptions]
  }
}

