package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotVwapPointOptions extends js.Object {
  /**
    * (Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotVwapPointEventsOptions] = js.undefined
}

object PlotVwapPointOptions {
  @scala.inline
  def apply(events: PlotVwapPointEventsOptions = null): PlotVwapPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotVwapPointOptions]
  }
}

