package typings.materialSwitch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ARIACHECKEDATTR extends StObject {
    
    var ARIA_CHECKED_ATTR: String = js.native
    
    var NATIVE_CONTROL_SELECTOR: String = js.native
    
    var RIPPLE_SURFACE_SELECTOR: String = js.native
  }
  object ARIACHECKEDATTR {
    
    @scala.inline
    def apply(ARIA_CHECKED_ATTR: String, NATIVE_CONTROL_SELECTOR: String, RIPPLE_SURFACE_SELECTOR: String): ARIACHECKEDATTR = {
      val __obj = js.Dynamic.literal(ARIA_CHECKED_ATTR = ARIA_CHECKED_ATTR.asInstanceOf[js.Any], NATIVE_CONTROL_SELECTOR = NATIVE_CONTROL_SELECTOR.asInstanceOf[js.Any], RIPPLE_SURFACE_SELECTOR = RIPPLE_SURFACE_SELECTOR.asInstanceOf[js.Any])
      __obj.asInstanceOf[ARIACHECKEDATTR]
    }
    
    @scala.inline
    implicit class ARIACHECKEDATTRMutableBuilder[Self <: ARIACHECKEDATTR] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setARIA_CHECKED_ATTR(value: String): Self = StObject.set(x, "ARIA_CHECKED_ATTR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNATIVE_CONTROL_SELECTOR(value: String): Self = StObject.set(x, "NATIVE_CONTROL_SELECTOR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRIPPLE_SURFACE_SELECTOR(value: String): Self = StObject.set(x, "RIPPLE_SURFACE_SELECTOR", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CHECKED extends StObject {
    
    var CHECKED: String = js.native
    
    var DISABLED: String = js.native
  }
  object CHECKED {
    
    @scala.inline
    def apply(CHECKED: String, DISABLED: String): CHECKED = {
      val __obj = js.Dynamic.literal(CHECKED = CHECKED.asInstanceOf[js.Any], DISABLED = DISABLED.asInstanceOf[js.Any])
      __obj.asInstanceOf[CHECKED]
    }
    
    @scala.inline
    implicit class CHECKEDMutableBuilder[Self <: CHECKED] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCHECKED(value: String): Self = StObject.set(x, "CHECKED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDISABLED(value: String): Self = StObject.set(x, "DISABLED", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/switch.@material/switch/adapter.MDCSwitchAdapter> */
  @js.native
  trait PartialMDCSwitchAdapter extends StObject {
    
    var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
    
    var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
    
    var setNativeControlAttr: js.UndefOr[js.Function2[/* attr */ String, /* value */ String, Unit]] = js.native
    
    var setNativeControlChecked: js.UndefOr[js.Function1[/* checked */ Boolean, Unit]] = js.native
    
    var setNativeControlDisabled: js.UndefOr[js.Function1[/* disabled */ Boolean, Unit]] = js.native
  }
  object PartialMDCSwitchAdapter {
    
    @scala.inline
    def apply(): PartialMDCSwitchAdapter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCSwitchAdapter]
    }
    
    @scala.inline
    implicit class PartialMDCSwitchAdapterMutableBuilder[Self <: PartialMDCSwitchAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddClass(value: /* className */ String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      @scala.inline
      def setRemoveClass(value: /* className */ String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      @scala.inline
      def setSetNativeControlAttr(value: (/* attr */ String, /* value */ String) => Unit): Self = StObject.set(x, "setNativeControlAttr", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetNativeControlAttrUndefined: Self = StObject.set(x, "setNativeControlAttr", js.undefined)
      
      @scala.inline
      def setSetNativeControlChecked(value: /* checked */ Boolean => Unit): Self = StObject.set(x, "setNativeControlChecked", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetNativeControlCheckedUndefined: Self = StObject.set(x, "setNativeControlChecked", js.undefined)
      
      @scala.inline
      def setSetNativeControlDisabled(value: /* disabled */ Boolean => Unit): Self = StObject.set(x, "setNativeControlDisabled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetNativeControlDisabledUndefined: Self = StObject.set(x, "setNativeControlDisabled", js.undefined)
    }
  }
}
