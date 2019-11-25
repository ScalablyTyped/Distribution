package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMapDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highmaps) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotMapDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotMapDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotMapDragDropGuideBoxDefaultOptions = null): PlotMapDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotMapDragDropGuideBoxOptions]
  }
}

