package typings.materialTabBar

import typings.materialTab.typesMod.MDCTabDimensions
import typings.std.ClientRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ARROWLEFTKEY extends StObject {
    
    var ARROW_LEFT_KEY: String = js.native
    
    var ARROW_RIGHT_KEY: String = js.native
    
    var END_KEY: String = js.native
    
    var ENTER_KEY: String = js.native
    
    var HOME_KEY: String = js.native
    
    var SPACE_KEY: String = js.native
    
    var TAB_ACTIVATED_EVENT: String = js.native
    
    var TAB_SCROLLER_SELECTOR: String = js.native
    
    var TAB_SELECTOR: String = js.native
  }
  object ARROWLEFTKEY {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ARROWLEFTKEYMutableBuilder[Self <: ARROWLEFTKEY] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setARROW_LEFT_KEY(value: String): Self = StObject.set(x, "ARROW_LEFT_KEY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setARROW_RIGHT_KEY(value: String): Self = StObject.set(x, "ARROW_RIGHT_KEY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEND_KEY(value: String): Self = StObject.set(x, "END_KEY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setENTER_KEY(value: String): Self = StObject.set(x, "ENTER_KEY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHOME_KEY(value: String): Self = StObject.set(x, "HOME_KEY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSPACE_KEY(value: String): Self = StObject.set(x, "SPACE_KEY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTAB_ACTIVATED_EVENT(value: String): Self = StObject.set(x, "TAB_ACTIVATED_EVENT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTAB_SCROLLER_SELECTOR(value: String): Self = StObject.set(x, "TAB_SCROLLER_SELECTOR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTAB_SELECTOR(value: String): Self = StObject.set(x, "TAB_SELECTOR", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ARROWLEFTKEYCODE extends StObject {
    
    var ARROW_LEFT_KEYCODE: Double = js.native
    
    var ARROW_RIGHT_KEYCODE: Double = js.native
    
    var END_KEYCODE: Double = js.native
    
    var ENTER_KEYCODE: Double = js.native
    
    var EXTRA_SCROLL_AMOUNT: Double = js.native
    
    var HOME_KEYCODE: Double = js.native
    
    var SPACE_KEYCODE: Double = js.native
  }
  object ARROWLEFTKEYCODE {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ARROWLEFTKEYCODEMutableBuilder[Self <: ARROWLEFTKEYCODE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setARROW_LEFT_KEYCODE(value: Double): Self = StObject.set(x, "ARROW_LEFT_KEYCODE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setARROW_RIGHT_KEYCODE(value: Double): Self = StObject.set(x, "ARROW_RIGHT_KEYCODE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEND_KEYCODE(value: Double): Self = StObject.set(x, "END_KEYCODE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setENTER_KEYCODE(value: Double): Self = StObject.set(x, "ENTER_KEYCODE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEXTRA_SCROLL_AMOUNT(value: Double): Self = StObject.set(x, "EXTRA_SCROLL_AMOUNT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHOME_KEYCODE(value: Double): Self = StObject.set(x, "HOME_KEYCODE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSPACE_KEYCODE(value: Double): Self = StObject.set(x, "SPACE_KEYCODE", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/tab-bar.@material/tab-bar/adapter.MDCTabBarAdapter> */
  @js.native
  trait PartialMDCTabBarAdapter extends StObject {
    
    var activateTabAtIndex: js.UndefOr[js.Function2[/* index */ Double, /* clientRect */ js.UndefOr[ClientRect], Unit]] = js.native
    
    var deactivateTabAtIndex: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
    
    var focusTabAtIndex: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
    
    var getFocusedTabIndex: js.UndefOr[js.Function0[Double]] = js.native
    
    var getIndexOfTabById: js.UndefOr[js.Function1[/* id */ String, Double]] = js.native
    
    var getOffsetWidth: js.UndefOr[js.Function0[Double]] = js.native
    
    var getPreviousActiveTabIndex: js.UndefOr[js.Function0[Double]] = js.native
    
    var getScrollContentWidth: js.UndefOr[js.Function0[Double]] = js.native
    
    var getScrollPosition: js.UndefOr[js.Function0[Double]] = js.native
    
    var getTabDimensionsAtIndex: js.UndefOr[js.Function1[/* index */ Double, MDCTabDimensions]] = js.native
    
    var getTabIndicatorClientRectAtIndex: js.UndefOr[js.Function1[/* index */ Double, ClientRect]] = js.native
    
    var getTabListLength: js.UndefOr[js.Function0[Double]] = js.native
    
    var incrementScroll: js.UndefOr[js.Function1[/* scrollXIncrement */ Double, Unit]] = js.native
    
    var isRTL: js.UndefOr[js.Function0[Boolean]] = js.native
    
    var notifyTabActivated: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
    
    var scrollTo: js.UndefOr[js.Function1[/* scrollX */ Double, Unit]] = js.native
    
    var setActiveTab: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
  }
  object PartialMDCTabBarAdapter {
    
    @scala.inline
    def apply(): PartialMDCTabBarAdapter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCTabBarAdapter]
    }
    
    @scala.inline
    implicit class PartialMDCTabBarAdapterMutableBuilder[Self <: PartialMDCTabBarAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivateTabAtIndex(value: (/* index */ Double, /* clientRect */ js.UndefOr[ClientRect]) => Unit): Self = StObject.set(x, "activateTabAtIndex", js.Any.fromFunction2(value))
      
      @scala.inline
      def setActivateTabAtIndexUndefined: Self = StObject.set(x, "activateTabAtIndex", js.undefined)
      
      @scala.inline
      def setDeactivateTabAtIndex(value: /* index */ Double => Unit): Self = StObject.set(x, "deactivateTabAtIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeactivateTabAtIndexUndefined: Self = StObject.set(x, "deactivateTabAtIndex", js.undefined)
      
      @scala.inline
      def setFocusTabAtIndex(value: /* index */ Double => Unit): Self = StObject.set(x, "focusTabAtIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFocusTabAtIndexUndefined: Self = StObject.set(x, "focusTabAtIndex", js.undefined)
      
      @scala.inline
      def setGetFocusedTabIndex(value: () => Double): Self = StObject.set(x, "getFocusedTabIndex", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFocusedTabIndexUndefined: Self = StObject.set(x, "getFocusedTabIndex", js.undefined)
      
      @scala.inline
      def setGetIndexOfTabById(value: /* id */ String => Double): Self = StObject.set(x, "getIndexOfTabById", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetIndexOfTabByIdUndefined: Self = StObject.set(x, "getIndexOfTabById", js.undefined)
      
      @scala.inline
      def setGetOffsetWidth(value: () => Double): Self = StObject.set(x, "getOffsetWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetOffsetWidthUndefined: Self = StObject.set(x, "getOffsetWidth", js.undefined)
      
      @scala.inline
      def setGetPreviousActiveTabIndex(value: () => Double): Self = StObject.set(x, "getPreviousActiveTabIndex", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPreviousActiveTabIndexUndefined: Self = StObject.set(x, "getPreviousActiveTabIndex", js.undefined)
      
      @scala.inline
      def setGetScrollContentWidth(value: () => Double): Self = StObject.set(x, "getScrollContentWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetScrollContentWidthUndefined: Self = StObject.set(x, "getScrollContentWidth", js.undefined)
      
      @scala.inline
      def setGetScrollPosition(value: () => Double): Self = StObject.set(x, "getScrollPosition", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetScrollPositionUndefined: Self = StObject.set(x, "getScrollPosition", js.undefined)
      
      @scala.inline
      def setGetTabDimensionsAtIndex(value: /* index */ Double => MDCTabDimensions): Self = StObject.set(x, "getTabDimensionsAtIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetTabDimensionsAtIndexUndefined: Self = StObject.set(x, "getTabDimensionsAtIndex", js.undefined)
      
      @scala.inline
      def setGetTabIndicatorClientRectAtIndex(value: /* index */ Double => ClientRect): Self = StObject.set(x, "getTabIndicatorClientRectAtIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetTabIndicatorClientRectAtIndexUndefined: Self = StObject.set(x, "getTabIndicatorClientRectAtIndex", js.undefined)
      
      @scala.inline
      def setGetTabListLength(value: () => Double): Self = StObject.set(x, "getTabListLength", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTabListLengthUndefined: Self = StObject.set(x, "getTabListLength", js.undefined)
      
      @scala.inline
      def setIncrementScroll(value: /* scrollXIncrement */ Double => Unit): Self = StObject.set(x, "incrementScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIncrementScrollUndefined: Self = StObject.set(x, "incrementScroll", js.undefined)
      
      @scala.inline
      def setIsRTL(value: () => Boolean): Self = StObject.set(x, "isRTL", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsRTLUndefined: Self = StObject.set(x, "isRTL", js.undefined)
      
      @scala.inline
      def setNotifyTabActivated(value: /* index */ Double => Unit): Self = StObject.set(x, "notifyTabActivated", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNotifyTabActivatedUndefined: Self = StObject.set(x, "notifyTabActivated", js.undefined)
      
      @scala.inline
      def setScrollTo(value: /* scrollX */ Double => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScrollToUndefined: Self = StObject.set(x, "scrollTo", js.undefined)
      
      @scala.inline
      def setSetActiveTab(value: /* index */ Double => Unit): Self = StObject.set(x, "setActiveTab", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetActiveTabUndefined: Self = StObject.set(x, "setActiveTab", js.undefined)
    }
  }
}
