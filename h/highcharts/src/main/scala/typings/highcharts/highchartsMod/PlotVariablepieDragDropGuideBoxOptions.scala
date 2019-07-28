package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotVariablepieDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotVariablepieDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotVariablepieDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotVariablepieDragDropGuideBoxDefaultOptions = null): PlotVariablepieDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotVariablepieDragDropGuideBoxOptions]
  }
}

