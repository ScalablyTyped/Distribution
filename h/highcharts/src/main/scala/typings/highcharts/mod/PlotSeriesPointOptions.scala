package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotSeriesPointOptions extends js.Object {
  /**
    * (Highstock) Events for each single point.
    */
  var events: js.UndefOr[PointEventsOptionsObject] = js.undefined
}

object PlotSeriesPointOptions {
  @scala.inline
  def apply(events: PointEventsOptionsObject = null): PlotSeriesPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotSeriesPointOptions]
  }
}

