package typings.keya

import typings.std.IDBObjectStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("keya/out/browser/indexeddb", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  trait IndexedDBStore[T]
    extends typings.keya.storeMod.default[T] {
    
    var index: IDBObjectStore | Null = js.native
  }
  
  @js.native
  class default[T] () extends IndexedDBStore[T]
  /* static members */
  @js.native
  object default extends js.Object {
    
    def stores(): js.Promise[js.Array[String]] = js.native
  }
}
