package typings.materialFormField

import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  trait MDCFormFieldAdapter extends StObject {
    
    def activateInputRipple(): Unit
    
    def deactivateInputRipple(): Unit
    
    def deregisterInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    def registerInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
  }
  object MDCFormFieldAdapter {
    
    inline def apply(
      activateInputRipple: () => Unit,
      deactivateInputRipple: () => Unit,
      deregisterInteractionHandler: (Any, SpecificEventListener[Any]) => Unit,
      registerInteractionHandler: (Any, SpecificEventListener[Any]) => Unit
    ): MDCFormFieldAdapter = {
      val __obj = js.Dynamic.literal(activateInputRipple = js.Any.fromFunction0(activateInputRipple), deactivateInputRipple = js.Any.fromFunction0(deactivateInputRipple), deregisterInteractionHandler = js.Any.fromFunction2(deregisterInteractionHandler), registerInteractionHandler = js.Any.fromFunction2(registerInteractionHandler))
      __obj.asInstanceOf[MDCFormFieldAdapter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MDCFormFieldAdapter] (val x: Self) extends AnyVal {
      
      inline def setActivateInputRipple(value: () => Unit): Self = StObject.set(x, "activateInputRipple", js.Any.fromFunction0(value))
      
      inline def setDeactivateInputRipple(value: () => Unit): Self = StObject.set(x, "deactivateInputRipple", js.Any.fromFunction0(value))
      
      inline def setDeregisterInteractionHandler(value: (Any, SpecificEventListener[Any]) => Unit): Self = StObject.set(x, "deregisterInteractionHandler", js.Any.fromFunction2(value))
      
      inline def setRegisterInteractionHandler(value: (Any, SpecificEventListener[Any]) => Unit): Self = StObject.set(x, "registerInteractionHandler", js.Any.fromFunction2(value))
    }
  }
}
