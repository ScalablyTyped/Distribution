package typings.materialBanner

import typings.materialBanner.constantsMod.Action
import typings.materialBanner.constantsMod.CloseReason
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@material/banner.@material/banner/adapter.MDCBannerAdapter> */
  trait PartialMDCBannerAdapter extends StObject {
    
    var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var getContentHeight: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var notifyActionClicked: js.UndefOr[js.Function1[/* action */ Action, Unit]] = js.undefined
    
    var notifyClosed: js.UndefOr[js.Function1[/* reason */ CloseReason, Unit]] = js.undefined
    
    var notifyClosing: js.UndefOr[js.Function1[/* reason */ CloseReason, Unit]] = js.undefined
    
    var notifyOpened: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var notifyOpening: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var releaseFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var setStyleProperty: js.UndefOr[js.Function2[/* propertyName */ String, /* value */ String, Unit]] = js.undefined
    
    var trapFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object PartialMDCBannerAdapter {
    
    inline def apply(): PartialMDCBannerAdapter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCBannerAdapter]
    }
    
    extension [Self <: PartialMDCBannerAdapter](x: Self) {
      
      inline def setAddClass(value: /* className */ String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      inline def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      inline def setGetContentHeight(value: () => Double): Self = StObject.set(x, "getContentHeight", js.Any.fromFunction0(value))
      
      inline def setGetContentHeightUndefined: Self = StObject.set(x, "getContentHeight", js.undefined)
      
      inline def setNotifyActionClicked(value: /* action */ Action => Unit): Self = StObject.set(x, "notifyActionClicked", js.Any.fromFunction1(value))
      
      inline def setNotifyActionClickedUndefined: Self = StObject.set(x, "notifyActionClicked", js.undefined)
      
      inline def setNotifyClosed(value: /* reason */ CloseReason => Unit): Self = StObject.set(x, "notifyClosed", js.Any.fromFunction1(value))
      
      inline def setNotifyClosedUndefined: Self = StObject.set(x, "notifyClosed", js.undefined)
      
      inline def setNotifyClosing(value: /* reason */ CloseReason => Unit): Self = StObject.set(x, "notifyClosing", js.Any.fromFunction1(value))
      
      inline def setNotifyClosingUndefined: Self = StObject.set(x, "notifyClosing", js.undefined)
      
      inline def setNotifyOpened(value: () => Unit): Self = StObject.set(x, "notifyOpened", js.Any.fromFunction0(value))
      
      inline def setNotifyOpenedUndefined: Self = StObject.set(x, "notifyOpened", js.undefined)
      
      inline def setNotifyOpening(value: () => Unit): Self = StObject.set(x, "notifyOpening", js.Any.fromFunction0(value))
      
      inline def setNotifyOpeningUndefined: Self = StObject.set(x, "notifyOpening", js.undefined)
      
      inline def setReleaseFocus(value: () => Unit): Self = StObject.set(x, "releaseFocus", js.Any.fromFunction0(value))
      
      inline def setReleaseFocusUndefined: Self = StObject.set(x, "releaseFocus", js.undefined)
      
      inline def setRemoveClass(value: /* className */ String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      inline def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      inline def setSetStyleProperty(value: (/* propertyName */ String, /* value */ String) => Unit): Self = StObject.set(x, "setStyleProperty", js.Any.fromFunction2(value))
      
      inline def setSetStylePropertyUndefined: Self = StObject.set(x, "setStyleProperty", js.undefined)
      
      inline def setTrapFocus(value: () => Unit): Self = StObject.set(x, "trapFocus", js.Any.fromFunction0(value))
      
      inline def setTrapFocusUndefined: Self = StObject.set(x, "trapFocus", js.undefined)
    }
  }
}
