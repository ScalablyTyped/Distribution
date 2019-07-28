package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotWmaPointOptions extends js.Object {
  /**
    * (Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotWmaPointEventsOptions] = js.undefined
}

object PlotWmaPointOptions {
  @scala.inline
  def apply(events: PlotWmaPointEventsOptions = null): PlotWmaPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[PlotWmaPointOptions]
  }
}

