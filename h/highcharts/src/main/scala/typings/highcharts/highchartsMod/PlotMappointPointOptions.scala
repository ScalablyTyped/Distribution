package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMappointPointOptions extends js.Object {
  /**
    * (Highmaps) Events for each single point.
    */
  var events: js.UndefOr[PlotMappointPointEventsOptions] = js.undefined
}

object PlotMappointPointOptions {
  @scala.inline
  def apply(events: PlotMappointPointEventsOptions = null): PlotMappointPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[PlotMappointPointOptions]
  }
}

