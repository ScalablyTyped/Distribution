package typings
package atIonicCoreLib.distTypesUtilsGestureGestureDashControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GestureConfig extends js.Object {
  var disableScroll: js.UndefOr[scala.Boolean] = js.undefined
  var name: java.lang.String
  var priority: js.UndefOr[scala.Double] = js.undefined
}

object GestureConfig {
  @scala.inline
  def apply(
    name: java.lang.String,
    disableScroll: js.UndefOr[scala.Boolean] = js.undefined,
    priority: scala.Int | scala.Double = null
  ): GestureConfig = {
    val __obj = js.Dynamic.literal(name = name)
    if (!js.isUndefined(disableScroll)) __obj.updateDynamic("disableScroll")(disableScroll)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureConfig]
  }
}

