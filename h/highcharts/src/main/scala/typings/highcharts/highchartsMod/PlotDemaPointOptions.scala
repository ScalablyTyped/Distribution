package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotDemaPointOptions extends js.Object {
  /**
    * (Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotDemaPointEventsOptions] = js.undefined
}

object PlotDemaPointOptions {
  @scala.inline
  def apply(events: PlotDemaPointEventsOptions = null): PlotDemaPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[PlotDemaPointOptions]
  }
}

