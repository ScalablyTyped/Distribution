package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotSunburstPointOptions extends js.Object {
  /**
    * (Highcharts) Events for each single point.
    */
  var events: js.UndefOr[PlotSunburstPointEventsOptions] = js.undefined
}

object PlotSunburstPointOptions {
  @scala.inline
  def apply(events: PlotSunburstPointEventsOptions = null): PlotSunburstPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotSunburstPointOptions]
  }
}

