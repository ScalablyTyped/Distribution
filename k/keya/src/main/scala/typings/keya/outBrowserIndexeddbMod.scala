package typings.keya

import typings.std.IDBObjectStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outBrowserIndexeddbMod {
  
  @JSImport("keya/out/browser/indexeddb", JSImport.Default)
  @js.native
  open class default[T] () extends IndexedDBStore[T]
  /* static members */
  object default {
    
    @JSImport("keya/out/browser/indexeddb", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def stores(): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("stores")().asInstanceOf[js.Promise[js.Array[String]]]
  }
  
  @js.native
  trait IndexedDBStore[T]
    extends typings.keya.outCoreStoreMod.default[T] {
    
    var index: IDBObjectStore | Null = js.native
  }
}
