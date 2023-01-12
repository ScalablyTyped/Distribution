package typings.idb.buildEntryMod

import typings.std.IDBCursorDirection
import typings.std.IDBRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined idb.idb/build/entry.Omit<std.IDBCursor, 'key' | 'primaryKey' | 'source' | 'advance' | 'continue' | 'continuePrimaryKey' | 'delete' | 'update'> */
trait IDBPCursorExtends extends StObject {
  
  var direction: IDBCursorDirection
  
  var request: IDBRequest[Any]
}
object IDBPCursorExtends {
  
  inline def apply(direction: IDBCursorDirection, request: IDBRequest[Any]): IDBPCursorExtends = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBPCursorExtends]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDBPCursorExtends] (val x: Self) extends AnyVal {
    
    inline def setDirection(value: IDBCursorDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: IDBRequest[Any]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
