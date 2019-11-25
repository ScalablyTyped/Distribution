package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotDpoPointOptions extends js.Object {
  /**
    * (Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotDpoPointEventsOptions] = js.undefined
}

object PlotDpoPointOptions {
  @scala.inline
  def apply(events: PlotDpoPointEventsOptions = null): PlotDpoPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotDpoPointOptions]
  }
}

