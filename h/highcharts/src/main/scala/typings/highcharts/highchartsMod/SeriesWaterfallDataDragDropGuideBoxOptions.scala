package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesWaterfallDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesWaterfallDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesWaterfallDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesWaterfallDataDragDropGuideBoxDefaultOptions = null): SeriesWaterfallDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesWaterfallDataDragDropGuideBoxOptions]
  }
}

