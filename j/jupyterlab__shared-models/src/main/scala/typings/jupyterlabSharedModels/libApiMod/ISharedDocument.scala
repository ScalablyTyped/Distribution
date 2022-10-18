package typings.jupyterlabSharedModels.libApiMod

import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISharedDocument
  extends StObject
     with ISharedBase {
  
  /**
    * The changed signal.
    */
  val changed: ISignal[this.type, DocumentChange]
  
  /**
    * Whether the document is saved to disk or not.
    */
  val dirty: Boolean
}
object ISharedDocument {
  
  inline def apply(
    canRedo: () => Boolean,
    canUndo: () => Boolean,
    changed: ISignal[ISharedDocument, DocumentChange],
    clearUndoHistory: () => Unit,
    dirty: Boolean,
    dispose: () => Unit,
    isDisposed: Boolean,
    redo: () => Unit,
    transact: js.Function0[Unit] => Unit,
    undo: () => Unit
  ): ISharedDocument = {
    val __obj = js.Dynamic.literal(canRedo = js.Any.fromFunction0(canRedo), canUndo = js.Any.fromFunction0(canUndo), changed = changed.asInstanceOf[js.Any], clearUndoHistory = js.Any.fromFunction0(clearUndoHistory), dirty = dirty.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed.asInstanceOf[js.Any], redo = js.Any.fromFunction0(redo), transact = js.Any.fromFunction1(transact), undo = js.Any.fromFunction0(undo))
    __obj.asInstanceOf[ISharedDocument]
  }
  
  extension [Self <: ISharedDocument](x: Self) {
    
    inline def setChanged(value: ISignal[ISharedDocument, DocumentChange]): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
    
    inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
  }
}
