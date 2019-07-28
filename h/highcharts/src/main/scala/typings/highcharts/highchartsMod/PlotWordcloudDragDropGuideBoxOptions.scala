package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotWordcloudDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotWordcloudDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotWordcloudDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotWordcloudDragDropGuideBoxDefaultOptions = null): PlotWordcloudDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotWordcloudDragDropGuideBoxOptions]
  }
}

