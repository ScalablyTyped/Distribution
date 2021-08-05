package typings.materialTextfield.anon

import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material/textfield.@material/textfield/icon/adapter.MDCTextFieldIconAdapter> */
trait PartialMDCTextFieldIconAd extends StObject {
  
  var deregisterInteractionHandler: js.UndefOr[
    js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.undefined
  
  var getAttr: js.UndefOr[js.Function1[/* attr */ String, String | Null]] = js.undefined
  
  var notifyIconAction: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var registerInteractionHandler: js.UndefOr[
    js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.undefined
  
  var removeAttr: js.UndefOr[js.Function1[/* attr */ String, Unit]] = js.undefined
  
  var setAttr: js.UndefOr[js.Function2[/* attr */ String, /* value */ String, Unit]] = js.undefined
  
  var setContent: js.UndefOr[js.Function1[/* content */ String, Unit]] = js.undefined
}
object PartialMDCTextFieldIconAd {
  
  inline def apply(): PartialMDCTextFieldIconAd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCTextFieldIconAd]
  }
  
  extension [Self <: PartialMDCTextFieldIconAd](x: Self) {
    
    inline def setDeregisterInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "deregisterInteractionHandler", js.Any.fromFunction2(value))
    
    inline def setDeregisterInteractionHandlerUndefined: Self = StObject.set(x, "deregisterInteractionHandler", js.undefined)
    
    inline def setGetAttr(value: /* attr */ String => String | Null): Self = StObject.set(x, "getAttr", js.Any.fromFunction1(value))
    
    inline def setGetAttrUndefined: Self = StObject.set(x, "getAttr", js.undefined)
    
    inline def setNotifyIconAction(value: () => Unit): Self = StObject.set(x, "notifyIconAction", js.Any.fromFunction0(value))
    
    inline def setNotifyIconActionUndefined: Self = StObject.set(x, "notifyIconAction", js.undefined)
    
    inline def setRegisterInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "registerInteractionHandler", js.Any.fromFunction2(value))
    
    inline def setRegisterInteractionHandlerUndefined: Self = StObject.set(x, "registerInteractionHandler", js.undefined)
    
    inline def setRemoveAttr(value: /* attr */ String => Unit): Self = StObject.set(x, "removeAttr", js.Any.fromFunction1(value))
    
    inline def setRemoveAttrUndefined: Self = StObject.set(x, "removeAttr", js.undefined)
    
    inline def setSetAttr(value: (/* attr */ String, /* value */ String) => Unit): Self = StObject.set(x, "setAttr", js.Any.fromFunction2(value))
    
    inline def setSetAttrUndefined: Self = StObject.set(x, "setAttr", js.undefined)
    
    inline def setSetContent(value: /* content */ String => Unit): Self = StObject.set(x, "setContent", js.Any.fromFunction1(value))
    
    inline def setSetContentUndefined: Self = StObject.set(x, "setContent", js.undefined)
  }
}
