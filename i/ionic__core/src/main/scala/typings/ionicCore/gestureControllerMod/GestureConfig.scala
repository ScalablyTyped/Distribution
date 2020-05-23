package typings.ionicCore.gestureControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GestureConfig extends js.Object {
  var disableScroll: js.UndefOr[Boolean] = js.undefined
  var name: String
  var priority: js.UndefOr[Double] = js.undefined
}

object GestureConfig {
  @scala.inline
  def apply(
    name: String,
    disableScroll: js.UndefOr[Boolean] = js.undefined,
    priority: js.UndefOr[Double] = js.undefined
  ): GestureConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(disableScroll)) __obj.updateDynamic("disableScroll")(disableScroll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureConfig]
  }
}

