package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotColumnpyramidDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotColumnpyramidDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotColumnpyramidDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotColumnpyramidDragDropGuideBoxDefaultOptions = null): PlotColumnpyramidDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotColumnpyramidDragDropGuideBoxOptions]
  }
}

