package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotGanttDragDropGuideBoxOptions extends js.Object {
  /**
    * (Gantt) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotGanttDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotGanttDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotGanttDragDropGuideBoxDefaultOptions = null): PlotGanttDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotGanttDragDropGuideBoxOptions]
  }
}

