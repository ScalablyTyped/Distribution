package typings.idb.buildEntryMod

import typings.std.IDBValidKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBSchemaValue extends StObject {
  
  var indexes: js.UndefOr[IndexKeys] = js.undefined
  
  var key: IDBValidKey
  
  var value: Any
}
object DBSchemaValue {
  
  inline def apply(key: IDBValidKey, value: Any): DBSchemaValue = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBSchemaValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DBSchemaValue] (val x: Self) extends AnyVal {
    
    inline def setIndexes(value: IndexKeys): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
    
    inline def setIndexesUndefined: Self = StObject.set(x, "indexes", js.undefined)
    
    inline def setKey(value: IDBValidKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyVarargs(value: Any*): Self = StObject.set(x, "key", js.Array(value*))
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
