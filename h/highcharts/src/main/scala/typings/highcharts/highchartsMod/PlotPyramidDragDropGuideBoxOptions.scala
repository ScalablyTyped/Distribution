package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPyramidDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotPyramidDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotPyramidDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotPyramidDragDropGuideBoxDefaultOptions = null): PlotPyramidDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotPyramidDragDropGuideBoxOptions]
  }
}

