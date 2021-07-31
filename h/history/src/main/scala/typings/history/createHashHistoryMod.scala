package typings.history

import typings.history.mod.History
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createHashHistoryMod {
  
  @JSImport("history/createHashHistory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[S](): History[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[History[S]]
  @scala.inline
  def default[S](options: HashHistoryBuildOptions): History[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[History[S]]
  
  trait HashHistoryBuildOptions extends StObject {
    
    var basename: js.UndefOr[String] = js.undefined
    
    var getUserConfirmation: js.UndefOr[
        js.Function2[/* message */ String, /* callback */ js.Function1[/* result */ Boolean, Unit], Unit]
      ] = js.undefined
    
    var hashType: js.UndefOr[HashType] = js.undefined
  }
  object HashHistoryBuildOptions {
    
    @scala.inline
    def apply(): HashHistoryBuildOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HashHistoryBuildOptions]
    }
    
    @scala.inline
    implicit class HashHistoryBuildOptionsMutableBuilder[Self <: HashHistoryBuildOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      @scala.inline
      def setGetUserConfirmation(value: (/* message */ String, /* callback */ js.Function1[/* result */ Boolean, Unit]) => Unit): Self = StObject.set(x, "getUserConfirmation", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetUserConfirmationUndefined: Self = StObject.set(x, "getUserConfirmation", js.undefined)
      
      @scala.inline
      def setHashType(value: HashType): Self = StObject.set(x, "hashType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashTypeUndefined: Self = StObject.set(x, "hashType", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.history.historyStrings.hashbang
    - typings.history.historyStrings.noslash
    - typings.history.historyStrings.slash
  */
  trait HashType extends StObject
  object HashType {
    
    @scala.inline
    def hashbang: typings.history.historyStrings.hashbang = "hashbang".asInstanceOf[typings.history.historyStrings.hashbang]
    
    @scala.inline
    def noslash: typings.history.historyStrings.noslash = "noslash".asInstanceOf[typings.history.historyStrings.noslash]
    
    @scala.inline
    def slash: typings.history.historyStrings.slash = "slash".asInstanceOf[typings.history.historyStrings.slash]
  }
}
