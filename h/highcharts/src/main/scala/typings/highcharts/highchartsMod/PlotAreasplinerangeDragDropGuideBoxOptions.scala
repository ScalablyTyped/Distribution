package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotAreasplinerangeDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotAreasplinerangeDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotAreasplinerangeDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotAreasplinerangeDragDropGuideBoxDefaultOptions = null): PlotAreasplinerangeDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotAreasplinerangeDragDropGuideBoxOptions]
  }
}

