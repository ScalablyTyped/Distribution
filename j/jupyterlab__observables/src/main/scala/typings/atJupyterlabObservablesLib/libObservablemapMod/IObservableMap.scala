package typings
package atJupyterlabObservablesLib.libObservablemapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObservableMap[T]
  extends atJupyterlabObservablesLib.libModeldbMod.IObservable {
  /**
    * A signal emitted when the map has changed.
    */
  val changed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
    this.type, 
    atJupyterlabObservablesLib.libObservablemapMod.IObservableMapNs.IChangedArgs[T]
  ]
  /**
    * The number of key-value pairs in the map.
    */
  val size: scala.Double
  /**
    * The type of the Observable.
    */
  @JSName("type")
  var type_IObservableMap: atJupyterlabObservablesLib.atJupyterlabObservablesLibStrings.Map
  /**
    * Set the ObservableMap to an empty map.
    */
  def clear(): scala.Unit
  /**
    * Remove a key from the map
    *
    * @param key - the key to remove.
    *
    * @returns the value of the given key,
    *   or undefined if that does not exist.
    */
  def delete(key: java.lang.String): js.UndefOr[T]
  /**
    * Get a value for a given key.
    *
    * @param key - the key.
    *
    * @returns the value for that key.
    */
  def get(key: java.lang.String): js.UndefOr[T]
  /**
    * Check whether the map has a key.
    *
    * @param key - the key to check.
    *
    * @returns `true` if the map has the key, `false` otherwise.
    */
  def has(key: java.lang.String): scala.Boolean
  /**
    * Get a list of the keys in the map.
    *
    * @returns - a list of keys.
    */
  def keys(): js.Array[java.lang.String]
  /**
    * Set a key-value pair in the map
    *
    * @param key - The key to set.
    *
    * @param value - The value for the key.
    *
    * @returns the old value for the key, or undefined
    *   if that did not exist.
    */
  def set(key: java.lang.String, value: T): js.UndefOr[T]
  /**
    * Get a list of the values in the map.
    *
    * @returns - a list of values.
    */
  def values(): js.Array[T]
}

object IObservableMap {
  @scala.inline
  def apply[T](
    changed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
      IObservableMap[T], 
      atJupyterlabObservablesLib.libObservablemapMod.IObservableMapNs.IChangedArgs[T]
    ],
    clear: () => scala.Unit,
    delete: java.lang.String => js.UndefOr[T],
    dispose: () => scala.Unit,
    get: java.lang.String => js.UndefOr[T],
    has: java.lang.String => scala.Boolean,
    isDisposed: scala.Boolean,
    keys: () => js.Array[java.lang.String],
    set: (java.lang.String, T) => js.UndefOr[T],
    size: scala.Double,
    `type`: atJupyterlabObservablesLib.atJupyterlabObservablesLibStrings.Map,
    values: () => js.Array[T]
  ): IObservableMap[T] = {
    val __obj = js.Dynamic.literal(changed = changed, clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), dispose = js.Any.fromFunction0(dispose), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), isDisposed = isDisposed, keys = js.Any.fromFunction0(keys), set = js.Any.fromFunction2(set), size = size, values = js.Any.fromFunction0(values))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IObservableMap[T]]
  }
}

