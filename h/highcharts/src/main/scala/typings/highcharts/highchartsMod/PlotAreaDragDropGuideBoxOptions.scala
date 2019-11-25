package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotAreaDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotAreaDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotAreaDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotAreaDragDropGuideBoxDefaultOptions = null): PlotAreaDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotAreaDragDropGuideBoxOptions]
  }
}

