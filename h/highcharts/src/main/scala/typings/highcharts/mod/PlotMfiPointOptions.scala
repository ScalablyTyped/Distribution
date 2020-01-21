package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMfiPointOptions extends js.Object {
  /**
    * (Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotMfiPointEventsOptions] = js.undefined
}

object PlotMfiPointOptions {
  @scala.inline
  def apply(events: PlotMfiPointEventsOptions = null): PlotMfiPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotMfiPointOptions]
  }
}

