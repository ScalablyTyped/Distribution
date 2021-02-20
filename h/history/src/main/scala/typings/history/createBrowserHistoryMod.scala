package typings.history

import typings.history.mod.History
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createBrowserHistoryMod {
  
  @JSImport("history/createBrowserHistory", JSImport.Default)
  @js.native
  def default[S](): History[S] = js.native
  @JSImport("history/createBrowserHistory", JSImport.Default)
  @js.native
  def default[S](options: BrowserHistoryBuildOptions): History[S] = js.native
  
  @js.native
  trait BrowserHistoryBuildOptions extends StObject {
    
    var basename: js.UndefOr[String] = js.native
    
    var forceRefresh: js.UndefOr[Boolean] = js.native
    
    var getUserConfirmation: js.UndefOr[
        js.Function2[/* message */ String, /* callback */ js.Function1[/* result */ Boolean, Unit], Unit]
      ] = js.native
    
    var keyLength: js.UndefOr[Double] = js.native
  }
  object BrowserHistoryBuildOptions {
    
    @scala.inline
    def apply(): BrowserHistoryBuildOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrowserHistoryBuildOptions]
    }
    
    @scala.inline
    implicit class BrowserHistoryBuildOptionsMutableBuilder[Self <: BrowserHistoryBuildOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      @scala.inline
      def setForceRefresh(value: Boolean): Self = StObject.set(x, "forceRefresh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceRefreshUndefined: Self = StObject.set(x, "forceRefresh", js.undefined)
      
      @scala.inline
      def setGetUserConfirmation(value: (/* message */ String, /* callback */ js.Function1[/* result */ Boolean, Unit]) => Unit): Self = StObject.set(x, "getUserConfirmation", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetUserConfirmationUndefined: Self = StObject.set(x, "getUserConfirmation", js.undefined)
      
      @scala.inline
      def setKeyLength(value: Double): Self = StObject.set(x, "keyLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyLengthUndefined: Self = StObject.set(x, "keyLength", js.undefined)
    }
  }
}
