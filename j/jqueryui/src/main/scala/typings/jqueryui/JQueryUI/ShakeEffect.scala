package typings.jqueryui.JQueryUI

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
  def apply(
    direction: String = null,
    distance: js.UndefOr[Double] = js.undefined,
    times: js.UndefOr[Double] = js.undefined
  ): ShakeEffect = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(distance)) __obj.updateDynamic("distance")(distance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(times)) __obj.updateDynamic("times")(times.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShakeEffect]
  }
}

