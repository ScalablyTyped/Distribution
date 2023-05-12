package typings.lowdb

import typings.lowdb.libAdaptersBrowserWebStorageMod.WebStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAdaptersBrowserSessionStorageMod {
  
  @JSImport("lowdb/lib/adapters/browser/SessionStorage", "SessionStorage")
  @js.native
  open class SessionStorage[T] protected () extends WebStorage[T] {
    def this(key: String) = this()
  }
}
