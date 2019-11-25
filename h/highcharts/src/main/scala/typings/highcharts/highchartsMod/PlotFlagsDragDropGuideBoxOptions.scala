package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotFlagsDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotFlagsDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotFlagsDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotFlagsDragDropGuideBoxDefaultOptions = null): PlotFlagsDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotFlagsDragDropGuideBoxOptions]
  }
}

