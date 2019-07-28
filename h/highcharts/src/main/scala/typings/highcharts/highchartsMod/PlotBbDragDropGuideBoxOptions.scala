package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotBbDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotBbDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotBbDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotBbDragDropGuideBoxDefaultOptions = null): PlotBbDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotBbDragDropGuideBoxOptions]
  }
}

