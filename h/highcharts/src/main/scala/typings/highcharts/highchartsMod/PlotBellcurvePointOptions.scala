package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotBellcurvePointOptions extends js.Object {
  /**
    * (Highcharts) Events for each single point.
    */
  var events: js.UndefOr[PlotBellcurvePointEventsOptions] = js.undefined
}

object PlotBellcurvePointOptions {
  @scala.inline
  def apply(events: PlotBellcurvePointEventsOptions = null): PlotBellcurvePointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotBellcurvePointOptions]
  }
}

