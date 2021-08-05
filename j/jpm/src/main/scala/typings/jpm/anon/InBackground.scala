package typings.jpm.anon

import typings.jpm.FFAddonSDK.Tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InBackground extends StObject {
  
  var inBackground: js.UndefOr[Boolean] = js.undefined
  
  var inNewWindow: js.UndefOr[Boolean] = js.undefined
  
  var isPinned: js.UndefOr[Boolean] = js.undefined
  
  var onActivate: js.UndefOr[js.Function1[/* tab */ Tab, js.Any]] = js.undefined
  
  var onClose: js.UndefOr[js.Function1[/* tab */ Tab, js.Any]] = js.undefined
  
  var onDeactivate: js.UndefOr[js.Function1[/* tab */ Tab, js.Any]] = js.undefined
  
  var onLoad: js.UndefOr[js.Function1[/* tab */ Tab, js.Any]] = js.undefined
  
  var onOpen: js.UndefOr[js.Function1[/* tab */ Tab, js.Any]] = js.undefined
  
  var onPageShow: js.UndefOr[js.Function1[/* tab */ Tab, js.Any]] = js.undefined
  
  var onReady: js.UndefOr[js.Function1[/* tab */ Tab, js.Any]] = js.undefined
  
  var url: String
}
object InBackground {
  
  inline def apply(url: String): InBackground = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[InBackground]
  }
  
  extension [Self <: InBackground](x: Self) {
    
    inline def setInBackground(value: Boolean): Self = StObject.set(x, "inBackground", value.asInstanceOf[js.Any])
    
    inline def setInBackgroundUndefined: Self = StObject.set(x, "inBackground", js.undefined)
    
    inline def setInNewWindow(value: Boolean): Self = StObject.set(x, "inNewWindow", value.asInstanceOf[js.Any])
    
    inline def setInNewWindowUndefined: Self = StObject.set(x, "inNewWindow", js.undefined)
    
    inline def setIsPinned(value: Boolean): Self = StObject.set(x, "isPinned", value.asInstanceOf[js.Any])
    
    inline def setIsPinnedUndefined: Self = StObject.set(x, "isPinned", js.undefined)
    
    inline def setOnActivate(value: /* tab */ Tab => js.Any): Self = StObject.set(x, "onActivate", js.Any.fromFunction1(value))
    
    inline def setOnActivateUndefined: Self = StObject.set(x, "onActivate", js.undefined)
    
    inline def setOnClose(value: /* tab */ Tab => js.Any): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnDeactivate(value: /* tab */ Tab => js.Any): Self = StObject.set(x, "onDeactivate", js.Any.fromFunction1(value))
    
    inline def setOnDeactivateUndefined: Self = StObject.set(x, "onDeactivate", js.undefined)
    
    inline def setOnLoad(value: /* tab */ Tab => js.Any): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setOnOpen(value: /* tab */ Tab => js.Any): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
    
    inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
    
    inline def setOnPageShow(value: /* tab */ Tab => js.Any): Self = StObject.set(x, "onPageShow", js.Any.fromFunction1(value))
    
    inline def setOnPageShowUndefined: Self = StObject.set(x, "onPageShow", js.undefined)
    
    inline def setOnReady(value: /* tab */ Tab => js.Any): Self = StObject.set(x, "onReady", js.Any.fromFunction1(value))
    
    inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
