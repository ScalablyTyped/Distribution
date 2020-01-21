package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotBubblePointOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotBubblePointEventsOptions] = js.undefined
}

object PlotBubblePointOptions {
  @scala.inline
  def apply(events: PlotBubblePointEventsOptions = null): PlotBubblePointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotBubblePointOptions]
  }
}

