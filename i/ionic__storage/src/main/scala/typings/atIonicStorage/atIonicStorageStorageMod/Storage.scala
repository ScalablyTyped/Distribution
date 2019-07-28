package typings.atIonicStorage.atIonicStorageStorageMod

import typings.localforage.LocalForage
import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/storage/storage", "Storage")
@js.native
class Storage protected () extends js.Object {
  /**
    * Create a new Storage instance using the order of drivers and any additional config
    * options to pass to LocalForage.
    *
    * Possible driver options are: ['sqlite', 'indexeddb', 'websql', 'localstorage'] and the
    * default is that exact ordering.
    */
  def this(config: StorageConfig) = this()
  var _dbPromise: js.Any = js.native
  var _driver: js.Any = js.native
  /** @hidden */
  var _getDriverOrder: js.Any = js.native
  /**
    * Get the name of the driver being used.
    * @returns Name of the driver
    */
  val driver: String | Null = js.native
  /**
    * Clear the entire key value store. WARNING: HOT!
    * @returns Returns a promise that resolves when the store is cleared
    */
  def clear(): js.Promise[Unit] = js.native
  /**
    * Iterate through each key,value pair.
    * @param iteratorCallback a callback of the form (value, key, iterationNumber)
    * @returns Returns a promise that resolves when the iteration has finished.
    */
  def forEach(
    iteratorCallback: js.Function3[/* value */ js.Any, /* key */ String, /* iterationNumber */ Number, _]
  ): js.Promise[Unit] = js.native
  /**
    * Get the value associated with the given key.
    * @param key the key to identify this value
    * @returns Returns a promise with the value of the given key
    */
  def get(key: String): js.Promise[_] = js.native
  /**
    * @returns Returns a promise that resolves with the keys in the store.
    */
  def keys(): js.Promise[js.Array[String]] = js.native
  /**
    * @returns Returns a promise that resolves with the number of keys stored.
    */
  def length(): js.Promise[Double] = js.native
  /**
    * Reflect the readiness of the store.
    * @returns Returns a promise that resolves when the store is ready
    */
  def ready(): js.Promise[LocalForage] = js.native
  /**
    * Remove any value associated with this key.
    * @param key the key to identify this value
    * @returns Returns a promise that resolves when the value is removed
    */
  def remove(key: String): js.Promise[_] = js.native
  /**
    * Set the value for the given key.
    * @param key the key to identify this value
    * @param value the value for this key
    * @returns Returns a promise that resolves when the key and value are set
    */
  def set(key: String, value: js.Any): js.Promise[_] = js.native
}

