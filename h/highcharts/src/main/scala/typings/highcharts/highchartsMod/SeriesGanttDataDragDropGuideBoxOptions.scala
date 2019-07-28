package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesGanttDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Gantt) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesGanttDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesGanttDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesGanttDataDragDropGuideBoxDefaultOptions = null): SeriesGanttDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[SeriesGanttDataDragDropGuideBoxOptions]
  }
}

