package typings.jpm

import typings.std.DOMException
import typings.std.IDBFactory
import typings.std.IDBKeyRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sdkIndexedDbMod {
  
  // these interfaces are already provided by TypeScript
  trait IndexedImpl extends StObject {
    
    var DOMException: typings.std.DOMException
    
    var IDBKeyRange: typings.std.IDBKeyRange
    
    var indexedDB: IDBFactory
  }
  object IndexedImpl {
    
    inline def apply(DOMException: DOMException, IDBKeyRange: IDBKeyRange, indexedDB: IDBFactory): IndexedImpl = {
      val __obj = js.Dynamic.literal(DOMException = DOMException.asInstanceOf[js.Any], IDBKeyRange = IDBKeyRange.asInstanceOf[js.Any], indexedDB = indexedDB.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndexedImpl]
    }
    
    extension [Self <: IndexedImpl](x: Self) {
      
      inline def setDOMException(value: DOMException): Self = StObject.set(x, "DOMException", value.asInstanceOf[js.Any])
      
      inline def setIDBKeyRange(value: IDBKeyRange): Self = StObject.set(x, "IDBKeyRange", value.asInstanceOf[js.Any])
      
      inline def setIndexedDB(value: IDBFactory): Self = StObject.set(x, "indexedDB", value.asInstanceOf[js.Any])
    }
  }
}
