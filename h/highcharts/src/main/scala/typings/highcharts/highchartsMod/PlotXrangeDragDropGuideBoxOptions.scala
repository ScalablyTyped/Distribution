package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotXrangeDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) Style options for the guide box default
    * state.
    */
  var default: js.UndefOr[PlotXrangeDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotXrangeDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotXrangeDragDropGuideBoxDefaultOptions = null): PlotXrangeDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotXrangeDragDropGuideBoxOptions]
  }
}

