package typings.javascriptDashObfuscator.srcInterfacesStoragesIArrayStorageMod

import typings.javascriptDashObfuscator.srcInterfacesIInitializableMod.IInitializable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IArrayStorage[V]
  extends IInitializable[js.Array[scala.Nothing]] {
  /**
    * @param {number} key
    * @returns {V}
    */
  def get(key: Double): V
  /**
    * @param value
    * @returns number | null
    */
  def getKeyOf(value: V): Double | Null
  /**
    * @returns number
    */
  def getLength(): Double
  /**
    * @returns {V[]}
    */
  def getStorage(): js.Array[V]
  /**
    * @returns string
    */
  def getStorageId(): String
  /**
    * @param storage
    * @param mergeId
    */
  def mergeWith(storage: this.type, mergeId: Boolean): Unit
  /**
    * @param {number} key
    * @param {V} value
    */
  def set(key: Double, value: V): Unit
}

object IArrayStorage {
  @scala.inline
  def apply[V](
    get: Double => V,
    getKeyOf: V => Double | Null,
    getLength: () => Double,
    getStorage: () => js.Array[V],
    getStorageId: () => String,
    initialize: js.Array[scala.Nothing] => Unit,
    mergeWith: (IArrayStorage[V], Boolean) => Unit,
    set: (Double, V) => Unit
  ): IArrayStorage[V] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getKeyOf = js.Any.fromFunction1(getKeyOf), getLength = js.Any.fromFunction0(getLength), getStorage = js.Any.fromFunction0(getStorage), getStorageId = js.Any.fromFunction0(getStorageId), initialize = js.Any.fromFunction1(initialize), mergeWith = js.Any.fromFunction2(mergeWith), set = js.Any.fromFunction2(set))
  
    __obj.asInstanceOf[IArrayStorage[V]]
  }
}

