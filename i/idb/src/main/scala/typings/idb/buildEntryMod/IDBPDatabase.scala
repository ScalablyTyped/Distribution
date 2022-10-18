package typings.idb.buildEntryMod

import typings.idb.idbStrings.versionchange
import typings.std.ArrayLike
import typings.std.IDBKeyRange
import typings.std.IDBObjectStoreParameters
import typings.std.IDBTransactionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDBPDatabase[DBTypes /* <: DBSchema | Any */]
  extends StObject
     with IDBPDatabaseExtends {
  
  /**
    * Add a value to a store.
    *
    * Rejects if an item of a given key already exists in the store.
    *
    * This is a shortcut that creates a transaction for this single action. If you need to do more
    * than one action, create a transaction instead.
    *
    * @param storeName Name of the store.
    * @param value
    * @param key
    */
  def add[Name /* <: StoreNames[DBTypes] */](storeName: Name, value: StoreValue[DBTypes, Name]): js.Promise[StoreKey[DBTypes, Name]] = js.native
  def add[Name /* <: StoreNames[DBTypes] */](storeName: Name, value: StoreValue[DBTypes, Name], key: StoreKey[DBTypes, Name]): js.Promise[StoreKey[DBTypes, Name]] = js.native
  def add[Name /* <: StoreNames[DBTypes] */](storeName: Name, value: StoreValue[DBTypes, Name], key: IDBKeyRange): js.Promise[StoreKey[DBTypes, Name]] = js.native
  
  /**
    * Deletes all records in a store.
    *
    * This is a shortcut that creates a transaction for this single action. If you need to do more
    * than one action, create a transaction instead.
    *
    * @param storeName Name of the store.
    */
  def clear(name: StoreNames[DBTypes]): js.Promise[Unit] = js.native
  
  /**
    * Retrieves the number of records matching the given query in a store.
    *
    * This is a shortcut that creates a transaction for this single action. If you need to do more
    * than one action, create a transaction instead.
    *
    * @param storeName Name of the store.
    * @param key
    */
  def count[Name /* <: StoreNames[DBTypes] */](storeName: Name): js.Promise[Double] = js.native
  def count[Name /* <: StoreNames[DBTypes] */](storeName: Name, key: StoreKey[DBTypes, Name]): js.Promise[Double] = js.native
  def count[Name /* <: StoreNames[DBTypes] */](storeName: Name, key: IDBKeyRange): js.Promise[Double] = js.native
  
  /**
    * Retrieves the number of records matching the given query in an index.
    *
    * This is a shortcut that creates a transaction for this single action. If you need to do more
    * than one action, create a transaction instead.
    *
    * @param storeName Name of the store.
    * @param indexName Name of the index within the store.
    * @param key
    */
  def countFromIndex[Name /* <: StoreNames[DBTypes] */, IndexName /* <: IndexNames[DBTypes, Name] */](storeName: Name, indexName: IndexName): js.Promise[Double] = js.native
  def countFromIndex[Name /* <: StoreNames[DBTypes] */, IndexName /* <: IndexNames[DBTypes, Name] */](storeName: Name, indexName: IndexName, key: IndexKey[DBTypes, Name, IndexName]): js.Promise[Double] = js.native
  def countFromIndex[Name /* <: StoreNames[DBTypes] */, IndexName /* <: IndexNames[DBTypes, Name] */](storeName: Name, indexName: IndexName, key: IDBKeyRange): js.Promise[Double] = js.native
  
  /**
    * Creates a new object store.
    *
    * Throws a "InvalidStateError" DOMException if not called within an upgrade transaction.
    */
  def createObjectStore[Name /* <: StoreNames[DBTypes] */](name: Name): IDBPObjectStore[DBTypes, ArrayLike[StoreNames[DBTypes]], Name, versionchange] = js.native
  def createObjectStore[Name /* <: StoreNames[DBTypes] */](name: Name, optionalParameters: IDBObjectStoreParameters): IDBPObjectStore[DBTypes, ArrayLike[StoreNames[DBTypes]], Name, versionchange] = js.native
  
  /**
    * Deletes records in a store matching the given query.
    *
    * This is a shortcut that creates a transaction for this single action. If you need to do more
    * than one action, create a transaction instead.
    *
    * @param storeName Name of the store.
    * @param key
    */
  def delete[Name /* <: StoreNames[DBTypes] */](storeName: Name, key: StoreKey[DBTypes, Name]): js.Promise[Unit] = js.native
  def delete[Name /* <: StoreNames[DBTypes] */](storeName: Name, key: IDBKeyRange): js.Promise[Unit] = js.native
  
  /**
    * Deletes the object store with the given name.
    *
    * Throws a "InvalidStateError" DOMException if not called within an upgrade transaction.
    */
  def deleteObjectStore(name: StoreNames[DBTypes]): Unit = js.native
  
  /**
    * Retrieves the value of the first record in a store matching the query.
    *
    * Resolves with undefined if no match is found.
    *
    * This is a shortcut that creates a transaction for this single action. If you need to do more
    * than one action, create a transaction instead.
    *
    * @param storeName Name of the store.
    * @param query
    */
  def get[Name /* <: StoreNames[DBTypes] */](storeName: Name, query: StoreKey[DBTypes, Name]): js.Promise[js.UndefOr[StoreValue[DBTypes, Name]]] = js.native
  def get[Name /* <: StoreNames[DBTypes] */](storeName: Name, query: IDBKeyRange): js.Promise[js.UndefOr[StoreValue[DBTypes, Name]]] = js.native
  
  /**
    * Retrieves all values in a store that match the query.
    *
    * This is a shortcut that creates a transaction for this single action. If you need to do more
    * than one action, create a transaction instead.
    *
    * @param storeName Name of the store.
    * @param query
    * @param count Maximum number of values to return.
    */
  def getAll[Name /* <: StoreNames[DBTypes] */](storeName: Name): js.Promise[js.Array[StoreValue[DBTypes, Name]]] = js.native
  def getAll[Name /* <: StoreNames[DBTypes] */](storeName: Name, query: Null, count: Double): js.Promise[js.Array[StoreValue[DBTypes, Name]]] = js.native
  def getAll[Name /* <: StoreNames[DBTypes] */](storeName: Name, query: Unit, count: Double): js.Promise[js.Array[StoreValue[DBTypes, Name]]] = js.native
  def getAll[Name /* <: StoreNames[DBTypes] */](storeName: Name, query: StoreKey[DBTypes, Name]): js.Promise[js.Array[StoreValue[DBTypes, Name]]] = js.native
  def getAll[Name /* <: StoreNames[DBTypes] */](storeName: Name, query: StoreKey[DBTypes, Name], count: Double): js.Promise[js.Array[StoreValue[DBTypes, Name]]] = js.native
  def getAll[Name /* <: StoreNames[DBTypes] */](storeName: Name, query: IDBKeyRange): js.Promise[js.Array[StoreValue[DBTypes, Name]]] = js.native
  def getAll[Name /* <: StoreNames[DBTypes] */](storeName: Name, query: IDBKeyRange, count: Double): js.Promise[js.Array[StoreValue[DBTypes, Name]]] = js.native
  
  /**
    * Retrieves all values in an index that match the query.
    *
    * This is a shortcut that creates a transaction for this single action. If you need to do more
    * than one action, create a transaction instead.
    *
    * @param storeName Name of the store.
    * @param indexName Name of the index within the store.
    * @param query
    * @param count Maximum number of values to return.
    */
  def getAllFromIndex[Name /* <: StoreNames[DBTypes] */, IndexName /* <: IndexNames[DBTypes, Name] */](storeName: Name, indexName: IndexName): js.Promise[js.Array[StoreValue[DBTypes, Name]]] = js.native
  def getAllFromIndex[Name /* <: StoreNames[DBTypes] */, IndexName /* <: IndexNames[DBTypes, Name] */](storeName: Name, indexName: IndexName, query: Null, count: Double): js.Promise[js.Array[StoreValue[DBTypes, Name]]] = js.native
  def getAllFromIndex[Name /* <: StoreNames[DBTypes] */, IndexName /* <: IndexNames[DBTypes, Name] */](storeName: Name, indexName: IndexName, query: Unit, count: Double): js.Promise[js.Array[StoreValue[DBTypes, Name]]] = js.native
  def getAllFromIndex[Name /* <: StoreNames[DBTypes] */, IndexName /* <: IndexNames[DBTypes, Name] */](storeName: Name, indexName: IndexName, query: IndexKey[DBTypes, Name, IndexName]): js.Promise[js.Array[StoreValue[DBTypes, Name]]] = js.native
  def getAllFromIndex[Name /* <: StoreNames[DBTypes] */, IndexName /* <: IndexNames[DBTypes, Name] */](storeName: Name, indexName: IndexName, query: IndexKey[DBTypes, Name, IndexName], count: Double): js.Promise[js.Array[StoreValue[DBTypes, Name]]] = js.native
  def getAllFromIndex[Name /* <: StoreNames[DBTypes] */, IndexName /* <: IndexNames[DBTypes, Name] */](storeName: Name, indexName: IndexName, query: IDBKeyRange): js.Promise[js.Array[StoreValue[DBTypes, Name]]] = js.native
  def getAllFromIndex[Name /* <: StoreNames[DBTypes] */, IndexName /* <: IndexNames[DBTypes, Name] */](storeName: Name, indexName: IndexName, query: IDBKeyRange, count: Double): js.Promise[js.Array[StoreValue[DBTypes, Name]]] = js.native
  
  /**
    * Retrieves the keys of records in a store matching the query.
    *
    * This is a shortcut that creates a transaction for this single action. If you need to do more
    * than one action, create a transaction instead.
    *
    * @param storeName Name of the store.
    * @param query
    * @param count Maximum number of keys to return.
    */
  def getAllKeys[Name /* <: StoreNames[DBTypes] */](storeName: Name): js.Promise[js.Array[StoreKey[DBTypes, Name]]] = js.native
  def getAllKeys[Name /* <: StoreNames[DBTypes] */](storeName: Name, query: Null, count: Double): js.Promise[js.Array[StoreKey[DBTypes, Name]]] = js.native
  def getAllKeys[Name /* <: StoreNames[DBTypes] */](storeName: Name, query: Unit, count: Double): js.Promise[js.Array[StoreKey[DBTypes, Name]]] = js.native
  def getAllKeys[Name /* <: StoreNames[DBTypes] */](storeName: Name, query: StoreKey[DBTypes, Name]): js.Promise[js.Array[StoreKey[DBTypes, Name]]] = js.native
  def getAllKeys[Name /* <: StoreNames[DBTypes] */](storeName: Name, query: StoreKey[DBTypes, Name], count: Double): js.Promise[js.Array[StoreKey[DBTypes, Name]]] = js.native
  def getAllKeys[Name /* <: StoreNames[DBTypes] */](storeName: Name, query: IDBKeyRange): js.Promise[js.Array[StoreKey[DBTypes, Name]]] = js.native
  def getAllKeys[Name /* <: StoreNames[DBTypes] */](storeName: Name, query: IDBKeyRange, count: Double): js.Promise[js.Array[StoreKey[DBTypes, Name]]] = js.native
  
  /**
    * Retrieves the keys of records in an index matching the query.
    *
    * This is a shortcut that creates a transaction for this single action. If you need to do more
    * than one action, create a transaction instead.
    *
    * @param storeName Name of the store.
    * @param indexName Name of the index within the store.
    * @param query
    * @param count Maximum number of keys to return.
    */
  def getAllKeysFromIndex[Name /* <: StoreNames[DBTypes] */, IndexName /* <: IndexNames[DBTypes, Name] */](storeName: Name, indexName: IndexName): js.Promise[js.Array[StoreKey[DBTypes, Name]]] = js.native
  def getAllKeysFromIndex[Name /* <: StoreNames[DBTypes] */, IndexName /* <: IndexNames[DBTypes, Name] */](storeName: Name, indexName: IndexName, query: Null, count: Double): js.Promise[js.Array[StoreKey[DBTypes, Name]]] = js.native
  def getAllKeysFromIndex[Name /* <: StoreNames[DBTypes] */, IndexName /* <: IndexNames[DBTypes, Name] */](storeName: Name, indexName: IndexName, query: Unit, count: Double): js.Promise[js.Array[StoreKey[DBTypes, Name]]] = js.native
  def getAllKeysFromIndex[Name /* <: StoreNames[DBTypes] */, IndexName /* <: IndexNames[DBTypes, Name] */](storeName: Name, indexName: IndexName, query: IndexKey[DBTypes, Name, IndexName]): js.Promise[js.Array[StoreKey[DBTypes, Name]]] = js.native
  def getAllKeysFromIndex[Name /* <: StoreNames[DBTypes] */, IndexName /* <: IndexNames[DBTypes, Name] */](storeName: Name, indexName: IndexName, query: IndexKey[DBTypes, Name, IndexName], count: Double): js.Promise[js.Array[StoreKey[DBTypes, Name]]] = js.native
  def getAllKeysFromIndex[Name /* <: StoreNames[DBTypes] */, IndexName /* <: IndexNames[DBTypes, Name] */](storeName: Name, indexName: IndexName, query: IDBKeyRange): js.Promise[js.Array[StoreKey[DBTypes, Name]]] = js.native
  def getAllKeysFromIndex[Name /* <: StoreNames[DBTypes] */, IndexName /* <: IndexNames[DBTypes, Name] */](storeName: Name, indexName: IndexName, query: IDBKeyRange, count: Double): js.Promise[js.Array[StoreKey[DBTypes, Name]]] = js.native
  
  /**
    * Retrieves the value of the first record in an index matching the query.
    *
    * Resolves with undefined if no match is found.
    *
    * This is a shortcut that creates a transaction for this single action. If you need to do more
    * than one action, create a transaction instead.
    *
    * @param storeName Name of the store.
    * @param indexName Name of the index within the store.
    * @param query
    */
  def getFromIndex[Name /* <: StoreNames[DBTypes] */, IndexName /* <: IndexNames[DBTypes, Name] */](storeName: Name, indexName: IndexName, query: IndexKey[DBTypes, Name, IndexName]): js.Promise[js.UndefOr[StoreValue[DBTypes, Name]]] = js.native
  def getFromIndex[Name /* <: StoreNames[DBTypes] */, IndexName /* <: IndexNames[DBTypes, Name] */](storeName: Name, indexName: IndexName, query: IDBKeyRange): js.Promise[js.UndefOr[StoreValue[DBTypes, Name]]] = js.native
  
  /**
    * Retrieves the key of the first record in a store that matches the query.
    *
    * Resolves with undefined if no match is found.
    *
    * This is a shortcut that creates a transaction for this single action. If you need to do more
    * than one action, create a transaction instead.
    *
    * @param storeName Name of the store.
    * @param query
    */
  def getKey[Name /* <: StoreNames[DBTypes] */](storeName: Name, query: StoreKey[DBTypes, Name]): js.Promise[js.UndefOr[StoreKey[DBTypes, Name]]] = js.native
  def getKey[Name /* <: StoreNames[DBTypes] */](storeName: Name, query: IDBKeyRange): js.Promise[js.UndefOr[StoreKey[DBTypes, Name]]] = js.native
  
  /**
    * Retrieves the key of the first record in an index that matches the query.
    *
    * Resolves with undefined if no match is found.
    *
    * This is a shortcut that creates a transaction for this single action. If you need to do more
    * than one action, create a transaction instead.
    *
    * @param storeName Name of the store.
    * @param indexName Name of the index within the store.
    * @param query
    */
  def getKeyFromIndex[Name /* <: StoreNames[DBTypes] */, IndexName /* <: IndexNames[DBTypes, Name] */](storeName: Name, indexName: IndexName, query: IndexKey[DBTypes, Name, IndexName]): js.Promise[js.UndefOr[StoreKey[DBTypes, Name]]] = js.native
  def getKeyFromIndex[Name /* <: StoreNames[DBTypes] */, IndexName /* <: IndexNames[DBTypes, Name] */](storeName: Name, indexName: IndexName, query: IDBKeyRange): js.Promise[js.UndefOr[StoreKey[DBTypes, Name]]] = js.native
  
  /**
    * The names of stores in the database.
    */
  val objectStoreNames: TypedDOMStringList[StoreNames[DBTypes]] = js.native
  
  /**
    * Put an item in the database.
    *
    * Replaces any item with the same key.
    *
    * This is a shortcut that creates a transaction for this single action. If you need to do more
    * than one action, create a transaction instead.
    *
    * @param storeName Name of the store.
    * @param value
    * @param key
    */
  def put[Name /* <: StoreNames[DBTypes] */](storeName: Name, value: StoreValue[DBTypes, Name]): js.Promise[StoreKey[DBTypes, Name]] = js.native
  def put[Name /* <: StoreNames[DBTypes] */](storeName: Name, value: StoreValue[DBTypes, Name], key: StoreKey[DBTypes, Name]): js.Promise[StoreKey[DBTypes, Name]] = js.native
  def put[Name /* <: StoreNames[DBTypes] */](storeName: Name, value: StoreValue[DBTypes, Name], key: IDBKeyRange): js.Promise[StoreKey[DBTypes, Name]] = js.native
  
  def transaction[Names /* <: ArrayLike[StoreNames[DBTypes]] */, Mode /* <: IDBTransactionMode */](storeNames: Names): IDBPTransaction[DBTypes, Names, Mode] = js.native
  def transaction[Names /* <: ArrayLike[StoreNames[DBTypes]] */, Mode /* <: IDBTransactionMode */](storeNames: Names, mode: Mode): IDBPTransaction[DBTypes, Names, Mode] = js.native
  def transaction[Names /* <: ArrayLike[StoreNames[DBTypes]] */, Mode /* <: IDBTransactionMode */](storeNames: Names, mode: Mode, options: IDBTransactionOptions): IDBPTransaction[DBTypes, Names, Mode] = js.native
  def transaction[Names /* <: ArrayLike[StoreNames[DBTypes]] */, Mode /* <: IDBTransactionMode */](storeNames: Names, mode: Unit, options: IDBTransactionOptions): IDBPTransaction[DBTypes, Names, Mode] = js.native
  /**
    * Start a new transaction.
    *
    * @param storeNames The object store(s) this transaction needs.
    * @param mode
    * @param options
    */
  @JSName("transaction")
  def transaction_NameMode[Name /* <: StoreNames[DBTypes] */, Mode /* <: IDBTransactionMode */](storeNames: Name): IDBPTransaction[DBTypes, js.Array[Name], Mode] = js.native
  @JSName("transaction")
  def transaction_NameMode[Name /* <: StoreNames[DBTypes] */, Mode /* <: IDBTransactionMode */](storeNames: Name, mode: Mode): IDBPTransaction[DBTypes, js.Array[Name], Mode] = js.native
  @JSName("transaction")
  def transaction_NameMode[Name /* <: StoreNames[DBTypes] */, Mode /* <: IDBTransactionMode */](storeNames: Name, mode: Mode, options: IDBTransactionOptions): IDBPTransaction[DBTypes, js.Array[Name], Mode] = js.native
  @JSName("transaction")
  def transaction_NameMode[Name /* <: StoreNames[DBTypes] */, Mode /* <: IDBTransactionMode */](storeNames: Name, mode: Unit, options: IDBTransactionOptions): IDBPTransaction[DBTypes, js.Array[Name], Mode] = js.native
}
