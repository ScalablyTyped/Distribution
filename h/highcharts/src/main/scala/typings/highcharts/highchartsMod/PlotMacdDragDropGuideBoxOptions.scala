package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMacdDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotMacdDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotMacdDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotMacdDragDropGuideBoxDefaultOptions = null): PlotMacdDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotMacdDragDropGuideBoxOptions]
  }
}

