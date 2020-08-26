package typings.leafletGeosearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Button extends js.Object {
  var button: js.UndefOr[String] = js.native
  var container: js.UndefOr[String] = js.native
  var form: js.UndefOr[String] = js.native
  var input: js.UndefOr[String] = js.native
  var msgbox: js.UndefOr[String] = js.native
  var resetButton: js.UndefOr[String] = js.native
}

object Button {
  @scala.inline
  def apply(): Button = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Button]
  }
  @scala.inline
  implicit class ButtonOps[Self <: Button] (val x: Self) extends AnyVal {
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
    def setButton(value: String): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    @scala.inline
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setForm(value: String): Self = this.set("form", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    @scala.inline
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setMsgbox(value: String): Self = this.set("msgbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsgbox: Self = this.set("msgbox", js.undefined)
    @scala.inline
    def setResetButton(value: String): Self = this.set("resetButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResetButton: Self = this.set("resetButton", js.undefined)
  }
  
}

