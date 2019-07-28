package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotColumnpyramidPointOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotColumnpyramidPointEventsOptions] = js.undefined
}

object PlotColumnpyramidPointOptions {
  @scala.inline
  def apply(events: PlotColumnpyramidPointEventsOptions = null): PlotColumnpyramidPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[PlotColumnpyramidPointOptions]
  }
}

