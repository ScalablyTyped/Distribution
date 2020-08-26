package typings.ionicAngular.ionicLifecycleHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewDidLeave extends js.Object {
  /**
    * Fired when the component routing to has finished animating.
    */
  def ionViewDidLeave(): Unit = js.native
}

object ViewDidLeave {
  @scala.inline
  def apply(ionViewDidLeave: () => Unit): ViewDidLeave = {
    val __obj = js.Dynamic.literal(ionViewDidLeave = js.Any.fromFunction0(ionViewDidLeave))
    __obj.asInstanceOf[ViewDidLeave]
  }
  @scala.inline
  implicit class ViewDidLeaveOps[Self <: ViewDidLeave] (val x: Self) extends AnyVal {
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
    def setIonViewDidLeave(value: () => Unit): Self = this.set("ionViewDidLeave", js.Any.fromFunction0(value))
  }
  
}

