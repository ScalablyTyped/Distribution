package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMappointMarkerStatesInactiveOptions extends js.Object {
  /**
    * (Highmaps) Opacity of inactive markers.
    */
  var opacity: js.UndefOr[js.Any] = js.undefined
}

object PlotMappointMarkerStatesInactiveOptions {
  @scala.inline
  def apply(opacity: js.Any = null): PlotMappointMarkerStatesInactiveOptions = {
    val __obj = js.Dynamic.literal()
    if (opacity != null) __obj.updateDynamic("opacity")(opacity)
    __obj.asInstanceOf[PlotMappointMarkerStatesInactiveOptions]
  }
}

