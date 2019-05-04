package typings
package atJupyterlabObservablesLib.libUndoablelistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObservableUndoableList[T]
  extends atJupyterlabObservablesLib.libObservablelistMod.IObservableList[T] {
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

