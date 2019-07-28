package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotEmaMarkerStatesInactiveOptions extends js.Object {
  /**
    * (Highstock) Opacity of inactive markers.
    */
  var opacity: js.UndefOr[js.Any] = js.undefined
}

object PlotEmaMarkerStatesInactiveOptions {
  @scala.inline
  def apply(opacity: js.Any = null): PlotEmaMarkerStatesInactiveOptions = {
    val __obj = js.Dynamic.literal()
    if (opacity != null) __obj.updateDynamic("opacity")(opacity)
    __obj.asInstanceOf[PlotEmaMarkerStatesInactiveOptions]
  }
}

