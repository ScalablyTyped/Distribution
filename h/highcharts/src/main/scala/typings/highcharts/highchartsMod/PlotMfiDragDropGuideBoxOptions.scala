package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMfiDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotMfiDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotMfiDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotMfiDragDropGuideBoxDefaultOptions = null): PlotMfiDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotMfiDragDropGuideBoxOptions]
  }
}

