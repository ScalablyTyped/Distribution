package typings
package atIonicCoreLib.distTypesUtilsGestureGestureDashControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockerConfig extends js.Object {
  var disable: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var disableScroll: js.UndefOr[scala.Boolean] = js.undefined
}

object BlockerConfig {
  @scala.inline
  def apply(
    disable: js.Array[java.lang.String] = null,
    disableScroll: js.UndefOr[scala.Boolean] = js.undefined
  ): BlockerConfig = {
    val __obj = js.Dynamic.literal()
    if (disable != null) __obj.updateDynamic("disable")(disable)
    if (!js.isUndefined(disableScroll)) __obj.updateDynamic("disableScroll")(disableScroll)
    __obj.asInstanceOf[BlockerConfig]
  }
}

