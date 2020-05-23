package typings.highcharts.ganttMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  /**
    * The ending X value of the range point.
    */
  var x2: js.UndefOr[Double] = js.undefined
}

object Point {
  @scala.inline
  def apply(x2: js.UndefOr[Double] = js.undefined): Point = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(x2)) __obj.updateDynamic("x2")(x2.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
}

