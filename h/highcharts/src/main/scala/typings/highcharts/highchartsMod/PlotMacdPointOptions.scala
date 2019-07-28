package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMacdPointOptions extends js.Object {
  /**
    * (Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotMacdPointEventsOptions] = js.undefined
}

object PlotMacdPointOptions {
  @scala.inline
  def apply(events: PlotMacdPointEventsOptions = null): PlotMacdPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[PlotMacdPointOptions]
  }
}

