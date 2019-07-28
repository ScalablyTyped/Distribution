package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPcDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotPcDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotPcDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotPcDragDropGuideBoxDefaultOptions = null): PlotPcDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotPcDragDropGuideBoxOptions]
  }
}

