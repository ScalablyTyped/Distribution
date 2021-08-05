package typings.jsoneditoronline

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSONEditorHistory extends StObject {
  
  def add(action: String, params: js.Object): Unit
  
  def canRedo(): Boolean
  
  def canUndo(): Boolean
  
  def clear(): Unit
  
  def onChange(): Unit
  
  def redo(): Unit
  
  def undo(): Unit
}
object JSONEditorHistory {
  
  inline def apply(
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
  
  extension [Self <: JSONEditorHistory](x: Self) {
    
    inline def setAdd(value: (String, js.Object) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setCanRedo(value: () => Boolean): Self = StObject.set(x, "canRedo", js.Any.fromFunction0(value))
    
    inline def setCanUndo(value: () => Boolean): Self = StObject.set(x, "canUndo", js.Any.fromFunction0(value))
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
    
    inline def setRedo(value: () => Unit): Self = StObject.set(x, "redo", js.Any.fromFunction0(value))
    
    inline def setUndo(value: () => Unit): Self = StObject.set(x, "undo", js.Any.fromFunction0(value))
  }
}
