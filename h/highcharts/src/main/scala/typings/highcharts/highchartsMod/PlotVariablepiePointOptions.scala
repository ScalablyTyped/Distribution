package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotVariablepiePointOptions extends js.Object {
  /**
    * (Highcharts) Events for each single point.
    */
  var events: js.UndefOr[PlotVariablepiePointEventsOptions] = js.undefined
}

object PlotVariablepiePointOptions {
  @scala.inline
  def apply(events: PlotVariablepiePointEventsOptions = null): PlotVariablepiePointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[PlotVariablepiePointOptions]
  }
}

