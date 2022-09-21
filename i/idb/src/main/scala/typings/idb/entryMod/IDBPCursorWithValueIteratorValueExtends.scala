package typings.idb.entryMod

import typings.std.ArrayLike
import typings.std.IDBCursorDirection
import typings.std.IDBRequest
import typings.std.IDBTransactionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined idb.idb/build/entry.Omit<idb.idb/build/entry.IDBPCursorWithValue<DBTypes, TxStores, StoreName, IndexName, Mode>, 'advance' | 'continue' | 'continuePrimaryKey'> */
trait IDBPCursorWithValueIteratorValueExtends[DBTypes /* <: DBSchema | Any */, TxStores /* <: ArrayLike[StoreNames[DBTypes]] */, StoreName /* <: StoreNames[DBTypes] */, IndexName /* <: (IndexNames[DBTypes, StoreName]) | Any */, Mode /* <: IDBTransactionMode */] extends StObject {
  
  var delete: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
  
  var direction: IDBCursorDirection
  
  var key: CursorKey[DBTypes, StoreName, IndexName]
  
  var primaryKey: StoreKey[DBTypes, StoreName]
  
  var request: IDBRequest[Any]
  
  var source: CursorSource[DBTypes, TxStores, StoreName, IndexName, Mode]
  
  var update: js.UndefOr[
    js.Function1[
      /* value */ StoreValue[DBTypes, StoreName], 
      js.Promise[StoreKey[DBTypes, StoreName]]
    ]
  ] = js.undefined
  
  var value: StoreValue[DBTypes, StoreName]
}
object IDBPCursorWithValueIteratorValueExtends {
  
  inline def apply[DBTypes /* <: DBSchema | Any */, TxStores /* <: ArrayLike[StoreNames[DBTypes]] */, StoreName /* <: StoreNames[DBTypes] */, IndexName /* <: (IndexNames[DBTypes, StoreName]) | Any */, Mode /* <: IDBTransactionMode */](
    direction: IDBCursorDirection,
    key: CursorKey[DBTypes, StoreName, IndexName],
    primaryKey: StoreKey[DBTypes, StoreName],
    request: IDBRequest[Any],
    source: CursorSource[DBTypes, TxStores, StoreName, IndexName, Mode],
    value: StoreValue[DBTypes, StoreName]
  ): IDBPCursorWithValueIteratorValueExtends[DBTypes, TxStores, StoreName, IndexName, Mode] = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], primaryKey = primaryKey.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBPCursorWithValueIteratorValueExtends[DBTypes, TxStores, StoreName, IndexName, Mode]]
  }
  
  extension [Self <: IDBPCursorWithValueIteratorValueExtends[?, ?, ?, ?, ?], DBTypes /* <: DBSchema | Any */, TxStores /* <: ArrayLike[StoreNames[DBTypes]] */, StoreName /* <: StoreNames[DBTypes] */, IndexName /* <: (IndexNames[DBTypes, StoreName]) | Any */, Mode /* <: IDBTransactionMode */](x: Self & (IDBPCursorWithValueIteratorValueExtends[DBTypes, TxStores, StoreName, IndexName, Mode])) {
    
    inline def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
    
    inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    inline def setDirection(value: IDBCursorDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setKey(value: CursorKey[DBTypes, StoreName, IndexName]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyVarargs(value: Any*): Self = StObject.set(x, "key", js.Array(value*))
    
    inline def setPrimaryKey(value: StoreKey[DBTypes, StoreName]): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKeyVarargs(value: Any*): Self = StObject.set(x, "primaryKey", js.Array(value*))
    
    inline def setRequest(value: IDBRequest[Any]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setSource(value: CursorSource[DBTypes, TxStores, StoreName, IndexName, Mode]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: /* value */ StoreValue[DBTypes, StoreName] => js.Promise[StoreKey[DBTypes, StoreName]]): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    inline def setValue(value: StoreValue[DBTypes, StoreName]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
