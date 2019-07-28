package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotLinearregressionDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotLinearregressionDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotLinearregressionDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotLinearregressionDragDropGuideBoxDefaultOptions = null): PlotLinearregressionDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotLinearregressionDragDropGuideBoxOptions]
  }
}

