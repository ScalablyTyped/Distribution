package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMomentumPointOptions extends js.Object {
  /**
    * (Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotMomentumPointEventsOptions] = js.undefined
}

object PlotMomentumPointOptions {
  @scala.inline
  def apply(events: PlotMomentumPointEventsOptions = null): PlotMomentumPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[PlotMomentumPointOptions]
  }
}

