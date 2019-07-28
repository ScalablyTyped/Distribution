package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotEmaDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotEmaDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotEmaDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotEmaDragDropGuideBoxDefaultOptions = null): PlotEmaDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotEmaDragDropGuideBoxOptions]
  }
}

