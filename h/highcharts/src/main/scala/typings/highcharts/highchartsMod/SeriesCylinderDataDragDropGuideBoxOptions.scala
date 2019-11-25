package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesCylinderDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesCylinderDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesCylinderDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesCylinderDataDragDropGuideBoxDefaultOptions = null): SeriesCylinderDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesCylinderDataDragDropGuideBoxOptions]
  }
}

