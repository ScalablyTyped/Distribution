package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotIkhPointOptions extends js.Object {
  /**
    * (Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotIkhPointEventsOptions] = js.undefined
}

object PlotIkhPointOptions {
  @scala.inline
  def apply(events: PlotIkhPointEventsOptions = null): PlotIkhPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotIkhPointOptions]
  }
}

