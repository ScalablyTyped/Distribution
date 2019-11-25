package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotDependencywheelPointOptions extends js.Object {
  /**
    * (Highcharts) Events for each single point.
    */
  var events: js.UndefOr[PlotDependencywheelPointEventsOptions] = js.undefined
}

object PlotDependencywheelPointOptions {
  @scala.inline
  def apply(events: PlotDependencywheelPointEventsOptions = null): PlotDependencywheelPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotDependencywheelPointOptions]
  }
}

