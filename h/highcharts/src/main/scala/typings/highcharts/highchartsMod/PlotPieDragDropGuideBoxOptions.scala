package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPieDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotPieDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotPieDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotPieDragDropGuideBoxDefaultOptions = null): PlotPieDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotPieDragDropGuideBoxOptions]
  }
}

