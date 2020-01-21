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
  def apply(high: Int | Double = null, low: Int | Double = null): Point = {
    val __obj = js.Dynamic.literal()
    if (high != null) __obj.updateDynamic("high")(high.asInstanceOf[js.Any])
    if (low != null) __obj.updateDynamic("low")(low.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
}

