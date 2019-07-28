package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotAbandsTopLineStylesOptions extends js.Object {
  /**
    * (Highstock) Pixel width of the line.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
}

object PlotAbandsTopLineStylesOptions {
  @scala.inline
  def apply(lineWidth: Int | Double = null): PlotAbandsTopLineStylesOptions = {
    val __obj = js.Dynamic.literal()
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotAbandsTopLineStylesOptions]
  }
}

