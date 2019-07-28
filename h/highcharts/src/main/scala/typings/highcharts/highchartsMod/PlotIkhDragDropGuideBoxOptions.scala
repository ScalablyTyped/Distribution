package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotIkhDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotIkhDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotIkhDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotIkhDragDropGuideBoxDefaultOptions = null): PlotIkhDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotIkhDragDropGuideBoxOptions]
  }
}

