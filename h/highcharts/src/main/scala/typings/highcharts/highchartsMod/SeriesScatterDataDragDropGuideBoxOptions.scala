package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesScatterDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesScatterDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesScatterDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesScatterDataDragDropGuideBoxDefaultOptions = null): SeriesScatterDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[SeriesScatterDataDragDropGuideBoxOptions]
  }
}

