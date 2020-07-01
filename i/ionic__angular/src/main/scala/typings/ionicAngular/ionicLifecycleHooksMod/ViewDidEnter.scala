package typings.ionicAngular.ionicLifecycleHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewDidEnter extends js.Object {
  /**
    * Fired when the component routing to has finished animating.
    */
  def ionViewDidEnter(): Unit
}

object ViewDidEnter {
  @scala.inline
  def apply(ionViewDidEnter: () => Unit): ViewDidEnter = {
    val __obj = js.Dynamic.literal(ionViewDidEnter = js.Any.fromFunction0(ionViewDidEnter))
    __obj.asInstanceOf[ViewDidEnter]
  }
}

