package typings.ionicAngular.ionicLifecycleHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewDidLeave extends js.Object {
  /**
    * Fired when the component routing to has finished animating.
    */
  def ionViewDidLeave(): Unit
}

object ViewDidLeave {
  @scala.inline
  def apply(ionViewDidLeave: () => Unit): ViewDidLeave = {
    val __obj = js.Dynamic.literal(ionViewDidLeave = js.Any.fromFunction0(ionViewDidLeave))
    __obj.asInstanceOf[ViewDidLeave]
  }
}

