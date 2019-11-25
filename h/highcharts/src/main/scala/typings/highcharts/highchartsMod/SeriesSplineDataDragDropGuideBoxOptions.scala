package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesSplineDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesSplineDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesSplineDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesSplineDataDragDropGuideBoxDefaultOptions = null): SeriesSplineDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesSplineDataDragDropGuideBoxOptions]
  }
}

