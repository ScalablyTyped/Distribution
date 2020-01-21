package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotTilemapPointOptions extends js.Object {
  /**
    * (Highcharts, Highmaps) Events for each single point.
    */
  var events: js.UndefOr[PlotTilemapPointEventsOptions] = js.undefined
}

object PlotTilemapPointOptions {
  @scala.inline
  def apply(events: PlotTilemapPointEventsOptions = null): PlotTilemapPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotTilemapPointOptions]
  }
}

