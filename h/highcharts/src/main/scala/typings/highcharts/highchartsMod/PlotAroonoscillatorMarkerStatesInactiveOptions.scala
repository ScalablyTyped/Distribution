package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotAroonoscillatorMarkerStatesInactiveOptions extends js.Object {
  /**
    * (Highstock) Opacity of inactive markers.
    */
  var opacity: js.UndefOr[js.Any] = js.undefined
}

object PlotAroonoscillatorMarkerStatesInactiveOptions {
  @scala.inline
  def apply(opacity: js.Any = null): PlotAroonoscillatorMarkerStatesInactiveOptions = {
    val __obj = js.Dynamic.literal()
    if (opacity != null) __obj.updateDynamic("opacity")(opacity)
    __obj.asInstanceOf[PlotAroonoscillatorMarkerStatesInactiveOptions]
  }
}

