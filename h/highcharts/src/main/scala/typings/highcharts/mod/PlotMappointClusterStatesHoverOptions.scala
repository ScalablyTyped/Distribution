package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMappointClusterStatesHoverOptions extends js.Object {
  /**
    * (Highcharts, Highmaps) The fill color of the cluster marker in hover
    * state. When `undefined`, the series' or point's fillColor for normal
    * state is used.
    */
  var fillColor: js.UndefOr[ColorType] = js.undefined
}

object PlotMappointClusterStatesHoverOptions {
  @scala.inline
  def apply(fillColor: ColorType = null): PlotMappointClusterStatesHoverOptions = {
    val __obj = js.Dynamic.literal()
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotMappointClusterStatesHoverOptions]
  }
}

