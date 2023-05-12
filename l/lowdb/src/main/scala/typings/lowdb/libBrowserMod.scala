package typings.lowdb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBrowserMod {
  
  @JSImport("lowdb/lib/browser", "LocalStorage")
  @js.native
  open class LocalStorage[T] protected ()
    extends typings.lowdb.libAdaptersBrowserLocalStorageMod.LocalStorage[T] {
    def this(key: String) = this()
  }
  
  @JSImport("lowdb/lib/browser", "SessionStorage")
  @js.native
  open class SessionStorage[T] protected ()
    extends typings.lowdb.libAdaptersBrowserSessionStorageMod.SessionStorage[T] {
    def this(key: String) = this()
  }
}
