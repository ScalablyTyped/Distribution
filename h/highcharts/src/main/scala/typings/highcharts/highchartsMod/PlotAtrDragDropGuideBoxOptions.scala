package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotAtrDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotAtrDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotAtrDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotAtrDragDropGuideBoxDefaultOptions = null): PlotAtrDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotAtrDragDropGuideBoxOptions]
  }
}

