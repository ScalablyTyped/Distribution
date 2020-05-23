package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotSunburstLevelsColorVariationOptions extends js.Object {
  /**
    * (Highcharts) The key of a color variation. Currently supports
    * `brightness` only.
    */
  var key: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) The ending value of a color variation. The last sibling will
    * receive this value.
    */
  var to: js.UndefOr[Double] = js.undefined
}

object PlotSunburstLevelsColorVariationOptions {
  @scala.inline
  def apply(key: String = null, to: js.UndefOr[Double] = js.undefined): PlotSunburstLevelsColorVariationOptions = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(to)) __obj.updateDynamic("to")(to.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotSunburstLevelsColorVariationOptions]
  }
}

