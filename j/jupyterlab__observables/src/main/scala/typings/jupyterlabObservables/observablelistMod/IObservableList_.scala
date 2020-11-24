package typings.jupyterlabObservables.observablelistMod

import typings.jupyterlabObservables.jupyterlabObservablesStrings.List
import typings.jupyterlabObservables.observablelistMod.IObservableList.IChangedArgs
import typings.luminoAlgorithm.iterMod.IIterator
import typings.luminoAlgorithm.iterMod.IterableOrArrayLike
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObservableList_[T] extends IDisposable {
  
  /**
    * A signal emitted when the list has changed.
    */
  val changed: ISignal[this.type, IChangedArgs[T]] = js.native
  
  /**
    * Remove all values from the list.
    *
    * #### Complexity
    * Linear.
    *
    * #### Iterator Validity
    * All current iterators are invalidated.
    */
  def clear(): Unit = js.native
  
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
  def get(index: Double): T = js.native
  
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
  def insert(index: Double, value: T): Unit = js.native
  
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
  def insertAll(index: Double, values: IterableOrArrayLike[T]): Unit = js.native
  
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
  def iter(): IIterator[T] = js.native
  
  /**
    * The length of the list.
    *
    * #### Notes
    * This is a read-only property.
    */
  var length: Double = js.native
  
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
  def move(fromIndex: Double, toIndex: Double): Unit = js.native
  
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
  def push(value: T): Double = js.native
  
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
  def pushAll(values: IterableOrArrayLike[T]): Double = js.native
  
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
  def remove(index: Double): js.UndefOr[T] = js.native
  
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
  def removeRange(startIndex: Double, endIndex: Double): Double = js.native
  
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
  def removeValue(value: T): Double = js.native
  
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
  def set(index: Double, value: T): Unit = js.native
  
  /**
    * The type of this object.
    */
  val `type`: List = js.native
}
object IObservableList_ {
  
  @scala.inline
  def apply[T](
    changed: ISignal[IObservableList_[T], IChangedArgs[T]],
    clear: () => Unit,
    dispose: () => Unit,
    get: Double => T,
    insert: (Double, T) => Unit,
    insertAll: (Double, IterableOrArrayLike[T]) => Unit,
    isDisposed: Boolean,
    iter: () => IIterator[T],
    length: Double,
    move: (Double, Double) => Unit,
    push: T => Double,
    pushAll: IterableOrArrayLike[T] => Double,
    remove: Double => js.UndefOr[T],
    removeRange: (Double, Double) => Double,
    removeValue: T => Double,
    set: (Double, T) => Unit,
    `type`: List
  ): IObservableList_[T] = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), dispose = js.Any.fromFunction0(dispose), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction2(insert), insertAll = js.Any.fromFunction2(insertAll), isDisposed = isDisposed.asInstanceOf[js.Any], iter = js.Any.fromFunction0(iter), length = length.asInstanceOf[js.Any], move = js.Any.fromFunction2(move), push = js.Any.fromFunction1(push), pushAll = js.Any.fromFunction1(pushAll), remove = js.Any.fromFunction1(remove), removeRange = js.Any.fromFunction2(removeRange), removeValue = js.Any.fromFunction1(removeValue), set = js.Any.fromFunction2(set))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObservableList_[T]]
  }
  
  @scala.inline
  implicit class IObservableList_Ops[Self <: IObservableList_[_], T] (val x: Self with IObservableList_[T]) extends AnyVal {
    
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
    def setChanged(value: ISignal[IObservableList_[T], IChangedArgs[T]]): Self = this.set("changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet(value: Double => T): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsert(value: (Double, T) => Unit): Self = this.set("insert", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsertAll(value: (Double, IterableOrArrayLike[T]) => Unit): Self = this.set("insertAll", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIter(value: () => IIterator[T]): Self = this.set("iter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMove(value: (Double, Double) => Unit): Self = this.set("move", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPush(value: T => Double): Self = this.set("push", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPushAll(value: IterableOrArrayLike[T] => Double): Self = this.set("pushAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: Double => js.UndefOr[T]): Self = this.set("remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveRange(value: (Double, Double) => Double): Self = this.set("removeRange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveValue(value: T => Double): Self = this.set("removeValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (Double, T) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setType(value: List): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
