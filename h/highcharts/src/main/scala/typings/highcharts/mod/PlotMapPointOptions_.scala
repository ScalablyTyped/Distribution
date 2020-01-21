package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMapPointOptions_ extends js.Object {
  /**
    * (Highmaps) Events for each single point.
    */
  var events: js.UndefOr[PlotMapPointEventsOptions_] = js.undefined
}

object PlotMapPointOptions_ {
  @scala.inline
  def apply(events: PlotMapPointEventsOptions_ = null): PlotMapPointOptions_ = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotMapPointOptions_]
  }
}

