package typings.materialNotchedOutline

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait NOLABEL extends StObject {
    
    var NO_LABEL: String = js.native
    
    var OUTLINE_NOTCHED: String = js.native
    
    var OUTLINE_UPGRADED: String = js.native
  }
  object NOLABEL {
    
    @scala.inline
    def apply(NO_LABEL: String, OUTLINE_NOTCHED: String, OUTLINE_UPGRADED: String): NOLABEL = {
      val __obj = js.Dynamic.literal(NO_LABEL = NO_LABEL.asInstanceOf[js.Any], OUTLINE_NOTCHED = OUTLINE_NOTCHED.asInstanceOf[js.Any], OUTLINE_UPGRADED = OUTLINE_UPGRADED.asInstanceOf[js.Any])
      __obj.asInstanceOf[NOLABEL]
    }
    
    @scala.inline
    implicit class NOLABELMutableBuilder[Self <: NOLABEL] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNO_LABEL(value: String): Self = StObject.set(x, "NO_LABEL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOUTLINE_NOTCHED(value: String): Self = StObject.set(x, "OUTLINE_NOTCHED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOUTLINE_UPGRADED(value: String): Self = StObject.set(x, "OUTLINE_UPGRADED", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NOTCHELEMENTPADDING extends StObject {
    
    var NOTCH_ELEMENT_PADDING: Double = js.native
  }
  object NOTCHELEMENTPADDING {
    
    @scala.inline
    def apply(NOTCH_ELEMENT_PADDING: Double): NOTCHELEMENTPADDING = {
      val __obj = js.Dynamic.literal(NOTCH_ELEMENT_PADDING = NOTCH_ELEMENT_PADDING.asInstanceOf[js.Any])
      __obj.asInstanceOf[NOTCHELEMENTPADDING]
    }
    
    @scala.inline
    implicit class NOTCHELEMENTPADDINGMutableBuilder[Self <: NOTCHELEMENTPADDING] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNOTCH_ELEMENT_PADDING(value: Double): Self = StObject.set(x, "NOTCH_ELEMENT_PADDING", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NOTCHELEMENTSELECTOR extends StObject {
    
    var NOTCH_ELEMENT_SELECTOR: String = js.native
  }
  object NOTCHELEMENTSELECTOR {
    
    @scala.inline
    def apply(NOTCH_ELEMENT_SELECTOR: String): NOTCHELEMENTSELECTOR = {
      val __obj = js.Dynamic.literal(NOTCH_ELEMENT_SELECTOR = NOTCH_ELEMENT_SELECTOR.asInstanceOf[js.Any])
      __obj.asInstanceOf[NOTCHELEMENTSELECTOR]
    }
    
    @scala.inline
    implicit class NOTCHELEMENTSELECTORMutableBuilder[Self <: NOTCHELEMENTSELECTOR] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNOTCH_ELEMENT_SELECTOR(value: String): Self = StObject.set(x, "NOTCH_ELEMENT_SELECTOR", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/notched-outline.@material/notched-outline/adapter.MDCNotchedOutlineAdapter> */
  @js.native
  trait PartialMDCNotchedOutlineA extends StObject {
    
    var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
    
    var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
    
    var removeNotchWidthProperty: js.UndefOr[js.Function0[Unit]] = js.native
    
    var setNotchWidthProperty: js.UndefOr[js.Function1[/* width */ Double, Unit]] = js.native
  }
  object PartialMDCNotchedOutlineA {
    
    @scala.inline
    def apply(): PartialMDCNotchedOutlineA = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCNotchedOutlineA]
    }
    
    @scala.inline
    implicit class PartialMDCNotchedOutlineAMutableBuilder[Self <: PartialMDCNotchedOutlineA] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddClass(value: /* className */ String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      @scala.inline
      def setRemoveClass(value: /* className */ String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      @scala.inline
      def setRemoveNotchWidthProperty(value: () => Unit): Self = StObject.set(x, "removeNotchWidthProperty", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveNotchWidthPropertyUndefined: Self = StObject.set(x, "removeNotchWidthProperty", js.undefined)
      
      @scala.inline
      def setSetNotchWidthProperty(value: /* width */ Double => Unit): Self = StObject.set(x, "setNotchWidthProperty", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetNotchWidthPropertyUndefined: Self = StObject.set(x, "setNotchWidthProperty", js.undefined)
    }
  }
}
