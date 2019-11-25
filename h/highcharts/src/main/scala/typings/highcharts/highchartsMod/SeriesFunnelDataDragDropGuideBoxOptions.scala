package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesFunnelDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesFunnelDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesFunnelDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesFunnelDataDragDropGuideBoxDefaultOptions = null): SeriesFunnelDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesFunnelDataDragDropGuideBoxOptions]
  }
}

