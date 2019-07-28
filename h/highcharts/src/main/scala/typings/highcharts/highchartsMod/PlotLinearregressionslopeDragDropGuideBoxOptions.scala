package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotLinearregressionslopeDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotLinearregressionslopeDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotLinearregressionslopeDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotLinearregressionslopeDragDropGuideBoxDefaultOptions = null): PlotLinearregressionslopeDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotLinearregressionslopeDragDropGuideBoxOptions]
  }
}

