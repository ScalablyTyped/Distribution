package typings.ionicReact

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationCallbackOptions
import typings.ionicCore.animationInterfaceMod.AnimationLifecycle
import typings.ionicCore.ionicCoreNumbers.`0`
import typings.ionicCore.ionicCoreNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCallback extends js.Object {
  var callback: AnimationLifecycle
  var opts: js.UndefOr[AnimationCallbackOptions] = js.undefined
}

object AnonCallback {
  @scala.inline
  def apply(
    callback: (/* currentStep */ `0` | `1`, /* animation */ Animation) => Unit,
    opts: AnimationCallbackOptions = null
  ): AnonCallback = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback))
    if (opts != null) __obj.updateDynamic("opts")(opts.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCallback]
  }
}

