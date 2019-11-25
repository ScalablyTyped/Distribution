package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotSplinePointOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotSplinePointEventsOptions] = js.undefined
}

object PlotSplinePointOptions {
  @scala.inline
  def apply(events: PlotSplinePointEventsOptions = null): PlotSplinePointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotSplinePointOptions]
  }
}

