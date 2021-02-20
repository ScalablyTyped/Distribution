package typings.materialTabIndicator

import typings.std.ClientRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  @js.native
  trait MDCTabIndicatorAdapter extends StObject {
    
    /**
      * Adds the given className to the root element.
      * @param className The className to add
      */
    def addClass(className: String): Unit = js.native
    
    /**
      * Returns the client rect of the content element.
      */
    def computeContentClientRect(): ClientRect = js.native
    
    /**
      * Removes the given className from the root element.
      * @param className The className to remove
      */
    def removeClass(className: String): Unit = js.native
    
    /**
      * Sets a style property of the content element to the passed value
      * @param propName The style property name to set
      * @param value The style property value
      */
    def setContentStyleProperty(propName: String, value: String): Unit = js.native
  }
  object MDCTabIndicatorAdapter {
    
    @scala.inline
    def apply(
      addClass: String => Unit,
      computeContentClientRect: () => ClientRect,
      removeClass: String => Unit,
      setContentStyleProperty: (String, String) => Unit
    ): MDCTabIndicatorAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), computeContentClientRect = js.Any.fromFunction0(computeContentClientRect), removeClass = js.Any.fromFunction1(removeClass), setContentStyleProperty = js.Any.fromFunction2(setContentStyleProperty))
      __obj.asInstanceOf[MDCTabIndicatorAdapter]
    }
    
    @scala.inline
    implicit class MDCTabIndicatorAdapterMutableBuilder[Self <: MDCTabIndicatorAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddClass(value: String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComputeContentClientRect(value: () => ClientRect): Self = StObject.set(x, "computeContentClientRect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveClass(value: String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetContentStyleProperty(value: (String, String) => Unit): Self = StObject.set(x, "setContentStyleProperty", js.Any.fromFunction2(value))
    }
  }
}
