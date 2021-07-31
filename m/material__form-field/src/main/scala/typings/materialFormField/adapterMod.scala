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
    
    @scala.inline
    def apply(
      activateInputRipple: () => Unit,
      deactivateInputRipple: () => Unit,
      deregisterInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
      registerInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit
    ): MDCFormFieldAdapter = {
      val __obj = js.Dynamic.literal(activateInputRipple = js.Any.fromFunction0(activateInputRipple), deactivateInputRipple = js.Any.fromFunction0(deactivateInputRipple), deregisterInteractionHandler = js.Any.fromFunction2(deregisterInteractionHandler), registerInteractionHandler = js.Any.fromFunction2(registerInteractionHandler))
      __obj.asInstanceOf[MDCFormFieldAdapter]
    }
    
    @scala.inline
    implicit class MDCFormFieldAdapterMutableBuilder[Self <: MDCFormFieldAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivateInputRipple(value: () => Unit): Self = StObject.set(x, "activateInputRipple", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDeactivateInputRipple(value: () => Unit): Self = StObject.set(x, "deactivateInputRipple", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDeregisterInteractionHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = StObject.set(x, "deregisterInteractionHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRegisterInteractionHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = StObject.set(x, "registerInteractionHandler", js.Any.fromFunction2(value))
    }
  }
}
