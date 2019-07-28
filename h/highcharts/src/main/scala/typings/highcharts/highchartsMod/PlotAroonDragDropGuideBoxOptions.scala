package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotAroonDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotAroonDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotAroonDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotAroonDragDropGuideBoxDefaultOptions = null): PlotAroonDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotAroonDragDropGuideBoxOptions]
  }
}

