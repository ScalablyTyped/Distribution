package typings.materialDialog.anon

import typings.std.Event
import typings.std.EventTarget
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material/dialog.@material/dialog/adapter.MDCDialogAdapter> */
@js.native
trait PartialMDCDialogAdapter extends js.Object {
  
  var addBodyClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var areButtonsStacked: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var clickDefaultButton: js.UndefOr[js.Function0[Unit]] = js.native
  
  var eventTargetMatches: js.UndefOr[js.Function2[/* target */ EventTarget | Null, /* selector */ String, Boolean]] = js.native
  
  var getActionFromEvent: js.UndefOr[js.Function1[/* evt */ Event, String | Null]] = js.native
  
  var getInitialFocusEl: js.UndefOr[js.Function0[HTMLElement | Null]] = js.native
  
  var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.native
  
  var isContentScrollable: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var notifyClosed: js.UndefOr[js.Function1[/* action */ String, Unit]] = js.native
  
  var notifyClosing: js.UndefOr[js.Function1[/* action */ String, Unit]] = js.native
  
  var notifyOpened: js.UndefOr[js.Function0[Unit]] = js.native
  
  var notifyOpening: js.UndefOr[js.Function0[Unit]] = js.native
  
  var releaseFocus: js.UndefOr[js.Function0[Unit]] = js.native
  
  var removeBodyClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var reverseButtons: js.UndefOr[js.Function0[Unit]] = js.native
  
  var trapFocus: js.UndefOr[js.Function1[/* focusElement */ HTMLElement | Null, Unit]] = js.native
}
object PartialMDCDialogAdapter {
  
  @scala.inline
  def apply(): PartialMDCDialogAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCDialogAdapter]
  }
  
  @scala.inline
  implicit class PartialMDCDialogAdapterOps[Self <: PartialMDCDialogAdapter] (val x: Self) extends AnyVal {
    
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
    def setAddBodyClass(value: /* className */ String => Unit): Self = this.set("addBodyClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAddBodyClass: Self = this.set("addBodyClass", js.undefined)
    
    @scala.inline
    def setAddClass(value: /* className */ String => Unit): Self = this.set("addClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAddClass: Self = this.set("addClass", js.undefined)
    
    @scala.inline
    def setAreButtonsStacked(value: () => Boolean): Self = this.set("areButtonsStacked", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteAreButtonsStacked: Self = this.set("areButtonsStacked", js.undefined)
    
    @scala.inline
    def setClickDefaultButton(value: () => Unit): Self = this.set("clickDefaultButton", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteClickDefaultButton: Self = this.set("clickDefaultButton", js.undefined)
    
    @scala.inline
    def setEventTargetMatches(value: (/* target */ EventTarget | Null, /* selector */ String) => Boolean): Self = this.set("eventTargetMatches", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEventTargetMatches: Self = this.set("eventTargetMatches", js.undefined)
    
    @scala.inline
    def setGetActionFromEvent(value: /* evt */ Event => String | Null): Self = this.set("getActionFromEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetActionFromEvent: Self = this.set("getActionFromEvent", js.undefined)
    
    @scala.inline
    def setGetInitialFocusEl(value: () => HTMLElement | Null): Self = this.set("getInitialFocusEl", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetInitialFocusEl: Self = this.set("getInitialFocusEl", js.undefined)
    
    @scala.inline
    def setHasClass(value: /* className */ String => Boolean): Self = this.set("hasClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHasClass: Self = this.set("hasClass", js.undefined)
    
    @scala.inline
    def setIsContentScrollable(value: () => Boolean): Self = this.set("isContentScrollable", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsContentScrollable: Self = this.set("isContentScrollable", js.undefined)
    
    @scala.inline
    def setNotifyClosed(value: /* action */ String => Unit): Self = this.set("notifyClosed", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNotifyClosed: Self = this.set("notifyClosed", js.undefined)
    
    @scala.inline
    def setNotifyClosing(value: /* action */ String => Unit): Self = this.set("notifyClosing", js.Any.fromFunction1(value))
    
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
    def setReleaseFocus(value: () => Unit): Self = this.set("releaseFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteReleaseFocus: Self = this.set("releaseFocus", js.undefined)
    
    @scala.inline
    def setRemoveBodyClass(value: /* className */ String => Unit): Self = this.set("removeBodyClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveBodyClass: Self = this.set("removeBodyClass", js.undefined)
    
    @scala.inline
    def setRemoveClass(value: /* className */ String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveClass: Self = this.set("removeClass", js.undefined)
    
    @scala.inline
    def setReverseButtons(value: () => Unit): Self = this.set("reverseButtons", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteReverseButtons: Self = this.set("reverseButtons", js.undefined)
    
    @scala.inline
    def setTrapFocus(value: /* focusElement */ HTMLElement | Null => Unit): Self = this.set("trapFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTrapFocus: Self = this.set("trapFocus", js.undefined)
  }
}
