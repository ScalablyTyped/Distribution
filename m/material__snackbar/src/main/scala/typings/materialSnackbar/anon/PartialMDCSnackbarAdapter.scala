package typings.materialSnackbar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material/snackbar.@material/snackbar/adapter.MDCSnackbarAdapter> */
@js.native
trait PartialMDCSnackbarAdapter extends js.Object {
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  var announce: js.UndefOr[js.Function0[Unit]] = js.native
  var notifyClosed: js.UndefOr[js.Function1[/* reason */ String, Unit]] = js.native
  var notifyClosing: js.UndefOr[js.Function1[/* reason */ String, Unit]] = js.native
  var notifyOpened: js.UndefOr[js.Function0[Unit]] = js.native
  var notifyOpening: js.UndefOr[js.Function0[Unit]] = js.native
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
}

object PartialMDCSnackbarAdapter {
  @scala.inline
  def apply(): PartialMDCSnackbarAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCSnackbarAdapter]
  }
  @scala.inline
  implicit class PartialMDCSnackbarAdapterOps[Self <: PartialMDCSnackbarAdapter] (val x: Self) extends AnyVal {
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
    def setAddClass(value: /* className */ String => Unit): Self = this.set("addClass", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAddClass: Self = this.set("addClass", js.undefined)
    @scala.inline
    def setAnnounce(value: () => Unit): Self = this.set("announce", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAnnounce: Self = this.set("announce", js.undefined)
    @scala.inline
    def setNotifyClosed(value: /* reason */ String => Unit): Self = this.set("notifyClosed", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNotifyClosed: Self = this.set("notifyClosed", js.undefined)
    @scala.inline
    def setNotifyClosing(value: /* reason */ String => Unit): Self = this.set("notifyClosing", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNotifyClosing: Self = this.set("notifyClosing", js.undefined)
    @scala.inline
    def setNotifyOpened(value: () => Unit): Self = this.set("notifyOpened", js.Any.fromFunction0(value))
    @scala.inline
    def deleteNotifyOpened: Self = this.set("notifyOpened", js.undefined)
    @scala.inline
    def setNotifyOpening(value: () => Unit): Self = this.set("notifyOpening", js.Any.fromFunction0(value))
    @scala.inline
    def deleteNotifyOpening: Self = this.set("notifyOpening", js.undefined)
    @scala.inline
    def setRemoveClass(value: /* className */ String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveClass: Self = this.set("removeClass", js.undefined)
  }
  
}

