package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMaplineDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highmaps) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotMaplineDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotMaplineDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotMaplineDragDropGuideBoxDefaultOptions = null): PlotMaplineDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotMaplineDragDropGuideBoxOptions]
  }
}

