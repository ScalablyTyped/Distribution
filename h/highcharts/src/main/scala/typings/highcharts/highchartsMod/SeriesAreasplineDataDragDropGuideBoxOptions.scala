package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesAreasplineDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesAreasplineDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesAreasplineDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesAreasplineDataDragDropGuideBoxDefaultOptions = null): SeriesAreasplineDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[SeriesAreasplineDataDragDropGuideBoxOptions]
  }
}

