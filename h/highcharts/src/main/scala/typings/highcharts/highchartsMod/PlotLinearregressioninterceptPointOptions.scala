package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotLinearregressioninterceptPointOptions extends js.Object {
  /**
    * (Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotLinearregressioninterceptPointEventsOptions] = js.undefined
}

object PlotLinearregressioninterceptPointOptions {
  @scala.inline
  def apply(events: PlotLinearregressioninterceptPointEventsOptions = null): PlotLinearregressioninterceptPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotLinearregressioninterceptPointOptions]
  }
}

