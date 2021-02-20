package typings.handsontable.mod.Handsontable.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UndoRedoSnapshot extends StObject {
  
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
  implicit class UndoRedoSnapshotMutableBuilder[Self <: UndoRedoSnapshot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRestore(value: () => Unit): Self = StObject.set(x, "restore", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSave(value: (String, Double, Double) => Unit): Self = StObject.set(x, "save", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSheet(value: Sheet): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStack(value: Stack): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
  }
}
