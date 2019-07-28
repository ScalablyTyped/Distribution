package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesVectorDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesVectorDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesVectorDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesVectorDataDragDropGuideBoxDefaultOptions = null): SeriesVectorDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[SeriesVectorDataDragDropGuideBoxOptions]
  }
}

