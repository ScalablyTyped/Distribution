package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesColumnrangeDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesColumnrangeDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesColumnrangeDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesColumnrangeDataDragDropGuideBoxDefaultOptions = null): SeriesColumnrangeDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[SeriesColumnrangeDataDragDropGuideBoxOptions]
  }
}

