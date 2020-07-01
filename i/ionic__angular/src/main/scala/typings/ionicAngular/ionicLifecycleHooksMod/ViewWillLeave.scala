package typings.ionicAngular.ionicLifecycleHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewWillLeave extends js.Object {
  /**
    * Fired when the component routing from is about to animate.
    */
  def ionViewWillLeave(): Unit
}

object ViewWillLeave {
  @scala.inline
  def apply(ionViewWillLeave: () => Unit): ViewWillLeave = {
    val __obj = js.Dynamic.literal(ionViewWillLeave = js.Any.fromFunction0(ionViewWillLeave))
    __obj.asInstanceOf[ViewWillLeave]
  }
}

