package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotSeriesPointOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Events for each single point.
    */
  var events: js.UndefOr[PlotSeriesPointEventsOptions] = js.undefined
}

object PlotSeriesPointOptions {
  @scala.inline
  def apply(events: PlotSeriesPointEventsOptions = null): PlotSeriesPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotSeriesPointOptions]
  }
}

