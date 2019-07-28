package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotWilliamsrDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotWilliamsrDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotWilliamsrDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotWilliamsrDragDropGuideBoxDefaultOptions = null): PlotWilliamsrDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotWilliamsrDragDropGuideBoxOptions]
  }
}

