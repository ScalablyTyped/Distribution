package typings.idb.entryMod

import typings.std.ArrayLike
import typings.std.IDBTransactionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDBPCursorWithValueIteratorValue[DBTypes /* <: DBSchema | Any */, TxStores /* <: ArrayLike[StoreNames[DBTypes]] */, StoreName /* <: StoreNames[DBTypes] */, IndexName /* <: (IndexNames[DBTypes, StoreName]) | Any */, Mode /* <: IDBTransactionMode */]
  extends StObject
     with IDBPCursorWithValueIteratorValueExtends[DBTypes, TxStores, StoreName, IndexName, Mode] {
  
  /**
    * Advances the cursor a given number of records.
    */
  def advance[T](count: Double): Unit = js.native
  
  /**
    * Advance the cursor by one record (unless 'key' is provided).
    *
    * @param key Advance to the index or object store with a key equal to or greater than this value.
    */
  def continue[T](): Unit = js.native
  def continue[T](key: CursorKey[DBTypes, StoreName, IndexName]): Unit = js.native
  
  /**
    * Advance the cursor by given keys.
    *
    * The operation is 'and' – both keys must be satisfied.
    *
    * @param key Advance to the index or object store with a key equal to or greater than this value.
    * @param primaryKey and where the object store has a key equal to or greater than this value.
    */
  def continuePrimaryKey[T](key: CursorKey[DBTypes, StoreName, IndexName], primaryKey: StoreKey[DBTypes, StoreName]): Unit = js.native
}
