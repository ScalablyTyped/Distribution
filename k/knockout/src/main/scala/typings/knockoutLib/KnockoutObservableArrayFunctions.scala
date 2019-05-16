package typings
package knockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The functions of observable arrays that mutate the array
@js.native
trait KnockoutObservableArrayFunctions[T] extends KnockoutReadonlyObservableArrayFunctions[T] {
  /**
    * Finds any objects in the array filtered by a function and gives them a special property called _destroy with value true.
    * @param destroyFunction A function used to determine which items should be marked with the property.
    */
  def destroy(destroyFunction: js.Function1[/* item */ T, scala.Boolean]): scala.Unit = js.native
  // Ko specific Usually relevant to Ruby on Rails developers only
  /**
    * Finds any objects in the array that equal someItem and gives them a special property called _destroy with value true.
    * @param item Items to be marked with the property.
    */
  def destroy(item: T): scala.Unit = js.native
  /**
    * Gives a special property called _destroy with value true to all objects in the array.
    */
  def destroyAll(): scala.Unit = js.native
  /**
    * Finds any objects in the array that equal suplied items and gives them a special property called _destroy with value true.
    * @param items
    */
  def destroyAll(items: js.Array[T]): scala.Unit = js.native
  /**
    * Removes the last value from the array and returns it.
    */
  def pop(): T = js.native
  /**
    * Adds new item or items to the end of array.
    * @param items Items  to be added.
    */
  def push(items: T*): scala.Unit = js.native
  /**
    * Removes all values that equal item and returns them as an array.
    * @param item The item to be removed.
    */
  def remove(item: T): js.Array[T] = js.native
  /**
    * Removes all values and returns them as an array.
    * @param removeFunction A function used to determine true if item should be removed and fasle otherwise.
    */
  def remove(removeFunction: js.Function1[/* item */ T, scala.Boolean]): js.Array[T] = js.native
  /**
    * Removes all values and returns them as an array.
    */
  def removeAll(): js.Array[T] = js.native
  /**
    * Removes all values that equal any of the supplied items.
    * @param items Items to be removed.
    */
  def removeAll(items: js.Array[T]): js.Array[T] = js.native
  // Ko specific
  /**
    * Replaces the first value that equals oldItem with newItem.
    * @param oldItem Item to be replaced.
    * @param newItem Replacing item.
    */
  def replace(oldItem: T, newItem: T): scala.Unit = js.native
  /**
    * Reverses the order of the array and returns the observableArray (not the underlying array).
    */
  def reverse(): KnockoutObservableArray[T] = js.native
  /**
    * Removes the first value from the array and returns it.
    */
  def shift(): T = js.native
  /**
    * Sorts the array contents and returns the observableArray.
    */
  def sort(): KnockoutObservableArray[T] = js.native
  /**
    * Sorts the array contents and returns the observableArray.
    * @param compareFunction A function that returns negative value if first argument is smaller, positive value if second is smaller, or zero to treat them as equal.
    */
  def sort(compareFunction: js.Function2[/* left */ T, /* right */ T, scala.Double]): KnockoutObservableArray[T] = js.native
  /**
    * Removes and returns all the remaining elements starting from a given index.
    * @param start The zero-based location in the array from which to start removing elements.
    */
  def splice(start: scala.Double): js.Array[T] = js.native
  /**
    * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
    * @param start The zero-based location in the array from which to start removing elements.
    * @param deleteCount The number of elements to remove.
    * @param items Elements to insert into the array in place of the deleted elements.
    */
  def splice(start: scala.Double, deleteCount: scala.Double, items: T*): js.Array[T] = js.native
  /**
    * Inserts new item or items at the beginning of the array.
    * @param items Items to be added.
    */
  def unshift(items: T*): scala.Double = js.native
}

