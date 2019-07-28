package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesBoxplotDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesBoxplotDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesBoxplotDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesBoxplotDataDragDropGuideBoxDefaultOptions = null): SeriesBoxplotDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[SeriesBoxplotDataDragDropGuideBoxOptions]
  }
}

