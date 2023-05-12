package typings.jupyterYdoc.libApiMod

import typings.luminoDisposable.mod.IObservableDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISharedBase
  extends StObject
     with IObservableDisposable {
  
  /**
    * Whether the object can undo changes.
    */
  def canRedo(): Boolean = js.native
  
  /**
    * Whether the object can redo changes.
    */
  def canUndo(): Boolean = js.native
  
  /**
    * Clear the change stack.
    */
  def clearUndoHistory(): Unit = js.native
  
  /**
    * Redo an operation.
    */
  def redo(): Unit = js.native
  
  /**
    * Perform a transaction. While the function f is called, all changes to the shared
    * document are bundled into a single event.
    *
    * @param f Transaction to execute
    * @param undoable Whether to track the change in the action history or not (default `true`)
    */
  def transact(f: js.Function0[Unit]): Unit = js.native
  def transact(f: js.Function0[Unit], undoable: Boolean): Unit = js.native
  
  /**
    * Undo an operation.
    */
  def undo(): Unit = js.native
}
