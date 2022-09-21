package typings.materialLinearProgress

import typings.materialLinearProgress.typesMod.MDCResizeObserver
import typings.materialLinearProgress.typesMod.MDCResizeObserverCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  trait MDCLinearProgressAdapter extends StObject {
    
    def addClass(className: String): Unit
    
    /**
      * If available, creates a `ResizeObserver` object, invokes the `#observe`
      * method on the root element. This is used for an optional performance gains
      * for the indeterminate animation on modern browsers.
      *
      * @param callback The callback to apply to the constructor of the
      *    `ResizeObserver`
      * @return Returns a `ResizeObserver` that has had `observe` called on the
      *    root element with the given callback. `null` if `ResizeObserver` is not
      *    implemented or polyfilled.
      */
    def attachResizeObserver(callback: MDCResizeObserverCallback): MDCResizeObserver | Null
    
    def forceLayout(): Unit
    
    /**
      * @return The width of the root element.
      */
    def getWidth(): Double
    
    def hasClass(className: String): Boolean
    
    def removeAttribute(name: String): Unit
    
    def removeClass(className: String): Unit
    
    def setAttribute(name: String, value: String): Unit
    
    def setBufferBarStyle(styleProperty: String, value: String): Unit
    
    def setPrimaryBarStyle(styleProperty: String, value: String): Unit
    
    /**
      * Sets the inline style on the root element.
      * @param styleProperty The style property to set.
      * @param value The value the style property should be set to.
      */
    def setStyle(styleProperty: String, value: String): Unit
  }
  object MDCLinearProgressAdapter {
    
    inline def apply(
      addClass: String => Unit,
      attachResizeObserver: MDCResizeObserverCallback => MDCResizeObserver | Null,
      forceLayout: () => Unit,
      getWidth: () => Double,
      hasClass: String => Boolean,
      removeAttribute: String => Unit,
      removeClass: String => Unit,
      setAttribute: (String, String) => Unit,
      setBufferBarStyle: (String, String) => Unit,
      setPrimaryBarStyle: (String, String) => Unit,
      setStyle: (String, String) => Unit
    ): MDCLinearProgressAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), attachResizeObserver = js.Any.fromFunction1(attachResizeObserver), forceLayout = js.Any.fromFunction0(forceLayout), getWidth = js.Any.fromFunction0(getWidth), hasClass = js.Any.fromFunction1(hasClass), removeAttribute = js.Any.fromFunction1(removeAttribute), removeClass = js.Any.fromFunction1(removeClass), setAttribute = js.Any.fromFunction2(setAttribute), setBufferBarStyle = js.Any.fromFunction2(setBufferBarStyle), setPrimaryBarStyle = js.Any.fromFunction2(setPrimaryBarStyle), setStyle = js.Any.fromFunction2(setStyle))
      __obj.asInstanceOf[MDCLinearProgressAdapter]
    }
    
    extension [Self <: MDCLinearProgressAdapter](x: Self) {
      
      inline def setAddClass(value: String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      inline def setAttachResizeObserver(value: MDCResizeObserverCallback => MDCResizeObserver | Null): Self = StObject.set(x, "attachResizeObserver", js.Any.fromFunction1(value))
      
      inline def setForceLayout(value: () => Unit): Self = StObject.set(x, "forceLayout", js.Any.fromFunction0(value))
      
      inline def setGetWidth(value: () => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
      
      inline def setHasClass(value: String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setRemoveAttribute(value: String => Unit): Self = StObject.set(x, "removeAttribute", js.Any.fromFunction1(value))
      
      inline def setRemoveClass(value: String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      inline def setSetAttribute(value: (String, String) => Unit): Self = StObject.set(x, "setAttribute", js.Any.fromFunction2(value))
      
      inline def setSetBufferBarStyle(value: (String, String) => Unit): Self = StObject.set(x, "setBufferBarStyle", js.Any.fromFunction2(value))
      
      inline def setSetPrimaryBarStyle(value: (String, String) => Unit): Self = StObject.set(x, "setPrimaryBarStyle", js.Any.fromFunction2(value))
      
      inline def setSetStyle(value: (String, String) => Unit): Self = StObject.set(x, "setStyle", js.Any.fromFunction2(value))
    }
  }
}
