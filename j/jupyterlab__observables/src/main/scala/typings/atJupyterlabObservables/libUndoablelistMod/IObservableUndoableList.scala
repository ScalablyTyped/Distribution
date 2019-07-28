package typings.atJupyterlabObservables.libUndoablelistMod

import typings.atJupyterlabObservables.libObservablelistMod.IObservableList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObservableUndoableList[T] extends IObservableList[T] {
  /**
    * Whether the object can redo changes.
    */
  val canRedo: Boolean = js.native
  /**
    * Whether the object can undo changes.
    */
  val canUndo: Boolean = js.native
  /**
    * Begin a compound operation.
    *
    * @param isUndoAble - Whether the operation is undoable.
    *   The default is `false`.
    */
  def beginCompoundOperation(): Unit = js.native
  def beginCompoundOperation(isUndoAble: Boolean): Unit = js.native
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

