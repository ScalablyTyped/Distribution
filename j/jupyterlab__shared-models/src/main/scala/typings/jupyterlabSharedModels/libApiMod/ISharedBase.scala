package typings.jupyterlabSharedModels.libApiMod

import typings.luminoDisposable.mod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISharedBase
  extends StObject
     with IDisposable {
  
  /**
    * Whether the object can undo changes.
    */
  def canRedo(): Boolean
  
  /**
    * Whether the object can redo changes.
    */
  def canUndo(): Boolean
  
  /**
    * Clear the change stack.
    */
  def clearUndoHistory(): Unit
  
  /**
    * Redo an operation.
    */
  def redo(): Unit
  
  /**
    * Perform a transaction. While the function f is called, all changes to the shared
    * document are bundled into a single event.
    */
  def transact(f: js.Function0[Unit]): Unit
  
  /**
    * Undo an operation.
    */
  def undo(): Unit
}
object ISharedBase {
  
  inline def apply(
    canRedo: () => Boolean,
    canUndo: () => Boolean,
    clearUndoHistory: () => Unit,
    dispose: () => Unit,
    isDisposed: Boolean,
    redo: () => Unit,
    transact: js.Function0[Unit] => Unit,
    undo: () => Unit
  ): ISharedBase = {
    val __obj = js.Dynamic.literal(canRedo = js.Any.fromFunction0(canRedo), canUndo = js.Any.fromFunction0(canUndo), clearUndoHistory = js.Any.fromFunction0(clearUndoHistory), dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed.asInstanceOf[js.Any], redo = js.Any.fromFunction0(redo), transact = js.Any.fromFunction1(transact), undo = js.Any.fromFunction0(undo))
    __obj.asInstanceOf[ISharedBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISharedBase] (val x: Self) extends AnyVal {
    
    inline def setCanRedo(value: () => Boolean): Self = StObject.set(x, "canRedo", js.Any.fromFunction0(value))
    
    inline def setCanUndo(value: () => Boolean): Self = StObject.set(x, "canUndo", js.Any.fromFunction0(value))
    
    inline def setClearUndoHistory(value: () => Unit): Self = StObject.set(x, "clearUndoHistory", js.Any.fromFunction0(value))
    
    inline def setRedo(value: () => Unit): Self = StObject.set(x, "redo", js.Any.fromFunction0(value))
    
    inline def setTransact(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "transact", js.Any.fromFunction1(value))
    
    inline def setUndo(value: () => Unit): Self = StObject.set(x, "undo", js.Any.fromFunction0(value))
  }
}
