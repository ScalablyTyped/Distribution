package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotFunnel3dDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotFunnel3dDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotFunnel3dDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotFunnel3dDragDropGuideBoxDefaultOptions = null): PlotFunnel3dDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotFunnel3dDragDropGuideBoxOptions]
  }
}

