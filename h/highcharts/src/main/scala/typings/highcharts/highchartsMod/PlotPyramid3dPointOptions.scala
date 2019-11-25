package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPyramid3dPointOptions extends js.Object {
  /**
    * (Highcharts) Events for each single point.
    */
  var events: js.UndefOr[PlotPyramid3dPointEventsOptions] = js.undefined
}

object PlotPyramid3dPointOptions {
  @scala.inline
  def apply(events: PlotPyramid3dPointEventsOptions = null): PlotPyramid3dPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotPyramid3dPointOptions]
  }
}

