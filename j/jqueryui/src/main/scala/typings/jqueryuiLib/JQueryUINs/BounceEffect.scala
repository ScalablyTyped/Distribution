package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BounceEffect extends js.Object {
  var distance: js.UndefOr[scala.Double] = js.undefined
  var times: js.UndefOr[scala.Double] = js.undefined
}

object BounceEffect {
  @scala.inline
  def apply(distance: scala.Int | scala.Double = null, times: scala.Int | scala.Double = null): BounceEffect = {
    val __obj = js.Dynamic.literal()
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (times != null) __obj.updateDynamic("times")(times.asInstanceOf[js.Any])
    __obj.asInstanceOf[BounceEffect]
  }
}

