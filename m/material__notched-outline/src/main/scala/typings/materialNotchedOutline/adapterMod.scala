package typings.materialNotchedOutline

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  trait MDCNotchedOutlineAdapter extends StObject {
    
    /**
      * Adds a class to the root element.
      */
    def addClass(className: String): Unit
    
    /**
      * Removes a class from the root element.
      */
    def removeClass(className: String): Unit
    
    /**
      * Removes the width style property from the notch element.
      */
    def removeNotchWidthProperty(): Unit
    
    /**
      * Sets the width style property of the notch element.
      */
    def setNotchWidthProperty(width: Double): Unit
  }
  object MDCNotchedOutlineAdapter {
    
    @scala.inline
    def apply(
      addClass: String => Unit,
      removeClass: String => Unit,
      removeNotchWidthProperty: () => Unit,
      setNotchWidthProperty: Double => Unit
    ): MDCNotchedOutlineAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), removeClass = js.Any.fromFunction1(removeClass), removeNotchWidthProperty = js.Any.fromFunction0(removeNotchWidthProperty), setNotchWidthProperty = js.Any.fromFunction1(setNotchWidthProperty))
      __obj.asInstanceOf[MDCNotchedOutlineAdapter]
    }
    
    @scala.inline
    implicit class MDCNotchedOutlineAdapterMutableBuilder[Self <: MDCNotchedOutlineAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddClass(value: String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveClass(value: String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveNotchWidthProperty(value: () => Unit): Self = StObject.set(x, "removeNotchWidthProperty", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetNotchWidthProperty(value: Double => Unit): Self = StObject.set(x, "setNotchWidthProperty", js.Any.fromFunction1(value))
    }
  }
}
