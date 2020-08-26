package typings.jqueryPnotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PNotifyconfirm extends js.Object {
  /**
    * Where to align the buttons. (right, center, left, justify)
    */
  var align: js.UndefOr[String] = js.native
  /**
    * The buttons to display, and their callbacks.
    */
  var buttons: js.UndefOr[js.Array[PNotifyconfirmButton]] = js.native
  /**
    * Make a confirmation box.
    */
  var confirm: js.UndefOr[Boolean] = js.native
  /**
    * Make a prompt.
    */
  var prompt: js.UndefOr[Boolean] = js.native
  /**
    * Classes to add to the input element of the prompt.
    */
  var prompt_class: js.UndefOr[String] = js.native
  /**
    * The default value of the prompt.
    */
  var prompt_default: js.UndefOr[String] = js.native
  /**
    * Whether the prompt should accept multiple lines of text.
    */
  var prompt_multi_line: js.UndefOr[Boolean] = js.native
}

object PNotifyconfirm {
  @scala.inline
  def apply(): PNotifyconfirm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PNotifyconfirm]
  }
  @scala.inline
  implicit class PNotifyconfirmOps[Self <: PNotifyconfirm] (val x: Self) extends AnyVal {
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
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setButtonsVarargs(value: PNotifyconfirmButton*): Self = this.set("buttons", js.Array(value :_*))
    @scala.inline
    def setButtons(value: js.Array[PNotifyconfirmButton]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    @scala.inline
    def setConfirm(value: Boolean): Self = this.set("confirm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfirm: Self = this.set("confirm", js.undefined)
    @scala.inline
    def setPrompt(value: Boolean): Self = this.set("prompt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrompt: Self = this.set("prompt", js.undefined)
    @scala.inline
    def setPrompt_class(value: String): Self = this.set("prompt_class", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrompt_class: Self = this.set("prompt_class", js.undefined)
    @scala.inline
    def setPrompt_default(value: String): Self = this.set("prompt_default", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrompt_default: Self = this.set("prompt_default", js.undefined)
    @scala.inline
    def setPrompt_multi_line(value: Boolean): Self = this.set("prompt_multi_line", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrompt_multi_line: Self = this.set("prompt_multi_line", js.undefined)
  }
  
}

