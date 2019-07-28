package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotAbandsDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotAbandsDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotAbandsDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotAbandsDragDropGuideBoxDefaultOptions = null): PlotAbandsDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotAbandsDragDropGuideBoxOptions]
  }
}

