package typings.materialTooltip

import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import typings.materialTooltip.anon.Height
import typings.materialTooltip.constantsMod.CssClasses
import typings.std.DOMRect
import typings.std.Element
import typings.std.HTMLElement
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
      * Checks if element is contained within the anchor element.
      */
    def anchorContainsElement(element: HTMLElement): Boolean
    
    /**
      * Clears all inline styles set on the caret-top and caret-bottom elements.
      */
    def clearTooltipCaretStyles(): Unit
    
    /**
      * Deregisters an event listener to the anchor element.
      */
    def deregisterAnchorEventHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * Deregisters an event listener to the document body.
      */
    def deregisterDocumentEventHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * Deregisters an event listener to the root element.
      */
    def deregisterEventHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * Deregisters an event listener to the window.
      */
    def deregisterWindowEventHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * Sets focus on the anchor element.
      */
    def focusAnchorElement(): Unit
    
    /**
      * @return the active element of the document that owns the tooltip.
      */
    def getActiveElement(): Element | Null
    
    /**
      * @return the attribute string if present on the anchor element, null
      * otherwise.
      */
    def getAnchorAttribute(attr: String): String | Null
    
    /**
      * @return the DOMRect for the anchor element.
      */
    def getAnchorBoundingRect(): DOMRect | Null
    
    /**
      * @return the attribute string if present on the root element, null
      * otherwise.
      */
    def getAttribute(attr: String): String | Null
    
    /**
      * @return the value of the given computed style property on the root element.
      */
    def getComputedStyleProperty(propertyName: String): String
    
    /**
      * @return the DOMRect for the parent of the tooltip element.
      */
    def getParentBoundingRect(): DOMRect | Null
    
    /**
      * @return the DOMRect for the caret element.
      */
    def getTooltipCaretBoundingRect(): DOMRect | Null
    
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
      * Registers an event listener to the anchor element.
      */
    def registerAnchorEventHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * Registers an event listener to the document body.
      */
    def registerDocumentEventHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * Registers an event listener to the root element.
      */
    def registerEventHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * Registers an event listener to the window.
      */
    def registerWindowEventHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * Removes an attribute on the root element.
      */
    def removeAttribute(attr: String): Unit
    
    /**
      * Removes a class from the root element.
      */
    def removeClass(className: CssClasses): Unit
    
    /**
      * Sets an attribute on the anchor element.
      */
    def setAnchorAttribute(attr: String, value: String): Unit
    
    /**
      * Sets an attribute on the root element.
      */
    def setAttribute(attr: String, value: String): Unit
    
    /**
      * Sets the property value of the given style property on the root element.
      */
    def setStyleProperty(propertyName: String, value: String): Unit
    
    /**
      * Sets the property value of the given style property on the tooltip's
      * surface-animation element (indicated by the
      * "mdc-tooltip__surface-animation" class).
      */
    def setSurfaceAnimationStyleProperty(propertyName: String, value: String): Unit
    
    /**
      * Sets the property value of the given style property on both the caret-top
      * and caret-bottom elements.
      */
    def setTooltipCaretStyle(propertyName: String, value: String): Unit
    
    /**
      * Checks if element is contained within the tooltip element.
      */
    def tooltipContainsElement(element: HTMLElement): Boolean
  }
  object MDCTooltipAdapter {
    
    inline def apply(
      addClass: CssClasses => Unit,
      anchorContainsElement: HTMLElement => Boolean,
      clearTooltipCaretStyles: () => Unit,
      deregisterAnchorEventHandler: (Any, SpecificEventListener[Any]) => Unit,
      deregisterDocumentEventHandler: (Any, SpecificEventListener[Any]) => Unit,
      deregisterEventHandler: (Any, SpecificEventListener[Any]) => Unit,
      deregisterWindowEventHandler: (Any, SpecificEventListener[Any]) => Unit,
      focusAnchorElement: () => Unit,
      getActiveElement: () => Element | Null,
      getAnchorAttribute: String => String | Null,
      getAnchorBoundingRect: () => DOMRect | Null,
      getAttribute: String => String | Null,
      getComputedStyleProperty: String => String,
      getParentBoundingRect: () => DOMRect | Null,
      getTooltipCaretBoundingRect: () => DOMRect | Null,
      getTooltipSize: () => Height,
      getViewportHeight: () => Double,
      getViewportWidth: () => Double,
      hasClass: CssClasses => Boolean,
      isRTL: () => Boolean,
      notifyHidden: () => Unit,
      registerAnchorEventHandler: (Any, SpecificEventListener[Any]) => Unit,
      registerDocumentEventHandler: (Any, SpecificEventListener[Any]) => Unit,
      registerEventHandler: (Any, SpecificEventListener[Any]) => Unit,
      registerWindowEventHandler: (Any, SpecificEventListener[Any]) => Unit,
      removeAttribute: String => Unit,
      removeClass: CssClasses => Unit,
      setAnchorAttribute: (String, String) => Unit,
      setAttribute: (String, String) => Unit,
      setStyleProperty: (String, String) => Unit,
      setSurfaceAnimationStyleProperty: (String, String) => Unit,
      setTooltipCaretStyle: (String, String) => Unit,
      tooltipContainsElement: HTMLElement => Boolean
    ): MDCTooltipAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), anchorContainsElement = js.Any.fromFunction1(anchorContainsElement), clearTooltipCaretStyles = js.Any.fromFunction0(clearTooltipCaretStyles), deregisterAnchorEventHandler = js.Any.fromFunction2(deregisterAnchorEventHandler), deregisterDocumentEventHandler = js.Any.fromFunction2(deregisterDocumentEventHandler), deregisterEventHandler = js.Any.fromFunction2(deregisterEventHandler), deregisterWindowEventHandler = js.Any.fromFunction2(deregisterWindowEventHandler), focusAnchorElement = js.Any.fromFunction0(focusAnchorElement), getActiveElement = js.Any.fromFunction0(getActiveElement), getAnchorAttribute = js.Any.fromFunction1(getAnchorAttribute), getAnchorBoundingRect = js.Any.fromFunction0(getAnchorBoundingRect), getAttribute = js.Any.fromFunction1(getAttribute), getComputedStyleProperty = js.Any.fromFunction1(getComputedStyleProperty), getParentBoundingRect = js.Any.fromFunction0(getParentBoundingRect), getTooltipCaretBoundingRect = js.Any.fromFunction0(getTooltipCaretBoundingRect), getTooltipSize = js.Any.fromFunction0(getTooltipSize), getViewportHeight = js.Any.fromFunction0(getViewportHeight), getViewportWidth = js.Any.fromFunction0(getViewportWidth), hasClass = js.Any.fromFunction1(hasClass), isRTL = js.Any.fromFunction0(isRTL), notifyHidden = js.Any.fromFunction0(notifyHidden), registerAnchorEventHandler = js.Any.fromFunction2(registerAnchorEventHandler), registerDocumentEventHandler = js.Any.fromFunction2(registerDocumentEventHandler), registerEventHandler = js.Any.fromFunction2(registerEventHandler), registerWindowEventHandler = js.Any.fromFunction2(registerWindowEventHandler), removeAttribute = js.Any.fromFunction1(removeAttribute), removeClass = js.Any.fromFunction1(removeClass), setAnchorAttribute = js.Any.fromFunction2(setAnchorAttribute), setAttribute = js.Any.fromFunction2(setAttribute), setStyleProperty = js.Any.fromFunction2(setStyleProperty), setSurfaceAnimationStyleProperty = js.Any.fromFunction2(setSurfaceAnimationStyleProperty), setTooltipCaretStyle = js.Any.fromFunction2(setTooltipCaretStyle), tooltipContainsElement = js.Any.fromFunction1(tooltipContainsElement))
      __obj.asInstanceOf[MDCTooltipAdapter]
    }
    
    extension [Self <: MDCTooltipAdapter](x: Self) {
      
      inline def setAddClass(value: CssClasses => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      inline def setAnchorContainsElement(value: HTMLElement => Boolean): Self = StObject.set(x, "anchorContainsElement", js.Any.fromFunction1(value))
      
      inline def setClearTooltipCaretStyles(value: () => Unit): Self = StObject.set(x, "clearTooltipCaretStyles", js.Any.fromFunction0(value))
      
      inline def setDeregisterAnchorEventHandler(value: (Any, SpecificEventListener[Any]) => Unit): Self = StObject.set(x, "deregisterAnchorEventHandler", js.Any.fromFunction2(value))
      
      inline def setDeregisterDocumentEventHandler(value: (Any, SpecificEventListener[Any]) => Unit): Self = StObject.set(x, "deregisterDocumentEventHandler", js.Any.fromFunction2(value))
      
      inline def setDeregisterEventHandler(value: (Any, SpecificEventListener[Any]) => Unit): Self = StObject.set(x, "deregisterEventHandler", js.Any.fromFunction2(value))
      
      inline def setDeregisterWindowEventHandler(value: (Any, SpecificEventListener[Any]) => Unit): Self = StObject.set(x, "deregisterWindowEventHandler", js.Any.fromFunction2(value))
      
      inline def setFocusAnchorElement(value: () => Unit): Self = StObject.set(x, "focusAnchorElement", js.Any.fromFunction0(value))
      
      inline def setGetActiveElement(value: () => Element | Null): Self = StObject.set(x, "getActiveElement", js.Any.fromFunction0(value))
      
      inline def setGetAnchorAttribute(value: String => String | Null): Self = StObject.set(x, "getAnchorAttribute", js.Any.fromFunction1(value))
      
      inline def setGetAnchorBoundingRect(value: () => DOMRect | Null): Self = StObject.set(x, "getAnchorBoundingRect", js.Any.fromFunction0(value))
      
      inline def setGetAttribute(value: String => String | Null): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
      
      inline def setGetComputedStyleProperty(value: String => String): Self = StObject.set(x, "getComputedStyleProperty", js.Any.fromFunction1(value))
      
      inline def setGetParentBoundingRect(value: () => DOMRect | Null): Self = StObject.set(x, "getParentBoundingRect", js.Any.fromFunction0(value))
      
      inline def setGetTooltipCaretBoundingRect(value: () => DOMRect | Null): Self = StObject.set(x, "getTooltipCaretBoundingRect", js.Any.fromFunction0(value))
      
      inline def setGetTooltipSize(value: () => Height): Self = StObject.set(x, "getTooltipSize", js.Any.fromFunction0(value))
      
      inline def setGetViewportHeight(value: () => Double): Self = StObject.set(x, "getViewportHeight", js.Any.fromFunction0(value))
      
      inline def setGetViewportWidth(value: () => Double): Self = StObject.set(x, "getViewportWidth", js.Any.fromFunction0(value))
      
      inline def setHasClass(value: CssClasses => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setIsRTL(value: () => Boolean): Self = StObject.set(x, "isRTL", js.Any.fromFunction0(value))
      
      inline def setNotifyHidden(value: () => Unit): Self = StObject.set(x, "notifyHidden", js.Any.fromFunction0(value))
      
      inline def setRegisterAnchorEventHandler(value: (Any, SpecificEventListener[Any]) => Unit): Self = StObject.set(x, "registerAnchorEventHandler", js.Any.fromFunction2(value))
      
      inline def setRegisterDocumentEventHandler(value: (Any, SpecificEventListener[Any]) => Unit): Self = StObject.set(x, "registerDocumentEventHandler", js.Any.fromFunction2(value))
      
      inline def setRegisterEventHandler(value: (Any, SpecificEventListener[Any]) => Unit): Self = StObject.set(x, "registerEventHandler", js.Any.fromFunction2(value))
      
      inline def setRegisterWindowEventHandler(value: (Any, SpecificEventListener[Any]) => Unit): Self = StObject.set(x, "registerWindowEventHandler", js.Any.fromFunction2(value))
      
      inline def setRemoveAttribute(value: String => Unit): Self = StObject.set(x, "removeAttribute", js.Any.fromFunction1(value))
      
      inline def setRemoveClass(value: CssClasses => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      inline def setSetAnchorAttribute(value: (String, String) => Unit): Self = StObject.set(x, "setAnchorAttribute", js.Any.fromFunction2(value))
      
      inline def setSetAttribute(value: (String, String) => Unit): Self = StObject.set(x, "setAttribute", js.Any.fromFunction2(value))
      
      inline def setSetStyleProperty(value: (String, String) => Unit): Self = StObject.set(x, "setStyleProperty", js.Any.fromFunction2(value))
      
      inline def setSetSurfaceAnimationStyleProperty(value: (String, String) => Unit): Self = StObject.set(x, "setSurfaceAnimationStyleProperty", js.Any.fromFunction2(value))
      
      inline def setSetTooltipCaretStyle(value: (String, String) => Unit): Self = StObject.set(x, "setTooltipCaretStyle", js.Any.fromFunction2(value))
      
      inline def setTooltipContainsElement(value: HTMLElement => Boolean): Self = StObject.set(x, "tooltipContainsElement", js.Any.fromFunction1(value))
    }
  }
}
