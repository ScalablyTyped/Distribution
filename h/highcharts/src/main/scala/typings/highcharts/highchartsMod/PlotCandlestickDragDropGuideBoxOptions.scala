package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotCandlestickDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotCandlestickDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotCandlestickDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotCandlestickDragDropGuideBoxDefaultOptions = null): PlotCandlestickDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotCandlestickDragDropGuideBoxOptions]
  }
}

