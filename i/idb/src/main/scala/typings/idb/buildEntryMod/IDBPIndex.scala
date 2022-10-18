package typings.idb.buildEntryMod

import typings.std.ArrayLike
import typings.std.AsyncIterableIterator
import typings.std.IDBCursorDirection
import typings.std.IDBKeyRange
import typings.std.IDBTransactionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDBPIndex[DBTypes /* <: DBSchema | Any */, TxStores /* <: ArrayLike[StoreNames[DBTypes]] */, StoreName /* <: StoreNames[DBTypes] */, IndexName /* <: IndexNames[DBTypes, StoreName] */, Mode /* <: IDBTransactionMode */]
  extends StObject
     with IDBPIndexExtends {
  
  /**
    * Retrieves the number of records matching the given query.
    */
  def count(): js.Promise[Double] = js.native
  def count(key: IndexKey[DBTypes, StoreName, IndexName]): js.Promise[Double] = js.native
  def count(key: IDBKeyRange): js.Promise[Double] = js.native
  
  /**
    * Retrieves the value of the first record matching the query.
    *
    * Resolves with undefined if no match is found.
    */
  def get(query: IndexKey[DBTypes, StoreName, IndexName]): js.Promise[js.UndefOr[StoreValue[DBTypes, StoreName]]] = js.native
  def get(query: IDBKeyRange): js.Promise[js.UndefOr[StoreValue[DBTypes, StoreName]]] = js.native
  
  /**
    * Retrieves all values that match the query.
    *
    * @param query
    * @param count Maximum number of values to return.
    */
  def getAll(): js.Promise[js.Array[StoreValue[DBTypes, StoreName]]] = js.native
  def getAll(query: Null, count: Double): js.Promise[js.Array[StoreValue[DBTypes, StoreName]]] = js.native
  def getAll(query: Unit, count: Double): js.Promise[js.Array[StoreValue[DBTypes, StoreName]]] = js.native
  def getAll(query: IndexKey[DBTypes, StoreName, IndexName]): js.Promise[js.Array[StoreValue[DBTypes, StoreName]]] = js.native
  def getAll(query: IndexKey[DBTypes, StoreName, IndexName], count: Double): js.Promise[js.Array[StoreValue[DBTypes, StoreName]]] = js.native
  def getAll(query: IDBKeyRange): js.Promise[js.Array[StoreValue[DBTypes, StoreName]]] = js.native
  def getAll(query: IDBKeyRange, count: Double): js.Promise[js.Array[StoreValue[DBTypes, StoreName]]] = js.native
  
  /**
    * Retrieves the keys of records matching the query.
    *
    * @param query
    * @param count Maximum number of keys to return.
    */
  def getAllKeys(): js.Promise[js.Array[StoreKey[DBTypes, StoreName]]] = js.native
  def getAllKeys(query: Null, count: Double): js.Promise[js.Array[StoreKey[DBTypes, StoreName]]] = js.native
  def getAllKeys(query: Unit, count: Double): js.Promise[js.Array[StoreKey[DBTypes, StoreName]]] = js.native
  def getAllKeys(query: IndexKey[DBTypes, StoreName, IndexName]): js.Promise[js.Array[StoreKey[DBTypes, StoreName]]] = js.native
  def getAllKeys(query: IndexKey[DBTypes, StoreName, IndexName], count: Double): js.Promise[js.Array[StoreKey[DBTypes, StoreName]]] = js.native
  def getAllKeys(query: IDBKeyRange): js.Promise[js.Array[StoreKey[DBTypes, StoreName]]] = js.native
  def getAllKeys(query: IDBKeyRange, count: Double): js.Promise[js.Array[StoreKey[DBTypes, StoreName]]] = js.native
  
  /**
    * Retrieves the key of the first record that matches the query.
    *
    * Resolves with undefined if no match is found.
    */
  def getKey(query: IndexKey[DBTypes, StoreName, IndexName]): js.Promise[js.UndefOr[StoreKey[DBTypes, StoreName]]] = js.native
  def getKey(query: IDBKeyRange): js.Promise[js.UndefOr[StoreKey[DBTypes, StoreName]]] = js.native
  
  /**
    * Iterate over the records matching the query.
    *
    * Resolves with null if no matches are found.
    *
    * @param query If null, all records match.
    * @param direction
    */
  def iterate(): AsyncIterableIterator[IDBPCursorWithValueIteratorValue[DBTypes, TxStores, StoreName, IndexName, Mode]] = js.native
  def iterate(query: Null, direction: IDBCursorDirection): AsyncIterableIterator[IDBPCursorWithValueIteratorValue[DBTypes, TxStores, StoreName, IndexName, Mode]] = js.native
  def iterate(query: Unit, direction: IDBCursorDirection): AsyncIterableIterator[IDBPCursorWithValueIteratorValue[DBTypes, TxStores, StoreName, IndexName, Mode]] = js.native
  def iterate(query: IndexKey[DBTypes, StoreName, IndexName]): AsyncIterableIterator[IDBPCursorWithValueIteratorValue[DBTypes, TxStores, StoreName, IndexName, Mode]] = js.native
  def iterate(query: IndexKey[DBTypes, StoreName, IndexName], direction: IDBCursorDirection): AsyncIterableIterator[IDBPCursorWithValueIteratorValue[DBTypes, TxStores, StoreName, IndexName, Mode]] = js.native
  def iterate(query: IDBKeyRange): AsyncIterableIterator[IDBPCursorWithValueIteratorValue[DBTypes, TxStores, StoreName, IndexName, Mode]] = js.native
  def iterate(query: IDBKeyRange, direction: IDBCursorDirection): AsyncIterableIterator[IDBPCursorWithValueIteratorValue[DBTypes, TxStores, StoreName, IndexName, Mode]] = js.native
  
  /**
    * The IDBObjectStore the index belongs to.
    */
  val objectStore: IDBPObjectStore[DBTypes, TxStores, StoreName, Mode] = js.native
  
  /**
    * Opens a cursor over the records matching the query.
    *
    * Resolves with null if no matches are found.
    *
    * @param query If null, all records match.
    * @param direction
    */
  def openCursor(): js.Promise[(IDBPCursorWithValue[DBTypes, TxStores, StoreName, IndexName, Mode]) | Null] = js.native
  def openCursor(query: Null, direction: IDBCursorDirection): js.Promise[(IDBPCursorWithValue[DBTypes, TxStores, StoreName, IndexName, Mode]) | Null] = js.native
  def openCursor(query: Unit, direction: IDBCursorDirection): js.Promise[(IDBPCursorWithValue[DBTypes, TxStores, StoreName, IndexName, Mode]) | Null] = js.native
  def openCursor(query: IndexKey[DBTypes, StoreName, IndexName]): js.Promise[(IDBPCursorWithValue[DBTypes, TxStores, StoreName, IndexName, Mode]) | Null] = js.native
  def openCursor(query: IndexKey[DBTypes, StoreName, IndexName], direction: IDBCursorDirection): js.Promise[(IDBPCursorWithValue[DBTypes, TxStores, StoreName, IndexName, Mode]) | Null] = js.native
  def openCursor(query: IDBKeyRange): js.Promise[(IDBPCursorWithValue[DBTypes, TxStores, StoreName, IndexName, Mode]) | Null] = js.native
  def openCursor(query: IDBKeyRange, direction: IDBCursorDirection): js.Promise[(IDBPCursorWithValue[DBTypes, TxStores, StoreName, IndexName, Mode]) | Null] = js.native
  
  /**
    * Opens a cursor over the keys matching the query.
    *
    * Resolves with null if no matches are found.
    *
    * @param query If null, all records match.
    * @param direction
    */
  def openKeyCursor(): js.Promise[(IDBPCursor[DBTypes, TxStores, StoreName, IndexName, Mode]) | Null] = js.native
  def openKeyCursor(query: Null, direction: IDBCursorDirection): js.Promise[(IDBPCursor[DBTypes, TxStores, StoreName, IndexName, Mode]) | Null] = js.native
  def openKeyCursor(query: Unit, direction: IDBCursorDirection): js.Promise[(IDBPCursor[DBTypes, TxStores, StoreName, IndexName, Mode]) | Null] = js.native
  def openKeyCursor(query: IndexKey[DBTypes, StoreName, IndexName]): js.Promise[(IDBPCursor[DBTypes, TxStores, StoreName, IndexName, Mode]) | Null] = js.native
  def openKeyCursor(query: IndexKey[DBTypes, StoreName, IndexName], direction: IDBCursorDirection): js.Promise[(IDBPCursor[DBTypes, TxStores, StoreName, IndexName, Mode]) | Null] = js.native
  def openKeyCursor(query: IDBKeyRange): js.Promise[(IDBPCursor[DBTypes, TxStores, StoreName, IndexName, Mode]) | Null] = js.native
  def openKeyCursor(query: IDBKeyRange, direction: IDBCursorDirection): js.Promise[(IDBPCursor[DBTypes, TxStores, StoreName, IndexName, Mode]) | Null] = js.native
}
