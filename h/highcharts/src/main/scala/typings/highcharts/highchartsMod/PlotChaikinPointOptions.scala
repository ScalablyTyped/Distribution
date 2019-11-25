package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotChaikinPointOptions extends js.Object {
  /**
    * (Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotChaikinPointEventsOptions] = js.undefined
}

object PlotChaikinPointOptions {
  @scala.inline
  def apply(events: PlotChaikinPointEventsOptions = null): PlotChaikinPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotChaikinPointOptions]
  }
}

