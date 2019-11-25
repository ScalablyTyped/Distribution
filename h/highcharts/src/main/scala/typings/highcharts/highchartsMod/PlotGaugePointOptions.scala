package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotGaugePointOptions extends js.Object {
  /**
    * (Highcharts) Events for each single point.
    */
  var events: js.UndefOr[PlotGaugePointEventsOptions] = js.undefined
}

object PlotGaugePointOptions {
  @scala.inline
  def apply(events: PlotGaugePointEventsOptions = null): PlotGaugePointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotGaugePointOptions]
  }
}

