package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotLinePointOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotLinePointEventsOptions] = js.undefined
}

object PlotLinePointOptions {
  @scala.inline
  def apply(events: PlotLinePointEventsOptions = null): PlotLinePointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[PlotLinePointOptions]
  }
}

