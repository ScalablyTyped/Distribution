package typings.materialLineRipple

import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait LINERIPPLEACTIVE extends StObject {
    
    var LINE_RIPPLE_ACTIVE: String
    
    var LINE_RIPPLE_DEACTIVATING: String
  }
  object LINERIPPLEACTIVE {
    
    inline def apply(LINE_RIPPLE_ACTIVE: String, LINE_RIPPLE_DEACTIVATING: String): LINERIPPLEACTIVE = {
      val __obj = js.Dynamic.literal(LINE_RIPPLE_ACTIVE = LINE_RIPPLE_ACTIVE.asInstanceOf[js.Any], LINE_RIPPLE_DEACTIVATING = LINE_RIPPLE_DEACTIVATING.asInstanceOf[js.Any])
      __obj.asInstanceOf[LINERIPPLEACTIVE]
    }
    
    extension [Self <: LINERIPPLEACTIVE](x: Self) {
      
      inline def setLINE_RIPPLE_ACTIVE(value: String): Self = StObject.set(x, "LINE_RIPPLE_ACTIVE", value.asInstanceOf[js.Any])
      
      inline def setLINE_RIPPLE_DEACTIVATING(value: String): Self = StObject.set(x, "LINE_RIPPLE_DEACTIVATING", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/line-ripple.@material/line-ripple/adapter.MDCLineRippleAdapter> */
  trait PartialMDCLineRippleAdapt extends StObject {
    
    var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var deregisterEventHandler: js.UndefOr[
        js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.undefined
    
    var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.undefined
    
    var registerEventHandler: js.UndefOr[
        js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.undefined
    
    var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var setStyle: js.UndefOr[js.Function2[/* propertyName */ String, /* value */ String, Unit]] = js.undefined
  }
  object PartialMDCLineRippleAdapt {
    
    inline def apply(): PartialMDCLineRippleAdapt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCLineRippleAdapt]
    }
    
    extension [Self <: PartialMDCLineRippleAdapt](x: Self) {
      
      inline def setAddClass(value: /* className */ String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      inline def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      inline def setDeregisterEventHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "deregisterEventHandler", js.Any.fromFunction2(value))
      
      inline def setDeregisterEventHandlerUndefined: Self = StObject.set(x, "deregisterEventHandler", js.undefined)
      
      inline def setHasClass(value: /* className */ String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setHasClassUndefined: Self = StObject.set(x, "hasClass", js.undefined)
      
      inline def setRegisterEventHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "registerEventHandler", js.Any.fromFunction2(value))
      
      inline def setRegisterEventHandlerUndefined: Self = StObject.set(x, "registerEventHandler", js.undefined)
      
      inline def setRemoveClass(value: /* className */ String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      inline def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      inline def setSetStyle(value: (/* propertyName */ String, /* value */ String) => Unit): Self = StObject.set(x, "setStyle", js.Any.fromFunction2(value))
      
      inline def setSetStyleUndefined: Self = StObject.set(x, "setStyle", js.undefined)
    }
  }
}
