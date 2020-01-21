package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesErrorbarDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesErrorbarDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesErrorbarDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesErrorbarDataDragDropGuideBoxDefaultOptions = null): SeriesErrorbarDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesErrorbarDataDragDropGuideBoxOptions]
  }
}

