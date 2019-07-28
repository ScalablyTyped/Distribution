package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotRsiDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotRsiDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotRsiDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotRsiDragDropGuideBoxDefaultOptions = null): PlotRsiDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotRsiDragDropGuideBoxOptions]
  }
}

