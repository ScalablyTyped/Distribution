package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPsarPointOptions extends js.Object {
  /**
    * (Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotPsarPointEventsOptions] = js.undefined
}

object PlotPsarPointOptions {
  @scala.inline
  def apply(events: PlotPsarPointEventsOptions = null): PlotPsarPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[PlotPsarPointOptions]
  }
}

