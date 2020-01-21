package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotStochasticPointOptions extends js.Object {
  /**
    * (Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotStochasticPointEventsOptions] = js.undefined
}

object PlotStochasticPointOptions {
  @scala.inline
  def apply(events: PlotStochasticPointEventsOptions = null): PlotStochasticPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotStochasticPointOptions]
  }
}

