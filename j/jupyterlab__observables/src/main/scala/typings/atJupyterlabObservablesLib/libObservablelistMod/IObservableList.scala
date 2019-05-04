package typings
package atJupyterlabObservablesLib.libObservablelistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObservableList[T]
  extends atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable {
  /**
    * A signal emitted when the list has changed.
    */
  val changed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
    this.type, 
    atJupyterlabObservablesLib.libObservablelistMod.IObservableListNs.IChangedArgs[T]
  ]
  /**
    * The length of the list.
    *
    * #### Notes
    * This is a read-only property.
    */
  var length: scala.Double
  /**
    * The type of this object.
    */
  val `type`: atJupyterlabObservablesLib.atJupyterlabObservablesLibStrings.List
  /**
    * Remove all values from the list.
    *
    * #### Complexity
    * Linear.
    *
    * #### Iterator Validity
    * All current iterators are invalidated.
    */
  def clear(): scala.Unit
  /**
    * Get the value at the specified index.
    *
    * @param index - The positive integer index of interest.
    *
    * @returns The value at the specified index.
    *
    * #### Undefined Behavior
    * An `index` which is non-integral or out of range.
    */
  def get(index: scala.Double): js.UndefOr[T]
  /**
    * Insert a value into the list at a specific index.
    *
    * @param index - The index at which to insert the value.
    *
    * @param value - The value to set at the specified index.
    *
    * #### Complexity
    * Linear.
    *
    * #### Iterator Validity
    * No changes.
    *
    * #### Notes
    * The `index` will be clamped to the bounds of the list.
    *
    * #### Undefined Behavior
    * An `index` which is non-integral.
    */
  def insert(index: scala.Double, value: T): scala.Unit
  /**
    * Insert a set of items into the list at the specified index.
    *
    * @param index - The index at which to insert the values.
    *
    * @param values - The values to insert at the specified index.
    *
    * #### Complexity.
    * Linear.
    *
    * #### Iterator Validity
    * No changes.
    *
    * #### Notes
    * The `index` will be clamped to the bounds of the list.
    *
    * #### Undefined Behavior.
    * An `index` which is non-integral.
    */
  def insertAll(index: scala.Double, values: atPhosphorAlgorithmLib.libIterMod.IterableOrArrayLike[T]): scala.Unit
  /**
    * Create an iterator over the values in the list.
    *
    * @returns A new iterator starting at the front of the list.
    *
    * #### Complexity
    * Constant.
    *
    * #### Iterator Validity
    * No changes.
    */
  def iter(): atPhosphorAlgorithmLib.libIterMod.IIterator[T]
  /**
    * Move a value from one index to another.
    *
    * @parm fromIndex - The index of the element to move.
    *
    * @param toIndex - The index to move the element to.
    *
    * #### Complexity
    * Constant.
    *
    * #### Iterator Validity
    * Iterators pointing at the lesser of the `fromIndex` and the `toIndex`
    * and beyond are invalidated.
    *
    * #### Undefined Behavior
    * A `fromIndex` or a `toIndex` which is non-integral.
    */
  def move(fromIndex: scala.Double, toIndex: scala.Double): scala.Unit
  /**
    * Add a value to the back of the list.
    *
    * @param value - The value to add to the back of the list.
    *
    * @returns The new length of the list.
    *
    * #### Complexity
    * Constant.
    *
    * #### Iterator Validity
    * No changes.
    */
  def push(value: T): scala.Double
  /**
    * Push a set of values to the back of the list.
    *
    * @param values - An iterable or array-like set of values to add.
    *
    * @returns The new length of the list.
    *
    * #### Complexity
    * Linear.
    *
    * #### Iterator Validity
    * No changes.
    */
  def pushAll(values: atPhosphorAlgorithmLib.libIterMod.IterableOrArrayLike[T]): scala.Double
  /**
    * Remove and return the value at a specific index.
    *
    * @param index - The index of the value of interest.
    *
    * @returns The value at the specified index, or `undefined` if the
    *   index is out of range.
    *
    * #### Complexity
    * Constant.
    *
    * #### Iterator Validity
    * Iterators pointing at the removed value and beyond are invalidated.
    *
    * #### Undefined Behavior
    * An `index` which is non-integral.
    */
  def remove(index: scala.Double): js.UndefOr[T]
  /**
    * Remove a range of items from the list.
    *
    * @param startIndex - The start index of the range to remove (inclusive).
    *
    * @param endIndex - The end index of the range to remove (exclusive).
    *
    * @returns The new length of the list.
    *
    * #### Complexity
    * Linear.
    *
    * #### Iterator Validity
    * Iterators pointing to the first removed value and beyond are invalid.
    *
    * #### Undefined Behavior
    * A `startIndex` or `endIndex` which is non-integral.
    */
  def removeRange(startIndex: scala.Double, endIndex: scala.Double): scala.Double
  /**
    * Remove the first occurrence of a value from the list.
    *
    * @param value - The value of interest.
    *
    * @returns The index of the removed value, or `-1` if the value
    *   is not contained in the list.
    *
    * #### Complexity
    * Linear.
    *
    * #### Iterator Validity
    * Iterators pointing at the removed value and beyond are invalidated.
    */
  def removeValue(value: T): scala.Double
  /**
    * Set the value at the specified index.
    *
    * @param index - The positive integer index of interest.
    *
    * @param value - The value to set at the specified index.
    *
    * #### Complexity
    * Constant.
    *
    * #### Iterator Validity
    * No changes.
    *
    * #### Undefined Behavior
    * An `index` which is non-integral or out of range.
    */
  def set(index: scala.Double, value: T): scala.Unit
}

object IObservableList {
  @scala.inline
  def apply[T](
    changed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
      IObservableList[T], 
      atJupyterlabObservablesLib.libObservablelistMod.IObservableListNs.IChangedArgs[T]
    ],
    clear: () => scala.Unit,
    dispose: () => scala.Unit,
    get: scala.Double => js.UndefOr[T],
    insert: (scala.Double, T) => scala.Unit,
    insertAll: (scala.Double, atPhosphorAlgorithmLib.libIterMod.IterableOrArrayLike[T]) => scala.Unit,
    isDisposed: scala.Boolean,
    iter: () => atPhosphorAlgorithmLib.libIterMod.IIterator[T],
    length: scala.Double,
    move: (scala.Double, scala.Double) => scala.Unit,
    push: T => scala.Double,
    pushAll: atPhosphorAlgorithmLib.libIterMod.IterableOrArrayLike[T] => scala.Double,
    remove: scala.Double => js.UndefOr[T],
    removeRange: (scala.Double, scala.Double) => scala.Double,
    removeValue: T => scala.Double,
    set: (scala.Double, T) => scala.Unit,
    `type`: atJupyterlabObservablesLib.atJupyterlabObservablesLibStrings.List
  ): IObservableList[T] = {
    val __obj = js.Dynamic.literal(changed = changed, clear = js.Any.fromFunction0(clear), dispose = js.Any.fromFunction0(dispose), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction2(insert), insertAll = js.Any.fromFunction2(insertAll), isDisposed = isDisposed, iter = js.Any.fromFunction0(iter), length = length, move = js.Any.fromFunction2(move), push = js.Any.fromFunction1(push), pushAll = js.Any.fromFunction1(pushAll), remove = js.Any.fromFunction1(remove), removeRange = js.Any.fromFunction2(removeRange), removeValue = js.Any.fromFunction1(removeValue), set = js.Any.fromFunction2(set))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IObservableList[T]]
  }
}

