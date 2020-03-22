package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesColumnrangeDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[DragDropGuideBoxOptionsObject] = js.undefined
}

object SeriesColumnrangeDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: DragDropGuideBoxOptionsObject = null): SeriesColumnrangeDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesColumnrangeDataDragDropGuideBoxOptions]
  }
}

