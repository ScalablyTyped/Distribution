package typings.keya

import typings.std.IDBObjectStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("keya/out/browser/indexeddb", JSImport.Default)
  @js.native
  class default[T] () extends IndexedDBStore[T]
  /* static members */
  object default {
    
    @JSImport("keya/out/browser/indexeddb", "default.stores")
    @js.native
    def stores(): js.Promise[js.Array[String]] = js.native
  }
  
  @js.native
  trait IndexedDBStore[T]
    extends typings.keya.storeMod.default[T] {
    
    var index: IDBObjectStore | Null = js.native
  }
}
