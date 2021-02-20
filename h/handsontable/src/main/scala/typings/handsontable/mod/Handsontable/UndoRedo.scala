package typings.handsontable.mod.Handsontable

import typings.handsontable.mod.Handsontable.plugins.UndoRedoAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UndoRedo extends StObject {
  
  def clear(): Unit = js.native
  
  def done(action: UndoRedoAction): Unit = js.native
  
  var doneActions: js.Array[UndoRedoAction] = js.native
  
  var ignoreNewActions: Boolean = js.native
  
  var instance: typings.handsontable.mod.Handsontable = js.native
  
  def isRedoAvailable(): Boolean = js.native
  
  def isUndoAvailable(): Boolean = js.native
  
  def redo(): Unit = js.native
  
  def undo(): Unit = js.native
  
  var undoneActions: js.Array[UndoRedoAction] = js.native
}
object UndoRedo {
  
  @scala.inline
  def apply(
    clear: () => Unit,
    done: UndoRedoAction => Unit,
    doneActions: js.Array[UndoRedoAction],
    ignoreNewActions: Boolean,
    instance: typings.handsontable.mod.Handsontable,
    isRedoAvailable: () => Boolean,
    isUndoAvailable: () => Boolean,
    redo: () => Unit,
    undo: () => Unit,
    undoneActions: js.Array[UndoRedoAction]
  ): UndoRedo = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), done = js.Any.fromFunction1(done), doneActions = doneActions.asInstanceOf[js.Any], ignoreNewActions = ignoreNewActions.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], isRedoAvailable = js.Any.fromFunction0(isRedoAvailable), isUndoAvailable = js.Any.fromFunction0(isUndoAvailable), redo = js.Any.fromFunction0(redo), undo = js.Any.fromFunction0(undo), undoneActions = undoneActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[UndoRedo]
  }
  
  @scala.inline
  implicit class UndoRedoMutableBuilder[Self <: UndoRedo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDone(value: UndoRedoAction => Unit): Self = StObject.set(x, "done", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDoneActions(value: js.Array[UndoRedoAction]): Self = StObject.set(x, "doneActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoneActionsVarargs(value: UndoRedoAction*): Self = StObject.set(x, "doneActions", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreNewActions(value: Boolean): Self = StObject.set(x, "ignoreNewActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstance(value: typings.handsontable.mod.Handsontable): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRedoAvailable(value: () => Boolean): Self = StObject.set(x, "isRedoAvailable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsUndoAvailable(value: () => Boolean): Self = StObject.set(x, "isUndoAvailable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRedo(value: () => Unit): Self = StObject.set(x, "redo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUndo(value: () => Unit): Self = StObject.set(x, "undo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUndoneActions(value: js.Array[UndoRedoAction]): Self = StObject.set(x, "undoneActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndoneActionsVarargs(value: UndoRedoAction*): Self = StObject.set(x, "undoneActions", js.Array(value :_*))
  }
}
