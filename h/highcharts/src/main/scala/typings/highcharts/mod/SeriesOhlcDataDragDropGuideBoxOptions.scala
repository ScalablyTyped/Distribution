package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesOhlcDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[DragDropGuideBoxOptionsObject] = js.undefined
}

object SeriesOhlcDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: DragDropGuideBoxOptionsObject = null): SeriesOhlcDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesOhlcDataDragDropGuideBoxOptions]
  }
}

