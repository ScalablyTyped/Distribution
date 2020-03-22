package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesFunnel3dDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[DragDropGuideBoxOptionsObject] = js.undefined
}

object SeriesFunnel3dDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: DragDropGuideBoxOptionsObject = null): SeriesFunnel3dDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesFunnel3dDataDragDropGuideBoxOptions]
  }
}

