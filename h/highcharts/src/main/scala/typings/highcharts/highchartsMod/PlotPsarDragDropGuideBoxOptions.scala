package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPsarDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotPsarDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotPsarDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotPsarDragDropGuideBoxDefaultOptions = null): PlotPsarDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotPsarDragDropGuideBoxOptions]
  }
}

