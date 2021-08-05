package typings.idb

import typings.idb.idbStrings.next
import typings.idb.idbStrings.nextunique
import typings.idb.idbStrings.prev
import typings.idb.idbStrings.prevunique
import typings.idb.idbStrings.readonly
import typings.idb.idbStrings.readwrite
import typings.idb.idbStrings.versionchange
import typings.std.DOMStringList
import typings.std.IDBIndexParameters
import typings.std.IDBKeyRange
import typings.std.IDBObjectStoreParameters
import typings.std.IDBValidKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("idb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deleteDb(name: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteDb")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def openDb(name: String): js.Promise[DB] = ^.asInstanceOf[js.Dynamic].applyDynamic("openDb")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DB]]
  inline def openDb(name: String, version: Double): js.Promise[DB] = (^.asInstanceOf[js.Dynamic].applyDynamic("openDb")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DB]]
  inline def openDb(name: String, version: Double, upgradeCallback: js.Function1[/* db */ UpgradeDB, Unit]): js.Promise[DB] = (^.asInstanceOf[js.Dynamic].applyDynamic("openDb")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], upgradeCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DB]]
  inline def openDb(name: String, version: Unit, upgradeCallback: js.Function1[/* db */ UpgradeDB, Unit]): js.Promise[DB] = (^.asInstanceOf[js.Dynamic].applyDynamic("openDb")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], upgradeCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DB]]
  
  @js.native
  trait Cursor[TValue, TKey] extends StObject {
    
    /** Sets the number times a cursor should move its position forward.
      * @param count The number of times to move the cursor forward.
      * @returns The cursor after having been moved forward the specified number of times. */
    def advance(count: Double): js.Promise[Cursor[TValue, TKey]] = js.native
    
    /** Advances the cursor to the next position along its direction, to the item whose key matches the optional key parameter.
      * @param key Optional. The key to position the cursor at. If no key is specified, the cursor advances to the immediate next position, based on the its direction.
      * @returns The cursor after having been continued to the next or specified record. */
    def continue(): js.Promise[Cursor[TValue, TKey]] = js.native
    def continue(key: IDBKeyRange): js.Promise[Cursor[TValue, TKey]] = js.native
    def continue(key: IDBValidKey): js.Promise[Cursor[TValue, TKey]] = js.native
    
    /** Sets the cursor to the given index key and primary key given as arguments.
      * @param key The key to position the cursor at.
      * @param primaryKey The primary key to position the cursor at.
      * @returns The cursor after having been continued to the next or specified record. */
    def continuePrimaryKey(): js.Promise[Cursor[TValue, TKey]] = js.native
    def continuePrimaryKey(key: Unit, primaryKey: TKey): js.Promise[Cursor[TValue, TKey]] = js.native
    def continuePrimaryKey(key: IDBKeyRange): js.Promise[Cursor[TValue, TKey]] = js.native
    def continuePrimaryKey(key: IDBKeyRange, primaryKey: TKey): js.Promise[Cursor[TValue, TKey]] = js.native
    def continuePrimaryKey(key: IDBValidKey): js.Promise[Cursor[TValue, TKey]] = js.native
    def continuePrimaryKey(key: IDBValidKey, primaryKey: TKey): js.Promise[Cursor[TValue, TKey]] = js.native
    
    /** Returns a Promise of an IDBRequest object that (in a separate thread) deletes the record at the cursor's position, without changing the cursor's position.
      * This can be used to delete specific records.
      * @returns A promise that resolves when the underlying delete IDBRequest is successful. */
    def delete(): js.Promise[Unit] = js.native
    
    /** The direction of traversal of the cursor. */
    val direction: next | nextunique | prev | prevunique = js.native
    
    /** The key for the record at the cursor's position. If the cursor is outside its range, this is set to undefined. The cursor's key can be any data type. */
    val key: IDBKeyRange | IDBValidKey = js.native
    
    /** The cursor's current effective primary key. If the cursor is currently being iterated or has iterated outside its range, this is set to undefined. The cursor's primary key can be any data type. */
    val primaryKey: js.UndefOr[TKey] = js.native
    
    /** Returns a Promise of an IDBRequest object that (in a separate thread) updates the value at the current position of the cursor in the object store.
      * This can be used to update specific records.
      * @param value The value to write over the current cursor location.
      * @returns A promise that resolves when the underlying update IDBRequest is successful. */
    def update(value: TValue): js.Promise[Unit] = js.native
    
    /** The current value under the cursor. */
    val value: TValue = js.native
  }
  
  @js.native
  trait DB extends StObject {
    
    /** Returns immediately and closes the connection to a database in a separate thread. */
    def close(): Unit = js.native
    
    /** A DOMString that contains the name of the connected database. */
    val name: String = js.native
    
    /** A DOMStringList that contains a list of the names of the object stores currently in the connected database. */
    val objectStoreNames: DOMStringList = js.native
    
    /** Immediately returns a transaction object (Transaction) containing the IDBTransaction.objectStore method, which you can use to access your object store. Runs in a separate thread.
      * @param storeNames The names of object stores and indexes that are in the scope of the new transaction, declared as an array of strings. Specify only the object stores that you need to access.
      * If you need to access only one object store, you can specify its name as a string.
      * @param mode Optional. The types of access that can be performed in the transaction. Transactions are opened in one of three modes: 'readonly' or 'readwrite'. 'versionchange' mode can't be specified here. If you don't provide the parameter, the default access mode is readonly. To avoid slowing things down, don't open a readwrite transaction unless you actually need to write into the database.
      * @returns The transaction object. */
    def transaction(storeNames: String): Transaction = js.native
    def transaction(storeNames: js.Array[String]): Transaction = js.native
    @JSName("transaction")
    def transaction_readonly(storeNames: String, mode: readonly): Transaction = js.native
    @JSName("transaction")
    def transaction_readonly(storeNames: js.Array[String], mode: readonly): Transaction = js.native
    @JSName("transaction")
    def transaction_readwrite(storeNames: String, mode: readwrite): Transaction = js.native
    @JSName("transaction")
    def transaction_readwrite(storeNames: js.Array[String], mode: readwrite): Transaction = js.native
    
    /** A 64-bit integer that contains the version of the connected database. When a database is first created, this attribute is an empty string. */
    val version: Double = js.native
  }
  
  @js.native
  trait HasCursor[TValue, TKey] extends StObject {
    
    /** Due to the microtask issues in some browsers, iterating over a cursor using promises doesn't always work.
      * So in the mean time, iterateCursor maps to openCursor, takes identical arguments, plus an additional callback that receives an IDBCursor */
    def iterateCursor(callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
    def iterateCursor(range: Null, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
    def iterateCursor(range: IDBKeyRange, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
    def iterateCursor(range: IDBValidKey, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
    @JSName("iterateCursor")
    def iterateCursor_next(range: Null, direction: next, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
    @JSName("iterateCursor")
    def iterateCursor_next(range: IDBKeyRange, direction: next, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
    @JSName("iterateCursor")
    def iterateCursor_next(range: IDBValidKey, direction: next, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
    @JSName("iterateCursor")
    def iterateCursor_nextunique(range: Null, direction: nextunique, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
    @JSName("iterateCursor")
    def iterateCursor_nextunique(
      range: IDBKeyRange,
      direction: nextunique,
      callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]
    ): Unit = js.native
    @JSName("iterateCursor")
    def iterateCursor_nextunique(
      range: IDBValidKey,
      direction: nextunique,
      callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]
    ): Unit = js.native
    @JSName("iterateCursor")
    def iterateCursor_prev(range: Null, direction: prev, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
    @JSName("iterateCursor")
    def iterateCursor_prev(range: IDBKeyRange, direction: prev, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
    @JSName("iterateCursor")
    def iterateCursor_prev(range: IDBValidKey, direction: prev, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
    @JSName("iterateCursor")
    def iterateCursor_prevunique(range: Null, direction: prevunique, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
    @JSName("iterateCursor")
    def iterateCursor_prevunique(
      range: IDBKeyRange,
      direction: prevunique,
      callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]
    ): Unit = js.native
    @JSName("iterateCursor")
    def iterateCursor_prevunique(
      range: IDBValidKey,
      direction: prevunique,
      callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]
    ): Unit = js.native
    
    /** Due to the microtask issues in some browsers, iterating over a cursor using promises doesn't always work.
      * So in the mean time, iterateKeyCursor maps to openKeyCursor, takes identical arguments, plus an additional callback that receives an IDBCursor */
    def iterateKeyCursor(callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
    def iterateKeyCursor(range: Null, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
    def iterateKeyCursor(range: IDBKeyRange, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
    def iterateKeyCursor(range: IDBValidKey, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
    @JSName("iterateKeyCursor")
    def iterateKeyCursor_next(range: Null, direction: next, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
    @JSName("iterateKeyCursor")
    def iterateKeyCursor_next(range: IDBKeyRange, direction: next, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
    @JSName("iterateKeyCursor")
    def iterateKeyCursor_next(range: IDBValidKey, direction: next, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
    @JSName("iterateKeyCursor")
    def iterateKeyCursor_nextunique(range: Null, direction: nextunique, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
    @JSName("iterateKeyCursor")
    def iterateKeyCursor_nextunique(
      range: IDBKeyRange,
      direction: nextunique,
      callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]
    ): Unit = js.native
    @JSName("iterateKeyCursor")
    def iterateKeyCursor_nextunique(
      range: IDBValidKey,
      direction: nextunique,
      callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]
    ): Unit = js.native
    @JSName("iterateKeyCursor")
    def iterateKeyCursor_prev(range: Null, direction: prev, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
    @JSName("iterateKeyCursor")
    def iterateKeyCursor_prev(range: IDBKeyRange, direction: prev, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
    @JSName("iterateKeyCursor")
    def iterateKeyCursor_prev(range: IDBValidKey, direction: prev, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
    @JSName("iterateKeyCursor")
    def iterateKeyCursor_prevunique(range: Null, direction: prevunique, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
    @JSName("iterateKeyCursor")
    def iterateKeyCursor_prevunique(
      range: IDBKeyRange,
      direction: prevunique,
      callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]
    ): Unit = js.native
    @JSName("iterateKeyCursor")
    def iterateKeyCursor_prevunique(
      range: IDBValidKey,
      direction: prevunique,
      callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]
    ): Unit = js.native
    
    /** Returns a Promise of an IDBRequest object that (in a separate thread) resolves a new cursor object.
      * Used for iterating through an object store by primary key with a cursor.
      * @param range Optional. A key or IDBKeyRange to be queried. If a single valid key is passed, this will default to a range containing only that key. If nothing is passed, this will default to a key range that selects all the records in this object store.
      * @param direction Optional. An IDBCursorDirection telling the cursor what direction to travel. Defaults to "next".
      * @returns A promise that resolves with the cursor once it has been opened. */
    def openCursor(): js.Promise[Cursor[TValue, TKey]] = js.native
    def openCursor(range: IDBKeyRange): js.Promise[Cursor[TValue, TKey]] = js.native
    def openCursor(range: IDBValidKey): js.Promise[Cursor[TValue, TKey]] = js.native
    @JSName("openCursor")
    def openCursor_next(range: Null, direction: next): js.Promise[Cursor[TValue, TKey]] = js.native
    @JSName("openCursor")
    def openCursor_next(range: Unit, direction: next): js.Promise[Cursor[TValue, TKey]] = js.native
    @JSName("openCursor")
    def openCursor_next(range: IDBKeyRange, direction: next): js.Promise[Cursor[TValue, TKey]] = js.native
    @JSName("openCursor")
    def openCursor_next(range: IDBValidKey, direction: next): js.Promise[Cursor[TValue, TKey]] = js.native
    @JSName("openCursor")
    def openCursor_nextunique(range: Null, direction: nextunique): js.Promise[Cursor[TValue, TKey]] = js.native
    @JSName("openCursor")
    def openCursor_nextunique(range: Unit, direction: nextunique): js.Promise[Cursor[TValue, TKey]] = js.native
    @JSName("openCursor")
    def openCursor_nextunique(range: IDBKeyRange, direction: nextunique): js.Promise[Cursor[TValue, TKey]] = js.native
    @JSName("openCursor")
    def openCursor_nextunique(range: IDBValidKey, direction: nextunique): js.Promise[Cursor[TValue, TKey]] = js.native
    @JSName("openCursor")
    def openCursor_prev(range: Null, direction: prev): js.Promise[Cursor[TValue, TKey]] = js.native
    @JSName("openCursor")
    def openCursor_prev(range: Unit, direction: prev): js.Promise[Cursor[TValue, TKey]] = js.native
    @JSName("openCursor")
    def openCursor_prev(range: IDBKeyRange, direction: prev): js.Promise[Cursor[TValue, TKey]] = js.native
    @JSName("openCursor")
    def openCursor_prev(range: IDBValidKey, direction: prev): js.Promise[Cursor[TValue, TKey]] = js.native
    @JSName("openCursor")
    def openCursor_prevunique(range: Null, direction: prevunique): js.Promise[Cursor[TValue, TKey]] = js.native
    @JSName("openCursor")
    def openCursor_prevunique(range: Unit, direction: prevunique): js.Promise[Cursor[TValue, TKey]] = js.native
    @JSName("openCursor")
    def openCursor_prevunique(range: IDBKeyRange, direction: prevunique): js.Promise[Cursor[TValue, TKey]] = js.native
    @JSName("openCursor")
    def openCursor_prevunique(range: IDBValidKey, direction: prevunique): js.Promise[Cursor[TValue, TKey]] = js.native
    
    /** Returns a Promise of an IDBRequest object that (in a separate thread) resolves a new cursor object.
      * Used for iterating through an object store with a key.
      * @param range Optional. A key or IDBKeyRange to be queried. If a single valid key is passed, this will default to a range containing only that key. If nothing is passed, this will default to a key range that selects all the records in this object store.
      * @param direction Optional. An IDBCursorDirection telling the cursor what direction to travel. Defaults to "next".
      * @returns A promise that resolves with the cursor once it has been opened. */
    def openKeyCursor(): js.Promise[Cursor[TValue, TKey]] = js.native
    def openKeyCursor(range: IDBKeyRange): js.Promise[Cursor[TValue, TKey]] = js.native
    def openKeyCursor(range: IDBValidKey): js.Promise[Cursor[TValue, TKey]] = js.native
    @JSName("openKeyCursor")
    def openKeyCursor_next(range: Null, direction: next): js.Promise[Cursor[TValue, TKey]] = js.native
    @JSName("openKeyCursor")
    def openKeyCursor_next(range: Unit, direction: next): js.Promise[Cursor[TValue, TKey]] = js.native
    @JSName("openKeyCursor")
    def openKeyCursor_next(range: IDBKeyRange, direction: next): js.Promise[Cursor[TValue, TKey]] = js.native
    @JSName("openKeyCursor")
    def openKeyCursor_next(range: IDBValidKey, direction: next): js.Promise[Cursor[TValue, TKey]] = js.native
    @JSName("openKeyCursor")
    def openKeyCursor_nextunique(range: Null, direction: nextunique): js.Promise[Cursor[TValue, TKey]] = js.native
    @JSName("openKeyCursor")
    def openKeyCursor_nextunique(range: Unit, direction: nextunique): js.Promise[Cursor[TValue, TKey]] = js.native
    @JSName("openKeyCursor")
    def openKeyCursor_nextunique(range: IDBKeyRange, direction: nextunique): js.Promise[Cursor[TValue, TKey]] = js.native
    @JSName("openKeyCursor")
    def openKeyCursor_nextunique(range: IDBValidKey, direction: nextunique): js.Promise[Cursor[TValue, TKey]] = js.native
    @JSName("openKeyCursor")
    def openKeyCursor_prev(range: Null, direction: prev): js.Promise[Cursor[TValue, TKey]] = js.native
    @JSName("openKeyCursor")
    def openKeyCursor_prev(range: Unit, direction: prev): js.Promise[Cursor[TValue, TKey]] = js.native
    @JSName("openKeyCursor")
    def openKeyCursor_prev(range: IDBKeyRange, direction: prev): js.Promise[Cursor[TValue, TKey]] = js.native
    @JSName("openKeyCursor")
    def openKeyCursor_prev(range: IDBValidKey, direction: prev): js.Promise[Cursor[TValue, TKey]] = js.native
    @JSName("openKeyCursor")
    def openKeyCursor_prevunique(range: Null, direction: prevunique): js.Promise[Cursor[TValue, TKey]] = js.native
    @JSName("openKeyCursor")
    def openKeyCursor_prevunique(range: Unit, direction: prevunique): js.Promise[Cursor[TValue, TKey]] = js.native
    @JSName("openKeyCursor")
    def openKeyCursor_prevunique(range: IDBKeyRange, direction: prevunique): js.Promise[Cursor[TValue, TKey]] = js.native
    @JSName("openKeyCursor")
    def openKeyCursor_prevunique(range: IDBValidKey, direction: prevunique): js.Promise[Cursor[TValue, TKey]] = js.native
  }
  
  @js.native
  trait Index[TValue, TKey]
    extends StObject
       with HasCursor[TValue, TKey] {
    
    /** Returns a Promise of an IDBRequest object that (in a separate thread) counts the matching records.
      * If no arguments are provided, it returns the total number of records in the store.
      * @param key A key or IDBKeyRange object that specifies a range of records you want to count.
      * @returns A promise that resolves with the total when the underlying count IDBRequest is successful. */
    def count(): js.Promise[Double] = js.native
    def count(key: IDBKeyRange): js.Promise[Double] = js.native
    def count(key: IDBValidKey): js.Promise[Double] = js.native
    
    /** Returns a Promise of an IDBRequest object that (in a separate thread) resolves with the store object store selected by the specified key.
      * This is for retrieving specific records from an object store.
      * @param key The key or key range that identifies the record to be retrieved.
      * @returns A promise that resolves with the item when the underlying get IDBRequest is successful. */
    def get(key: IDBKeyRange): js.Promise[TValue] = js.native
    def get(key: IDBValidKey): js.Promise[TValue] = js.native
    
    /** Returns a Promise of an IDBRequest object that (in a separate thread) resolves with the objects in the object store matching the specified parameter or all objects in the store if no parameters are given.
      * @param query Optional. A key or IDBKeyRange to be queried. If nothing is passed, this will default to a key range that selects all the records in this object store.
      * @param count Optional. Specifies the number of values to return if more than one is found. If it is lower than 0 or greater than 232-1 a TypeError exception will be thrown.
      * @returns A promise that resolves with the items when the underlying getAll IDBRequest is successful. */
    def getAll(): js.Promise[js.Array[TValue]] = js.native
    def getAll(query: Unit, count: Double): js.Promise[js.Array[TValue]] = js.native
    def getAll(query: IDBKeyRange): js.Promise[js.Array[TValue]] = js.native
    def getAll(query: IDBKeyRange, count: Double): js.Promise[js.Array[TValue]] = js.native
    def getAll(query: IDBValidKey): js.Promise[js.Array[TValue]] = js.native
    def getAll(query: IDBValidKey, count: Double): js.Promise[js.Array[TValue]] = js.native
    
    /** Returns a Promise of an IDBRequest object that (in a separate thread) resolves with record keys for all the objects matching the specified parameter or all record keys in the store if no parameters are given.
      * @param query Optional. A key or IDBKeyRange to be queried. If nothing is passed, this will default to a key range that selects all the records in this object store.
      * @param count Optional. Specifies the number of values to return if more than one is found. If it is lower than 0 or greater than 232-1 a TypeError exception will be thrown.
      * @returns A promise that resolves with the record keys when the underlying getAllKeys IDBRequest is successful. */
    def getAllKeys(): js.Promise[js.Array[TKey]] = js.native
    def getAllKeys(query: Unit, count: Double): js.Promise[js.Array[TKey]] = js.native
    def getAllKeys(query: IDBKeyRange): js.Promise[js.Array[TKey]] = js.native
    def getAllKeys(query: IDBKeyRange, count: Double): js.Promise[js.Array[TKey]] = js.native
    
    /** Returns a Promise of an IDBRequest object that (in a separate thread) finds either the given key or the primary key, if key is an IDBKeyRange.
      * @param key The key or key range that identifies the record to be retrieved.
      * @returns A promise that resolves with the item when the underlying get IDBRequest is successful. */
    def getKey(key: IDBKeyRange): js.Promise[TValue] = js.native
    def getKey(key: IDBValidKey): js.Promise[TValue] = js.native
    
    /** The key path of this index. If null, this index is not auto-populated. */
    val keyPath: String | js.Array[String] = js.native
    
    /** Affects how the index behaves when the result of evaluating the index's key path yields an array.
      * If true, there is one record in the index for each item in an array of keys.
      * If false, then there is one record for each key that is an array. */
    val multiEntry: Boolean = js.native
    
    /** The name of this index. */
    val name: String = js.native
    
    /** If true, this index does not allow duplicate values for a key. */
    val unique: Boolean = js.native
  }
  
  @js.native
  trait ObjectStore[TValue, TKey]
    extends StObject
       with HasCursor[TValue, TKey] {
    
    /** Returns a Promise of an IDBRequest object that (in a separate thread) creates a structured clone of the value, and stores the cloned value in the object store.
      * This is for adding new records to an object store.
      * @param value The value to be stored.
      * @param key Optional. The key to use to identify the record. If unspecified, it results to null.
      * @returns A promise that resolves with the new key when the underlying add IDBRequest is successful. */
    def add(value: TValue): js.Promise[IDBValidKey] = js.native
    def add(value: TValue, key: IDBKeyRange): js.Promise[IDBValidKey] = js.native
    def add(value: TValue, key: IDBValidKey): js.Promise[IDBValidKey] = js.native
    
    /** The value of the auto increment flag for this object store. */
    val autoIncrement: Boolean = js.native
    
    /** Returns a Promise of an IDBRequest object that (in a separate thread) clears the object store.
      * This is for deleting all current records out of an object store.
      * @returns A promise that resolves when the underlying clear IDBRequest is successful.  */
    def clear(): js.Promise[Unit] = js.native
    
    /** Returns a Promise of an IDBRequest object that (in a separate thread) counts the matching records.
      * If no arguments are provided, it returns the total number of records in the store.
      * @param key A key or IDBKeyRange object that specifies a range of records you want to count.
      * @returns A promise that resolves with the total when the underlying count IDBRequest is successful. */
    def count(): js.Promise[Double] = js.native
    def count(key: IDBKeyRange): js.Promise[Double] = js.native
    def count(key: IDBValidKey): js.Promise[Double] = js.native
    
    /** Creates a new index during a version upgrade, returning a new Index object in the connected database.
      * @param name The name of the index to create. It is possible to create an index with an empty name.
      * @param keyPath The key path for the index to use. It is possible to create an index with an empty keyPath, and also to pass in an array as a keyPath.
      * @param optionalParameters Additional options: unique and multiEntry.
      * @returns The newly created index. */
    def createIndex[TKey](name: String, keyPath: String): Index[TValue, TKey] = js.native
    def createIndex[TKey](name: String, keyPath: String, optionalParameters: IDBIndexParameters): Index[TValue, TKey] = js.native
    def createIndex[TKey](name: String, keyPath: js.Array[String]): Index[TValue, TKey] = js.native
    def createIndex[TKey](name: String, keyPath: js.Array[String], optionalParameters: IDBIndexParameters): Index[TValue, TKey] = js.native
    
    /** Returns a Promise of an IDBRequest object that (in a separate thread) deletes the store object specified.
      * This is for deleting individual records out of an object store.
      * @param key The key of the record to be deleted, or an IDBKeyRange to delete all records with keys in range.
      * @returns A promise that resolves when the underlying delete IDBRequest is successful. */
    def delete(key: IDBKeyRange): js.Promise[Unit] = js.native
    def delete(key: IDBValidKey): js.Promise[Unit] = js.native
    
    /** Destroys the specified index in the connected database, used during a version upgrade.
      * @param indexName The name of the existing index to remove. */
    def deleteIndex(indexName: String): Unit = js.native
    
    /** Returns a Promise of an IDBRequest object that (in a separate thread) resolves with the store object store selected by the specified key.
      * This is for retrieving specific records from an object store.
      * @param key The key or key range that identifies the record to be retrieved.
      * @returns A promise that resolves with the item when the underlying get IDBRequest is successful. */
    def get(key: TKey): js.Promise[TValue] = js.native
    
    /** Returns a Promise of an IDBRequest object that (in a separate thread) resolves with the objects in the object store matching the specified parameter or all objects in the store if no parameters are given.
      * @param query Optional. A key or IDBKeyRange to be queried. If nothing is passed, this will default to a key range that selects all the records in this object store.
      * @param count Optional. Specifies the number of values to return if more than one is found. If it is lower than 0 or greater than 232-1 a TypeError exception will be thrown.
      * @returns A promise that resolves with the items when the underlying getAll IDBRequest is successful. */
    def getAll(): js.Promise[js.Array[TValue]] = js.native
    def getAll(query: Unit, count: Double): js.Promise[js.Array[TValue]] = js.native
    def getAll(query: IDBKeyRange): js.Promise[js.Array[TValue]] = js.native
    def getAll(query: IDBKeyRange, count: Double): js.Promise[js.Array[TValue]] = js.native
    def getAll(query: IDBValidKey): js.Promise[js.Array[TValue]] = js.native
    def getAll(query: IDBValidKey, count: Double): js.Promise[js.Array[TValue]] = js.native
    
    /** Returns a Promise of an IDBRequest object that (in a separate thread) resolves with record keys for all the objects matching the specified parameter or all record keys in the store if no parameters are given.
      * @param query Optional. A key or IDBKeyRange to be queried. If nothing is passed, this will default to a key range that selects all the records in this object store.
      * @param count Optional. Specifies the number of values to return if more than one is found. If it is lower than 0 or greater than 232-1 a TypeError exception will be thrown.
      * @returns A promise that resolves with the record keys when the underlying getAllKeys IDBRequest is successful. */
    def getAllKeys(): js.Promise[js.Array[TKey]] = js.native
    def getAllKeys(query: Unit, count: Double): js.Promise[js.Array[TKey]] = js.native
    def getAllKeys(query: IDBKeyRange): js.Promise[js.Array[TKey]] = js.native
    def getAllKeys(query: IDBKeyRange, count: Double): js.Promise[js.Array[TKey]] = js.native
    
    /** Returns a Promise of an IDBRequest object that (in a separate thread) finds either the given key or the primary key, if key is an IDBKeyRange.
      * @param key The key or key range that identifies the record to be retrieved.
      * @returns A promise that resolves with the item when the underlying get IDBRequest is successful. */
    def getKey(key: IDBKeyRange): js.Promise[TKey] = js.native
    def getKey(key: IDBValidKey): js.Promise[TKey] = js.native
    
    /** Opens an index from this object store after which it can, for example, be used to return a sequence of records sorted by that index using a cursor.
      * @param name The name of the existing index to get.
      * @returns The specified index. */
    def index[TKey](name: String): Index[TValue, TKey] = js.native
    
    /** A list of the names of indexes on objects in this object store. */
    val indexNames: DOMStringList = js.native
    
    /** The key path of this object store. If this attribute is null, the application must provide a key for each modification operation. */
    val keyPath: String | js.Array[String] = js.native
    
    /** The name of this object store. Settable only during upgrades. */
    var name: String = js.native
    
    /** Returns a Promise of an IDBRequest object that (in a separate thread) creates a structured clone of the value, and updates the cloned value in the object store.
      * This is for updating existing records in an object store when the transaction's mode is readwrite.
      * @param value The value to be stored.
      * @param key Optional. The key to use to identify the record. If unspecified, it results to null.
      * @returns A promise that resolves with the new key when the underlying put IDBRequest is successful. */
    def put(value: TValue): js.Promise[IDBValidKey] = js.native
    def put(value: TValue, key: IDBKeyRange): js.Promise[IDBValidKey] = js.native
    def put(value: TValue, key: IDBValidKey): js.Promise[IDBValidKey] = js.native
  }
  
  trait Transaction extends StObject {
    
    /** Rolls back all the changes to objects in the database associated with this transaction. If this transaction has been aborted or completed, then this method throws an error event. */
    def abort(): Unit
    
    /** Resolves when transaction completes, rejects if transaction aborts or errors. */
    val complete: js.Promise[Unit]
    
    /** The mode for isolating access to data in the object stores that are in the scope of the transaction. For possible values, see the Constants section below. The default value is readonly. */
    val mode: readonly | readwrite | versionchange
    
    /** Returns an ObjectStore object representing an object store that is part of the scope of this transaction.
      * @param name The name of the requested object store.
      * @returns The object store in the context of the transaction. */
    def objectStore[TValue, TKey](name: String): ObjectStore[TValue, TKey]
    
    /** Returns a DOMStringList of the names of IDBObjectStore objects. */
    val objectStoreNames: DOMStringList
  }
  object Transaction {
    
    inline def apply(
      abort: () => Unit,
      complete: js.Promise[Unit],
      mode: readonly | readwrite | versionchange,
      objectStore: String => ObjectStore[js.Any, js.Any],
      objectStoreNames: DOMStringList
    ): Transaction = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), complete = complete.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], objectStore = js.Any.fromFunction1(objectStore), objectStoreNames = objectStoreNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transaction]
    }
    
    extension [Self <: Transaction](x: Self) {
      
      inline def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
      
      inline def setComplete(value: js.Promise[Unit]): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setMode(value: readonly | readwrite | versionchange): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setObjectStore(value: String => ObjectStore[js.Any, js.Any]): Self = StObject.set(x, "objectStore", js.Any.fromFunction1(value))
      
      inline def setObjectStoreNames(value: DOMStringList): Self = StObject.set(x, "objectStoreNames", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UpgradeDB extends StObject {
    
    /** Creates and returns a new object store or index.
      * @param name The name of the new object store to be created. Note that it is possible to create an object store with an empty name.
      * @param optionalParameters Optional. An options object whose attributes are optional parameters to the method.
      * @returns The new object store. */
    def createObjectStore[TValue, TKey](name: String): ObjectStore[TValue, TKey] = js.native
    def createObjectStore[TValue, TKey](name: String, optionalParameters: IDBObjectStoreParameters): ObjectStore[TValue, TKey] = js.native
    
    /** Destroys the object store with the given name in the connected database, along with any indexes that reference it.
      * @param name The name of the object store to be removed. */
    def deleteObjectStore(name: String): Unit = js.native
    
    /** A DOMString that contains the name of the connected database. */
    val name: String = js.native
    
    /** A DOMStringList that contains a list of the names of the object stores currently in the connected database. */
    val objectStoreNames: DOMStringList = js.native
    
    /** The previous version of the DB seen by the browser, or 0 if it's new */
    val oldVersion: Double = js.native
    
    /** This is a property rather than a method. It's a Transaction representing the upgrade transaction */
    val transaction: Transaction = js.native
    
    /** A 64-bit integer that contains the version of the connected database. When a database is first created, this attribute is an empty string. */
    val version: Double = js.native
  }
}
