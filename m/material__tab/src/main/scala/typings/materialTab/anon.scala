package typings.materialTab

import typings.std.ClientRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ACTIVE extends StObject {
    
    var ACTIVE: String
  }
  object ACTIVE {
    
    @scala.inline
    def apply(ACTIVE: String): ACTIVE = {
      val __obj = js.Dynamic.literal(ACTIVE = ACTIVE.asInstanceOf[js.Any])
      __obj.asInstanceOf[ACTIVE]
    }
    
    @scala.inline
    implicit class ACTIVEMutableBuilder[Self <: ACTIVE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setACTIVE(value: String): Self = StObject.set(x, "ACTIVE", value.asInstanceOf[js.Any])
    }
  }
  
  trait ARIASELECTED extends StObject {
    
    var ARIA_SELECTED: String
    
    var CONTENT_SELECTOR: String
    
    var INTERACTED_EVENT: String
    
    var RIPPLE_SELECTOR: String
    
    var TABINDEX: String
    
    var TAB_INDICATOR_SELECTOR: String
  }
  object ARIASELECTED {
    
    @scala.inline
    def apply(
      ARIA_SELECTED: String,
      CONTENT_SELECTOR: String,
      INTERACTED_EVENT: String,
      RIPPLE_SELECTOR: String,
      TABINDEX: String,
      TAB_INDICATOR_SELECTOR: String
    ): ARIASELECTED = {
      val __obj = js.Dynamic.literal(ARIA_SELECTED = ARIA_SELECTED.asInstanceOf[js.Any], CONTENT_SELECTOR = CONTENT_SELECTOR.asInstanceOf[js.Any], INTERACTED_EVENT = INTERACTED_EVENT.asInstanceOf[js.Any], RIPPLE_SELECTOR = RIPPLE_SELECTOR.asInstanceOf[js.Any], TABINDEX = TABINDEX.asInstanceOf[js.Any], TAB_INDICATOR_SELECTOR = TAB_INDICATOR_SELECTOR.asInstanceOf[js.Any])
      __obj.asInstanceOf[ARIASELECTED]
    }
    
    @scala.inline
    implicit class ARIASELECTEDMutableBuilder[Self <: ARIASELECTED] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setARIA_SELECTED(value: String): Self = StObject.set(x, "ARIA_SELECTED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCONTENT_SELECTOR(value: String): Self = StObject.set(x, "CONTENT_SELECTOR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setINTERACTED_EVENT(value: String): Self = StObject.set(x, "INTERACTED_EVENT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRIPPLE_SELECTOR(value: String): Self = StObject.set(x, "RIPPLE_SELECTOR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTABINDEX(value: String): Self = StObject.set(x, "TABINDEX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTAB_INDICATOR_SELECTOR(value: String): Self = StObject.set(x, "TAB_INDICATOR_SELECTOR", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/tab.@material/tab/adapter.MDCTabAdapter> */
  trait PartialMDCTabAdapter extends StObject {
    
    var activateIndicator: js.UndefOr[js.Function1[/* previousIndicatorClientRect */ js.UndefOr[ClientRect], Unit]] = js.undefined
    
    var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var deactivateIndicator: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var focus: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var getContentOffsetLeft: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getContentOffsetWidth: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getOffsetLeft: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getOffsetWidth: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.undefined
    
    var notifyInteracted: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var setAttr: js.UndefOr[js.Function2[/* attr */ String, /* value */ String, Unit]] = js.undefined
  }
  object PartialMDCTabAdapter {
    
    @scala.inline
    def apply(): PartialMDCTabAdapter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCTabAdapter]
    }
    
    @scala.inline
    implicit class PartialMDCTabAdapterMutableBuilder[Self <: PartialMDCTabAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivateIndicator(value: /* previousIndicatorClientRect */ js.UndefOr[ClientRect] => Unit): Self = StObject.set(x, "activateIndicator", js.Any.fromFunction1(value))
      
      @scala.inline
      def setActivateIndicatorUndefined: Self = StObject.set(x, "activateIndicator", js.undefined)
      
      @scala.inline
      def setAddClass(value: /* className */ String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      @scala.inline
      def setDeactivateIndicator(value: () => Unit): Self = StObject.set(x, "deactivateIndicator", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDeactivateIndicatorUndefined: Self = StObject.set(x, "deactivateIndicator", js.undefined)
      
      @scala.inline
      def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      @scala.inline
      def setGetContentOffsetLeft(value: () => Double): Self = StObject.set(x, "getContentOffsetLeft", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetContentOffsetLeftUndefined: Self = StObject.set(x, "getContentOffsetLeft", js.undefined)
      
      @scala.inline
      def setGetContentOffsetWidth(value: () => Double): Self = StObject.set(x, "getContentOffsetWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetContentOffsetWidthUndefined: Self = StObject.set(x, "getContentOffsetWidth", js.undefined)
      
      @scala.inline
      def setGetOffsetLeft(value: () => Double): Self = StObject.set(x, "getOffsetLeft", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetOffsetLeftUndefined: Self = StObject.set(x, "getOffsetLeft", js.undefined)
      
      @scala.inline
      def setGetOffsetWidth(value: () => Double): Self = StObject.set(x, "getOffsetWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetOffsetWidthUndefined: Self = StObject.set(x, "getOffsetWidth", js.undefined)
      
      @scala.inline
      def setHasClass(value: /* className */ String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasClassUndefined: Self = StObject.set(x, "hasClass", js.undefined)
      
      @scala.inline
      def setNotifyInteracted(value: () => Unit): Self = StObject.set(x, "notifyInteracted", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNotifyInteractedUndefined: Self = StObject.set(x, "notifyInteracted", js.undefined)
      
      @scala.inline
      def setRemoveClass(value: /* className */ String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      @scala.inline
      def setSetAttr(value: (/* attr */ String, /* value */ String) => Unit): Self = StObject.set(x, "setAttr", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetAttrUndefined: Self = StObject.set(x, "setAttr", js.undefined)
    }
  }
}
