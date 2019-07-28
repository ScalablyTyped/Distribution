package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotAroonoscillatorPointOptions extends js.Object {
  /**
    * (Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotAroonoscillatorPointEventsOptions] = js.undefined
}

object PlotAroonoscillatorPointOptions {
  @scala.inline
  def apply(events: PlotAroonoscillatorPointEventsOptions = null): PlotAroonoscillatorPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[PlotAroonoscillatorPointOptions]
  }
}

