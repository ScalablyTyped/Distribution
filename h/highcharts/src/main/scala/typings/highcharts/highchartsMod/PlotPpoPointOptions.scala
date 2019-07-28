package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPpoPointOptions extends js.Object {
  /**
    * (Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotPpoPointEventsOptions] = js.undefined
}

object PlotPpoPointOptions {
  @scala.inline
  def apply(events: PlotPpoPointEventsOptions = null): PlotPpoPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[PlotPpoPointOptions]
  }
}

