package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotBarDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotBarDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotBarDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotBarDragDropGuideBoxDefaultOptions = null): PlotBarDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotBarDragDropGuideBoxOptions]
  }
}

