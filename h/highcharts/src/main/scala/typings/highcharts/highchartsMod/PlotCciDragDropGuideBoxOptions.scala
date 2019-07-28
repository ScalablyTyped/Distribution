package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotCciDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotCciDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotCciDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotCciDragDropGuideBoxDefaultOptions = null): PlotCciDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotCciDragDropGuideBoxOptions]
  }
}

