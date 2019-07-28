package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPolygonPointOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotPolygonPointEventsOptions] = js.undefined
}

object PlotPolygonPointOptions {
  @scala.inline
  def apply(events: PlotPolygonPointEventsOptions = null): PlotPolygonPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[PlotPolygonPointOptions]
  }
}

