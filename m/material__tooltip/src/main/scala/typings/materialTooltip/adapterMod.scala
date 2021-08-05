package typings.materialTooltip

import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import typings.materialTooltip.anon.Height
import typings.materialTooltip.constantsMod.CssClasses
import typings.std.ClientRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  trait MDCTooltipAdapter extends StObject {
    
    /**
      * Adds a class onto the root element.
      */
    def addClass(className: CssClasses): Unit
    
    /**
      * Deregisters an event listener to the document body.
      */
    def deregisterDocumentEventHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * @return the attribute string if present on the anchor element, null
      * otherwise.
      */
    def getAnchorAttribute(attr: String): String | Null
    
    /**
      * @return the ClientRect for the anchor element.
      */
    def getAnchorBoundingRect(): ClientRect | Null
    
    /**
      * @return the attribute string if present on the root element, null
      * otherwise.
      */
    def getAttribute(attr: String): String | Null
    
    /**
      * @return the width and height of the tooltip element.
      */
    def getTooltipSize(): Height
    
    /**
      * @return the height of the viewport.
      */
    def getViewportHeight(): Double
    
    /**
      * @return the width of the viewport.
      */
    def getViewportWidth(): Double
    
    /**
      * @return whether or not the root element has the provided className.
      */
    def hasClass(className: CssClasses): Boolean
    
    /**
      * @return true if the text direction is right-to-left.
      */
    def isRTL(): Boolean
    
    /**
      * Notification that the tooltip element has been fully hidden. Typically used
      * to wait for the hide animation to complete.
      */
    def notifyHidden(): Unit
    
    /**
      * Registers an event listener to the document body.
      */
    def registerDocumentEventHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * Removes a class from the root element.
      */
    def removeClass(className: CssClasses): Unit
    
    /**
      * Sets an attribute on the root element.
      */
    def setAttribute(attr: String, value: String): Unit
    
    /**
      * Sets the property value of the given style property on the root element.
      */
    def setStyleProperty(propertyName: String, value: String): Unit
  }
  object MDCTooltipAdapter {
    
    inline def apply(
      addClass: CssClasses => Unit,
      deregisterDocumentEventHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
      getAnchorAttribute: String => String | Null,
      getAnchorBoundingRect: () => ClientRect | Null,
      getAttribute: String => String | Null,
      getTooltipSize: () => Height,
      getViewportHeight: () => Double,
      getViewportWidth: () => Double,
      hasClass: CssClasses => Boolean,
      isRTL: () => Boolean,
      notifyHidden: () => Unit,
      registerDocumentEventHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
      removeClass: CssClasses => Unit,
      setAttribute: (String, String) => Unit,
      setStyleProperty: (String, String) => Unit
    ): MDCTooltipAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), deregisterDocumentEventHandler = js.Any.fromFunction2(deregisterDocumentEventHandler), getAnchorAttribute = js.Any.fromFunction1(getAnchorAttribute), getAnchorBoundingRect = js.Any.fromFunction0(getAnchorBoundingRect), getAttribute = js.Any.fromFunction1(getAttribute), getTooltipSize = js.Any.fromFunction0(getTooltipSize), getViewportHeight = js.Any.fromFunction0(getViewportHeight), getViewportWidth = js.Any.fromFunction0(getViewportWidth), hasClass = js.Any.fromFunction1(hasClass), isRTL = js.Any.fromFunction0(isRTL), notifyHidden = js.Any.fromFunction0(notifyHidden), registerDocumentEventHandler = js.Any.fromFunction2(registerDocumentEventHandler), removeClass = js.Any.fromFunction1(removeClass), setAttribute = js.Any.fromFunction2(setAttribute), setStyleProperty = js.Any.fromFunction2(setStyleProperty))
      __obj.asInstanceOf[MDCTooltipAdapter]
    }
    
    extension [Self <: MDCTooltipAdapter](x: Self) {
      
      inline def setAddClass(value: CssClasses => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      inline def setDeregisterDocumentEventHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = StObject.set(x, "deregisterDocumentEventHandler", js.Any.fromFunction2(value))
      
      inline def setGetAnchorAttribute(value: String => String | Null): Self = StObject.set(x, "getAnchorAttribute", js.Any.fromFunction1(value))
      
      inline def setGetAnchorBoundingRect(value: () => ClientRect | Null): Self = StObject.set(x, "getAnchorBoundingRect", js.Any.fromFunction0(value))
      
      inline def setGetAttribute(value: String => String | Null): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
      
      inline def setGetTooltipSize(value: () => Height): Self = StObject.set(x, "getTooltipSize", js.Any.fromFunction0(value))
      
      inline def setGetViewportHeight(value: () => Double): Self = StObject.set(x, "getViewportHeight", js.Any.fromFunction0(value))
      
      inline def setGetViewportWidth(value: () => Double): Self = StObject.set(x, "getViewportWidth", js.Any.fromFunction0(value))
      
      inline def setHasClass(value: CssClasses => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setIsRTL(value: () => Boolean): Self = StObject.set(x, "isRTL", js.Any.fromFunction0(value))
      
      inline def setNotifyHidden(value: () => Unit): Self = StObject.set(x, "notifyHidden", js.Any.fromFunction0(value))
      
      inline def setRegisterDocumentEventHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = StObject.set(x, "registerDocumentEventHandler", js.Any.fromFunction2(value))
      
      inline def setRemoveClass(value: CssClasses => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      inline def setSetAttribute(value: (String, String) => Unit): Self = StObject.set(x, "setAttribute", js.Any.fromFunction2(value))
      
      inline def setSetStyleProperty(value: (String, String) => Unit): Self = StObject.set(x, "setStyleProperty", js.Any.fromFunction2(value))
    }
  }
}
