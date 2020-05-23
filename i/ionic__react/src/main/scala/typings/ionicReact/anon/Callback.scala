package typings.ionicReact.anon

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationCallbackOptions
import typings.ionicCore.animationInterfaceMod.AnimationLifecycle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callback extends js.Object {
  var callback: AnimationLifecycle
  var opts: js.UndefOr[AnimationCallbackOptions] = js.undefined
}

object Callback {
  @scala.inline
  def apply(
    callback: (/* currentStep */ typings.ionicCore.ionicCoreNumbers.`0` | typings.ionicCore.ionicCoreNumbers.`1`, /* animation */ Animation) => Unit,
    opts: AnimationCallbackOptions = null
  ): Callback = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback))
    if (opts != null) __obj.updateDynamic("opts")(opts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callback]
  }
}

