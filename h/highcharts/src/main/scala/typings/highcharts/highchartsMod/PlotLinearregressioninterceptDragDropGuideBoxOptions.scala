package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotLinearregressioninterceptDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotLinearregressioninterceptDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotLinearregressioninterceptDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotLinearregressioninterceptDragDropGuideBoxDefaultOptions = null): PlotLinearregressioninterceptDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotLinearregressioninterceptDragDropGuideBoxOptions]
  }
}

