package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesFunnel3dDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesFunnel3dDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesFunnel3dDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesFunnel3dDataDragDropGuideBoxDefaultOptions = null): SeriesFunnel3dDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[SeriesFunnel3dDataDragDropGuideBoxOptions]
  }
}

