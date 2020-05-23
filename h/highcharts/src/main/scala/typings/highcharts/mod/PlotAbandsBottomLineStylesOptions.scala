package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotAbandsBottomLineStylesOptions extends js.Object {
  /**
    * (Highstock) Pixel width of the line.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
}

object PlotAbandsBottomLineStylesOptions {
  @scala.inline
  def apply(lineWidth: js.UndefOr[Double] = js.undefined): PlotAbandsBottomLineStylesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotAbandsBottomLineStylesOptions]
  }
}

