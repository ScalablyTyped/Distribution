package typings.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BounceEffect extends js.Object {
  var distance: js.UndefOr[Double] = js.undefined
  var times: js.UndefOr[Double] = js.undefined
}

object BounceEffect {
  @scala.inline
  def apply(distance: js.UndefOr[Double] = js.undefined, times: js.UndefOr[Double] = js.undefined): BounceEffect = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(distance)) __obj.updateDynamic("distance")(distance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(times)) __obj.updateDynamic("times")(times.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BounceEffect]
  }
}

