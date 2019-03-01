package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShakeEffect extends js.Object {
  var direction: js.UndefOr[java.lang.String] = js.undefined
  var distance: js.UndefOr[scala.Double] = js.undefined
  var times: js.UndefOr[scala.Double] = js.undefined
}

object ShakeEffect {
  @scala.inline
  def apply(
    direction: java.lang.String = null,
    distance: scala.Int | scala.Double = null,
    times: scala.Int | scala.Double = null
  ): ShakeEffect = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (times != null) __obj.updateDynamic("times")(times.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShakeEffect]
  }
}

