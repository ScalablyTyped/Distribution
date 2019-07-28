package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesColumnDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesColumnDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesColumnDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesColumnDataDragDropGuideBoxDefaultOptions = null): SeriesColumnDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[SeriesColumnDataDragDropGuideBoxOptions]
  }
}

