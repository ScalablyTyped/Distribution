package typings.kendoUi.kendo.mobile.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalViewOptions extends js.Object {
  var beforeOpen: js.UndefOr[js.Function1[/* e */ ModalViewBeforeOpenEvent, Unit]] = js.native
  var close: js.UndefOr[js.Function1[/* e */ ModalViewCloseEvent, Unit]] = js.native
  var height: js.UndefOr[Double] = js.native
  var init: js.UndefOr[js.Function1[/* e */ ModalViewInitEvent, Unit]] = js.native
  var modal: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var open: js.UndefOr[js.Function1[/* e */ ModalViewOpenEvent, Unit]] = js.native
  var width: js.UndefOr[Double] = js.native
}

object ModalViewOptions {
  @scala.inline
  def apply(): ModalViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalViewOptions]
  }
  @scala.inline
  implicit class ModalViewOptionsOps[Self <: ModalViewOptions] (val x: Self) extends AnyVal {
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
    def setBeforeOpen(value: /* e */ ModalViewBeforeOpenEvent => Unit): Self = this.set("beforeOpen", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeOpen: Self = this.set("beforeOpen", js.undefined)
    @scala.inline
    def setClose(value: /* e */ ModalViewCloseEvent => Unit): Self = this.set("close", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setInit(value: /* e */ ModalViewInitEvent => Unit): Self = this.set("init", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    @scala.inline
    def setModal(value: Boolean): Self = this.set("modal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOpen(value: /* e */ ModalViewOpenEvent => Unit): Self = this.set("open", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

