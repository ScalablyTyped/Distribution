package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotHistogramDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotHistogramDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotHistogramDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotHistogramDragDropGuideBoxDefaultOptions = null): PlotHistogramDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotHistogramDragDropGuideBoxOptions]
  }
}

