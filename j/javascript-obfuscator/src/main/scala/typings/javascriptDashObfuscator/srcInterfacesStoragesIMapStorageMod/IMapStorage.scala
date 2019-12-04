package typings.javascriptDashObfuscator.srcInterfacesStoragesIMapStorageMod

import typings.javascriptDashObfuscator.srcInterfacesIInitializableMod.IInitializable
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMapStorage[K, V]
  extends IInitializable[js.Array[scala.Nothing]] {
  /**
    * @param {K} key
    * @returns {V}
    */
  def get(key: K): V
  /**
    * @param {V} value
    * @returns {K | null}
    */
  def getKeyOf(value: V): K | Null
  /**
    * @returns number
    */
  def getLength(): Double
  /**
    * @returns {Map<K, V>}
    */
  def getStorage(): Map[K, V]
  /**
    * @returns string
    */
  def getStorageId(): String
  /**
    * @param {K} key
    * @returns {boolean}
    */
  def has(key: K): Boolean
  /**
    * @param storage
    * @param mergeId
    */
  def mergeWith(storage: this.type, mergeId: Boolean): Unit
  /**
    * @param {K} key
    * @param {V} value
    */
  def set(key: K, value: V): Unit
}

object IMapStorage {
  @scala.inline
  def apply[K, V](
    get: K => V,
    getKeyOf: V => K | Null,
    getLength: () => Double,
    getStorage: () => Map[K, V],
    getStorageId: () => String,
    has: K => Boolean,
    initialize: js.Array[scala.Nothing] => Unit,
    mergeWith: (IMapStorage[K, V], Boolean) => Unit,
    set: (K, V) => Unit
  ): IMapStorage[K, V] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getKeyOf = js.Any.fromFunction1(getKeyOf), getLength = js.Any.fromFunction0(getLength), getStorage = js.Any.fromFunction0(getStorage), getStorageId = js.Any.fromFunction0(getStorageId), has = js.Any.fromFunction1(has), initialize = js.Any.fromFunction1(initialize), mergeWith = js.Any.fromFunction2(mergeWith), set = js.Any.fromFunction2(set))
  
    __obj.asInstanceOf[IMapStorage[K, V]]
  }
}

