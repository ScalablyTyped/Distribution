package typings.knockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- js.Function because Already inherited
- typings.knockout.mod.SubscribableFunctions because Already inherited
- typings.knockout.mod.ObservableFunctions because Already inherited
- typings.knockout.mod.ObservableArrayFunctions because var conflicts: length. Inlined indexOf, indexOf, slice, slice, splice, splice, pop, push, shift, unshift, reverse, sort, sort, reversed, sorted, sorted, replace, remove, remove, removeAll, removeAll, destroy, destroy, destroyAll, destroyAll */ @js.native
trait ObservableArray_[T]
  extends Observable_[js.Array[T]] {
  
  /**
    * Finds any objects in the array filtered by a function and gives them a special property called _destroy with value true.
    * Usually only relevant to Ruby on Rails development
    * @param destroyFunction A function used to determine which items should be marked with the property.
    */
  def destroy(destroyFunction: js.Function1[T, Boolean]): Unit = js.native
  // Ko specific Usually relevant to Ruby on Rails developers only
  /**
    * Finds any objects in the array that equal someItem and gives them a special property called _destroy with value true.
    * Usually only relevant to Ruby on Rails development
    * @param item Items to be marked with the property.
    */
  def destroy(item: T): Unit = js.native
  
  /**
    * Gives a special property called _destroy with value true to all objects in the array.
    * Usually only relevant to Ruby on Rails development
    */
  def destroyAll(): Unit = js.native
  /**
    * Finds any objects in the array that equal supplied items and gives them a special property called _destroy with value true.
    * Usually only relevant to Ruby on Rails development
    * @param items
    */
  def destroyAll(items: js.Array[T]): Unit = js.native
  
  //#region observableArray/generalFunctions
  /**
    * Returns the index of the first occurrence of a value in an array.
    * @param searchElement The value to locate in the array.
    * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
    */
  def indexOf(searchElement: T): Double = js.native
  def indexOf(searchElement: T, fromIndex: Double): Double = js.native
  
  /**
    * Removes the last value from the array and returns it.
    */
  def pop(): T = js.native
  
  /**
    * Adds a new item to the end of array.
    * @param items Items to be added
    */
  def push(items: T*): Double = js.native
  
  /**
    * Removes all values that equal item and returns them as an array.
    * @param item The item to be removed
    */
  def remove(item: T): js.Array[T] = js.native
  /**
    * Removes all values  and returns them as an array.
    * @param removeFunction A function used to determine true if item should be removed and fasle otherwise
    */
  def remove(removeFunction: js.Function1[T, Boolean]): js.Array[T] = js.native
  
  /**
    * Removes all values and returns them as an array.
    */
  def removeAll(): js.Array[T] = js.native
  /**
    * Removes all values that equal any of the supplied items
    * @param items Items to be removed
    */
  def removeAll(items: js.Array[T]): js.Array[T] = js.native
  
  /**
    * Replaces the first value that equals oldItem with newItem
    * @param oldItem Item to be replaced
    * @param newItem Replacing item
    */
  def replace(oldItem: T, newItem: T): Unit = js.native
  
  /**
    * Reverses the order of the array and returns the observableArray.
    * Modifies the underlying array.
    */
  def reverse(): this.type = js.native
  
  //#endregion
  //#region observableArray/koSpecificFunctions
  /**
    * Returns a reversed copy of the array.
    * Does not modify the underlying array.
    */
  def reversed(): js.Array[T] = js.native
  
  /**
    * Removes the first value from the array and returns it.
    */
  def shift(): T = js.native
  
  /**
    * Returns a section of an array.
    * @param start The beginning of the specified portion of the array.
    * @param end The end of the specified portion of the array. If omitted, all items after start are included
    */
  def slice(start: Double): js.Array[T] = js.native
  def slice(start: Double, end: Double): js.Array[T] = js.native
  
  /**
    * Sorts the array contents and returns the observableArray.
    * Modifies the underlying array.
    */
  def sort(): this.type = js.native
  def sort(compareFunction: js.Function2[T, T, Double]): this.type = js.native
  
  /**
    * Returns a reversed copy of the array.
    * Does not modify the underlying array.
    */
  def sorted(): js.Array[T] = js.native
  def sorted(compareFunction: js.Function2[T, T, Double]): js.Array[T] = js.native
  
  def splice(start: Double, deleteCount: js.UndefOr[scala.Nothing], items: T*): js.Array[T] = js.native
  /**
    * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
    * @param start The zero-based location in the array from which to start removing elements.
    * @param deleteCount The number of elements to remove. Defaults to removing everything after `start`
    * @param items Elements to insert into the array in place of the deleted elements.
    */
  def splice(start: Double, deleteCount: Double, items: T*): js.Array[T] = js.native
  
  /**
    * Inserts a new item at the beginning of the array.
    * @param items Items to be added
    */
  def unshift(items: T*): Double = js.native
}
