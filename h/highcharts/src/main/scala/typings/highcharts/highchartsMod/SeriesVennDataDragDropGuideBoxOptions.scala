package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesVennDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesVennDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesVennDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesVennDataDragDropGuideBoxDefaultOptions = null): SeriesVennDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesVennDataDragDropGuideBoxOptions]
  }
}

