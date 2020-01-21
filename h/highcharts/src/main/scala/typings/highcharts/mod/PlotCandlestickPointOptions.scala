package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotCandlestickPointOptions extends js.Object {
  /**
    * (Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotCandlestickPointEventsOptions] = js.undefined
}

object PlotCandlestickPointOptions {
  @scala.inline
  def apply(events: PlotCandlestickPointEventsOptions = null): PlotCandlestickPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotCandlestickPointOptions]
  }
}

