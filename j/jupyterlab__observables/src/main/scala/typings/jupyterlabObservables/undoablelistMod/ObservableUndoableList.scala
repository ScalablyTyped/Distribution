package typings.jupyterlabObservables.undoablelistMod

import typings.jupyterlabObservables.observablelistMod.ObservableList
import typings.luminoCoreutils.jsonMod.JSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.luminoDisposable.mod.IDisposable because Already inherited
- typings.jupyterlabObservables.observablelistMod.IObservableList because Already inherited
- typings.jupyterlabObservables.undoablelistMod.IObservableUndoableList because var conflicts: changed, isDisposed, length, `type`. Inlined canRedo, canUndo, beginCompoundOperation, beginCompoundOperation, endCompoundOperation, undo, redo, clearUndo */ @JSImport("@jupyterlab/observables/lib/undoablelist", "ObservableUndoableList")
@js.native
class ObservableUndoableList[T] protected () extends ObservableList[T] {
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
  @JSName("canRedo")
  val canRedo_FObservableUndoableList: Boolean = js.native
  /**
    * Whether the object can undo changes.
    */
  @JSName("canUndo")
  val canUndo_FObservableUndoableList: Boolean = js.native
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
  def beginCompoundOperation(): Unit = js.native
  def beginCompoundOperation(isUndoAble: Boolean): Unit = js.native
  /**
    * Whether the object can redo changes.
    */
  def canRedo: Boolean = js.native
  /**
    * Whether the object can undo changes.
    */
  def canUndo: Boolean = js.native
  /**
    * Clear the change stack.
    */
  def clearUndo(): Unit = js.native
  /**
    * End a compound operation.
    */
  def endCompoundOperation(): Unit = js.native
  /**
    * Redo an operation.
    */
  def redo(): Unit = js.native
  /**
    * Undo an operation.
    */
  def undo(): Unit = js.native
}

@JSImport("@jupyterlab/observables/lib/undoablelist", "ObservableUndoableList")
@js.native
object ObservableUndoableList extends js.Object {
  /**
    * A default, identity serializer.
    */
  @js.native
  class IdentitySerializer[T /* <: JSONValue */] () extends ISerializer[T] {
    /**
      * Deserialize the object from JSON.
      */
    /* CompleteClass */
    override def fromJSON(value: JSONValue): T = js.native
    /**
      * Convert the object to JSON.
      */
    /* CompleteClass */
    override def toJSON(value: T): JSONValue = js.native
  }
  
}

