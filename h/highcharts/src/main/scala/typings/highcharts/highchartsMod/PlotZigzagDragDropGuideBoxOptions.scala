package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotZigzagDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotZigzagDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotZigzagDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotZigzagDragDropGuideBoxDefaultOptions = null): PlotZigzagDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotZigzagDragDropGuideBoxOptions]
  }
}

