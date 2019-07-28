package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotVbpDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotVbpDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotVbpDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotVbpDragDropGuideBoxDefaultOptions = null): PlotVbpDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotVbpDragDropGuideBoxOptions]
  }
}

