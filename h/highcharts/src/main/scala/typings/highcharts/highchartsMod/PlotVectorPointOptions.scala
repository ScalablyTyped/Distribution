package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotVectorPointOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotVectorPointEventsOptions] = js.undefined
}

object PlotVectorPointOptions {
  @scala.inline
  def apply(events: PlotVectorPointEventsOptions = null): PlotVectorPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotVectorPointOptions]
  }
}

