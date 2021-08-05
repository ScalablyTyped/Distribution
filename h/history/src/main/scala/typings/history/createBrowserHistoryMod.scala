package typings.history

import typings.history.mod.History
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createBrowserHistoryMod {
  
  @JSImport("history/createBrowserHistory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[S](): History[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[History[S]]
  inline def default[S](options: BrowserHistoryBuildOptions): History[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[History[S]]
  
  trait BrowserHistoryBuildOptions extends StObject {
    
    var basename: js.UndefOr[String] = js.undefined
    
    var forceRefresh: js.UndefOr[Boolean] = js.undefined
    
    var getUserConfirmation: js.UndefOr[
        js.Function2[/* message */ String, /* callback */ js.Function1[/* result */ Boolean, Unit], Unit]
      ] = js.undefined
    
    var keyLength: js.UndefOr[Double] = js.undefined
  }
  object BrowserHistoryBuildOptions {
    
    inline def apply(): BrowserHistoryBuildOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrowserHistoryBuildOptions]
    }
    
    extension [Self <: BrowserHistoryBuildOptions](x: Self) {
      
      inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      inline def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      inline def setForceRefresh(value: Boolean): Self = StObject.set(x, "forceRefresh", value.asInstanceOf[js.Any])
      
      inline def setForceRefreshUndefined: Self = StObject.set(x, "forceRefresh", js.undefined)
      
      inline def setGetUserConfirmation(value: (/* message */ String, /* callback */ js.Function1[/* result */ Boolean, Unit]) => Unit): Self = StObject.set(x, "getUserConfirmation", js.Any.fromFunction2(value))
      
      inline def setGetUserConfirmationUndefined: Self = StObject.set(x, "getUserConfirmation", js.undefined)
      
      inline def setKeyLength(value: Double): Self = StObject.set(x, "keyLength", value.asInstanceOf[js.Any])
      
      inline def setKeyLengthUndefined: Self = StObject.set(x, "keyLength", js.undefined)
    }
  }
}
