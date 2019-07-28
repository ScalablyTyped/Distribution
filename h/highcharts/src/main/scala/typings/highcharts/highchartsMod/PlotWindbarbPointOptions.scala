package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotWindbarbPointOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotWindbarbPointEventsOptions] = js.undefined
}

object PlotWindbarbPointOptions {
  @scala.inline
  def apply(events: PlotWindbarbPointEventsOptions = null): PlotWindbarbPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[PlotWindbarbPointOptions]
  }
}

