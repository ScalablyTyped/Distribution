package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesPyramidDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[DragDropGuideBoxOptionsObject] = js.undefined
}

object SeriesPyramidDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: DragDropGuideBoxOptionsObject = null): SeriesPyramidDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesPyramidDataDragDropGuideBoxOptions]
  }
}

