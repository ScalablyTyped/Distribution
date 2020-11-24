package typings.handsontable.mod.Handsontable.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UndoRedoSnapshot extends js.Object {
  
  def destroy(): Unit = js.native
  
  def restore(): Unit = js.native
  
  def save(axis: String, index: Double, amount: Double): Unit = js.native
  
  var sheet: Sheet = js.native
  
  var stack: Stack = js.native
}
object UndoRedoSnapshot {
  
  @scala.inline
  def apply(
    destroy: () => Unit,
    restore: () => Unit,
    save: (String, Double, Double) => Unit,
    sheet: Sheet,
    stack: Stack
  ): UndoRedoSnapshot = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), restore = js.Any.fromFunction0(restore), save = js.Any.fromFunction3(save), sheet = sheet.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[UndoRedoSnapshot]
  }
  
  @scala.inline
  implicit class UndoRedoSnapshotOps[Self <: UndoRedoSnapshot] (val x: Self) extends AnyVal {
    
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
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRestore(value: () => Unit): Self = this.set("restore", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSave(value: (String, Double, Double) => Unit): Self = this.set("save", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSheet(value: Sheet): Self = this.set("sheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStack(value: Stack): Self = this.set("stack", value.asInstanceOf[js.Any])
  }
}
