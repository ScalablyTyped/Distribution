package typings.idb.mod

import typings.std.DOMStringList
import typings.std.IDBIndexParameters
import typings.std.IDBKeyRange
import typings.std.IDBValidKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectStore[TValue, TKey] extends HasCursor[TValue, TKey] {
  /** The value of the auto increment flag for this object store. */
  val autoIncrement: Boolean = js.native
  /** A list of the names of indexes on objects in this object store. */
  val indexNames: DOMStringList = js.native
  /** The key path of this object store. If this attribute is null, the application must provide a key for each modification operation. */
  val keyPath: String | js.Array[String] = js.native
  /** The name of this object store. Settable only during upgrades. */
  var name: String = js.native
  /** Returns a Promise of an IDBRequest object that (in a separate thread) creates a structured clone of the value, and stores the cloned value in the object store.
    * This is for adding new records to an object store.
    * @param value The value to be stored.
    * @param key Optional. The key to use to identify the record. If unspecified, it results to null.
    * @returns A promise that resolves with the new key when the underlying add IDBRequest is successful. */
  def add(value: TValue): js.Promise[IDBValidKey] = js.native
  def add(value: TValue, key: IDBKeyRange): js.Promise[IDBValidKey] = js.native
  def add(value: TValue, key: IDBValidKey): js.Promise[IDBValidKey] = js.native
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
  def getAll(query: js.UndefOr[IDBValidKey], count: Double): js.Promise[js.Array[TValue]] = js.native
  def getAll(query: IDBKeyRange): js.Promise[js.Array[TValue]] = js.native
  def getAll(query: IDBKeyRange, count: Double): js.Promise[js.Array[TValue]] = js.native
  def getAll(query: IDBValidKey): js.Promise[js.Array[TValue]] = js.native
  /** Returns a Promise of an IDBRequest object that (in a separate thread) resolves with record keys for all the objects matching the specified parameter or all record keys in the store if no parameters are given.
    * @param query Optional. A key or IDBKeyRange to be queried. If nothing is passed, this will default to a key range that selects all the records in this object store.
    * @param count Optional. Specifies the number of values to return if more than one is found. If it is lower than 0 or greater than 232-1 a TypeError exception will be thrown.
    * @returns A promise that resolves with the record keys when the underlying getAllKeys IDBRequest is successful. */
  def getAllKeys(): js.Promise[js.Array[TKey]] = js.native
  def getAllKeys(query: js.UndefOr[scala.Nothing], count: Double): js.Promise[js.Array[TKey]] = js.native
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
  /** Returns a Promise of an IDBRequest object that (in a separate thread) creates a structured clone of the value, and updates the cloned value in the object store.
    * This is for updating existing records in an object store when the transaction's mode is readwrite.
    * @param value The value to be stored.
    * @param key Optional. The key to use to identify the record. If unspecified, it results to null.
    * @returns A promise that resolves with the new key when the underlying put IDBRequest is successful. */
  def put(value: TValue): js.Promise[IDBValidKey] = js.native
  def put(value: TValue, key: IDBKeyRange): js.Promise[IDBValidKey] = js.native
  def put(value: TValue, key: IDBValidKey): js.Promise[IDBValidKey] = js.native
}

