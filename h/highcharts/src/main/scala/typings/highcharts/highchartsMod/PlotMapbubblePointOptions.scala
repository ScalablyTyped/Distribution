package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMapbubblePointOptions extends js.Object {
  /**
    * (Highmaps) Events for each single point.
    */
  var events: js.UndefOr[PlotMapbubblePointEventsOptions] = js.undefined
}

object PlotMapbubblePointOptions {
  @scala.inline
  def apply(events: PlotMapbubblePointEventsOptions = null): PlotMapbubblePointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[PlotMapbubblePointOptions]
  }
}

