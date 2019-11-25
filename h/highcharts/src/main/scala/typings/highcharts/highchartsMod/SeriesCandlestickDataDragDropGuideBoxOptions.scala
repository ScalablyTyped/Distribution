package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesCandlestickDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesCandlestickDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesCandlestickDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesCandlestickDataDragDropGuideBoxDefaultOptions = null): SeriesCandlestickDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesCandlestickDataDragDropGuideBoxOptions]
  }
}

