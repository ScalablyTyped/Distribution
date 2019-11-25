package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesPackedbubbleDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesPackedbubbleDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesPackedbubbleDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesPackedbubbleDataDragDropGuideBoxDefaultOptions = null): SeriesPackedbubbleDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesPackedbubbleDataDragDropGuideBoxOptions]
  }
}

