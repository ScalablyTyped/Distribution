package typings.highcharts.xrangeMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  var x2: js.UndefOr[Double] = js.undefined
}

object Point {
  @scala.inline
  def apply(x2: Int | Double = null): Point = {
    val __obj = js.Dynamic.literal()
    if (x2 != null) __obj.updateDynamic("x2")(x2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
}

