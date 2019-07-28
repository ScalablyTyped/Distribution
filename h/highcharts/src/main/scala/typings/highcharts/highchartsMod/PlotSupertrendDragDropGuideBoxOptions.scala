package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotSupertrendDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotSupertrendDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotSupertrendDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotSupertrendDragDropGuideBoxDefaultOptions = null): PlotSupertrendDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotSupertrendDragDropGuideBoxOptions]
  }
}

