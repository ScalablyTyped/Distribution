package typings.jpm.anon

import typings.jpm.FFAddonSDK.BrowserWindow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsPrivate extends StObject {
  
  var isPrivate: js.UndefOr[Boolean] = js.undefined
  
  var onActivate: js.UndefOr[js.Function1[/* window */ BrowserWindow, js.Any]] = js.undefined
  
  var onClose: js.UndefOr[js.Function1[/* window */ BrowserWindow, js.Any]] = js.undefined
  
  var onDeactivate: js.UndefOr[js.Function1[/* window */ BrowserWindow, js.Any]] = js.undefined
  
  var onOpen: js.UndefOr[js.Function1[/* window */ BrowserWindow, js.Any]] = js.undefined
  
  var url: String
}
object IsPrivate {
  
  inline def apply(url: String): IsPrivate = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsPrivate]
  }
  
  extension [Self <: IsPrivate](x: Self) {
    
    inline def setIsPrivate(value: Boolean): Self = StObject.set(x, "isPrivate", value.asInstanceOf[js.Any])
    
    inline def setIsPrivateUndefined: Self = StObject.set(x, "isPrivate", js.undefined)
    
    inline def setOnActivate(value: /* window */ BrowserWindow => js.Any): Self = StObject.set(x, "onActivate", js.Any.fromFunction1(value))
    
    inline def setOnActivateUndefined: Self = StObject.set(x, "onActivate", js.undefined)
    
    inline def setOnClose(value: /* window */ BrowserWindow => js.Any): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnDeactivate(value: /* window */ BrowserWindow => js.Any): Self = StObject.set(x, "onDeactivate", js.Any.fromFunction1(value))
    
    inline def setOnDeactivateUndefined: Self = StObject.set(x, "onDeactivate", js.undefined)
    
    inline def setOnOpen(value: /* window */ BrowserWindow => js.Any): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
    
    inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
