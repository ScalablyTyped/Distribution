package typings.materialTopAppBar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ACTIONITEMSELECTOR extends StObject {
    
    var ACTION_ITEM_SELECTOR: String = js.native
    
    var NAVIGATION_EVENT: String = js.native
    
    var NAVIGATION_ICON_SELECTOR: String = js.native
    
    var ROOT_SELECTOR: String = js.native
    
    var TITLE_SELECTOR: String = js.native
  }
  object ACTIONITEMSELECTOR {
    
    @scala.inline
    def apply(
      ACTION_ITEM_SELECTOR: String,
      NAVIGATION_EVENT: String,
      NAVIGATION_ICON_SELECTOR: String,
      ROOT_SELECTOR: String,
      TITLE_SELECTOR: String
    ): ACTIONITEMSELECTOR = {
      val __obj = js.Dynamic.literal(ACTION_ITEM_SELECTOR = ACTION_ITEM_SELECTOR.asInstanceOf[js.Any], NAVIGATION_EVENT = NAVIGATION_EVENT.asInstanceOf[js.Any], NAVIGATION_ICON_SELECTOR = NAVIGATION_ICON_SELECTOR.asInstanceOf[js.Any], ROOT_SELECTOR = ROOT_SELECTOR.asInstanceOf[js.Any], TITLE_SELECTOR = TITLE_SELECTOR.asInstanceOf[js.Any])
      __obj.asInstanceOf[ACTIONITEMSELECTOR]
    }
    
    @scala.inline
    implicit class ACTIONITEMSELECTORMutableBuilder[Self <: ACTIONITEMSELECTOR] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setACTION_ITEM_SELECTOR(value: String): Self = StObject.set(x, "ACTION_ITEM_SELECTOR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNAVIGATION_EVENT(value: String): Self = StObject.set(x, "NAVIGATION_EVENT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNAVIGATION_ICON_SELECTOR(value: String): Self = StObject.set(x, "NAVIGATION_ICON_SELECTOR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setROOT_SELECTOR(value: String): Self = StObject.set(x, "ROOT_SELECTOR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTITLE_SELECTOR(value: String): Self = StObject.set(x, "TITLE_SELECTOR", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DEBOUNCETHROTTLERESIZETIMEMS extends StObject {
    
    var DEBOUNCE_THROTTLE_RESIZE_TIME_MS: Double = js.native
    
    var MAX_TOP_APP_BAR_HEIGHT: Double = js.native
  }
  object DEBOUNCETHROTTLERESIZETIMEMS {
    
    @scala.inline
    def apply(DEBOUNCE_THROTTLE_RESIZE_TIME_MS: Double, MAX_TOP_APP_BAR_HEIGHT: Double): DEBOUNCETHROTTLERESIZETIMEMS = {
      val __obj = js.Dynamic.literal(DEBOUNCE_THROTTLE_RESIZE_TIME_MS = DEBOUNCE_THROTTLE_RESIZE_TIME_MS.asInstanceOf[js.Any], MAX_TOP_APP_BAR_HEIGHT = MAX_TOP_APP_BAR_HEIGHT.asInstanceOf[js.Any])
      __obj.asInstanceOf[DEBOUNCETHROTTLERESIZETIMEMS]
    }
    
    @scala.inline
    implicit class DEBOUNCETHROTTLERESIZETIMEMSMutableBuilder[Self <: DEBOUNCETHROTTLERESIZETIMEMS] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDEBOUNCE_THROTTLE_RESIZE_TIME_MS(value: Double): Self = StObject.set(x, "DEBOUNCE_THROTTLE_RESIZE_TIME_MS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMAX_TOP_APP_BAR_HEIGHT(value: Double): Self = StObject.set(x, "MAX_TOP_APP_BAR_HEIGHT", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FIXEDCLASS extends StObject {
    
    var FIXED_CLASS: String = js.native
    
    var FIXED_SCROLLED_CLASS: String = js.native
    
    var SHORT_CLASS: String = js.native
    
    var SHORT_COLLAPSED_CLASS: String = js.native
    
    var SHORT_HAS_ACTION_ITEM_CLASS: String = js.native
  }
  object FIXEDCLASS {
    
    @scala.inline
    def apply(
      FIXED_CLASS: String,
      FIXED_SCROLLED_CLASS: String,
      SHORT_CLASS: String,
      SHORT_COLLAPSED_CLASS: String,
      SHORT_HAS_ACTION_ITEM_CLASS: String
    ): FIXEDCLASS = {
      val __obj = js.Dynamic.literal(FIXED_CLASS = FIXED_CLASS.asInstanceOf[js.Any], FIXED_SCROLLED_CLASS = FIXED_SCROLLED_CLASS.asInstanceOf[js.Any], SHORT_CLASS = SHORT_CLASS.asInstanceOf[js.Any], SHORT_COLLAPSED_CLASS = SHORT_COLLAPSED_CLASS.asInstanceOf[js.Any], SHORT_HAS_ACTION_ITEM_CLASS = SHORT_HAS_ACTION_ITEM_CLASS.asInstanceOf[js.Any])
      __obj.asInstanceOf[FIXEDCLASS]
    }
    
    @scala.inline
    implicit class FIXEDCLASSMutableBuilder[Self <: FIXEDCLASS] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFIXED_CLASS(value: String): Self = StObject.set(x, "FIXED_CLASS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFIXED_SCROLLED_CLASS(value: String): Self = StObject.set(x, "FIXED_SCROLLED_CLASS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSHORT_CLASS(value: String): Self = StObject.set(x, "SHORT_CLASS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSHORT_COLLAPSED_CLASS(value: String): Self = StObject.set(x, "SHORT_COLLAPSED_CLASS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSHORT_HAS_ACTION_ITEM_CLASS(value: String): Self = StObject.set(x, "SHORT_HAS_ACTION_ITEM_CLASS", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/top-app-bar.@material/top-app-bar/adapter.MDCTopAppBarAdapter> */
  @js.native
  trait PartialMDCTopAppBarAdapte extends StObject {
    
    var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
    
    var getTopAppBarHeight: js.UndefOr[js.Function0[Double]] = js.native
    
    var getTotalActionItems: js.UndefOr[js.Function0[Double]] = js.native
    
    var getViewportScrollY: js.UndefOr[js.Function0[Double]] = js.native
    
    var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.native
    
    var notifyNavigationIconClicked: js.UndefOr[js.Function0[Unit]] = js.native
    
    var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
    
    var setStyle: js.UndefOr[js.Function2[/* property */ String, /* value */ String, Unit]] = js.native
  }
  object PartialMDCTopAppBarAdapte {
    
    @scala.inline
    def apply(): PartialMDCTopAppBarAdapte = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCTopAppBarAdapte]
    }
    
    @scala.inline
    implicit class PartialMDCTopAppBarAdapteMutableBuilder[Self <: PartialMDCTopAppBarAdapte] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddClass(value: /* className */ String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      @scala.inline
      def setGetTopAppBarHeight(value: () => Double): Self = StObject.set(x, "getTopAppBarHeight", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTopAppBarHeightUndefined: Self = StObject.set(x, "getTopAppBarHeight", js.undefined)
      
      @scala.inline
      def setGetTotalActionItems(value: () => Double): Self = StObject.set(x, "getTotalActionItems", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTotalActionItemsUndefined: Self = StObject.set(x, "getTotalActionItems", js.undefined)
      
      @scala.inline
      def setGetViewportScrollY(value: () => Double): Self = StObject.set(x, "getViewportScrollY", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetViewportScrollYUndefined: Self = StObject.set(x, "getViewportScrollY", js.undefined)
      
      @scala.inline
      def setHasClass(value: /* className */ String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasClassUndefined: Self = StObject.set(x, "hasClass", js.undefined)
      
      @scala.inline
      def setNotifyNavigationIconClicked(value: () => Unit): Self = StObject.set(x, "notifyNavigationIconClicked", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNotifyNavigationIconClickedUndefined: Self = StObject.set(x, "notifyNavigationIconClicked", js.undefined)
      
      @scala.inline
      def setRemoveClass(value: /* className */ String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      @scala.inline
      def setSetStyle(value: (/* property */ String, /* value */ String) => Unit): Self = StObject.set(x, "setStyle", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetStyleUndefined: Self = StObject.set(x, "setStyle", js.undefined)
    }
  }
}
