package typings.materialFloatingLabel

import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  @js.native
  trait MDCFloatingLabelAdapter extends StObject {
    
    /**
      * Adds a class to the label element.
      */
    def addClass(className: String): Unit = js.native
    
    /**
      * Deregisters an event listener on the root element for a given event.
      */
    def deregisterInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
    
    /**
      * Returns the width of the label element.
      */
    def getWidth(): Double = js.native
    
    /**
      * Registers an event listener on the root element for a given event.
      */
    def registerInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
    
    /**
      * Removes a class from the label element.
      */
    def removeClass(className: String): Unit = js.native
  }
  object MDCFloatingLabelAdapter {
    
    @scala.inline
    def apply(
      addClass: String => Unit,
      deregisterInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
      getWidth: () => Double,
      registerInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
      removeClass: String => Unit
    ): MDCFloatingLabelAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), deregisterInteractionHandler = js.Any.fromFunction2(deregisterInteractionHandler), getWidth = js.Any.fromFunction0(getWidth), registerInteractionHandler = js.Any.fromFunction2(registerInteractionHandler), removeClass = js.Any.fromFunction1(removeClass))
      __obj.asInstanceOf[MDCFloatingLabelAdapter]
    }
    
    @scala.inline
    implicit class MDCFloatingLabelAdapterMutableBuilder[Self <: MDCFloatingLabelAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddClass(value: String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeregisterInteractionHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = StObject.set(x, "deregisterInteractionHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetWidth(value: () => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRegisterInteractionHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = StObject.set(x, "registerInteractionHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveClass(value: String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
    }
  }
}
