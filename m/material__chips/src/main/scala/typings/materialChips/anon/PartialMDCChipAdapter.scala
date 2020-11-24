package typings.materialChips.anon

import typings.materialChips.chipConstantsMod.EventSource
import typings.std.ClientRect
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material/chips.@material/chips/chip/adapter.MDCChipAdapter> */
@js.native
trait PartialMDCChipAdapter extends js.Object {
  
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var addClassToLeadingIcon: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var eventTargetHasClass: js.UndefOr[js.Function2[/* target */ EventTarget | Null, /* className */ String, Boolean]] = js.native
  
  var focusPrimaryAction: js.UndefOr[js.Function0[Unit]] = js.native
  
  var focusTrailingAction: js.UndefOr[js.Function0[Unit]] = js.native
  
  var getAttribute: js.UndefOr[js.Function1[/* attr */ String, String | Null]] = js.native
  
  var getCheckmarkBoundingClientRect: js.UndefOr[js.Function0[ClientRect | Null]] = js.native
  
  var getComputedStyleValue: js.UndefOr[js.Function1[/* propertyName */ String, String]] = js.native
  
  var getRootBoundingClientRect: js.UndefOr[js.Function0[ClientRect]] = js.native
  
  var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.native
  
  var hasLeadingIcon: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var isRTL: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var isTrailingActionNavigable: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var notifyEditFinish: js.UndefOr[js.Function0[Unit]] = js.native
  
  var notifyEditStart: js.UndefOr[js.Function0[Unit]] = js.native
  
  var notifyInteraction: js.UndefOr[js.Function0[Unit]] = js.native
  
  var notifyNavigation: js.UndefOr[js.Function2[/* key */ String, /* source */ EventSource, Unit]] = js.native
  
  var notifyRemoval: js.UndefOr[js.Function1[/* removedAnnouncement */ String | Null, Unit]] = js.native
  
  var notifySelection: js.UndefOr[js.Function2[/* selected */ Boolean, /* chipSetShouldIgnore */ Boolean, Unit]] = js.native
  
  var notifyTrailingIconInteraction: js.UndefOr[js.Function0[Unit]] = js.native
  
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var removeClassFromLeadingIcon: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var removeTrailingActionFocus: js.UndefOr[js.Function0[Unit]] = js.native
  
  var setPrimaryActionAttr: js.UndefOr[js.Function2[/* attr */ String, /* value */ String, Unit]] = js.native
  
  var setStyleProperty: js.UndefOr[js.Function2[/* propertyName */ String, /* value */ String, Unit]] = js.native
}
object PartialMDCChipAdapter {
  
  @scala.inline
  def apply(): PartialMDCChipAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCChipAdapter]
  }
  
  @scala.inline
  implicit class PartialMDCChipAdapterOps[Self <: PartialMDCChipAdapter] (val x: Self) extends AnyVal {
    
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
    def setAddClassToLeadingIcon(value: /* className */ String => Unit): Self = this.set("addClassToLeadingIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAddClassToLeadingIcon: Self = this.set("addClassToLeadingIcon", js.undefined)
    
    @scala.inline
    def setEventTargetHasClass(value: (/* target */ EventTarget | Null, /* className */ String) => Boolean): Self = this.set("eventTargetHasClass", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEventTargetHasClass: Self = this.set("eventTargetHasClass", js.undefined)
    
    @scala.inline
    def setFocusPrimaryAction(value: () => Unit): Self = this.set("focusPrimaryAction", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteFocusPrimaryAction: Self = this.set("focusPrimaryAction", js.undefined)
    
    @scala.inline
    def setFocusTrailingAction(value: () => Unit): Self = this.set("focusTrailingAction", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteFocusTrailingAction: Self = this.set("focusTrailingAction", js.undefined)
    
    @scala.inline
    def setGetAttribute(value: /* attr */ String => String | Null): Self = this.set("getAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetAttribute: Self = this.set("getAttribute", js.undefined)
    
    @scala.inline
    def setGetCheckmarkBoundingClientRect(value: () => ClientRect | Null): Self = this.set("getCheckmarkBoundingClientRect", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetCheckmarkBoundingClientRect: Self = this.set("getCheckmarkBoundingClientRect", js.undefined)
    
    @scala.inline
    def setGetComputedStyleValue(value: /* propertyName */ String => String): Self = this.set("getComputedStyleValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetComputedStyleValue: Self = this.set("getComputedStyleValue", js.undefined)
    
    @scala.inline
    def setGetRootBoundingClientRect(value: () => ClientRect): Self = this.set("getRootBoundingClientRect", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetRootBoundingClientRect: Self = this.set("getRootBoundingClientRect", js.undefined)
    
    @scala.inline
    def setHasClass(value: /* className */ String => Boolean): Self = this.set("hasClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHasClass: Self = this.set("hasClass", js.undefined)
    
    @scala.inline
    def setHasLeadingIcon(value: () => Boolean): Self = this.set("hasLeadingIcon", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteHasLeadingIcon: Self = this.set("hasLeadingIcon", js.undefined)
    
    @scala.inline
    def setIsRTL(value: () => Boolean): Self = this.set("isRTL", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsRTL: Self = this.set("isRTL", js.undefined)
    
    @scala.inline
    def setIsTrailingActionNavigable(value: () => Boolean): Self = this.set("isTrailingActionNavigable", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsTrailingActionNavigable: Self = this.set("isTrailingActionNavigable", js.undefined)
    
    @scala.inline
    def setNotifyEditFinish(value: () => Unit): Self = this.set("notifyEditFinish", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteNotifyEditFinish: Self = this.set("notifyEditFinish", js.undefined)
    
    @scala.inline
    def setNotifyEditStart(value: () => Unit): Self = this.set("notifyEditStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteNotifyEditStart: Self = this.set("notifyEditStart", js.undefined)
    
    @scala.inline
    def setNotifyInteraction(value: () => Unit): Self = this.set("notifyInteraction", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteNotifyInteraction: Self = this.set("notifyInteraction", js.undefined)
    
    @scala.inline
    def setNotifyNavigation(value: (/* key */ String, /* source */ EventSource) => Unit): Self = this.set("notifyNavigation", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteNotifyNavigation: Self = this.set("notifyNavigation", js.undefined)
    
    @scala.inline
    def setNotifyRemoval(value: /* removedAnnouncement */ String | Null => Unit): Self = this.set("notifyRemoval", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNotifyRemoval: Self = this.set("notifyRemoval", js.undefined)
    
    @scala.inline
    def setNotifySelection(value: (/* selected */ Boolean, /* chipSetShouldIgnore */ Boolean) => Unit): Self = this.set("notifySelection", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteNotifySelection: Self = this.set("notifySelection", js.undefined)
    
    @scala.inline
    def setNotifyTrailingIconInteraction(value: () => Unit): Self = this.set("notifyTrailingIconInteraction", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteNotifyTrailingIconInteraction: Self = this.set("notifyTrailingIconInteraction", js.undefined)
    
    @scala.inline
    def setRemoveClass(value: /* className */ String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveClass: Self = this.set("removeClass", js.undefined)
    
    @scala.inline
    def setRemoveClassFromLeadingIcon(value: /* className */ String => Unit): Self = this.set("removeClassFromLeadingIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveClassFromLeadingIcon: Self = this.set("removeClassFromLeadingIcon", js.undefined)
    
    @scala.inline
    def setRemoveTrailingActionFocus(value: () => Unit): Self = this.set("removeTrailingActionFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRemoveTrailingActionFocus: Self = this.set("removeTrailingActionFocus", js.undefined)
    
    @scala.inline
    def setSetPrimaryActionAttr(value: (/* attr */ String, /* value */ String) => Unit): Self = this.set("setPrimaryActionAttr", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetPrimaryActionAttr: Self = this.set("setPrimaryActionAttr", js.undefined)
    
    @scala.inline
    def setSetStyleProperty(value: (/* propertyName */ String, /* value */ String) => Unit): Self = this.set("setStyleProperty", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetStyleProperty: Self = this.set("setStyleProperty", js.undefined)
  }
}
