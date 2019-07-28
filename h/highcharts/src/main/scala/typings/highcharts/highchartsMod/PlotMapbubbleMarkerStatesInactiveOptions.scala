package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMapbubbleMarkerStatesInactiveOptions extends js.Object {
  /**
    * (Highmaps) Opacity of inactive markers.
    */
  var opacity: js.UndefOr[js.Any] = js.undefined
}

object PlotMapbubbleMarkerStatesInactiveOptions {
  @scala.inline
  def apply(opacity: js.Any = null): PlotMapbubbleMarkerStatesInactiveOptions = {
    val __obj = js.Dynamic.literal()
    if (opacity != null) __obj.updateDynamic("opacity")(opacity)
    __obj.asInstanceOf[PlotMapbubbleMarkerStatesInactiveOptions]
  }
}

