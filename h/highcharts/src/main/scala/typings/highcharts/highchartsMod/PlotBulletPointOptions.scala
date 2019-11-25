package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotBulletPointOptions extends js.Object {
  /**
    * (Highcharts) Events for each single point.
    */
  var events: js.UndefOr[PlotBulletPointEventsOptions] = js.undefined
}

object PlotBulletPointOptions {
  @scala.inline
  def apply(events: PlotBulletPointEventsOptions = null): PlotBulletPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotBulletPointOptions]
  }
}

