package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesPieDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesPieDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesPieDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesPieDataDragDropGuideBoxDefaultOptions = null): SeriesPieDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[SeriesPieDataDragDropGuideBoxOptions]
  }
}

