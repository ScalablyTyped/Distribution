package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotKeltnerchannelsPointOptions extends js.Object {
  /**
    * (Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotKeltnerchannelsPointEventsOptions] = js.undefined
}

object PlotKeltnerchannelsPointOptions {
  @scala.inline
  def apply(events: PlotKeltnerchannelsPointEventsOptions = null): PlotKeltnerchannelsPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[PlotKeltnerchannelsPointOptions]
  }
}

