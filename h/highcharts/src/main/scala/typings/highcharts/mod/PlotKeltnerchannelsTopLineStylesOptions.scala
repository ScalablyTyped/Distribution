package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotKeltnerchannelsTopLineStylesOptions extends js.Object {
  /**
    * (Highstock) Color of the line. If not set, it's inherited from
    * `plotOptions.keltnerchannels.color`
    */
  var lineColor: js.UndefOr[String] = js.undefined
  /**
    * (Highstock) Pixel width of the line.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
}

object PlotKeltnerchannelsTopLineStylesOptions {
  @scala.inline
  def apply(lineColor: String = null, lineWidth: js.UndefOr[Double] = js.undefined): PlotKeltnerchannelsTopLineStylesOptions = {
    val __obj = js.Dynamic.literal()
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotKeltnerchannelsTopLineStylesOptions]
  }
}

