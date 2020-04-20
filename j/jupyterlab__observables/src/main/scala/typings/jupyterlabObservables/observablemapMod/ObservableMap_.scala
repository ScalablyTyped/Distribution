package typings.jupyterlabObservables.observablemapMod

import typings.jupyterlabObservables.jupyterlabObservablesStrings.Map
import typings.jupyterlabObservables.modeldbMod.ObservableType
import typings.jupyterlabObservables.observablemapMod.IObservableMap.IChangedArgs
import typings.jupyterlabObservables.observablemapMod.ObservableMap.IOptions
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/observables/lib/observablemap", "ObservableMap")
@js.native
/**
  * Construct a new observable map.
  */
class ObservableMap_[T] () extends IObservableMap[T] {
  def this(options: IOptions[T]) = this()
  var _changed: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _itemCmp: js.Any = js.native
  var _map: js.Any = js.native
  /**
    * A signal emitted when the map has changed.
    */
  /* CompleteClass */
  override val changed: ISignal[this.type, IChangedArgs[T]] = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: Boolean = js.native
  /**
    * The number of key-value pairs in the map.
    */
  /* CompleteClass */
  override val size: Double = js.native
  /**
    * The type of this object.
    */
  /* CompleteClass */
  override val `type`: ObservableType = js.native
  /**
    * The type of the Observable.
    */
  /* CompleteClass */
  @JSName("type")
  override var type_IObservableMap_ : Map = js.native
  /**
    * A signal emitted when the map has changed.
    */
  @JSName("changed")
  def changed_MObservableMap_ : ISignal[this.type, IChangedArgs[T]] = js.native
  /**
    * Set the ObservableMap to an empty map.
    */
  /* CompleteClass */
  override def clear(): Unit = js.native
  /**
    * Remove a key from the map
    *
    * @param key - the key to remove.
    *
    * @returns the value of the given key,
    *   or undefined if that does not exist.
    */
  /* CompleteClass */
  override def delete(key: String): js.UndefOr[T] = js.native
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
  override def dispose(): Unit = js.native
  /**
    * Get a value for a given key.
    *
    * @param key - the key.
    *
    * @returns the value for that key.
    */
  /* CompleteClass */
  override def get(key: String): js.UndefOr[T] = js.native
  /**
    * Check whether the map has a key.
    *
    * @param key - the key to check.
    *
    * @returns `true` if the map has the key, `false` otherwise.
    */
  /* CompleteClass */
  override def has(key: String): Boolean = js.native
  /**
    * Whether this map has been disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MObservableMap_ : Boolean = js.native
  /**
    * Get a list of the keys in the map.
    *
    * @returns - a list of keys.
    */
  /* CompleteClass */
  override def keys(): js.Array[String] = js.native
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
  override def set(key: String, value: T): js.UndefOr[T] = js.native
  /**
    * The number of key-value pairs in the map.
    */
  @JSName("size")
  def size_MObservableMap_ : Double = js.native
  /**
    * The type of the Observable.
    */
  @JSName("type")
  def type_MObservableMap_ : Map = js.native
  /**
    * Get a list of the values in the map.
    *
    * @returns - a list of values.
    */
  /* CompleteClass */
  override def values(): js.Array[T] = js.native
}

