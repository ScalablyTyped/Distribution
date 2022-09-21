package typings.idb.entryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined idb.idb/build/entry.Omit<std.IDBObjectStore, 'transaction' | 'add' | 'clear' | 'count' | 'createIndex' | 'delete' | 'get' | 'getAll' | 'getAllKeys' | 'getKey' | 'index' | 'openCursor' | 'openKeyCursor' | 'put' | 'indexNames'> */
trait IDBPObjectStoreExtends extends StObject {
  
  var autoIncrement: Boolean
  
  def deleteIndex(name: String): Unit
  @JSName("deleteIndex")
  var deleteIndex_Original: js.Function1[/* name */ String, Unit]
  
  var keyPath: String | js.Array[String]
  
  var name: String
}
object IDBPObjectStoreExtends {
  
  inline def apply(
    autoIncrement: Boolean,
    deleteIndex: /* name */ String => Unit,
    keyPath: String | js.Array[String],
    name: String
  ): IDBPObjectStoreExtends = {
    val __obj = js.Dynamic.literal(autoIncrement = autoIncrement.asInstanceOf[js.Any], deleteIndex = js.Any.fromFunction1(deleteIndex), keyPath = keyPath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBPObjectStoreExtends]
  }
  
  extension [Self <: IDBPObjectStoreExtends](x: Self) {
    
    inline def setAutoIncrement(value: Boolean): Self = StObject.set(x, "autoIncrement", value.asInstanceOf[js.Any])
    
    inline def setDeleteIndex(value: /* name */ String => Unit): Self = StObject.set(x, "deleteIndex", js.Any.fromFunction1(value))
    
    inline def setKeyPath(value: String | js.Array[String]): Self = StObject.set(x, "keyPath", value.asInstanceOf[js.Any])
    
    inline def setKeyPathVarargs(value: String*): Self = StObject.set(x, "keyPath", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
