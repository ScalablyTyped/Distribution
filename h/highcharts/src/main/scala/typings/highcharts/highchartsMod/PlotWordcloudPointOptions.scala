package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotWordcloudPointOptions extends js.Object {
  /**
    * (Highcharts) Events for each single point.
    */
  var events: js.UndefOr[PlotWordcloudPointEventsOptions] = js.undefined
}

object PlotWordcloudPointOptions {
  @scala.inline
  def apply(events: PlotWordcloudPointEventsOptions = null): PlotWordcloudPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotWordcloudPointOptions]
  }
}

