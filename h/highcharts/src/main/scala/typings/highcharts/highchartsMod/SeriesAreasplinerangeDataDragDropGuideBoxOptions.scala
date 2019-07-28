package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesAreasplinerangeDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesAreasplinerangeDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesAreasplinerangeDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesAreasplinerangeDataDragDropGuideBoxDefaultOptions = null): SeriesAreasplinerangeDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[SeriesAreasplinerangeDataDragDropGuideBoxOptions]
  }
}

