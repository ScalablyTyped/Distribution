package typings.materialDrawer

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ANIMATE extends StObject {
    
    var ANIMATE: String
    
    var CLOSING: String
    
    var DISMISSIBLE: String
    
    var MODAL: String
    
    var OPEN: String
    
    var OPENING: String
    
    var ROOT: String
  }
  object ANIMATE {
    
    inline def apply(
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
    
    extension [Self <: ANIMATE](x: Self) {
      
      inline def setANIMATE(value: String): Self = StObject.set(x, "ANIMATE", value.asInstanceOf[js.Any])
      
      inline def setCLOSING(value: String): Self = StObject.set(x, "CLOSING", value.asInstanceOf[js.Any])
      
      inline def setDISMISSIBLE(value: String): Self = StObject.set(x, "DISMISSIBLE", value.asInstanceOf[js.Any])
      
      inline def setMODAL(value: String): Self = StObject.set(x, "MODAL", value.asInstanceOf[js.Any])
      
      inline def setOPEN(value: String): Self = StObject.set(x, "OPEN", value.asInstanceOf[js.Any])
      
      inline def setOPENING(value: String): Self = StObject.set(x, "OPENING", value.asInstanceOf[js.Any])
      
      inline def setROOT(value: String): Self = StObject.set(x, "ROOT", value.asInstanceOf[js.Any])
    }
  }
  
  trait APPCONTENTSELECTOR extends StObject {
    
    var APP_CONTENT_SELECTOR: String
    
    var CLOSE_EVENT: String
    
    var LIST_ITEM_ACTIVATED_SELECTOR: String
    
    var LIST_SELECTOR: String
    
    var OPEN_EVENT: String
    
    var SCRIM_SELECTOR: String
  }
  object APPCONTENTSELECTOR {
    
    inline def apply(
      APP_CONTENT_SELECTOR: String,
      CLOSE_EVENT: String,
      LIST_ITEM_ACTIVATED_SELECTOR: String,
      LIST_SELECTOR: String,
      OPEN_EVENT: String,
      SCRIM_SELECTOR: String
    ): APPCONTENTSELECTOR = {
      val __obj = js.Dynamic.literal(APP_CONTENT_SELECTOR = APP_CONTENT_SELECTOR.asInstanceOf[js.Any], CLOSE_EVENT = CLOSE_EVENT.asInstanceOf[js.Any], LIST_ITEM_ACTIVATED_SELECTOR = LIST_ITEM_ACTIVATED_SELECTOR.asInstanceOf[js.Any], LIST_SELECTOR = LIST_SELECTOR.asInstanceOf[js.Any], OPEN_EVENT = OPEN_EVENT.asInstanceOf[js.Any], SCRIM_SELECTOR = SCRIM_SELECTOR.asInstanceOf[js.Any])
      __obj.asInstanceOf[APPCONTENTSELECTOR]
    }
    
    extension [Self <: APPCONTENTSELECTOR](x: Self) {
      
      inline def setAPP_CONTENT_SELECTOR(value: String): Self = StObject.set(x, "APP_CONTENT_SELECTOR", value.asInstanceOf[js.Any])
      
      inline def setCLOSE_EVENT(value: String): Self = StObject.set(x, "CLOSE_EVENT", value.asInstanceOf[js.Any])
      
      inline def setLIST_ITEM_ACTIVATED_SELECTOR(value: String): Self = StObject.set(x, "LIST_ITEM_ACTIVATED_SELECTOR", value.asInstanceOf[js.Any])
      
      inline def setLIST_SELECTOR(value: String): Self = StObject.set(x, "LIST_SELECTOR", value.asInstanceOf[js.Any])
      
      inline def setOPEN_EVENT(value: String): Self = StObject.set(x, "OPEN_EVENT", value.asInstanceOf[js.Any])
      
      inline def setSCRIM_SELECTOR(value: String): Self = StObject.set(x, "SCRIM_SELECTOR", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/drawer.@material/drawer/adapter.MDCDrawerAdapter> */
  trait PartialMDCDrawerAdapter extends StObject {
    
    var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var elementHasClass: js.UndefOr[js.Function2[/* element */ Element, /* className */ String, Boolean]] = js.undefined
    
    var focusActiveNavigationItem: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.undefined
    
    var notifyClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var notifyOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var releaseFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var restoreFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var saveFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var trapFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object PartialMDCDrawerAdapter {
    
    inline def apply(): PartialMDCDrawerAdapter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCDrawerAdapter]
    }
    
    extension [Self <: PartialMDCDrawerAdapter](x: Self) {
      
      inline def setAddClass(value: /* className */ String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      inline def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      inline def setElementHasClass(value: (/* element */ Element, /* className */ String) => Boolean): Self = StObject.set(x, "elementHasClass", js.Any.fromFunction2(value))
      
      inline def setElementHasClassUndefined: Self = StObject.set(x, "elementHasClass", js.undefined)
      
      inline def setFocusActiveNavigationItem(value: () => Unit): Self = StObject.set(x, "focusActiveNavigationItem", js.Any.fromFunction0(value))
      
      inline def setFocusActiveNavigationItemUndefined: Self = StObject.set(x, "focusActiveNavigationItem", js.undefined)
      
      inline def setHasClass(value: /* className */ String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setHasClassUndefined: Self = StObject.set(x, "hasClass", js.undefined)
      
      inline def setNotifyClose(value: () => Unit): Self = StObject.set(x, "notifyClose", js.Any.fromFunction0(value))
      
      inline def setNotifyCloseUndefined: Self = StObject.set(x, "notifyClose", js.undefined)
      
      inline def setNotifyOpen(value: () => Unit): Self = StObject.set(x, "notifyOpen", js.Any.fromFunction0(value))
      
      inline def setNotifyOpenUndefined: Self = StObject.set(x, "notifyOpen", js.undefined)
      
      inline def setReleaseFocus(value: () => Unit): Self = StObject.set(x, "releaseFocus", js.Any.fromFunction0(value))
      
      inline def setReleaseFocusUndefined: Self = StObject.set(x, "releaseFocus", js.undefined)
      
      inline def setRemoveClass(value: /* className */ String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      inline def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      inline def setRestoreFocus(value: () => Unit): Self = StObject.set(x, "restoreFocus", js.Any.fromFunction0(value))
      
      inline def setRestoreFocusUndefined: Self = StObject.set(x, "restoreFocus", js.undefined)
      
      inline def setSaveFocus(value: () => Unit): Self = StObject.set(x, "saveFocus", js.Any.fromFunction0(value))
      
      inline def setSaveFocusUndefined: Self = StObject.set(x, "saveFocus", js.undefined)
      
      inline def setTrapFocus(value: () => Unit): Self = StObject.set(x, "trapFocus", js.Any.fromFunction0(value))
      
      inline def setTrapFocusUndefined: Self = StObject.set(x, "trapFocus", js.undefined)
    }
  }
}
