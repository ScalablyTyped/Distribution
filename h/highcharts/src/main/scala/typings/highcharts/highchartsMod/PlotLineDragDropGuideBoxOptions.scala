package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotLineDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotLineDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotLineDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotLineDragDropGuideBoxDefaultOptions = null): PlotLineDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotLineDragDropGuideBoxOptions]
  }
}

