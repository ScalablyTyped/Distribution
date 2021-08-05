package typings.materialTabBar

import typings.materialTab.typesMod.MDCTabDimensions
import typings.std.ClientRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ARROWLEFTKEY extends StObject {
    
    var ARROW_LEFT_KEY: String
    
    var ARROW_RIGHT_KEY: String
    
    var END_KEY: String
    
    var ENTER_KEY: String
    
    var HOME_KEY: String
    
    var SPACE_KEY: String
    
    var TAB_ACTIVATED_EVENT: String
    
    var TAB_SCROLLER_SELECTOR: String
    
    var TAB_SELECTOR: String
  }
  object ARROWLEFTKEY {
    
    inline def apply(
      ARROW_LEFT_KEY: String,
      ARROW_RIGHT_KEY: String,
      END_KEY: String,
      ENTER_KEY: String,
      HOME_KEY: String,
      SPACE_KEY: String,
      TAB_ACTIVATED_EVENT: String,
      TAB_SCROLLER_SELECTOR: String,
      TAB_SELECTOR: String
    ): ARROWLEFTKEY = {
      val __obj = js.Dynamic.literal(ARROW_LEFT_KEY = ARROW_LEFT_KEY.asInstanceOf[js.Any], ARROW_RIGHT_KEY = ARROW_RIGHT_KEY.asInstanceOf[js.Any], END_KEY = END_KEY.asInstanceOf[js.Any], ENTER_KEY = ENTER_KEY.asInstanceOf[js.Any], HOME_KEY = HOME_KEY.asInstanceOf[js.Any], SPACE_KEY = SPACE_KEY.asInstanceOf[js.Any], TAB_ACTIVATED_EVENT = TAB_ACTIVATED_EVENT.asInstanceOf[js.Any], TAB_SCROLLER_SELECTOR = TAB_SCROLLER_SELECTOR.asInstanceOf[js.Any], TAB_SELECTOR = TAB_SELECTOR.asInstanceOf[js.Any])
      __obj.asInstanceOf[ARROWLEFTKEY]
    }
    
    extension [Self <: ARROWLEFTKEY](x: Self) {
      
      inline def setARROW_LEFT_KEY(value: String): Self = StObject.set(x, "ARROW_LEFT_KEY", value.asInstanceOf[js.Any])
      
      inline def setARROW_RIGHT_KEY(value: String): Self = StObject.set(x, "ARROW_RIGHT_KEY", value.asInstanceOf[js.Any])
      
      inline def setEND_KEY(value: String): Self = StObject.set(x, "END_KEY", value.asInstanceOf[js.Any])
      
      inline def setENTER_KEY(value: String): Self = StObject.set(x, "ENTER_KEY", value.asInstanceOf[js.Any])
      
      inline def setHOME_KEY(value: String): Self = StObject.set(x, "HOME_KEY", value.asInstanceOf[js.Any])
      
      inline def setSPACE_KEY(value: String): Self = StObject.set(x, "SPACE_KEY", value.asInstanceOf[js.Any])
      
      inline def setTAB_ACTIVATED_EVENT(value: String): Self = StObject.set(x, "TAB_ACTIVATED_EVENT", value.asInstanceOf[js.Any])
      
      inline def setTAB_SCROLLER_SELECTOR(value: String): Self = StObject.set(x, "TAB_SCROLLER_SELECTOR", value.asInstanceOf[js.Any])
      
      inline def setTAB_SELECTOR(value: String): Self = StObject.set(x, "TAB_SELECTOR", value.asInstanceOf[js.Any])
    }
  }
  
  trait ARROWLEFTKEYCODE extends StObject {
    
    var ARROW_LEFT_KEYCODE: Double
    
    var ARROW_RIGHT_KEYCODE: Double
    
    var END_KEYCODE: Double
    
    var ENTER_KEYCODE: Double
    
    var EXTRA_SCROLL_AMOUNT: Double
    
    var HOME_KEYCODE: Double
    
    var SPACE_KEYCODE: Double
  }
  object ARROWLEFTKEYCODE {
    
    inline def apply(
      ARROW_LEFT_KEYCODE: Double,
      ARROW_RIGHT_KEYCODE: Double,
      END_KEYCODE: Double,
      ENTER_KEYCODE: Double,
      EXTRA_SCROLL_AMOUNT: Double,
      HOME_KEYCODE: Double,
      SPACE_KEYCODE: Double
    ): ARROWLEFTKEYCODE = {
      val __obj = js.Dynamic.literal(ARROW_LEFT_KEYCODE = ARROW_LEFT_KEYCODE.asInstanceOf[js.Any], ARROW_RIGHT_KEYCODE = ARROW_RIGHT_KEYCODE.asInstanceOf[js.Any], END_KEYCODE = END_KEYCODE.asInstanceOf[js.Any], ENTER_KEYCODE = ENTER_KEYCODE.asInstanceOf[js.Any], EXTRA_SCROLL_AMOUNT = EXTRA_SCROLL_AMOUNT.asInstanceOf[js.Any], HOME_KEYCODE = HOME_KEYCODE.asInstanceOf[js.Any], SPACE_KEYCODE = SPACE_KEYCODE.asInstanceOf[js.Any])
      __obj.asInstanceOf[ARROWLEFTKEYCODE]
    }
    
    extension [Self <: ARROWLEFTKEYCODE](x: Self) {
      
      inline def setARROW_LEFT_KEYCODE(value: Double): Self = StObject.set(x, "ARROW_LEFT_KEYCODE", value.asInstanceOf[js.Any])
      
      inline def setARROW_RIGHT_KEYCODE(value: Double): Self = StObject.set(x, "ARROW_RIGHT_KEYCODE", value.asInstanceOf[js.Any])
      
      inline def setEND_KEYCODE(value: Double): Self = StObject.set(x, "END_KEYCODE", value.asInstanceOf[js.Any])
      
      inline def setENTER_KEYCODE(value: Double): Self = StObject.set(x, "ENTER_KEYCODE", value.asInstanceOf[js.Any])
      
      inline def setEXTRA_SCROLL_AMOUNT(value: Double): Self = StObject.set(x, "EXTRA_SCROLL_AMOUNT", value.asInstanceOf[js.Any])
      
      inline def setHOME_KEYCODE(value: Double): Self = StObject.set(x, "HOME_KEYCODE", value.asInstanceOf[js.Any])
      
      inline def setSPACE_KEYCODE(value: Double): Self = StObject.set(x, "SPACE_KEYCODE", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/tab-bar.@material/tab-bar/adapter.MDCTabBarAdapter> */
  trait PartialMDCTabBarAdapter extends StObject {
    
    var activateTabAtIndex: js.UndefOr[js.Function2[/* index */ Double, /* clientRect */ js.UndefOr[ClientRect], Unit]] = js.undefined
    
    var deactivateTabAtIndex: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
    
    var focusTabAtIndex: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
    
    var getFocusedTabIndex: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getIndexOfTabById: js.UndefOr[js.Function1[/* id */ String, Double]] = js.undefined
    
    var getOffsetWidth: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getPreviousActiveTabIndex: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getScrollContentWidth: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getScrollPosition: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getTabDimensionsAtIndex: js.UndefOr[js.Function1[/* index */ Double, MDCTabDimensions]] = js.undefined
    
    var getTabIndicatorClientRectAtIndex: js.UndefOr[js.Function1[/* index */ Double, ClientRect]] = js.undefined
    
    var getTabListLength: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var incrementScroll: js.UndefOr[js.Function1[/* scrollXIncrement */ Double, Unit]] = js.undefined
    
    var isRTL: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var notifyTabActivated: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
    
    var scrollTo: js.UndefOr[js.Function1[/* scrollX */ Double, Unit]] = js.undefined
    
    var setActiveTab: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
  }
  object PartialMDCTabBarAdapter {
    
    inline def apply(): PartialMDCTabBarAdapter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCTabBarAdapter]
    }
    
    extension [Self <: PartialMDCTabBarAdapter](x: Self) {
      
      inline def setActivateTabAtIndex(value: (/* index */ Double, /* clientRect */ js.UndefOr[ClientRect]) => Unit): Self = StObject.set(x, "activateTabAtIndex", js.Any.fromFunction2(value))
      
      inline def setActivateTabAtIndexUndefined: Self = StObject.set(x, "activateTabAtIndex", js.undefined)
      
      inline def setDeactivateTabAtIndex(value: /* index */ Double => Unit): Self = StObject.set(x, "deactivateTabAtIndex", js.Any.fromFunction1(value))
      
      inline def setDeactivateTabAtIndexUndefined: Self = StObject.set(x, "deactivateTabAtIndex", js.undefined)
      
      inline def setFocusTabAtIndex(value: /* index */ Double => Unit): Self = StObject.set(x, "focusTabAtIndex", js.Any.fromFunction1(value))
      
      inline def setFocusTabAtIndexUndefined: Self = StObject.set(x, "focusTabAtIndex", js.undefined)
      
      inline def setGetFocusedTabIndex(value: () => Double): Self = StObject.set(x, "getFocusedTabIndex", js.Any.fromFunction0(value))
      
      inline def setGetFocusedTabIndexUndefined: Self = StObject.set(x, "getFocusedTabIndex", js.undefined)
      
      inline def setGetIndexOfTabById(value: /* id */ String => Double): Self = StObject.set(x, "getIndexOfTabById", js.Any.fromFunction1(value))
      
      inline def setGetIndexOfTabByIdUndefined: Self = StObject.set(x, "getIndexOfTabById", js.undefined)
      
      inline def setGetOffsetWidth(value: () => Double): Self = StObject.set(x, "getOffsetWidth", js.Any.fromFunction0(value))
      
      inline def setGetOffsetWidthUndefined: Self = StObject.set(x, "getOffsetWidth", js.undefined)
      
      inline def setGetPreviousActiveTabIndex(value: () => Double): Self = StObject.set(x, "getPreviousActiveTabIndex", js.Any.fromFunction0(value))
      
      inline def setGetPreviousActiveTabIndexUndefined: Self = StObject.set(x, "getPreviousActiveTabIndex", js.undefined)
      
      inline def setGetScrollContentWidth(value: () => Double): Self = StObject.set(x, "getScrollContentWidth", js.Any.fromFunction0(value))
      
      inline def setGetScrollContentWidthUndefined: Self = StObject.set(x, "getScrollContentWidth", js.undefined)
      
      inline def setGetScrollPosition(value: () => Double): Self = StObject.set(x, "getScrollPosition", js.Any.fromFunction0(value))
      
      inline def setGetScrollPositionUndefined: Self = StObject.set(x, "getScrollPosition", js.undefined)
      
      inline def setGetTabDimensionsAtIndex(value: /* index */ Double => MDCTabDimensions): Self = StObject.set(x, "getTabDimensionsAtIndex", js.Any.fromFunction1(value))
      
      inline def setGetTabDimensionsAtIndexUndefined: Self = StObject.set(x, "getTabDimensionsAtIndex", js.undefined)
      
      inline def setGetTabIndicatorClientRectAtIndex(value: /* index */ Double => ClientRect): Self = StObject.set(x, "getTabIndicatorClientRectAtIndex", js.Any.fromFunction1(value))
      
      inline def setGetTabIndicatorClientRectAtIndexUndefined: Self = StObject.set(x, "getTabIndicatorClientRectAtIndex", js.undefined)
      
      inline def setGetTabListLength(value: () => Double): Self = StObject.set(x, "getTabListLength", js.Any.fromFunction0(value))
      
      inline def setGetTabListLengthUndefined: Self = StObject.set(x, "getTabListLength", js.undefined)
      
      inline def setIncrementScroll(value: /* scrollXIncrement */ Double => Unit): Self = StObject.set(x, "incrementScroll", js.Any.fromFunction1(value))
      
      inline def setIncrementScrollUndefined: Self = StObject.set(x, "incrementScroll", js.undefined)
      
      inline def setIsRTL(value: () => Boolean): Self = StObject.set(x, "isRTL", js.Any.fromFunction0(value))
      
      inline def setIsRTLUndefined: Self = StObject.set(x, "isRTL", js.undefined)
      
      inline def setNotifyTabActivated(value: /* index */ Double => Unit): Self = StObject.set(x, "notifyTabActivated", js.Any.fromFunction1(value))
      
      inline def setNotifyTabActivatedUndefined: Self = StObject.set(x, "notifyTabActivated", js.undefined)
      
      inline def setScrollTo(value: /* scrollX */ Double => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction1(value))
      
      inline def setScrollToUndefined: Self = StObject.set(x, "scrollTo", js.undefined)
      
      inline def setSetActiveTab(value: /* index */ Double => Unit): Self = StObject.set(x, "setActiveTab", js.Any.fromFunction1(value))
      
      inline def setSetActiveTabUndefined: Self = StObject.set(x, "setActiveTab", js.undefined)
    }
  }
}
