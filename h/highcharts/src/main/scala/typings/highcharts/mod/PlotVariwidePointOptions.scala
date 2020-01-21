package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotVariwidePointOptions extends js.Object {
  /**
    * (Highcharts) Events for each single point.
    */
  var events: js.UndefOr[PlotVariwidePointEventsOptions] = js.undefined
}

object PlotVariwidePointOptions {
  @scala.inline
  def apply(events: PlotVariwidePointEventsOptions = null): PlotVariwidePointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotVariwidePointOptions]
  }
}

