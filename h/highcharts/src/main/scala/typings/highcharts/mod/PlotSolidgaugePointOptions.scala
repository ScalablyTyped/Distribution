package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotSolidgaugePointOptions extends js.Object {
  /**
    * (Highcharts) Events for each single point.
    */
  var events: js.UndefOr[PlotSolidgaugePointEventsOptions] = js.undefined
}

object PlotSolidgaugePointOptions {
  @scala.inline
  def apply(events: PlotSolidgaugePointEventsOptions = null): PlotSolidgaugePointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotSolidgaugePointOptions]
  }
}

