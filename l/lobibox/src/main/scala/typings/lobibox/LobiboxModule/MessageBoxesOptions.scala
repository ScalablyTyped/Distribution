package typings.lobibox.LobiboxModule

import typings.lobibox.anon.Cancel
import typings.lobibox.anon.Confirm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageBoxesOptions extends MessageBoxesDefault {
  var bodyClass: js.UndefOr[String] = js.native
  var buttons: js.UndefOr[Cancel | js.Any] = js.native
  @JSName("buttonsAlign")
  var buttonsAlign_MessageBoxesOptions: js.UndefOr[js.Any] = js.native
  var callback: js.UndefOr[
    js.Function3[/* lobibox */ js.Any, /* type */ js.UndefOr[String], /* ev */ js.UndefOr[js.Any], Unit]
  ] = js.native
  var modalClasses: js.UndefOr[Confirm] = js.native
}

object MessageBoxesOptions {
  @scala.inline
  def apply(): MessageBoxesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageBoxesOptions]
  }
  @scala.inline
  implicit class MessageBoxesOptionsOps[Self <: MessageBoxesOptions] (val x: Self) extends AnyVal {
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
    def setBodyClass(value: String): Self = this.set("bodyClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyClass: Self = this.set("bodyClass", js.undefined)
    @scala.inline
    def setButtons(value: Cancel | js.Any): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    @scala.inline
    def setButtonsAlign(value: js.Any): Self = this.set("buttonsAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonsAlign: Self = this.set("buttonsAlign", js.undefined)
    @scala.inline
    def setCallback(value: (/* lobibox */ js.Any, /* type */ js.UndefOr[String], /* ev */ js.UndefOr[js.Any]) => Unit): Self = this.set("callback", js.Any.fromFunction3(value))
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setModalClasses(value: Confirm): Self = this.set("modalClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModalClasses: Self = this.set("modalClasses", js.undefined)
  }
  
}

