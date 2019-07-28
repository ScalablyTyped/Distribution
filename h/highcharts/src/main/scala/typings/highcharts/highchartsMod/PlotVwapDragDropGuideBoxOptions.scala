package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotVwapDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotVwapDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotVwapDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotVwapDragDropGuideBoxDefaultOptions = null): PlotVwapDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotVwapDragDropGuideBoxOptions]
  }
}

