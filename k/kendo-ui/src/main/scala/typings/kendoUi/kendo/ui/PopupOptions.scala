package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopupOptions extends js.Object {
  var activate: js.UndefOr[js.Function1[/* e */ PopupActivateEvent, Unit]] = js.native
  var adjustSize: js.UndefOr[js.Any] = js.native
  var anchor: js.UndefOr[String | JQuery] = js.native
  var animation: js.UndefOr[Boolean | PopupAnimation] = js.native
  var appendTo: js.UndefOr[String | JQuery] = js.native
  var close: js.UndefOr[js.Function1[/* e */ PopupCloseEvent, Unit]] = js.native
  var collision: js.UndefOr[String] = js.native
  var deactivate: js.UndefOr[js.Function1[/* e */ PopupDeactivateEvent, Unit]] = js.native
  var name: js.UndefOr[String] = js.native
  var open: js.UndefOr[js.Function1[/* e */ PopupOpenEvent, Unit]] = js.native
  var origin: js.UndefOr[String] = js.native
  var position: js.UndefOr[String] = js.native
}

object PopupOptions {
  @scala.inline
  def apply(): PopupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupOptions]
  }
  @scala.inline
  implicit class PopupOptionsOps[Self <: PopupOptions] (val x: Self) extends AnyVal {
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
    def setActivate(value: /* e */ PopupActivateEvent => Unit): Self = this.set("activate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteActivate: Self = this.set("activate", js.undefined)
    @scala.inline
    def setAdjustSize(value: js.Any): Self = this.set("adjustSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdjustSize: Self = this.set("adjustSize", js.undefined)
    @scala.inline
    def setAnchor(value: String | JQuery): Self = this.set("anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    @scala.inline
    def setAnimation(value: Boolean | PopupAnimation): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setAppendTo(value: String | JQuery): Self = this.set("appendTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendTo: Self = this.set("appendTo", js.undefined)
    @scala.inline
    def setClose(value: /* e */ PopupCloseEvent => Unit): Self = this.set("close", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setCollision(value: String): Self = this.set("collision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollision: Self = this.set("collision", js.undefined)
    @scala.inline
    def setDeactivate(value: /* e */ PopupDeactivateEvent => Unit): Self = this.set("deactivate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDeactivate: Self = this.set("deactivate", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOpen(value: /* e */ PopupOpenEvent => Unit): Self = this.set("open", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}

