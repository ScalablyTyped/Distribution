package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotTimelineMarkerStatesInactiveOptions extends js.Object {
  /**
    * (Highcharts) Opacity of inactive markers.
    */
  var opacity: js.UndefOr[js.Any] = js.undefined
}

object PlotTimelineMarkerStatesInactiveOptions {
  @scala.inline
  def apply(opacity: js.Any = null): PlotTimelineMarkerStatesInactiveOptions = {
    val __obj = js.Dynamic.literal()
    if (opacity != null) __obj.updateDynamic("opacity")(opacity)
    __obj.asInstanceOf[PlotTimelineMarkerStatesInactiveOptions]
  }
}

