package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesHeatmapDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts, Highmaps) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesHeatmapDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesHeatmapDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesHeatmapDataDragDropGuideBoxDefaultOptions = null): SeriesHeatmapDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[SeriesHeatmapDataDragDropGuideBoxOptions]
  }
}

