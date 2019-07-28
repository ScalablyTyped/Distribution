package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotGaugeDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotGaugeDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotGaugeDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotGaugeDragDropGuideBoxDefaultOptions = null): PlotGaugeDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotGaugeDragDropGuideBoxOptions]
  }
}

