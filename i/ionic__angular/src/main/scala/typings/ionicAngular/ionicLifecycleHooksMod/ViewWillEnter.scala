package typings.ionicAngular.ionicLifecycleHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewWillEnter extends js.Object {
  /**
    * Fired when the component routing to is about to animate into view.
    */
  def ionViewWillEnter(): Unit
}

object ViewWillEnter {
  @scala.inline
  def apply(ionViewWillEnter: () => Unit): ViewWillEnter = {
    val __obj = js.Dynamic.literal(ionViewWillEnter = js.Any.fromFunction0(ionViewWillEnter))
    __obj.asInstanceOf[ViewWillEnter]
  }
}

