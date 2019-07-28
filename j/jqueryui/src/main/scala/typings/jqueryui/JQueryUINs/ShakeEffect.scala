package typings.jqueryui.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShakeEffect extends js.Object {
  var direction: js.UndefOr[String] = js.undefined
  var distance: js.UndefOr[Double] = js.undefined
  var times: js.UndefOr[Double] = js.undefined
}

object ShakeEffect {
  @scala.inline
  def apply(direction: String = null, distance: Int | Double = null, times: Int | Double = null): ShakeEffect = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (times != null) __obj.updateDynamic("times")(times.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShakeEffect]
  }
}

