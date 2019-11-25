package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesPyramidDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesPyramidDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesPyramidDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesPyramidDataDragDropGuideBoxDefaultOptions = null): SeriesPyramidDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesPyramidDataDragDropGuideBoxOptions]
  }
}

