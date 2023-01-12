package typings.materialCheckbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  trait MDCCheckboxAdapter extends StObject {
    
    def addClass(className: String): Unit
    
    def forceLayout(): Unit
    
    def hasNativeControl(): Boolean
    
    def isAttachedToDOM(): Boolean
    
    def isChecked(): Boolean
    
    def isIndeterminate(): Boolean
    
    def removeClass(className: String): Unit
    
    def removeNativeControlAttr(attr: String): Unit
    
    def setNativeControlAttr(attr: String, value: String): Unit
    
    def setNativeControlDisabled(disabled: Boolean): Unit
  }
  object MDCCheckboxAdapter {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: MDCCheckboxAdapter] (val x: Self) extends AnyVal {
      
      inline def setAddClass(value: String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      inline def setForceLayout(value: () => Unit): Self = StObject.set(x, "forceLayout", js.Any.fromFunction0(value))
      
      inline def setHasNativeControl(value: () => Boolean): Self = StObject.set(x, "hasNativeControl", js.Any.fromFunction0(value))
      
      inline def setIsAttachedToDOM(value: () => Boolean): Self = StObject.set(x, "isAttachedToDOM", js.Any.fromFunction0(value))
      
      inline def setIsChecked(value: () => Boolean): Self = StObject.set(x, "isChecked", js.Any.fromFunction0(value))
      
      inline def setIsIndeterminate(value: () => Boolean): Self = StObject.set(x, "isIndeterminate", js.Any.fromFunction0(value))
      
      inline def setRemoveClass(value: String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      inline def setRemoveNativeControlAttr(value: String => Unit): Self = StObject.set(x, "removeNativeControlAttr", js.Any.fromFunction1(value))
      
      inline def setSetNativeControlAttr(value: (String, String) => Unit): Self = StObject.set(x, "setNativeControlAttr", js.Any.fromFunction2(value))
      
      inline def setSetNativeControlDisabled(value: Boolean => Unit): Self = StObject.set(x, "setNativeControlDisabled", js.Any.fromFunction1(value))
    }
  }
}
