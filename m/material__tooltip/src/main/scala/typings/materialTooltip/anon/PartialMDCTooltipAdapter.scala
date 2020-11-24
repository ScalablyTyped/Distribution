package typings.materialTooltip.anon

import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import typings.materialTooltip.constantsMod.CssClasses
import typings.std.ClientRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material/tooltip.@material/tooltip/adapter.MDCTooltipAdapter> */
@js.native
trait PartialMDCTooltipAdapter extends js.Object {
  
  var addClass: js.UndefOr[js.Function1[/* className */ CssClasses, Unit]] = js.native
  
  var deregisterDocumentEventHandler: js.UndefOr[
    js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.native
  
  var getAnchorAttribute: js.UndefOr[js.Function1[/* attr */ String, String | Null]] = js.native
  
  var getAnchorBoundingRect: js.UndefOr[js.Function0[ClientRect | Null]] = js.native
  
  var getAttribute: js.UndefOr[js.Function1[/* attr */ String, String | Null]] = js.native
  
  var getTooltipSize: js.UndefOr[js.Function0[Height]] = js.native
  
  var getViewportHeight: js.UndefOr[js.Function0[Double]] = js.native
  
  var getViewportWidth: js.UndefOr[js.Function0[Double]] = js.native
  
  var hasClass: js.UndefOr[js.Function1[/* className */ CssClasses, Boolean]] = js.native
  
  var isRTL: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var notifyHidden: js.UndefOr[js.Function0[Unit]] = js.native
  
  var registerDocumentEventHandler: js.UndefOr[
    js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.native
  
  var removeClass: js.UndefOr[js.Function1[/* className */ CssClasses, Unit]] = js.native
  
  var setAttribute: js.UndefOr[js.Function2[/* attr */ String, /* value */ String, Unit]] = js.native
  
  var setStyleProperty: js.UndefOr[js.Function2[/* propertyName */ String, /* value */ String, Unit]] = js.native
}
object PartialMDCTooltipAdapter {
  
  @scala.inline
  def apply(): PartialMDCTooltipAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCTooltipAdapter]
  }
  
  @scala.inline
  implicit class PartialMDCTooltipAdapterOps[Self <: PartialMDCTooltipAdapter] (val x: Self) extends AnyVal {
    
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
    def setAddClass(value: /* className */ CssClasses => Unit): Self = this.set("addClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAddClass: Self = this.set("addClass", js.undefined)
    
    @scala.inline
    def setDeregisterDocumentEventHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = this.set("deregisterDocumentEventHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDeregisterDocumentEventHandler: Self = this.set("deregisterDocumentEventHandler", js.undefined)
    
    @scala.inline
    def setGetAnchorAttribute(value: /* attr */ String => String | Null): Self = this.set("getAnchorAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetAnchorAttribute: Self = this.set("getAnchorAttribute", js.undefined)
    
    @scala.inline
    def setGetAnchorBoundingRect(value: () => ClientRect | Null): Self = this.set("getAnchorBoundingRect", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAnchorBoundingRect: Self = this.set("getAnchorBoundingRect", js.undefined)
    
    @scala.inline
    def setGetAttribute(value: /* attr */ String => String | Null): Self = this.set("getAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetAttribute: Self = this.set("getAttribute", js.undefined)
    
    @scala.inline
    def setGetTooltipSize(value: () => Height): Self = this.set("getTooltipSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTooltipSize: Self = this.set("getTooltipSize", js.undefined)
    
    @scala.inline
    def setGetViewportHeight(value: () => Double): Self = this.set("getViewportHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetViewportHeight: Self = this.set("getViewportHeight", js.undefined)
    
    @scala.inline
    def setGetViewportWidth(value: () => Double): Self = this.set("getViewportWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetViewportWidth: Self = this.set("getViewportWidth", js.undefined)
    
    @scala.inline
    def setHasClass(value: /* className */ CssClasses => Boolean): Self = this.set("hasClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHasClass: Self = this.set("hasClass", js.undefined)
    
    @scala.inline
    def setIsRTL(value: () => Boolean): Self = this.set("isRTL", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsRTL: Self = this.set("isRTL", js.undefined)
    
    @scala.inline
    def setNotifyHidden(value: () => Unit): Self = this.set("notifyHidden", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteNotifyHidden: Self = this.set("notifyHidden", js.undefined)
    
    @scala.inline
    def setRegisterDocumentEventHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = this.set("registerDocumentEventHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRegisterDocumentEventHandler: Self = this.set("registerDocumentEventHandler", js.undefined)
    
    @scala.inline
    def setRemoveClass(value: /* className */ CssClasses => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveClass: Self = this.set("removeClass", js.undefined)
    
    @scala.inline
    def setSetAttribute(value: (/* attr */ String, /* value */ String) => Unit): Self = this.set("setAttribute", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetAttribute: Self = this.set("setAttribute", js.undefined)
    
    @scala.inline
    def setSetStyleProperty(value: (/* propertyName */ String, /* value */ String) => Unit): Self = this.set("setStyleProperty", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetStyleProperty: Self = this.set("setStyleProperty", js.undefined)
  }
}
