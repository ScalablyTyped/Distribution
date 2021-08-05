package typings.materialLineRipple

import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  trait MDCLineRippleAdapter extends StObject {
    
    /**
      * Adds a class to the line ripple element.
      */
    def addClass(className: String): Unit
    
    /**
      * Deregisters an event listener on the line ripple element for a given event.
      */
    def deregisterEventHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    def hasClass(className: String): Boolean
    
    /**
      * Registers an event listener on the line ripple element for a given event.
      */
    def registerEventHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * Removes a class from the line ripple element.
      */
    def removeClass(className: String): Unit
    
    /**
      * Sets the style property with propertyName to value on the root element.
      */
    def setStyle(propertyName: String, value: String): Unit
  }
  object MDCLineRippleAdapter {
    
    inline def apply(
      addClass: String => Unit,
      deregisterEventHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
      hasClass: String => Boolean,
      registerEventHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
      removeClass: String => Unit,
      setStyle: (String, String) => Unit
    ): MDCLineRippleAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), deregisterEventHandler = js.Any.fromFunction2(deregisterEventHandler), hasClass = js.Any.fromFunction1(hasClass), registerEventHandler = js.Any.fromFunction2(registerEventHandler), removeClass = js.Any.fromFunction1(removeClass), setStyle = js.Any.fromFunction2(setStyle))
      __obj.asInstanceOf[MDCLineRippleAdapter]
    }
    
    extension [Self <: MDCLineRippleAdapter](x: Self) {
      
      inline def setAddClass(value: String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      inline def setDeregisterEventHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = StObject.set(x, "deregisterEventHandler", js.Any.fromFunction2(value))
      
      inline def setHasClass(value: String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setRegisterEventHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = StObject.set(x, "registerEventHandler", js.Any.fromFunction2(value))
      
      inline def setRemoveClass(value: String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      inline def setSetStyle(value: (String, String) => Unit): Self = StObject.set(x, "setStyle", js.Any.fromFunction2(value))
    }
  }
}
