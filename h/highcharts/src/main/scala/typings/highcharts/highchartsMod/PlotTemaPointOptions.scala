package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotTemaPointOptions extends js.Object {
  /**
    * (Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotTemaPointEventsOptions] = js.undefined
}

object PlotTemaPointOptions {
  @scala.inline
  def apply(events: PlotTemaPointEventsOptions = null): PlotTemaPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotTemaPointOptions]
  }
}

