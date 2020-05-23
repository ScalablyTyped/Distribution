package typings.highcharts.highchartsMoreMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  /**
    * Range series only. The high or maximum value for each data point.
    */
  var high: js.UndefOr[Double] = js.undefined
  /**
    * Range series only. The low or minimum value for each data point.
    */
  var low: js.UndefOr[Double] = js.undefined
}

object Point {
  @scala.inline
  def apply(high: js.UndefOr[Double] = js.undefined, low: js.UndefOr[Double] = js.undefined): Point = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(high)) __obj.updateDynamic("high")(high.get.asInstanceOf[js.Any])
    if (!js.isUndefined(low)) __obj.updateDynamic("low")(low.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
}

