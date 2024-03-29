package typings.materialTabIndicator

import typings.std.DOMRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  trait MDCTabIndicatorAdapter extends StObject {
    
    /**
      * Adds the given className to the root element.
      * @param className The className to add
      */
    def addClass(className: String): Unit
    
    /**
      * Returns the client rect of the content element.
      */
    def computeContentClientRect(): DOMRect
    
    /**
      * Removes the given className from the root element.
      * @param className The className to remove
      */
    def removeClass(className: String): Unit
    
    /**
      * Sets a style property of the content element to the passed value
      * @param propName The style property name to set
      * @param value The style property value
      */
    def setContentStyleProperty(propName: String, value: String): Unit
  }
  object MDCTabIndicatorAdapter {
    
    inline def apply(
      addClass: String => Unit,
      computeContentClientRect: () => DOMRect,
      removeClass: String => Unit,
      setContentStyleProperty: (String, String) => Unit
    ): MDCTabIndicatorAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), computeContentClientRect = js.Any.fromFunction0(computeContentClientRect), removeClass = js.Any.fromFunction1(removeClass), setContentStyleProperty = js.Any.fromFunction2(setContentStyleProperty))
      __obj.asInstanceOf[MDCTabIndicatorAdapter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MDCTabIndicatorAdapter] (val x: Self) extends AnyVal {
      
      inline def setAddClass(value: String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      inline def setComputeContentClientRect(value: () => DOMRect): Self = StObject.set(x, "computeContentClientRect", js.Any.fromFunction0(value))
      
      inline def setRemoveClass(value: String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      inline def setSetContentStyleProperty(value: (String, String) => Unit): Self = StObject.set(x, "setContentStyleProperty", js.Any.fromFunction2(value))
    }
  }
}
