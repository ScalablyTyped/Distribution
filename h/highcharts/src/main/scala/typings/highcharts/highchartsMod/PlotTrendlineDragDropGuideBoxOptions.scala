package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotTrendlineDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotTrendlineDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotTrendlineDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotTrendlineDragDropGuideBoxDefaultOptions = null): PlotTrendlineDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotTrendlineDragDropGuideBoxOptions]
  }
}

