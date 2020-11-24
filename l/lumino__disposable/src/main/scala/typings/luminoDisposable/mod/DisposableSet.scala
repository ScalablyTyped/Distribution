package typings.luminoDisposable.mod

import typings.luminoAlgorithm.iterMod.IterableOrArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/disposable", "DisposableSet")
@js.native
/**
  * Construct a new disposable set.
  */
class DisposableSet () extends IDisposable {
  
  var _isDisposed: js.Any = js.native
  
  var _items: js.Any = js.native
  
  /**
    * Add a disposable item to the set.
    *
    * @param item - The item to add to the set.
    *
    * #### Notes
    * If the item is already contained in the set, this is a no-op.
    */
  def add(item: IDisposable): Unit = js.native
  
  /**
    * Remove all items from the set.
    */
  def clear(): Unit = js.native
  
  /**
    * Test whether the set contains a specific item.
    *
    * @param item - The item of interest.
    *
    * @returns `true` if the set contains the item, `false` otherwise.
    */
  def contains(item: IDisposable): Boolean = js.native
  
  /**
    * Remove a disposable item from the set.
    *
    * @param item - The item to remove from the set.
    *
    * #### Notes
    * If the item is not contained in the set, this is a no-op.
    */
  def remove(item: IDisposable): Unit = js.native
}
@JSImport("@lumino/disposable", "DisposableSet")
@js.native
object DisposableSet extends js.Object {
  
  /**
    * Create a disposable set from an iterable of items.
    *
    * @param items - The iterable or array-like object of interest.
    *
    * @returns A new disposable initialized with the given items.
    */
  def from(items: IterableOrArrayLike[IDisposable]): DisposableSet = js.native
}
