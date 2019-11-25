package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotAreasplineDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotAreasplineDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotAreasplineDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotAreasplineDragDropGuideBoxDefaultOptions = null): PlotAreasplineDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotAreasplineDragDropGuideBoxOptions]
  }
}

