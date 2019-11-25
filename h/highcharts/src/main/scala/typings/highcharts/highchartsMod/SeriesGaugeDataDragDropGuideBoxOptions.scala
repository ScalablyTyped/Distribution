package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesGaugeDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesGaugeDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesGaugeDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesGaugeDataDragDropGuideBoxDefaultOptions = null): SeriesGaugeDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesGaugeDataDragDropGuideBoxOptions]
  }
}

