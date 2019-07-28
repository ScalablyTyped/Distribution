package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotSplineDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotSplineDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotSplineDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotSplineDragDropGuideBoxDefaultOptions = null): PlotSplineDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotSplineDragDropGuideBoxOptions]
  }
}

