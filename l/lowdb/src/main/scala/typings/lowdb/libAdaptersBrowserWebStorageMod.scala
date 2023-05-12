package typings.lowdb

import typings.lowdb.libCoreLowMod.SyncAdapter
import typings.std.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAdaptersBrowserWebStorageMod {
  
  @JSImport("lowdb/lib/adapters/browser/WebStorage", "WebStorage")
  @js.native
  open class WebStorage[T] protected ()
    extends StObject
       with SyncAdapter[T] {
    def this(key: String, storage: Storage) = this()
    
    /* private */ var `private`: Any = js.native
    
    /* CompleteClass */
    override def read(): T | Null = js.native
    
    /* CompleteClass */
    override def write(data: T): Unit = js.native
  }
}
