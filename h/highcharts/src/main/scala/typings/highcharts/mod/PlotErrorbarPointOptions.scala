package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotErrorbarPointOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotErrorbarPointEventsOptions] = js.undefined
}

object PlotErrorbarPointOptions {
  @scala.inline
  def apply(events: PlotErrorbarPointEventsOptions = null): PlotErrorbarPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotErrorbarPointOptions]
  }
}

