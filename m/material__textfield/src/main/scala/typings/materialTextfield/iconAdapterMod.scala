package typings.materialTextfield

import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconAdapterMod {
  
  trait MDCTextFieldIconAdapter extends StObject {
    
    /**
      * Deregisters an event listener on the icon element for a given event.
      */
    def deregisterInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * Gets the value of an attribute on the icon element.
      */
    def getAttr(attr: String): String | Null
    
    /**
      * Emits a custom event "MDCTextField:icon" denoting a user has clicked the icon.
      */
    def notifyIconAction(): Unit
    
    /**
      * Registers an event listener on the icon element for a given event.
      */
    def registerInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * Removes an attribute from the icon element.
      */
    def removeAttr(attr: String): Unit
    
    /**
      * Sets an attribute on the icon element.
      */
    def setAttr(attr: String, value: String): Unit
    
    /**
      * Sets the text content of the icon element.
      */
    def setContent(content: String): Unit
  }
  object MDCTextFieldIconAdapter {
    
    inline def apply(
      deregisterInteractionHandler: (Any, SpecificEventListener[Any]) => Unit,
      getAttr: String => String | Null,
      notifyIconAction: () => Unit,
      registerInteractionHandler: (Any, SpecificEventListener[Any]) => Unit,
      removeAttr: String => Unit,
      setAttr: (String, String) => Unit,
      setContent: String => Unit
    ): MDCTextFieldIconAdapter = {
      val __obj = js.Dynamic.literal(deregisterInteractionHandler = js.Any.fromFunction2(deregisterInteractionHandler), getAttr = js.Any.fromFunction1(getAttr), notifyIconAction = js.Any.fromFunction0(notifyIconAction), registerInteractionHandler = js.Any.fromFunction2(registerInteractionHandler), removeAttr = js.Any.fromFunction1(removeAttr), setAttr = js.Any.fromFunction2(setAttr), setContent = js.Any.fromFunction1(setContent))
      __obj.asInstanceOf[MDCTextFieldIconAdapter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MDCTextFieldIconAdapter] (val x: Self) extends AnyVal {
      
      inline def setDeregisterInteractionHandler(value: (Any, SpecificEventListener[Any]) => Unit): Self = StObject.set(x, "deregisterInteractionHandler", js.Any.fromFunction2(value))
      
      inline def setGetAttr(value: String => String | Null): Self = StObject.set(x, "getAttr", js.Any.fromFunction1(value))
      
      inline def setNotifyIconAction(value: () => Unit): Self = StObject.set(x, "notifyIconAction", js.Any.fromFunction0(value))
      
      inline def setRegisterInteractionHandler(value: (Any, SpecificEventListener[Any]) => Unit): Self = StObject.set(x, "registerInteractionHandler", js.Any.fromFunction2(value))
      
      inline def setRemoveAttr(value: String => Unit): Self = StObject.set(x, "removeAttr", js.Any.fromFunction1(value))
      
      inline def setSetAttr(value: (String, String) => Unit): Self = StObject.set(x, "setAttr", js.Any.fromFunction2(value))
      
      inline def setSetContent(value: String => Unit): Self = StObject.set(x, "setContent", js.Any.fromFunction1(value))
    }
  }
}
