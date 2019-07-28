package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotBellcurveDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotBellcurveDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotBellcurveDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotBellcurveDragDropGuideBoxDefaultOptions = null): PlotBellcurveDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotBellcurveDragDropGuideBoxOptions]
  }
}

