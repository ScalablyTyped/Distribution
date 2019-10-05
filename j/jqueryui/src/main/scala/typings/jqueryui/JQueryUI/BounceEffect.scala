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
  def apply(distance: Int | Double = null, times: Int | Double = null): BounceEffect = {
    val __obj = js.Dynamic.literal()
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (times != null) __obj.updateDynamic("times")(times.asInstanceOf[js.Any])
    __obj.asInstanceOf[BounceEffect]
  }
}

