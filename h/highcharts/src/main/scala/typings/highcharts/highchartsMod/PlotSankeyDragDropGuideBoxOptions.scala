package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotSankeyDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotSankeyDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotSankeyDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotSankeyDragDropGuideBoxDefaultOptions = null): PlotSankeyDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotSankeyDragDropGuideBoxOptions]
  }
}

