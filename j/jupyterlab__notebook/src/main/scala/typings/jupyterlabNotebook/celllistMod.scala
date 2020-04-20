package typings.jupyterlabNotebook

import typings.jupyterlabCells.modelMod.ICellModel
import typings.jupyterlabNotebook.modelMod.NotebookModel.IContentFactory
import typings.jupyterlabObservables.jupyterlabObservablesStrings.List
import typings.jupyterlabObservables.modeldbMod.IModelDB
import typings.jupyterlabObservables.observablelistMod.IObservableList.IChangedArgs
import typings.jupyterlabObservables.undoablelistMod.IObservableUndoableList
import typings.luminoAlgorithm.iterMod.IIterator
import typings.luminoAlgorithm.iterMod.IterableOrArrayLike
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook/lib/celllist", JSImport.Namespace)
@js.native
object celllistMod extends js.Object {
  @js.native
  class CellList protected () extends IObservableUndoableList[ICellModel] {
    /**
      * Construct the cell list.
      */
    def this(modelDB: IModelDB, factory: IContentFactory) = this()
    var _cellMap: js.Any = js.native
    var _cellOrder: js.Any = js.native
    var _changed: js.Any = js.native
    var _factory: js.Any = js.native
    var _isDisposed: js.Any = js.native
    var _onOrderChanged: js.Any = js.native
    /**
      * A signal emitted when the list has changed.
      */
    /* CompleteClass */
    override val changed: ISignal[this.type, IChangedArgs[ICellModel]] = js.native
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * The length of the list.
      *
      * #### Notes
      * This is a read-only property.
      */
    /* CompleteClass */
    override var length: Double = js.native
    /**
      * The type of this object.
      */
    /* CompleteClass */
    override val `type`: List = js.native
    @JSName("type")
    var type_CellList: typings.jupyterlabNotebook.jupyterlabNotebookStrings.List = js.native
    /**
      * Whether the object can redo changes.
      */
    @JSName("canRedo")
    def canRedo_MCellList: Boolean = js.native
    /**
      * Whether the object can undo changes.
      */
    @JSName("canUndo")
    def canUndo_MCellList: Boolean = js.native
    /**
      * A signal emitted when the cell list has changed.
      */
    @JSName("changed")
    def changed_MCellList: ISignal[this.type, IChangedArgs[ICellModel]] = js.native
    /**
      * Remove all values from the list.
      *
      * #### Complexity
      * Linear.
      *
      * #### Iterator Validity
      * All current iterators are invalidated.
      */
    /* CompleteClass */
    override def clear(): Unit = js.native
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
      * Get the value at the specified index.
      *
      * @param index - The positive integer index of interest.
      *
      * @returns The value at the specified index.
      *
      * #### Undefined Behavior
      * An `index` which is non-integral or out of range.
      */
    /* CompleteClass */
    override def get(index: Double): ICellModel = js.native
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
    /* CompleteClass */
    override def insert(index: Double, value: ICellModel): Unit = js.native
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
    /* CompleteClass */
    override def insertAll(index: Double, values: IterableOrArrayLike[ICellModel]): Unit = js.native
    /**
      * Test whether the cell list has been disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MCellList: Boolean = js.native
    /**
      * Test whether the list is empty.
      *
      * @returns `true` if the cell list is empty, `false` otherwise.
      *
      * #### Notes
      * This is a read-only property.
      *
      * #### Complexity
      * Constant.
      *
      * #### Iterator Validity
      * No changes.
      */
    def isEmpty: Boolean = js.native
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
    /* CompleteClass */
    override def iter(): IIterator[ICellModel] = js.native
    /**
      * Get the length of the cell list.
      *
      * @return The number of cells in the cell list.
      *
      * #### Notes
      * This is a read-only property.
      *
      * #### Complexity
      * Constant.
      *
      * #### Iterator Validity
      * No changes.
      */
    @JSName("length")
    def length_MCellList: Double = js.native
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
    /* CompleteClass */
    override def move(fromIndex: Double, toIndex: Double): Unit = js.native
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
    /* CompleteClass */
    override def push(value: ICellModel): Double = js.native
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
    /* CompleteClass */
    override def pushAll(values: IterableOrArrayLike[ICellModel]): Double = js.native
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
    /* CompleteClass */
    override def remove(index: Double): js.UndefOr[ICellModel] = js.native
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
    /* CompleteClass */
    override def removeRange(startIndex: Double, endIndex: Double): Double = js.native
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
    /* CompleteClass */
    override def removeValue(value: ICellModel): Double = js.native
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
    /* CompleteClass */
    override def set(index: Double, value: ICellModel): Unit = js.native
  }
  
}

