package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMapbubbleDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highmaps) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotMapbubbleDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotMapbubbleDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotMapbubbleDragDropGuideBoxDefaultOptions = null): PlotMapbubbleDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotMapbubbleDragDropGuideBoxOptions]
  }
}

