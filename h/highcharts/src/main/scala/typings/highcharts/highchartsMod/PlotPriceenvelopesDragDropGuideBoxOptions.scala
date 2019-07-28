package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPriceenvelopesDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotPriceenvelopesDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotPriceenvelopesDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotPriceenvelopesDragDropGuideBoxDefaultOptions = null): PlotPriceenvelopesDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotPriceenvelopesDragDropGuideBoxOptions]
  }
}

