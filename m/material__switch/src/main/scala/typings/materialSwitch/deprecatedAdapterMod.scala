package typings.materialSwitch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deprecatedAdapterMod {
  
  trait MDCSwitchAdapter extends StObject {
    
    /**
      * Adds a CSS class to the root element.
      */
    def addClass(className: String): Unit
    
    /**
      * Removes a CSS class from the root element.
      */
    def removeClass(className: String): Unit
    
    /**
      * Sets an attribute value of the native HTML control underlying the switch.
      */
    def setNativeControlAttr(attr: String, value: String): Unit
    
    /**
      * Sets checked state of the native HTML control underlying the switch.
      */
    def setNativeControlChecked(checked: Boolean): Unit
    
    /**
      * Sets the disabled state of the native HTML control underlying the switch.
      */
    def setNativeControlDisabled(disabled: Boolean): Unit
  }
  object MDCSwitchAdapter {
    
    inline def apply(
      addClass: String => Unit,
      removeClass: String => Unit,
      setNativeControlAttr: (String, String) => Unit,
      setNativeControlChecked: Boolean => Unit,
      setNativeControlDisabled: Boolean => Unit
    ): MDCSwitchAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), removeClass = js.Any.fromFunction1(removeClass), setNativeControlAttr = js.Any.fromFunction2(setNativeControlAttr), setNativeControlChecked = js.Any.fromFunction1(setNativeControlChecked), setNativeControlDisabled = js.Any.fromFunction1(setNativeControlDisabled))
      __obj.asInstanceOf[MDCSwitchAdapter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MDCSwitchAdapter] (val x: Self) extends AnyVal {
      
      inline def setAddClass(value: String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      inline def setRemoveClass(value: String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      inline def setSetNativeControlAttr(value: (String, String) => Unit): Self = StObject.set(x, "setNativeControlAttr", js.Any.fromFunction2(value))
      
      inline def setSetNativeControlChecked(value: Boolean => Unit): Self = StObject.set(x, "setNativeControlChecked", js.Any.fromFunction1(value))
      
      inline def setSetNativeControlDisabled(value: Boolean => Unit): Self = StObject.set(x, "setNativeControlDisabled", js.Any.fromFunction1(value))
    }
  }
}
