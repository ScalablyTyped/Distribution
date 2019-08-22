package typings.atIonicCore.distTypesUtilsAnimationAnimationDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationOnFinishCallback extends js.Object {
  var opts: AnimationOnFinishOptions
  def callback(didComplete: Boolean, animation: Animation): Unit
}

object AnimationOnFinishCallback {
  @scala.inline
  def apply(callback: (Boolean, Animation) => Unit, opts: AnimationOnFinishOptions): AnimationOnFinishCallback = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), opts = opts)
  
    __obj.asInstanceOf[AnimationOnFinishCallback]
  }
}

