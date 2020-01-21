package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotCylinderPointOptions extends js.Object {
  /**
    * (Highcharts) Events for each single point.
    */
  var events: js.UndefOr[PlotCylinderPointEventsOptions] = js.undefined
}

object PlotCylinderPointOptions {
  @scala.inline
  def apply(events: PlotCylinderPointEventsOptions = null): PlotCylinderPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotCylinderPointOptions]
  }
}

