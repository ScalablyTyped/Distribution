package typings.highcharts.annotationsAdvancedMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  var mock: js.UndefOr[Boolean] = js.undefined
}

object Point {
  @scala.inline
  def apply(mock: js.UndefOr[Boolean] = js.undefined): Point = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(mock)) __obj.updateDynamic("mock")(mock.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
}

