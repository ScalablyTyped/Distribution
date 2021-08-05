package typings.materialToolbar

import typings.materialBase.typesMod.SpecificEventListener
import typings.materialToolbar.materialToolbarStrings.resize
import typings.materialToolbar.materialToolbarStrings.scroll
import typings.materialToolbar.typesMod.MDCToolbarEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CHANGEEVENT extends StObject {
    
    var CHANGE_EVENT: String
    
    var FIRST_ROW_SELECTOR: String
    
    var ICON_SELECTOR: String
    
    var TITLE_SELECTOR: String
  }
  object CHANGEEVENT {
    
    inline def apply(CHANGE_EVENT: String, FIRST_ROW_SELECTOR: String, ICON_SELECTOR: String, TITLE_SELECTOR: String): CHANGEEVENT = {
      val __obj = js.Dynamic.literal(CHANGE_EVENT = CHANGE_EVENT.asInstanceOf[js.Any], FIRST_ROW_SELECTOR = FIRST_ROW_SELECTOR.asInstanceOf[js.Any], ICON_SELECTOR = ICON_SELECTOR.asInstanceOf[js.Any], TITLE_SELECTOR = TITLE_SELECTOR.asInstanceOf[js.Any])
      __obj.asInstanceOf[CHANGEEVENT]
    }
    
    extension [Self <: CHANGEEVENT](x: Self) {
      
      inline def setCHANGE_EVENT(value: String): Self = StObject.set(x, "CHANGE_EVENT", value.asInstanceOf[js.Any])
      
      inline def setFIRST_ROW_SELECTOR(value: String): Self = StObject.set(x, "FIRST_ROW_SELECTOR", value.asInstanceOf[js.Any])
      
      inline def setICON_SELECTOR(value: String): Self = StObject.set(x, "ICON_SELECTOR", value.asInstanceOf[js.Any])
      
      inline def setTITLE_SELECTOR(value: String): Self = StObject.set(x, "TITLE_SELECTOR", value.asInstanceOf[js.Any])
    }
  }
  
  trait FIXED extends StObject {
    
    var FIXED: String
    
    var FIXED_AT_LAST_ROW: String
    
    var FIXED_LASTROW: String
    
    var FLEXIBLE_DEFAULT_BEHAVIOR: String
    
    var FLEXIBLE_MAX: String
    
    var FLEXIBLE_MIN: String
    
    var TOOLBAR_ROW_FLEXIBLE: String
  }
  object FIXED {
    
    inline def apply(
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
    
    extension [Self <: FIXED](x: Self) {
      
      inline def setFIXED(value: String): Self = StObject.set(x, "FIXED", value.asInstanceOf[js.Any])
      
      inline def setFIXED_AT_LAST_ROW(value: String): Self = StObject.set(x, "FIXED_AT_LAST_ROW", value.asInstanceOf[js.Any])
      
      inline def setFIXED_LASTROW(value: String): Self = StObject.set(x, "FIXED_LASTROW", value.asInstanceOf[js.Any])
      
      inline def setFLEXIBLE_DEFAULT_BEHAVIOR(value: String): Self = StObject.set(x, "FLEXIBLE_DEFAULT_BEHAVIOR", value.asInstanceOf[js.Any])
      
      inline def setFLEXIBLE_MAX(value: String): Self = StObject.set(x, "FLEXIBLE_MAX", value.asInstanceOf[js.Any])
      
      inline def setFLEXIBLE_MIN(value: String): Self = StObject.set(x, "FLEXIBLE_MIN", value.asInstanceOf[js.Any])
      
      inline def setTOOLBAR_ROW_FLEXIBLE(value: String): Self = StObject.set(x, "TOOLBAR_ROW_FLEXIBLE", value.asInstanceOf[js.Any])
    }
  }
  
  trait MAXTITLESIZE extends StObject {
    
    var MAX_TITLE_SIZE: Double
    
    /** The ratio of max scrollTop that we should listen to to row height. */
    var MIN_TITLE_SIZE: Double
    
    var TOOLBAR_MOBILE_BREAKPOINT: Double
    
    var TOOLBAR_ROW_HEIGHT: Double
    
    var TOOLBAR_ROW_MOBILE_HEIGHT: Double
  }
  object MAXTITLESIZE {
    
    inline def apply(
      MAX_TITLE_SIZE: Double,
      MIN_TITLE_SIZE: Double,
      TOOLBAR_MOBILE_BREAKPOINT: Double,
      TOOLBAR_ROW_HEIGHT: Double,
      TOOLBAR_ROW_MOBILE_HEIGHT: Double
    ): MAXTITLESIZE = {
      val __obj = js.Dynamic.literal(MAX_TITLE_SIZE = MAX_TITLE_SIZE.asInstanceOf[js.Any], MIN_TITLE_SIZE = MIN_TITLE_SIZE.asInstanceOf[js.Any], TOOLBAR_MOBILE_BREAKPOINT = TOOLBAR_MOBILE_BREAKPOINT.asInstanceOf[js.Any], TOOLBAR_ROW_HEIGHT = TOOLBAR_ROW_HEIGHT.asInstanceOf[js.Any], TOOLBAR_ROW_MOBILE_HEIGHT = TOOLBAR_ROW_MOBILE_HEIGHT.asInstanceOf[js.Any])
      __obj.asInstanceOf[MAXTITLESIZE]
    }
    
    extension [Self <: MAXTITLESIZE](x: Self) {
      
      inline def setMAX_TITLE_SIZE(value: Double): Self = StObject.set(x, "MAX_TITLE_SIZE", value.asInstanceOf[js.Any])
      
      inline def setMIN_TITLE_SIZE(value: Double): Self = StObject.set(x, "MIN_TITLE_SIZE", value.asInstanceOf[js.Any])
      
      inline def setTOOLBAR_MOBILE_BREAKPOINT(value: Double): Self = StObject.set(x, "TOOLBAR_MOBILE_BREAKPOINT", value.asInstanceOf[js.Any])
      
      inline def setTOOLBAR_ROW_HEIGHT(value: Double): Self = StObject.set(x, "TOOLBAR_ROW_HEIGHT", value.asInstanceOf[js.Any])
      
      inline def setTOOLBAR_ROW_MOBILE_HEIGHT(value: Double): Self = StObject.set(x, "TOOLBAR_ROW_MOBILE_HEIGHT", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/toolbar.@material/toolbar/adapter.MDCToolbarAdapter> */
  trait PartialMDCToolbarAdapter extends StObject {
    
    var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var deregisterResizeHandler: js.UndefOr[js.Function1[/* handler */ SpecificEventListener[resize], Unit]] = js.undefined
    
    var deregisterScrollHandler: js.UndefOr[js.Function1[/* handler */ SpecificEventListener[scroll], Unit]] = js.undefined
    
    var getFirstRowElementOffsetHeight: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getOffsetHeight: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getViewportScrollY: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getViewportWidth: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.undefined
    
    var notifyChange: js.UndefOr[js.Function1[/* evtData */ MDCToolbarEventDetail, Unit]] = js.undefined
    
    var registerResizeHandler: js.UndefOr[js.Function1[/* handler */ SpecificEventListener[resize], Unit]] = js.undefined
    
    var registerScrollHandler: js.UndefOr[js.Function1[/* handler */ SpecificEventListener[scroll], Unit]] = js.undefined
    
    var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var setStyle: js.UndefOr[js.Function2[/* property */ String, /* value */ String, Unit]] = js.undefined
    
    var setStyleForFixedAdjustElement: js.UndefOr[js.Function2[/* property */ String, /* value */ String, Unit]] = js.undefined
    
    var setStyleForFlexibleRowElement: js.UndefOr[js.Function2[/* property */ String, /* value */ String, Unit]] = js.undefined
    
    var setStyleForTitleElement: js.UndefOr[js.Function2[/* property */ String, /* value */ String, Unit]] = js.undefined
  }
  object PartialMDCToolbarAdapter {
    
    inline def apply(): PartialMDCToolbarAdapter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCToolbarAdapter]
    }
    
    extension [Self <: PartialMDCToolbarAdapter](x: Self) {
      
      inline def setAddClass(value: /* className */ String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      inline def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      inline def setDeregisterResizeHandler(value: /* handler */ SpecificEventListener[resize] => Unit): Self = StObject.set(x, "deregisterResizeHandler", js.Any.fromFunction1(value))
      
      inline def setDeregisterResizeHandlerUndefined: Self = StObject.set(x, "deregisterResizeHandler", js.undefined)
      
      inline def setDeregisterScrollHandler(value: /* handler */ SpecificEventListener[scroll] => Unit): Self = StObject.set(x, "deregisterScrollHandler", js.Any.fromFunction1(value))
      
      inline def setDeregisterScrollHandlerUndefined: Self = StObject.set(x, "deregisterScrollHandler", js.undefined)
      
      inline def setGetFirstRowElementOffsetHeight(value: () => Double): Self = StObject.set(x, "getFirstRowElementOffsetHeight", js.Any.fromFunction0(value))
      
      inline def setGetFirstRowElementOffsetHeightUndefined: Self = StObject.set(x, "getFirstRowElementOffsetHeight", js.undefined)
      
      inline def setGetOffsetHeight(value: () => Double): Self = StObject.set(x, "getOffsetHeight", js.Any.fromFunction0(value))
      
      inline def setGetOffsetHeightUndefined: Self = StObject.set(x, "getOffsetHeight", js.undefined)
      
      inline def setGetViewportScrollY(value: () => Double): Self = StObject.set(x, "getViewportScrollY", js.Any.fromFunction0(value))
      
      inline def setGetViewportScrollYUndefined: Self = StObject.set(x, "getViewportScrollY", js.undefined)
      
      inline def setGetViewportWidth(value: () => Double): Self = StObject.set(x, "getViewportWidth", js.Any.fromFunction0(value))
      
      inline def setGetViewportWidthUndefined: Self = StObject.set(x, "getViewportWidth", js.undefined)
      
      inline def setHasClass(value: /* className */ String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setHasClassUndefined: Self = StObject.set(x, "hasClass", js.undefined)
      
      inline def setNotifyChange(value: /* evtData */ MDCToolbarEventDetail => Unit): Self = StObject.set(x, "notifyChange", js.Any.fromFunction1(value))
      
      inline def setNotifyChangeUndefined: Self = StObject.set(x, "notifyChange", js.undefined)
      
      inline def setRegisterResizeHandler(value: /* handler */ SpecificEventListener[resize] => Unit): Self = StObject.set(x, "registerResizeHandler", js.Any.fromFunction1(value))
      
      inline def setRegisterResizeHandlerUndefined: Self = StObject.set(x, "registerResizeHandler", js.undefined)
      
      inline def setRegisterScrollHandler(value: /* handler */ SpecificEventListener[scroll] => Unit): Self = StObject.set(x, "registerScrollHandler", js.Any.fromFunction1(value))
      
      inline def setRegisterScrollHandlerUndefined: Self = StObject.set(x, "registerScrollHandler", js.undefined)
      
      inline def setRemoveClass(value: /* className */ String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      inline def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      inline def setSetStyle(value: (/* property */ String, /* value */ String) => Unit): Self = StObject.set(x, "setStyle", js.Any.fromFunction2(value))
      
      inline def setSetStyleForFixedAdjustElement(value: (/* property */ String, /* value */ String) => Unit): Self = StObject.set(x, "setStyleForFixedAdjustElement", js.Any.fromFunction2(value))
      
      inline def setSetStyleForFixedAdjustElementUndefined: Self = StObject.set(x, "setStyleForFixedAdjustElement", js.undefined)
      
      inline def setSetStyleForFlexibleRowElement(value: (/* property */ String, /* value */ String) => Unit): Self = StObject.set(x, "setStyleForFlexibleRowElement", js.Any.fromFunction2(value))
      
      inline def setSetStyleForFlexibleRowElementUndefined: Self = StObject.set(x, "setStyleForFlexibleRowElement", js.undefined)
      
      inline def setSetStyleForTitleElement(value: (/* property */ String, /* value */ String) => Unit): Self = StObject.set(x, "setStyleForTitleElement", js.Any.fromFunction2(value))
      
      inline def setSetStyleForTitleElementUndefined: Self = StObject.set(x, "setStyleForTitleElement", js.undefined)
      
      inline def setSetStyleUndefined: Self = StObject.set(x, "setStyle", js.undefined)
    }
  }
}
