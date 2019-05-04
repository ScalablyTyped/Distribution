package typings
package atJupyterlabObservablesLib.libObservablemapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/observables/lib/observablemap", "ObservableMap")
@js.native
/**
  * Construct a new observable map.
  */
class ObservableMap[T] () extends IObservableMap[T] {
  def this(options: atJupyterlabObservablesLib.libObservablemapMod.ObservableMapNs.IOptions[T]) = this()
  var _changed: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _itemCmp: js.Any = js.native
  var _map: js.Any = js.native
  /**
    * A signal emitted when the map has changed.
    */
  /* CompleteClass */
  override val changed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
    this.type, 
    atJupyterlabObservablesLib.libObservablemapMod.IObservableMapNs.IChangedArgs[T]
  ] = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: scala.Boolean = js.native
  /**
    * The number of key-value pairs in the map.
    */
  /* CompleteClass */
  override val size: scala.Double = js.native
  /**
    * The type of this object.
    */
  /* CompleteClass */
  override val `type`: atJupyterlabObservablesLib.libModeldbMod.ObservableType = js.native
  /**
    * The type of the Observable.
    */
  /* CompleteClass */
  @JSName("type")
  override var type_IObservableMap: atJupyterlabObservablesLib.atJupyterlabObservablesLibStrings.Map = js.native
  /**
    * Set the ObservableMap to an empty map.
    */
  /* CompleteClass */
  override def clear(): scala.Unit = js.native
  /**
    * Remove a key from the map
    *
    * @param key - the key to remove.
    *
    * @returns the value of the given key,
    *   or undefined if that does not exist.
    */
  /* CompleteClass */
  override def delete(key: java.lang.String): js.UndefOr[T] = js.native
  /**
    * Dispose of the resources held by the object.
    *
    * #### Notes
    * If the object's `dispose` method is called more than once, all
    * calls made after the first will be a no-op.
    *
    * #### Undefined Behavior
    * It is undefined behavior to use any functionality of the object
    * after it has been disposed unless otherwise explicitly noted.
    */
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  /**
    * Get a value for a given key.
    *
    * @param key - the key.
    *
    * @returns the value for that key.
    */
  /* CompleteClass */
  override def get(key: java.lang.String): js.UndefOr[T] = js.native
  /**
    * Check whether the map has a key.
    *
    * @param key - the key to check.
    *
    * @returns `true` if the map has the key, `false` otherwise.
    */
  /* CompleteClass */
  override def has(key: java.lang.String): scala.Boolean = js.native
  /**
    * Get a list of the keys in the map.
    *
    * @returns - a list of keys.
    */
  /* CompleteClass */
  override def keys(): js.Array[java.lang.String] = js.native
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
  /* CompleteClass */
  override def set(key: java.lang.String, value: T): js.UndefOr[T] = js.native
  /**
    * Get a list of the values in the map.
    *
    * @returns - a list of values.
    */
  /* CompleteClass */
  override def values(): js.Array[T] = js.native
}

