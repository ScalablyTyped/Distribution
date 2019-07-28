package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotLinearregressionPointOptions extends js.Object {
  /**
    * (Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotLinearregressionPointEventsOptions] = js.undefined
}

object PlotLinearregressionPointOptions {
  @scala.inline
  def apply(events: PlotLinearregressionPointEventsOptions = null): PlotLinearregressionPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[PlotLinearregressionPointOptions]
  }
}

