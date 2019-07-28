package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotBarPointOptions extends js.Object {
  /**
    * (Highcharts) Events for each single point.
    */
  var events: js.UndefOr[PlotBarPointEventsOptions] = js.undefined
}

object PlotBarPointOptions {
  @scala.inline
  def apply(events: PlotBarPointEventsOptions = null): PlotBarPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[PlotBarPointOptions]
  }
}

