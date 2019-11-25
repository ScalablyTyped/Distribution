package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotScatter3dPointOptions extends js.Object {
  /**
    * (Highcharts) Events for each single point.
    */
  var events: js.UndefOr[PlotScatter3dPointEventsOptions] = js.undefined
}

object PlotScatter3dPointOptions {
  @scala.inline
  def apply(events: PlotScatter3dPointEventsOptions = null): PlotScatter3dPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotScatter3dPointOptions]
  }
}

