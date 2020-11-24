package typings.jupyterlabObservables.observablemapMod

import typings.jupyterlabObservables.jupyterlabObservablesStrings.Map
import typings.jupyterlabObservables.modeldbMod.IObservable
import typings.jupyterlabObservables.observablemapMod.IObservableMap.IChangedArgs
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObservableMap_[T] extends IObservable {
  
  /**
    * A signal emitted when the map has changed.
    */
  val changed: ISignal[this.type, IChangedArgs[T]] = js.native
  
  /**
    * Set the ObservableMap to an empty map.
    */
  def clear(): Unit = js.native
  
  /**
    * Remove a key from the map
    *
    * @param key - the key to remove.
    *
    * @returns the value of the given key,
    *   or undefined if that does not exist.
    */
  def delete(key: String): js.UndefOr[T] = js.native
  
  /**
    * Get a value for a given key.
    *
    * @param key - the key.
    *
    * @returns the value for that key.
    */
  def get(key: String): js.UndefOr[T] = js.native
  
  /**
    * Check whether the map has a key.
    *
    * @param key - the key to check.
    *
    * @returns `true` if the map has the key, `false` otherwise.
    */
  def has(key: String): Boolean = js.native
  
  /**
    * Get a list of the keys in the map.
    *
    * @returns - a list of keys.
    */
  def keys(): js.Array[String] = js.native
  
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
  def set(key: String, value: T): js.UndefOr[T] = js.native
  
  /**
    * The number of key-value pairs in the map.
    */
  val size: Double = js.native
  
  /**
    * The type of the Observable.
    */
  @JSName("type")
  var type_IObservableMap_ : Map = js.native
  
  /**
    * Get a list of the values in the map.
    *
    * @returns - a list of values.
    */
  def values(): js.Array[T] = js.native
}
object IObservableMap_ {
  
  @scala.inline
  def apply[T](
    changed: ISignal[IObservableMap_[T], IChangedArgs[T]],
    clear: () => Unit,
    delete: String => js.UndefOr[T],
    dispose: () => Unit,
    get: String => js.UndefOr[T],
    has: String => Boolean,
    isDisposed: Boolean,
    keys: () => js.Array[String],
    set: (String, T) => js.UndefOr[T],
    size: Double,
    `type`: Map,
    values: () => js.Array[T]
  ): IObservableMap_[T] = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), dispose = js.Any.fromFunction0(dispose), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), isDisposed = isDisposed.asInstanceOf[js.Any], keys = js.Any.fromFunction0(keys), set = js.Any.fromFunction2(set), size = size.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObservableMap_[T]]
  }
  
  @scala.inline
  implicit class IObservableMap_Ops[Self <: IObservableMap_[_], T] (val x: Self with IObservableMap_[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChanged(value: ISignal[IObservableMap_[T], IChangedArgs[T]]): Self = this.set("changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDelete(value: String => js.UndefOr[T]): Self = this.set("delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: String => js.UndefOr[T]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHas(value: String => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeys(value: () => js.Array[String]): Self = this.set("keys", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: (String, T) => js.UndefOr[T]): Self = this.set("set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Map): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: () => js.Array[T]): Self = this.set("values", js.Any.fromFunction0(value))
  }
}
