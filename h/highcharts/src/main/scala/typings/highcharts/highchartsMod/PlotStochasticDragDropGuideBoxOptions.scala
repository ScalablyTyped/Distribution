package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotStochasticDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotStochasticDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotStochasticDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotStochasticDragDropGuideBoxDefaultOptions = null): PlotStochasticDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotStochasticDragDropGuideBoxOptions]
  }
}

