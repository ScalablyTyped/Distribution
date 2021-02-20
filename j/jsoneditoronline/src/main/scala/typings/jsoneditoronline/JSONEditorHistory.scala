package typings.jsoneditoronline

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSONEditorHistory extends StObject {
  
  def add(action: String, params: js.Object): Unit = js.native
  
  def canRedo(): Boolean = js.native
  
  def canUndo(): Boolean = js.native
  
  def clear(): Unit = js.native
  
  def onChange(): Unit = js.native
  
  def redo(): Unit = js.native
  
  def undo(): Unit = js.native
}
object JSONEditorHistory {
  
  @scala.inline
  def apply(
    add: (String, js.Object) => Unit,
    canRedo: () => Boolean,
    canUndo: () => Boolean,
    clear: () => Unit,
    onChange: () => Unit,
    redo: () => Unit,
    undo: () => Unit
  ): JSONEditorHistory = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), canRedo = js.Any.fromFunction0(canRedo), canUndo = js.Any.fromFunction0(canUndo), clear = js.Any.fromFunction0(clear), onChange = js.Any.fromFunction0(onChange), redo = js.Any.fromFunction0(redo), undo = js.Any.fromFunction0(undo))
    __obj.asInstanceOf[JSONEditorHistory]
  }
  
  @scala.inline
  implicit class JSONEditorHistoryMutableBuilder[Self <: JSONEditorHistory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (String, js.Object) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCanRedo(value: () => Boolean): Self = StObject.set(x, "canRedo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCanUndo(value: () => Boolean): Self = StObject.set(x, "canUndo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRedo(value: () => Unit): Self = StObject.set(x, "redo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUndo(value: () => Unit): Self = StObject.set(x, "undo", js.Any.fromFunction0(value))
  }
}
