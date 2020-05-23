package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotIkhTenkanLineStylesOptions extends js.Object {
  /**
    * (Highstock) Color of the line.
    */
  var lineColor: js.UndefOr[ColorString] = js.undefined
  /**
    * (Highstock) Pixel width of the line.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
}

object PlotIkhTenkanLineStylesOptions {
  @scala.inline
  def apply(lineColor: ColorString = null, lineWidth: js.UndefOr[Double] = js.undefined): PlotIkhTenkanLineStylesOptions = {
    val __obj = js.Dynamic.literal()
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotIkhTenkanLineStylesOptions]
  }
}

