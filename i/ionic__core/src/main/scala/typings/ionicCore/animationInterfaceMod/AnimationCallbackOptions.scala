package typings.ionicCore.animationInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationCallbackOptions extends js.Object {
  var oneTimeCallback: Boolean
}

object AnimationCallbackOptions {
  @scala.inline
  def apply(oneTimeCallback: Boolean): AnimationCallbackOptions = {
    val __obj = js.Dynamic.literal(oneTimeCallback = oneTimeCallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationCallbackOptions]
  }
}

