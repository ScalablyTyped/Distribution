package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesTilemapDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts, Highmaps) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesTilemapDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesTilemapDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesTilemapDataDragDropGuideBoxDefaultOptions = null): SeriesTilemapDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesTilemapDataDragDropGuideBoxOptions]
  }
}

