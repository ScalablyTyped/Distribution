package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotScatter3dDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotScatter3dDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotScatter3dDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotScatter3dDragDropGuideBoxDefaultOptions = null): PlotScatter3dDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotScatter3dDragDropGuideBoxOptions]
  }
}

