package typings.jqueryPnotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PNotifyconfirmButton extends js.Object {
  var addClass: js.UndefOr[String] = js.native
  /**
    *  Whether to trigger this button when the user hits enter in a single line prompt.
    */
  var promptTrigger: js.UndefOr[Boolean] = js.native
  var text: js.UndefOr[String] = js.native
  def click(notice: PNotify, value: js.Any): Unit = js.native
}

object PNotifyconfirmButton {
  @scala.inline
  def apply(click: (PNotify, js.Any) => Unit): PNotifyconfirmButton = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction2(click))
    __obj.asInstanceOf[PNotifyconfirmButton]
  }
  @scala.inline
  implicit class PNotifyconfirmButtonOps[Self <: PNotifyconfirmButton] (val x: Self) extends AnyVal {
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
    def setClick(value: (PNotify, js.Any) => Unit): Self = this.set("click", js.Any.fromFunction2(value))
    @scala.inline
    def setAddClass(value: String): Self = this.set("addClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddClass: Self = this.set("addClass", js.undefined)
    @scala.inline
    def setPromptTrigger(value: Boolean): Self = this.set("promptTrigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromptTrigger: Self = this.set("promptTrigger", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

