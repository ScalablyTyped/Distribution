package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotLinearregressionslopePointOptions extends js.Object {
  /**
    * (Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotLinearregressionslopePointEventsOptions] = js.undefined
}

object PlotLinearregressionslopePointOptions {
  @scala.inline
  def apply(events: PlotLinearregressionslopePointEventsOptions = null): PlotLinearregressionslopePointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotLinearregressionslopePointOptions]
  }
}

