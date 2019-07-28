package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPriceenvelopesPointOptions extends js.Object {
  /**
    * (Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotPriceenvelopesPointEventsOptions] = js.undefined
}

object PlotPriceenvelopesPointOptions {
  @scala.inline
  def apply(events: PlotPriceenvelopesPointEventsOptions = null): PlotPriceenvelopesPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[PlotPriceenvelopesPointOptions]
  }
}

