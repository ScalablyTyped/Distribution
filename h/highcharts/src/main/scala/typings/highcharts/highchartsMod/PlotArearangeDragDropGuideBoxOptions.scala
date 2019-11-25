package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotArearangeDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotArearangeDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotArearangeDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotArearangeDragDropGuideBoxDefaultOptions = null): PlotArearangeDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotArearangeDragDropGuideBoxOptions]
  }
}

