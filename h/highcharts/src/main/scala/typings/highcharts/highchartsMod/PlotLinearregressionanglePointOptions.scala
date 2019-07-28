package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotLinearregressionanglePointOptions extends js.Object {
  /**
    * (Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotLinearregressionanglePointEventsOptions] = js.undefined
}

object PlotLinearregressionanglePointOptions {
  @scala.inline
  def apply(events: PlotLinearregressionanglePointEventsOptions = null): PlotLinearregressionanglePointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[PlotLinearregressionanglePointOptions]
  }
}

