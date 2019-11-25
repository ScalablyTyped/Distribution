package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesItemDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesItemDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesItemDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesItemDataDragDropGuideBoxDefaultOptions = null): SeriesItemDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesItemDataDragDropGuideBoxOptions]
  }
}

