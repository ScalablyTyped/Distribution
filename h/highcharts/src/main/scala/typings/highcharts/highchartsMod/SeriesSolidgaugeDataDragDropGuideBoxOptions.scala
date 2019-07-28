package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesSolidgaugeDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesSolidgaugeDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesSolidgaugeDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesSolidgaugeDataDragDropGuideBoxDefaultOptions = null): SeriesSolidgaugeDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[SeriesSolidgaugeDataDragDropGuideBoxOptions]
  }
}

