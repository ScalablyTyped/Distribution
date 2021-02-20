package typings.materialRadio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait DISABLED extends StObject {
    
    var DISABLED: String = js.native
    
    var ROOT: String = js.native
  }
  object DISABLED {
    
    @scala.inline
    def apply(DISABLED: String, ROOT: String): DISABLED = {
      val __obj = js.Dynamic.literal(DISABLED = DISABLED.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any])
      __obj.asInstanceOf[DISABLED]
    }
    
    @scala.inline
    implicit class DISABLEDMutableBuilder[Self <: DISABLED] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDISABLED(value: String): Self = StObject.set(x, "DISABLED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setROOT(value: String): Self = StObject.set(x, "ROOT", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NATIVECONTROLSELECTOR extends StObject {
    
    var NATIVE_CONTROL_SELECTOR: String = js.native
  }
  object NATIVECONTROLSELECTOR {
    
    @scala.inline
    def apply(NATIVE_CONTROL_SELECTOR: String): NATIVECONTROLSELECTOR = {
      val __obj = js.Dynamic.literal(NATIVE_CONTROL_SELECTOR = NATIVE_CONTROL_SELECTOR.asInstanceOf[js.Any])
      __obj.asInstanceOf[NATIVECONTROLSELECTOR]
    }
    
    @scala.inline
    implicit class NATIVECONTROLSELECTORMutableBuilder[Self <: NATIVECONTROLSELECTOR] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNATIVE_CONTROL_SELECTOR(value: String): Self = StObject.set(x, "NATIVE_CONTROL_SELECTOR", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/radio.@material/radio/adapter.MDCRadioAdapter> */
  @js.native
  trait PartialMDCRadioAdapter extends StObject {
    
    var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
    
    var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
    
    var setNativeControlDisabled: js.UndefOr[js.Function1[/* disabled */ Boolean, Unit]] = js.native
  }
  object PartialMDCRadioAdapter {
    
    @scala.inline
    def apply(): PartialMDCRadioAdapter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCRadioAdapter]
    }
    
    @scala.inline
    implicit class PartialMDCRadioAdapterMutableBuilder[Self <: PartialMDCRadioAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddClass(value: /* className */ String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      @scala.inline
      def setRemoveClass(value: /* className */ String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      @scala.inline
      def setSetNativeControlDisabled(value: /* disabled */ Boolean => Unit): Self = StObject.set(x, "setNativeControlDisabled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetNativeControlDisabledUndefined: Self = StObject.set(x, "setNativeControlDisabled", js.undefined)
    }
  }
}
