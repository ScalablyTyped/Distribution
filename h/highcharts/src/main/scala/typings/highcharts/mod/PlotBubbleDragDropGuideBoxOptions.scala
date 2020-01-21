package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotBubbleDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotBubbleDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotBubbleDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotBubbleDragDropGuideBoxDefaultOptions = null): PlotBubbleDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotBubbleDragDropGuideBoxOptions]
  }
}

