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
  def apply(name: String, disableScroll: js.UndefOr[Boolean] = js.undefined, priority: Int | Double = null): GestureConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(disableScroll)) __obj.updateDynamic("disableScroll")(disableScroll.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureConfig]
  }
}

