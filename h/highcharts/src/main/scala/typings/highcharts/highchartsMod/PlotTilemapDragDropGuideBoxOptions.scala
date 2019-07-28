package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotTilemapDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts, Highmaps) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotTilemapDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotTilemapDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotTilemapDragDropGuideBoxDefaultOptions = null): PlotTilemapDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotTilemapDragDropGuideBoxOptions]
  }
}

