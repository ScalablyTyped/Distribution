package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPivotpointsDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotPivotpointsDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotPivotpointsDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotPivotpointsDragDropGuideBoxDefaultOptions = null): PlotPivotpointsDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotPivotpointsDragDropGuideBoxOptions]
  }
}

