package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPriceenvelopesBottomLineStylesOptions extends js.Object {
  /**
    * (Highstock) Color of the line. If not set, it's inherited from
    * plotOptions.priceenvelopes.color.
    */
  var lineColor: js.UndefOr[ColorString] = js.undefined
  /**
    * (Highstock) Pixel width of the line.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
}

object PlotPriceenvelopesBottomLineStylesOptions {
  @scala.inline
  def apply(lineColor: ColorString = null, lineWidth: Int | Double = null): PlotPriceenvelopesBottomLineStylesOptions = {
    val __obj = js.Dynamic.literal()
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotPriceenvelopesBottomLineStylesOptions]
  }
}

