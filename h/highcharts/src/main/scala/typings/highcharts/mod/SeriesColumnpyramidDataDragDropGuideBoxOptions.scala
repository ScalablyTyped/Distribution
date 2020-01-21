package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesColumnpyramidDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesColumnpyramidDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesColumnpyramidDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesColumnpyramidDataDragDropGuideBoxDefaultOptions = null): SeriesColumnpyramidDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesColumnpyramidDataDragDropGuideBoxOptions]
  }
}

