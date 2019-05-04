package typings
package atJupyterlabObservablesLib.libUndoablelistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atJupyterlabObservablesLib.libUndoablelistMod.IObservableUndoableList because var conflicts: length. Inlined canRedo, canUndo, beginCompoundOperation, beginCompoundOperation, endCompoundOperation, undo, redo, clearUndo */ @JSImport("@jupyterlab/observables/lib/undoablelist", "ObservableUndoableList")
@js.native
class ObservableUndoableList[T] protected ()
  extends atJupyterlabObservablesLib.libObservablelistMod.ObservableList[T] {
  /**
    * Construct a new undoable observable list.
    */
  def this(serializer: ISerializer[T]) = this()
  /**
    * Copy a change as JSON.
    */
  var _copyChange: js.Any = js.native
  var _inCompound: js.Any = js.native
  var _index: js.Any = js.native
  var _isUndoable: js.Any = js.native
  var _madeCompoundChange: js.Any = js.native
  /**
    * Handle a change in the list.
    */
  var _onListChanged: js.Any = js.native
  /**
    * Redo a change event.
    */
  var _redoChange: js.Any = js.native
  var _serializer: js.Any = js.native
  var _stack: js.Any = js.native
  /**
    * Undo a change event.
    */
  var _undoChange: js.Any = js.native
  /**
    * Whether the object can redo changes.
    */
  val canRedo: scala.Boolean = js.native
  /**
    * Whether the object can undo changes.
    */
  val canUndo: scala.Boolean = js.native
  /**
    * Begin a compound operation.
    *
    * @param isUndoAble - Whether the operation is undoable.
    *   The default is `true`.
    */
  /**
    * Begin a compound operation.
    *
    * @param isUndoAble - Whether the operation is undoable.
    *   The default is `false`.
    */
  def beginCompoundOperation(): scala.Unit = js.native
  def beginCompoundOperation(isUndoAble: scala.Boolean): scala.Unit = js.native
  /**
    * Clear the change stack.
    */
  def clearUndo(): scala.Unit = js.native
  /**
    * End a compound operation.
    */
  def endCompoundOperation(): scala.Unit = js.native
  /**
    * Redo an operation.
    */
  def redo(): scala.Unit = js.native
  /**
    * Undo an operation.
    */
  def undo(): scala.Unit = js.native
}

