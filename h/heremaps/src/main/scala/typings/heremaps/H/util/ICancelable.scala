package typings.heremaps.H.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface to cancelable requests and actions.
  */
@js.native
trait ICancelable extends js.Object {
  /**
    * This method is used to cancel current action
    */
  def cancel(): Unit = js.native
}

object ICancelable {
  @scala.inline
  def apply(cancel: () => Unit): ICancelable = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
    __obj.asInstanceOf[ICancelable]
  }
  @scala.inline
  implicit class ICancelableOps[Self <: ICancelable] (val x: Self) extends AnyVal {
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
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
  }
  
}

