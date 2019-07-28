package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesWindbarbDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesWindbarbDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesWindbarbDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesWindbarbDataDragDropGuideBoxDefaultOptions = null): SeriesWindbarbDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[SeriesWindbarbDataDragDropGuideBoxOptions]
  }
}

