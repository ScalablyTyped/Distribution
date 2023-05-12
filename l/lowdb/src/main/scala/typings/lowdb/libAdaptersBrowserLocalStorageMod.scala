package typings.lowdb

import typings.lowdb.libAdaptersBrowserWebStorageMod.WebStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAdaptersBrowserLocalStorageMod {
  
  @JSImport("lowdb/lib/adapters/browser/LocalStorage", "LocalStorage")
  @js.native
  open class LocalStorage[T] protected () extends WebStorage[T] {
    def this(key: String) = this()
  }
}
