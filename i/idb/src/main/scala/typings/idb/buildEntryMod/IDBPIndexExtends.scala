package typings.idb.buildEntryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined idb.idb/build/entry.Omit<std.IDBIndex, 'objectStore' | 'count' | 'get' | 'getAll' | 'getAllKeys' | 'getKey' | 'openCursor' | 'openKeyCursor'> */
trait IDBPIndexExtends extends StObject {
  
  var keyPath: String | js.Array[String]
  
  var multiEntry: Boolean
  
  var name: String
  
  var unique: Boolean
}
object IDBPIndexExtends {
  
  inline def apply(keyPath: String | js.Array[String], multiEntry: Boolean, name: String, unique: Boolean): IDBPIndexExtends = {
    val __obj = js.Dynamic.literal(keyPath = keyPath.asInstanceOf[js.Any], multiEntry = multiEntry.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBPIndexExtends]
  }
  
  extension [Self <: IDBPIndexExtends](x: Self) {
    
    inline def setKeyPath(value: String | js.Array[String]): Self = StObject.set(x, "keyPath", value.asInstanceOf[js.Any])
    
    inline def setKeyPathVarargs(value: String*): Self = StObject.set(x, "keyPath", js.Array(value*))
    
    inline def setMultiEntry(value: Boolean): Self = StObject.set(x, "multiEntry", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
  }
}
