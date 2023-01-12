package typings.materialSwitch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ARIACHECKEDATTR extends StObject {
    
    var ARIA_CHECKED_ATTR: String
    
    var NATIVE_CONTROL_SELECTOR: String
    
    var RIPPLE_SURFACE_SELECTOR: String
  }
  object ARIACHECKEDATTR {
    
    inline def apply(ARIA_CHECKED_ATTR: String, NATIVE_CONTROL_SELECTOR: String, RIPPLE_SURFACE_SELECTOR: String): ARIACHECKEDATTR = {
      val __obj = js.Dynamic.literal(ARIA_CHECKED_ATTR = ARIA_CHECKED_ATTR.asInstanceOf[js.Any], NATIVE_CONTROL_SELECTOR = NATIVE_CONTROL_SELECTOR.asInstanceOf[js.Any], RIPPLE_SURFACE_SELECTOR = RIPPLE_SURFACE_SELECTOR.asInstanceOf[js.Any])
      __obj.asInstanceOf[ARIACHECKEDATTR]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ARIACHECKEDATTR] (val x: Self) extends AnyVal {
      
      inline def setARIA_CHECKED_ATTR(value: String): Self = StObject.set(x, "ARIA_CHECKED_ATTR", value.asInstanceOf[js.Any])
      
      inline def setNATIVE_CONTROL_SELECTOR(value: String): Self = StObject.set(x, "NATIVE_CONTROL_SELECTOR", value.asInstanceOf[js.Any])
      
      inline def setRIPPLE_SURFACE_SELECTOR(value: String): Self = StObject.set(x, "RIPPLE_SURFACE_SELECTOR", value.asInstanceOf[js.Any])
    }
  }
  
  trait CHECKED extends StObject {
    
    var CHECKED: String
    
    var DISABLED: String
  }
  object CHECKED {
    
    inline def apply(CHECKED: String, DISABLED: String): CHECKED = {
      val __obj = js.Dynamic.literal(CHECKED = CHECKED.asInstanceOf[js.Any], DISABLED = DISABLED.asInstanceOf[js.Any])
      __obj.asInstanceOf[CHECKED]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CHECKED] (val x: Self) extends AnyVal {
      
      inline def setCHECKED(value: String): Self = StObject.set(x, "CHECKED", value.asInstanceOf[js.Any])
      
      inline def setDISABLED(value: String): Self = StObject.set(x, "DISABLED", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/switch.@material/switch/deprecated/adapter.MDCSwitchAdapter> */
  trait PartialMDCSwitchAdapter extends StObject {
    
    var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var setNativeControlAttr: js.UndefOr[js.Function2[/* attr */ String, /* value */ String, Unit]] = js.undefined
    
    var setNativeControlChecked: js.UndefOr[js.Function1[/* checked */ Boolean, Unit]] = js.undefined
    
    var setNativeControlDisabled: js.UndefOr[js.Function1[/* disabled */ Boolean, Unit]] = js.undefined
  }
  object PartialMDCSwitchAdapter {
    
    inline def apply(): PartialMDCSwitchAdapter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCSwitchAdapter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialMDCSwitchAdapter] (val x: Self) extends AnyVal {
      
      inline def setAddClass(value: /* className */ String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      inline def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      inline def setRemoveClass(value: /* className */ String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      inline def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      inline def setSetNativeControlAttr(value: (/* attr */ String, /* value */ String) => Unit): Self = StObject.set(x, "setNativeControlAttr", js.Any.fromFunction2(value))
      
      inline def setSetNativeControlAttrUndefined: Self = StObject.set(x, "setNativeControlAttr", js.undefined)
      
      inline def setSetNativeControlChecked(value: /* checked */ Boolean => Unit): Self = StObject.set(x, "setNativeControlChecked", js.Any.fromFunction1(value))
      
      inline def setSetNativeControlCheckedUndefined: Self = StObject.set(x, "setNativeControlChecked", js.undefined)
      
      inline def setSetNativeControlDisabled(value: /* disabled */ Boolean => Unit): Self = StObject.set(x, "setNativeControlDisabled", js.Any.fromFunction1(value))
      
      inline def setSetNativeControlDisabledUndefined: Self = StObject.set(x, "setNativeControlDisabled", js.undefined)
    }
  }
}
