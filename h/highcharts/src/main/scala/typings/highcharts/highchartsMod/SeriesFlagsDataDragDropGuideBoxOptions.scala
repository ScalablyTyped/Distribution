package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesFlagsDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesFlagsDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesFlagsDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesFlagsDataDragDropGuideBoxDefaultOptions = null): SeriesFlagsDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[SeriesFlagsDataDragDropGuideBoxOptions]
  }
}

