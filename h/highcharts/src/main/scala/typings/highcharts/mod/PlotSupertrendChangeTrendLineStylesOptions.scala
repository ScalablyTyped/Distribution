package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotSupertrendChangeTrendLineStylesOptions extends js.Object {
  /**
    * (Highstock) The dash or dot style of the grid lines. For possible values,
    * see this demonstration.
    */
  var dashStyle: js.UndefOr[DashStyleValue] = js.undefined
  /**
    * (Highstock) Color of the line.
    */
  var lineColor: js.UndefOr[ColorString] = js.undefined
  /**
    * (Highstock) Pixel width of the line.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
}

object PlotSupertrendChangeTrendLineStylesOptions {
  @scala.inline
  def apply(
    dashStyle: DashStyleValue = null,
    lineColor: ColorString = null,
    lineWidth: js.UndefOr[Double] = js.undefined
  ): PlotSupertrendChangeTrendLineStylesOptions = {
    val __obj = js.Dynamic.literal()
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotSupertrendChangeTrendLineStylesOptions]
  }
}

