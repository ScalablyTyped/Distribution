package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesLineDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesLineDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesLineDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesLineDataDragDropGuideBoxDefaultOptions = null): SeriesLineDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[SeriesLineDataDragDropGuideBoxOptions]
  }
}

