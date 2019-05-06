package typings
package atIonicAngularLib.distProvidersNavDashControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationOptions extends js.Object {
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  var animationDirection: js.UndefOr[
    atIonicAngularLib.atIonicAngularLibStrings.forward | atIonicAngularLib.atIonicAngularLibStrings.back
  ] = js.undefined
}

object AnimationOptions {
  @scala.inline
  def apply(
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    animationDirection: atIonicAngularLib.atIonicAngularLibStrings.forward | atIonicAngularLib.atIonicAngularLibStrings.back = null
  ): AnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (animationDirection != null) __obj.updateDynamic("animationDirection")(animationDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationOptions]
  }
}

