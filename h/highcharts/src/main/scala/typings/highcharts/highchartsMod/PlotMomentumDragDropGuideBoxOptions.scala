package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMomentumDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotMomentumDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotMomentumDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotMomentumDragDropGuideBoxDefaultOptions = null): PlotMomentumDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotMomentumDragDropGuideBoxOptions]
  }
}

