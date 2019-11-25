package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesStreamgraphDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesStreamgraphDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesStreamgraphDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesStreamgraphDataDragDropGuideBoxDefaultOptions = null): SeriesStreamgraphDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesStreamgraphDataDragDropGuideBoxOptions]
  }
}

