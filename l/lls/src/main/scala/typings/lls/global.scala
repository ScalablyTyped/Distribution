package typings.lls

import org.scalablytyped.runtime.Shortcut
import typings.lls.mod.LargeLocalStorageInterfaces.LargeLocalStorageService
import typings.lls.mod.LargeLocalStorageInterfaces.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object LargeLocalStorage extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("LargeLocalStorage")
    @js.native
    open class ^ protected ()
      extends StObject
         with LargeLocalStorageService {
      def this(options: Options) = this()
    }
    
    @JSGlobal("LargeLocalStorage")
    @js.native
    val ^ : LargeLocalStorageService = js.native
    
    type _To = LargeLocalStorageService
    
    /* This means you don't have to write `^`, but can instead just say `LargeLocalStorage.foo` */
    override def _to: LargeLocalStorageService = ^
  }
}
