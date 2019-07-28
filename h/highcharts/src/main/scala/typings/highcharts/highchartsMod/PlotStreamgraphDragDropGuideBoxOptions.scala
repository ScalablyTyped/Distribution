package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotStreamgraphDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotStreamgraphDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotStreamgraphDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotStreamgraphDragDropGuideBoxDefaultOptions = null): PlotStreamgraphDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotStreamgraphDragDropGuideBoxOptions]
  }
}

