package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotLinearregressionangleDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotLinearregressionangleDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotLinearregressionangleDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotLinearregressionangleDragDropGuideBoxDefaultOptions = null): PlotLinearregressionangleDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotLinearregressionangleDragDropGuideBoxOptions]
  }
}

