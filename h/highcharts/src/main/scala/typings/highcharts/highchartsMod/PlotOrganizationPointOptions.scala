package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotOrganizationPointOptions extends js.Object {
  /**
    * (Highcharts) Events for each single point.
    */
  var events: js.UndefOr[PlotOrganizationPointEventsOptions] = js.undefined
}

object PlotOrganizationPointOptions {
  @scala.inline
  def apply(events: PlotOrganizationPointEventsOptions = null): PlotOrganizationPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotOrganizationPointOptions]
  }
}

