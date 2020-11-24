package typings.handsontable.mod.Handsontable

import typings.handsontable.mod.Handsontable.plugins.UndoRedoAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UndoRedo extends js.Object {
  
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
  implicit class UndoRedoOps[Self <: UndoRedo] (val x: Self) extends AnyVal {
    
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
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDone(value: UndoRedoAction => Unit): Self = this.set("done", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDoneActionsVarargs(value: UndoRedoAction*): Self = this.set("doneActions", js.Array(value :_*))
    
    @scala.inline
    def setDoneActions(value: js.Array[UndoRedoAction]): Self = this.set("doneActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreNewActions(value: Boolean): Self = this.set("ignoreNewActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstance(value: typings.handsontable.mod.Handsontable): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRedoAvailable(value: () => Boolean): Self = this.set("isRedoAvailable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsUndoAvailable(value: () => Boolean): Self = this.set("isUndoAvailable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRedo(value: () => Unit): Self = this.set("redo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUndo(value: () => Unit): Self = this.set("undo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUndoneActionsVarargs(value: UndoRedoAction*): Self = this.set("undoneActions", js.Array(value :_*))
    
    @scala.inline
    def setUndoneActions(value: js.Array[UndoRedoAction]): Self = this.set("undoneActions", value.asInstanceOf[js.Any])
  }
}
