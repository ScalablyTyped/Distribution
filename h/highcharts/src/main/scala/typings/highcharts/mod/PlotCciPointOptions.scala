package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotCciPointOptions extends js.Object {
  /**
    * (Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotCciPointEventsOptions] = js.undefined
}

object PlotCciPointOptions {
  @scala.inline
  def apply(events: PlotCciPointEventsOptions = null): PlotCciPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotCciPointOptions]
  }
}

