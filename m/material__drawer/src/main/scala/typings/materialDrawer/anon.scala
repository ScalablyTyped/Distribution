package typings.materialDrawer

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ANIMATE extends StObject {
    
    var ANIMATE: String = js.native
    
    var CLOSING: String = js.native
    
    var DISMISSIBLE: String = js.native
    
    var MODAL: String = js.native
    
    var OPEN: String = js.native
    
    var OPENING: String = js.native
    
    var ROOT: String = js.native
  }
  object ANIMATE {
    
    @scala.inline
    def apply(
      ANIMATE: String,
      CLOSING: String,
      DISMISSIBLE: String,
      MODAL: String,
      OPEN: String,
      OPENING: String,
      ROOT: String
    ): ANIMATE = {
      val __obj = js.Dynamic.literal(ANIMATE = ANIMATE.asInstanceOf[js.Any], CLOSING = CLOSING.asInstanceOf[js.Any], DISMISSIBLE = DISMISSIBLE.asInstanceOf[js.Any], MODAL = MODAL.asInstanceOf[js.Any], OPEN = OPEN.asInstanceOf[js.Any], OPENING = OPENING.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any])
      __obj.asInstanceOf[ANIMATE]
    }
    
    @scala.inline
    implicit class ANIMATEMutableBuilder[Self <: ANIMATE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setANIMATE(value: String): Self = StObject.set(x, "ANIMATE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCLOSING(value: String): Self = StObject.set(x, "CLOSING", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDISMISSIBLE(value: String): Self = StObject.set(x, "DISMISSIBLE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMODAL(value: String): Self = StObject.set(x, "MODAL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOPEN(value: String): Self = StObject.set(x, "OPEN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOPENING(value: String): Self = StObject.set(x, "OPENING", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setROOT(value: String): Self = StObject.set(x, "ROOT", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait APPCONTENTSELECTOR extends StObject {
    
    var APP_CONTENT_SELECTOR: String = js.native
    
    var CLOSE_EVENT: String = js.native
    
    var OPEN_EVENT: String = js.native
    
    var SCRIM_SELECTOR: String = js.native
  }
  object APPCONTENTSELECTOR {
    
    @scala.inline
    def apply(APP_CONTENT_SELECTOR: String, CLOSE_EVENT: String, OPEN_EVENT: String, SCRIM_SELECTOR: String): APPCONTENTSELECTOR = {
      val __obj = js.Dynamic.literal(APP_CONTENT_SELECTOR = APP_CONTENT_SELECTOR.asInstanceOf[js.Any], CLOSE_EVENT = CLOSE_EVENT.asInstanceOf[js.Any], OPEN_EVENT = OPEN_EVENT.asInstanceOf[js.Any], SCRIM_SELECTOR = SCRIM_SELECTOR.asInstanceOf[js.Any])
      __obj.asInstanceOf[APPCONTENTSELECTOR]
    }
    
    @scala.inline
    implicit class APPCONTENTSELECTORMutableBuilder[Self <: APPCONTENTSELECTOR] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAPP_CONTENT_SELECTOR(value: String): Self = StObject.set(x, "APP_CONTENT_SELECTOR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCLOSE_EVENT(value: String): Self = StObject.set(x, "CLOSE_EVENT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOPEN_EVENT(value: String): Self = StObject.set(x, "OPEN_EVENT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSCRIM_SELECTOR(value: String): Self = StObject.set(x, "SCRIM_SELECTOR", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/drawer.@material/drawer/adapter.MDCDrawerAdapter> */
  @js.native
  trait PartialMDCDrawerAdapter extends StObject {
    
    var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
    
    var elementHasClass: js.UndefOr[js.Function2[/* element */ Element, /* className */ String, Boolean]] = js.native
    
    var focusActiveNavigationItem: js.UndefOr[js.Function0[Unit]] = js.native
    
    var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.native
    
    var notifyClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    var notifyOpen: js.UndefOr[js.Function0[Unit]] = js.native
    
    var releaseFocus: js.UndefOr[js.Function0[Unit]] = js.native
    
    var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
    
    var restoreFocus: js.UndefOr[js.Function0[Unit]] = js.native
    
    var saveFocus: js.UndefOr[js.Function0[Unit]] = js.native
    
    var trapFocus: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object PartialMDCDrawerAdapter {
    
    @scala.inline
    def apply(): PartialMDCDrawerAdapter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCDrawerAdapter]
    }
    
    @scala.inline
    implicit class PartialMDCDrawerAdapterMutableBuilder[Self <: PartialMDCDrawerAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddClass(value: /* className */ String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      @scala.inline
      def setElementHasClass(value: (/* element */ Element, /* className */ String) => Boolean): Self = StObject.set(x, "elementHasClass", js.Any.fromFunction2(value))
      
      @scala.inline
      def setElementHasClassUndefined: Self = StObject.set(x, "elementHasClass", js.undefined)
      
      @scala.inline
      def setFocusActiveNavigationItem(value: () => Unit): Self = StObject.set(x, "focusActiveNavigationItem", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFocusActiveNavigationItemUndefined: Self = StObject.set(x, "focusActiveNavigationItem", js.undefined)
      
      @scala.inline
      def setHasClass(value: /* className */ String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasClassUndefined: Self = StObject.set(x, "hasClass", js.undefined)
      
      @scala.inline
      def setNotifyClose(value: () => Unit): Self = StObject.set(x, "notifyClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNotifyCloseUndefined: Self = StObject.set(x, "notifyClose", js.undefined)
      
      @scala.inline
      def setNotifyOpen(value: () => Unit): Self = StObject.set(x, "notifyOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNotifyOpenUndefined: Self = StObject.set(x, "notifyOpen", js.undefined)
      
      @scala.inline
      def setReleaseFocus(value: () => Unit): Self = StObject.set(x, "releaseFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReleaseFocusUndefined: Self = StObject.set(x, "releaseFocus", js.undefined)
      
      @scala.inline
      def setRemoveClass(value: /* className */ String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      @scala.inline
      def setRestoreFocus(value: () => Unit): Self = StObject.set(x, "restoreFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRestoreFocusUndefined: Self = StObject.set(x, "restoreFocus", js.undefined)
      
      @scala.inline
      def setSaveFocus(value: () => Unit): Self = StObject.set(x, "saveFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSaveFocusUndefined: Self = StObject.set(x, "saveFocus", js.undefined)
      
      @scala.inline
      def setTrapFocus(value: () => Unit): Self = StObject.set(x, "trapFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTrapFocusUndefined: Self = StObject.set(x, "trapFocus", js.undefined)
    }
  }
}
