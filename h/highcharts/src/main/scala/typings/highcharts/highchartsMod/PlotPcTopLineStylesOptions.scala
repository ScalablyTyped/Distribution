package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPcTopLineStylesOptions extends js.Object {
  /**
    * (Highstock) Color of the top line. If not set, it's inherited from
    * plotOptions.pc.color.
    */
  var lineColor: js.UndefOr[ColorString] = js.undefined
  /**
    * (Highstock) Pixel width of the line.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
}

object PlotPcTopLineStylesOptions {
  @scala.inline
  def apply(lineColor: ColorString = null, lineWidth: Int | Double = null): PlotPcTopLineStylesOptions = {
    val __obj = js.Dynamic.literal()
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotPcTopLineStylesOptions]
  }
}

