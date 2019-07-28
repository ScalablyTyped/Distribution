package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotWilliamsrPointOptions extends js.Object {
  /**
    * (Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotWilliamsrPointEventsOptions] = js.undefined
}

object PlotWilliamsrPointOptions {
  @scala.inline
  def apply(events: PlotWilliamsrPointEventsOptions = null): PlotWilliamsrPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[PlotWilliamsrPointOptions]
  }
}

