package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesScatter3dDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesScatter3dDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesScatter3dDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesScatter3dDataDragDropGuideBoxDefaultOptions = null): SeriesScatter3dDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesScatter3dDataDragDropGuideBoxOptions]
  }
}

