package typings.materialToolbar

import typings.materialBase.typesMod.SpecificEventListener
import typings.materialToolbar.materialToolbarStrings.resize
import typings.materialToolbar.materialToolbarStrings.scroll
import typings.materialToolbar.typesMod.MDCToolbarEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CHANGEEVENT extends StObject {
    
    var CHANGE_EVENT: String = js.native
    
    var FIRST_ROW_SELECTOR: String = js.native
    
    var ICON_SELECTOR: String = js.native
    
    var TITLE_SELECTOR: String = js.native
  }
  object CHANGEEVENT {
    
    @scala.inline
    def apply(CHANGE_EVENT: String, FIRST_ROW_SELECTOR: String, ICON_SELECTOR: String, TITLE_SELECTOR: String): CHANGEEVENT = {
      val __obj = js.Dynamic.literal(CHANGE_EVENT = CHANGE_EVENT.asInstanceOf[js.Any], FIRST_ROW_SELECTOR = FIRST_ROW_SELECTOR.asInstanceOf[js.Any], ICON_SELECTOR = ICON_SELECTOR.asInstanceOf[js.Any], TITLE_SELECTOR = TITLE_SELECTOR.asInstanceOf[js.Any])
      __obj.asInstanceOf[CHANGEEVENT]
    }
    
    @scala.inline
    implicit class CHANGEEVENTMutableBuilder[Self <: CHANGEEVENT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCHANGE_EVENT(value: String): Self = StObject.set(x, "CHANGE_EVENT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFIRST_ROW_SELECTOR(value: String): Self = StObject.set(x, "FIRST_ROW_SELECTOR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setICON_SELECTOR(value: String): Self = StObject.set(x, "ICON_SELECTOR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTITLE_SELECTOR(value: String): Self = StObject.set(x, "TITLE_SELECTOR", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FIXED extends StObject {
    
    var FIXED: String = js.native
    
    var FIXED_AT_LAST_ROW: String = js.native
    
    var FIXED_LASTROW: String = js.native
    
    var FLEXIBLE_DEFAULT_BEHAVIOR: String = js.native
    
    var FLEXIBLE_MAX: String = js.native
    
    var FLEXIBLE_MIN: String = js.native
    
    var TOOLBAR_ROW_FLEXIBLE: String = js.native
  }
  object FIXED {
    
    @scala.inline
    def apply(
      FIXED: String,
      FIXED_AT_LAST_ROW: String,
      FIXED_LASTROW: String,
      FLEXIBLE_DEFAULT_BEHAVIOR: String,
      FLEXIBLE_MAX: String,
      FLEXIBLE_MIN: String,
      TOOLBAR_ROW_FLEXIBLE: String
    ): FIXED = {
      val __obj = js.Dynamic.literal(FIXED = FIXED.asInstanceOf[js.Any], FIXED_AT_LAST_ROW = FIXED_AT_LAST_ROW.asInstanceOf[js.Any], FIXED_LASTROW = FIXED_LASTROW.asInstanceOf[js.Any], FLEXIBLE_DEFAULT_BEHAVIOR = FLEXIBLE_DEFAULT_BEHAVIOR.asInstanceOf[js.Any], FLEXIBLE_MAX = FLEXIBLE_MAX.asInstanceOf[js.Any], FLEXIBLE_MIN = FLEXIBLE_MIN.asInstanceOf[js.Any], TOOLBAR_ROW_FLEXIBLE = TOOLBAR_ROW_FLEXIBLE.asInstanceOf[js.Any])
      __obj.asInstanceOf[FIXED]
    }
    
    @scala.inline
    implicit class FIXEDMutableBuilder[Self <: FIXED] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFIXED(value: String): Self = StObject.set(x, "FIXED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFIXED_AT_LAST_ROW(value: String): Self = StObject.set(x, "FIXED_AT_LAST_ROW", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFIXED_LASTROW(value: String): Self = StObject.set(x, "FIXED_LASTROW", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFLEXIBLE_DEFAULT_BEHAVIOR(value: String): Self = StObject.set(x, "FLEXIBLE_DEFAULT_BEHAVIOR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFLEXIBLE_MAX(value: String): Self = StObject.set(x, "FLEXIBLE_MAX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFLEXIBLE_MIN(value: String): Self = StObject.set(x, "FLEXIBLE_MIN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTOOLBAR_ROW_FLEXIBLE(value: String): Self = StObject.set(x, "TOOLBAR_ROW_FLEXIBLE", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MAXTITLESIZE extends StObject {
    
    var MAX_TITLE_SIZE: Double = js.native
    
    /** The ratio of max scrollTop that we should listen to to row height. */
    var MIN_TITLE_SIZE: Double = js.native
    
    var TOOLBAR_MOBILE_BREAKPOINT: Double = js.native
    
    var TOOLBAR_ROW_HEIGHT: Double = js.native
    
    var TOOLBAR_ROW_MOBILE_HEIGHT: Double = js.native
  }
  object MAXTITLESIZE {
    
    @scala.inline
    def apply(
      MAX_TITLE_SIZE: Double,
      MIN_TITLE_SIZE: Double,
      TOOLBAR_MOBILE_BREAKPOINT: Double,
      TOOLBAR_ROW_HEIGHT: Double,
      TOOLBAR_ROW_MOBILE_HEIGHT: Double
    ): MAXTITLESIZE = {
      val __obj = js.Dynamic.literal(MAX_TITLE_SIZE = MAX_TITLE_SIZE.asInstanceOf[js.Any], MIN_TITLE_SIZE = MIN_TITLE_SIZE.asInstanceOf[js.Any], TOOLBAR_MOBILE_BREAKPOINT = TOOLBAR_MOBILE_BREAKPOINT.asInstanceOf[js.Any], TOOLBAR_ROW_HEIGHT = TOOLBAR_ROW_HEIGHT.asInstanceOf[js.Any], TOOLBAR_ROW_MOBILE_HEIGHT = TOOLBAR_ROW_MOBILE_HEIGHT.asInstanceOf[js.Any])
      __obj.asInstanceOf[MAXTITLESIZE]
    }
    
    @scala.inline
    implicit class MAXTITLESIZEMutableBuilder[Self <: MAXTITLESIZE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMAX_TITLE_SIZE(value: Double): Self = StObject.set(x, "MAX_TITLE_SIZE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMIN_TITLE_SIZE(value: Double): Self = StObject.set(x, "MIN_TITLE_SIZE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTOOLBAR_MOBILE_BREAKPOINT(value: Double): Self = StObject.set(x, "TOOLBAR_MOBILE_BREAKPOINT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTOOLBAR_ROW_HEIGHT(value: Double): Self = StObject.set(x, "TOOLBAR_ROW_HEIGHT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTOOLBAR_ROW_MOBILE_HEIGHT(value: Double): Self = StObject.set(x, "TOOLBAR_ROW_MOBILE_HEIGHT", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/toolbar.@material/toolbar/adapter.MDCToolbarAdapter> */
  @js.native
  trait PartialMDCToolbarAdapter extends StObject {
    
    var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
    
    var deregisterResizeHandler: js.UndefOr[js.Function1[/* handler */ SpecificEventListener[resize], Unit]] = js.native
    
    var deregisterScrollHandler: js.UndefOr[js.Function1[/* handler */ SpecificEventListener[scroll], Unit]] = js.native
    
    var getFirstRowElementOffsetHeight: js.UndefOr[js.Function0[Double]] = js.native
    
    var getOffsetHeight: js.UndefOr[js.Function0[Double]] = js.native
    
    var getViewportScrollY: js.UndefOr[js.Function0[Double]] = js.native
    
    var getViewportWidth: js.UndefOr[js.Function0[Double]] = js.native
    
    var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.native
    
    var notifyChange: js.UndefOr[js.Function1[/* evtData */ MDCToolbarEventDetail, Unit]] = js.native
    
    var registerResizeHandler: js.UndefOr[js.Function1[/* handler */ SpecificEventListener[resize], Unit]] = js.native
    
    var registerScrollHandler: js.UndefOr[js.Function1[/* handler */ SpecificEventListener[scroll], Unit]] = js.native
    
    var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
    
    var setStyle: js.UndefOr[js.Function2[/* property */ String, /* value */ String, Unit]] = js.native
    
    var setStyleForFixedAdjustElement: js.UndefOr[js.Function2[/* property */ String, /* value */ String, Unit]] = js.native
    
    var setStyleForFlexibleRowElement: js.UndefOr[js.Function2[/* property */ String, /* value */ String, Unit]] = js.native
    
    var setStyleForTitleElement: js.UndefOr[js.Function2[/* property */ String, /* value */ String, Unit]] = js.native
  }
  object PartialMDCToolbarAdapter {
    
    @scala.inline
    def apply(): PartialMDCToolbarAdapter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCToolbarAdapter]
    }
    
    @scala.inline
    implicit class PartialMDCToolbarAdapterMutableBuilder[Self <: PartialMDCToolbarAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddClass(value: /* className */ String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      @scala.inline
      def setDeregisterResizeHandler(value: /* handler */ SpecificEventListener[resize] => Unit): Self = StObject.set(x, "deregisterResizeHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeregisterResizeHandlerUndefined: Self = StObject.set(x, "deregisterResizeHandler", js.undefined)
      
      @scala.inline
      def setDeregisterScrollHandler(value: /* handler */ SpecificEventListener[scroll] => Unit): Self = StObject.set(x, "deregisterScrollHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeregisterScrollHandlerUndefined: Self = StObject.set(x, "deregisterScrollHandler", js.undefined)
      
      @scala.inline
      def setGetFirstRowElementOffsetHeight(value: () => Double): Self = StObject.set(x, "getFirstRowElementOffsetHeight", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFirstRowElementOffsetHeightUndefined: Self = StObject.set(x, "getFirstRowElementOffsetHeight", js.undefined)
      
      @scala.inline
      def setGetOffsetHeight(value: () => Double): Self = StObject.set(x, "getOffsetHeight", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetOffsetHeightUndefined: Self = StObject.set(x, "getOffsetHeight", js.undefined)
      
      @scala.inline
      def setGetViewportScrollY(value: () => Double): Self = StObject.set(x, "getViewportScrollY", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetViewportScrollYUndefined: Self = StObject.set(x, "getViewportScrollY", js.undefined)
      
      @scala.inline
      def setGetViewportWidth(value: () => Double): Self = StObject.set(x, "getViewportWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetViewportWidthUndefined: Self = StObject.set(x, "getViewportWidth", js.undefined)
      
      @scala.inline
      def setHasClass(value: /* className */ String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasClassUndefined: Self = StObject.set(x, "hasClass", js.undefined)
      
      @scala.inline
      def setNotifyChange(value: /* evtData */ MDCToolbarEventDetail => Unit): Self = StObject.set(x, "notifyChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNotifyChangeUndefined: Self = StObject.set(x, "notifyChange", js.undefined)
      
      @scala.inline
      def setRegisterResizeHandler(value: /* handler */ SpecificEventListener[resize] => Unit): Self = StObject.set(x, "registerResizeHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRegisterResizeHandlerUndefined: Self = StObject.set(x, "registerResizeHandler", js.undefined)
      
      @scala.inline
      def setRegisterScrollHandler(value: /* handler */ SpecificEventListener[scroll] => Unit): Self = StObject.set(x, "registerScrollHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRegisterScrollHandlerUndefined: Self = StObject.set(x, "registerScrollHandler", js.undefined)
      
      @scala.inline
      def setRemoveClass(value: /* className */ String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      @scala.inline
      def setSetStyle(value: (/* property */ String, /* value */ String) => Unit): Self = StObject.set(x, "setStyle", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetStyleForFixedAdjustElement(value: (/* property */ String, /* value */ String) => Unit): Self = StObject.set(x, "setStyleForFixedAdjustElement", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetStyleForFixedAdjustElementUndefined: Self = StObject.set(x, "setStyleForFixedAdjustElement", js.undefined)
      
      @scala.inline
      def setSetStyleForFlexibleRowElement(value: (/* property */ String, /* value */ String) => Unit): Self = StObject.set(x, "setStyleForFlexibleRowElement", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetStyleForFlexibleRowElementUndefined: Self = StObject.set(x, "setStyleForFlexibleRowElement", js.undefined)
      
      @scala.inline
      def setSetStyleForTitleElement(value: (/* property */ String, /* value */ String) => Unit): Self = StObject.set(x, "setStyleForTitleElement", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetStyleForTitleElementUndefined: Self = StObject.set(x, "setStyleForTitleElement", js.undefined)
      
      @scala.inline
      def setSetStyleUndefined: Self = StObject.set(x, "setStyle", js.undefined)
    }
  }
}
