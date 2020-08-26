package typings.materialDrawer.anon

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material/drawer.@material/drawer/adapter.MDCDrawerAdapter> */
@js.native
trait PartialMDCDrawerAdapter extends js.Object {
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  var elementHasClass: js.UndefOr[js.Function2[/* element */ Element, /* className */ String, Boolean]] = js.native
  var focusActiveNavigationItem: js.UndefOr[js.Function0[Unit]] = js.native
  var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.native
  var notifyClose: js.UndefOr[js.Function0[Unit]] = js.native
  var notifyOpen: js.UndefOr[js.Function0[Unit]] = js.native
  var releaseFocus: js.UndefOr[js.Function0[Unit]] = js.native
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  var restoreFocus: js.UndefOr[js.Function0[Unit]] = js.native
  var saveFocus: js.UndefOr[js.Function0[Unit]] = js.native
  var trapFocus: js.UndefOr[js.Function0[Unit]] = js.native
}

object PartialMDCDrawerAdapter {
  @scala.inline
  def apply(): PartialMDCDrawerAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCDrawerAdapter]
  }
  @scala.inline
  implicit class PartialMDCDrawerAdapterOps[Self <: PartialMDCDrawerAdapter] (val x: Self) extends AnyVal {
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
    def setElementHasClass(value: (/* element */ Element, /* className */ String) => Boolean): Self = this.set("elementHasClass", js.Any.fromFunction2(value))
    @scala.inline
    def deleteElementHasClass: Self = this.set("elementHasClass", js.undefined)
    @scala.inline
    def setFocusActiveNavigationItem(value: () => Unit): Self = this.set("focusActiveNavigationItem", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFocusActiveNavigationItem: Self = this.set("focusActiveNavigationItem", js.undefined)
    @scala.inline
    def setHasClass(value: /* className */ String => Boolean): Self = this.set("hasClass", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHasClass: Self = this.set("hasClass", js.undefined)
    @scala.inline
    def setNotifyClose(value: () => Unit): Self = this.set("notifyClose", js.Any.fromFunction0(value))
    @scala.inline
    def deleteNotifyClose: Self = this.set("notifyClose", js.undefined)
    @scala.inline
    def setNotifyOpen(value: () => Unit): Self = this.set("notifyOpen", js.Any.fromFunction0(value))
    @scala.inline
    def deleteNotifyOpen: Self = this.set("notifyOpen", js.undefined)
    @scala.inline
    def setReleaseFocus(value: () => Unit): Self = this.set("releaseFocus", js.Any.fromFunction0(value))
    @scala.inline
    def deleteReleaseFocus: Self = this.set("releaseFocus", js.undefined)
    @scala.inline
    def setRemoveClass(value: /* className */ String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveClass: Self = this.set("removeClass", js.undefined)
    @scala.inline
    def setRestoreFocus(value: () => Unit): Self = this.set("restoreFocus", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRestoreFocus: Self = this.set("restoreFocus", js.undefined)
    @scala.inline
    def setSaveFocus(value: () => Unit): Self = this.set("saveFocus", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSaveFocus: Self = this.set("saveFocus", js.undefined)
    @scala.inline
    def setTrapFocus(value: () => Unit): Self = this.set("trapFocus", js.Any.fromFunction0(value))
    @scala.inline
    def deleteTrapFocus: Self = this.set("trapFocus", js.undefined)
  }
  
}

