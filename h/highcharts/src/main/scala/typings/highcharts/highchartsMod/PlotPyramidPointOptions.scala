package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPyramidPointOptions extends js.Object {
  /**
    * (Highcharts) Events for each single point.
    */
  var events: js.UndefOr[PlotPyramidPointEventsOptions] = js.undefined
}

object PlotPyramidPointOptions {
  @scala.inline
  def apply(events: PlotPyramidPointEventsOptions = null): PlotPyramidPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotPyramidPointOptions]
  }
}

