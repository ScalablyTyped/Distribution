package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPackedbubbleDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotPackedbubbleDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotPackedbubbleDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotPackedbubbleDragDropGuideBoxDefaultOptions = null): PlotPackedbubbleDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotPackedbubbleDragDropGuideBoxOptions]
  }
}

