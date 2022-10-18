package typings.idb.buildEntryMod

import typings.std.ArrayLike
import typings.std.IDBTransactionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDBPCursor[DBTypes /* <: DBSchema | Any */, TxStores /* <: ArrayLike[StoreNames[DBTypes]] */, StoreName /* <: StoreNames[DBTypes] */, IndexName /* <: (IndexNames[DBTypes, StoreName]) | Any */, Mode /* <: IDBTransactionMode */]
  extends StObject
     with IDBPCursorExtends {
  
  /**
    * Advances the cursor a given number of records.
    *
    * Resolves to null if no matching records remain.
    */
  def advance[T](count: Double): js.Promise[T | Null] = js.native
  
  /**
    * Advance the cursor by one record (unless 'key' is provided).
    *
    * Resolves to null if no matching records remain.
    *
    * @param key Advance to the index or object store with a key equal to or greater than this value.
    */
  def continue[T](): js.Promise[T | Null] = js.native
  def continue[T](key: CursorKey[DBTypes, StoreName, IndexName]): js.Promise[T | Null] = js.native
  
  /**
    * Advance the cursor by given keys.
    *
    * The operation is 'and' – both keys must be satisfied.
    *
    * Resolves to null if no matching records remain.
    *
    * @param key Advance to the index or object store with a key equal to or greater than this value.
    * @param primaryKey and where the object store has a key equal to or greater than this value.
    */
  def continuePrimaryKey[T](key: CursorKey[DBTypes, StoreName, IndexName], primaryKey: StoreKey[DBTypes, StoreName]): js.Promise[T | Null] = js.native
  
  /**
    * Delete the current record.
    */
  var delete: /* import warning: importer.ImportType#apply Failed type conversion: Mode extends 'readonly' ? undefined : (): std.Promise<void> */ js.Any = js.native
  
  /**
    * The key of the current index or object store item.
    */
  val key: CursorKey[DBTypes, StoreName, IndexName] = js.native
  
  /**
    * The key of the current object store item.
    */
  val primaryKey: StoreKey[DBTypes, StoreName] = js.native
  
  /**
    * Returns the IDBObjectStore or IDBIndex the cursor was opened from.
    */
  val source: CursorSource[DBTypes, TxStores, StoreName, IndexName, Mode] = js.native
  
  /**
    * Updated the current record.
    */
  var update: /* import warning: importer.ImportType#apply Failed type conversion: Mode extends 'readonly' ? undefined : (value : idb.idb/build/entry.StoreValue<DBTypes, StoreName>): std.Promise<idb.idb/build/entry.StoreKey<DBTypes, StoreName>> */ js.Any = js.native
}
