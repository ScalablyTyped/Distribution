package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesPyramid3dDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesPyramid3dDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesPyramid3dDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesPyramid3dDataDragDropGuideBoxDefaultOptions = null): SeriesPyramid3dDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesPyramid3dDataDragDropGuideBoxOptions]
  }
}

