package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotFunnelDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotFunnelDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotFunnelDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotFunnelDragDropGuideBoxDefaultOptions = null): PlotFunnelDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotFunnelDragDropGuideBoxOptions]
  }
}

