package typings.igniteUi.Infragistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorProviderDate extends StObject {
  
  def createEditor(
    callbacks: js.Object,
    key: js.Object,
    editorOptions: js.Object,
    tabIndex: js.Object,
    format: js.Object,
    element: js.Object,
    offset: js.Object
  ): Unit
  
  def destroy(): Unit
  
  def isValid(): Unit
  
  def refreshValue(): Unit
  
  def removeFromParent(): Unit
  
  def setFocus(): Unit
  
  def setSize(width: js.Object, height: js.Object): Unit
  
  def setValue(value: js.Object, fe: js.Object, newOffset: js.Object): Unit
  
  def textChanged(evt: js.Object, ui: js.Object): Unit
  
  def validator(): Unit
}
object EditorProviderDate {
  
  @scala.inline
  def apply(
    createEditor: (js.Object, js.Object, js.Object, js.Object, js.Object, js.Object, js.Object) => Unit,
    destroy: () => Unit,
    isValid: () => Unit,
    refreshValue: () => Unit,
    removeFromParent: () => Unit,
    setFocus: () => Unit,
    setSize: (js.Object, js.Object) => Unit,
    setValue: (js.Object, js.Object, js.Object) => Unit,
    textChanged: (js.Object, js.Object) => Unit,
    validator: () => Unit
  ): EditorProviderDate = {
    val __obj = js.Dynamic.literal(createEditor = js.Any.fromFunction7(createEditor), destroy = js.Any.fromFunction0(destroy), isValid = js.Any.fromFunction0(isValid), refreshValue = js.Any.fromFunction0(refreshValue), removeFromParent = js.Any.fromFunction0(removeFromParent), setFocus = js.Any.fromFunction0(setFocus), setSize = js.Any.fromFunction2(setSize), setValue = js.Any.fromFunction3(setValue), textChanged = js.Any.fromFunction2(textChanged), validator = js.Any.fromFunction0(validator))
    __obj.asInstanceOf[EditorProviderDate]
  }
  
  @scala.inline
  implicit class EditorProviderDateMutableBuilder[Self <: EditorProviderDate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateEditor(value: (js.Object, js.Object, js.Object, js.Object, js.Object, js.Object, js.Object) => Unit): Self = StObject.set(x, "createEditor", js.Any.fromFunction7(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsValid(value: () => Unit): Self = StObject.set(x, "isValid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRefreshValue(value: () => Unit): Self = StObject.set(x, "refreshValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveFromParent(value: () => Unit): Self = StObject.set(x, "removeFromParent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetFocus(value: () => Unit): Self = StObject.set(x, "setFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetSize(value: (js.Object, js.Object) => Unit): Self = StObject.set(x, "setSize", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetValue(value: (js.Object, js.Object, js.Object) => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTextChanged(value: (js.Object, js.Object) => Unit): Self = StObject.set(x, "textChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValidator(value: () => Unit): Self = StObject.set(x, "validator", js.Any.fromFunction0(value))
  }
}
