package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesVariwideDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesVariwideDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesVariwideDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesVariwideDataDragDropGuideBoxDefaultOptions = null): SeriesVariwideDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesVariwideDataDragDropGuideBoxOptions]
  }
}

