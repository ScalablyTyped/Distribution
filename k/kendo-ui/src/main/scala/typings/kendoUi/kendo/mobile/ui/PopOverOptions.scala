package typings.kendoUi.kendo.mobile.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopOverOptions extends js.Object {
  var close: js.UndefOr[js.Function1[/* e */ PopOverCloseEvent, Unit]] = js.native
  var name: js.UndefOr[String] = js.native
  var open: js.UndefOr[js.Function1[/* e */ PopOverOpenEvent, Unit]] = js.native
  var pane: js.UndefOr[PopOverPane] = js.native
  var popup: js.UndefOr[PopOverPopup] = js.native
}

object PopOverOptions {
  @scala.inline
  def apply(): PopOverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopOverOptions]
  }
  @scala.inline
  implicit class PopOverOptionsOps[Self <: PopOverOptions] (val x: Self) extends AnyVal {
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
    def setClose(value: /* e */ PopOverCloseEvent => Unit): Self = this.set("close", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOpen(value: /* e */ PopOverOpenEvent => Unit): Self = this.set("open", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setPane(value: PopOverPane): Self = this.set("pane", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePane: Self = this.set("pane", js.undefined)
    @scala.inline
    def setPopup(value: PopOverPopup): Self = this.set("popup", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopup: Self = this.set("popup", js.undefined)
  }
  
}

