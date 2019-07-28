package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesArearangeDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesArearangeDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesArearangeDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesArearangeDataDragDropGuideBoxDefaultOptions = null): SeriesArearangeDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[SeriesArearangeDataDragDropGuideBoxOptions]
  }
}

