package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotAreasplinerangeLastPriceOptions extends js.Object {
  /**
    * (Highstock) The color of the line of last price.
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * (Highstock) Enable or disable the indicator.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object PlotAreasplinerangeLastPriceOptions {
  @scala.inline
  def apply(color: String = null, enabled: js.UndefOr[Boolean] = js.undefined): PlotAreasplinerangeLastPriceOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[PlotAreasplinerangeLastPriceOptions]
  }
}

