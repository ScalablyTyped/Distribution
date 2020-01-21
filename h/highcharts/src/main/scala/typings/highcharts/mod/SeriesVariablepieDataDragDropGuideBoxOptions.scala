package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesVariablepieDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesVariablepieDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesVariablepieDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesVariablepieDataDragDropGuideBoxDefaultOptions = null): SeriesVariablepieDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesVariablepieDataDragDropGuideBoxOptions]
  }
}

