package typings.ionicAngular.ionicLifecycleHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewDidEnter extends js.Object {
  /**
    * Fired when the component routing to has finished animating.
    */
  def ionViewDidEnter(): Unit = js.native
}

object ViewDidEnter {
  @scala.inline
  def apply(ionViewDidEnter: () => Unit): ViewDidEnter = {
    val __obj = js.Dynamic.literal(ionViewDidEnter = js.Any.fromFunction0(ionViewDidEnter))
    __obj.asInstanceOf[ViewDidEnter]
  }
  @scala.inline
  implicit class ViewDidEnterOps[Self <: ViewDidEnter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIonViewDidEnter(value: () => Unit): Self = this.set("ionViewDidEnter", js.Any.fromFunction0(value))
  }
  
}

