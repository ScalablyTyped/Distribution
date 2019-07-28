package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotHeatmapDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts, Highmaps) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotHeatmapDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotHeatmapDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotHeatmapDragDropGuideBoxDefaultOptions = null): PlotHeatmapDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotHeatmapDragDropGuideBoxOptions]
  }
}

