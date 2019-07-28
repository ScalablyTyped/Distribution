package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotDependencywheelDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotDependencywheelDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotDependencywheelDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotDependencywheelDragDropGuideBoxDefaultOptions = null): PlotDependencywheelDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotDependencywheelDragDropGuideBoxOptions]
  }
}

