package typings.materialCheckbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  @js.native
  trait MDCCheckboxAdapter extends StObject {
    
    def addClass(className: String): Unit = js.native
    
    def forceLayout(): Unit = js.native
    
    def hasNativeControl(): Boolean = js.native
    
    def isAttachedToDOM(): Boolean = js.native
    
    def isChecked(): Boolean = js.native
    
    def isIndeterminate(): Boolean = js.native
    
    def removeClass(className: String): Unit = js.native
    
    def removeNativeControlAttr(attr: String): Unit = js.native
    
    def setNativeControlAttr(attr: String, value: String): Unit = js.native
    
    def setNativeControlDisabled(disabled: Boolean): Unit = js.native
  }
  object MDCCheckboxAdapter {
    
    @scala.inline
    def apply(
      addClass: String => Unit,
      forceLayout: () => Unit,
      hasNativeControl: () => Boolean,
      isAttachedToDOM: () => Boolean,
      isChecked: () => Boolean,
      isIndeterminate: () => Boolean,
      removeClass: String => Unit,
      removeNativeControlAttr: String => Unit,
      setNativeControlAttr: (String, String) => Unit,
      setNativeControlDisabled: Boolean => Unit
    ): MDCCheckboxAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), forceLayout = js.Any.fromFunction0(forceLayout), hasNativeControl = js.Any.fromFunction0(hasNativeControl), isAttachedToDOM = js.Any.fromFunction0(isAttachedToDOM), isChecked = js.Any.fromFunction0(isChecked), isIndeterminate = js.Any.fromFunction0(isIndeterminate), removeClass = js.Any.fromFunction1(removeClass), removeNativeControlAttr = js.Any.fromFunction1(removeNativeControlAttr), setNativeControlAttr = js.Any.fromFunction2(setNativeControlAttr), setNativeControlDisabled = js.Any.fromFunction1(setNativeControlDisabled))
      __obj.asInstanceOf[MDCCheckboxAdapter]
    }
    
    @scala.inline
    implicit class MDCCheckboxAdapterMutableBuilder[Self <: MDCCheckboxAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddClass(value: String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setForceLayout(value: () => Unit): Self = StObject.set(x, "forceLayout", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasNativeControl(value: () => Boolean): Self = StObject.set(x, "hasNativeControl", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsAttachedToDOM(value: () => Boolean): Self = StObject.set(x, "isAttachedToDOM", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsChecked(value: () => Boolean): Self = StObject.set(x, "isChecked", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsIndeterminate(value: () => Boolean): Self = StObject.set(x, "isIndeterminate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveClass(value: String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveNativeControlAttr(value: String => Unit): Self = StObject.set(x, "removeNativeControlAttr", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetNativeControlAttr(value: (String, String) => Unit): Self = StObject.set(x, "setNativeControlAttr", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetNativeControlDisabled(value: Boolean => Unit): Self = StObject.set(x, "setNativeControlDisabled", js.Any.fromFunction1(value))
    }
  }
}
