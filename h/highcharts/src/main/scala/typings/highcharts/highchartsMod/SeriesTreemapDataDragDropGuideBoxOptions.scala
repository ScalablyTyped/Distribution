package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesTreemapDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesTreemapDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesTreemapDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesTreemapDataDragDropGuideBoxDefaultOptions = null): SeriesTreemapDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[SeriesTreemapDataDragDropGuideBoxOptions]
  }
}

