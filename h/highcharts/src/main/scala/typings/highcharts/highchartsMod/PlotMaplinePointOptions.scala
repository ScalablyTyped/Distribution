package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMaplinePointOptions extends js.Object {
  /**
    * (Highmaps) Events for each single point.
    */
  var events: js.UndefOr[PlotMaplinePointEventsOptions] = js.undefined
}

object PlotMaplinePointOptions {
  @scala.inline
  def apply(events: PlotMaplinePointEventsOptions = null): PlotMaplinePointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotMaplinePointOptions]
  }
}

