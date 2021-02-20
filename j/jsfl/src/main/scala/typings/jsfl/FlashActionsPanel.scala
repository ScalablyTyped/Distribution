package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlashActionsPanel extends StObject {
  
  def getClassForObject(): js.Any = js.native
  
  def getScriptAssistMode(): js.Any = js.native
  
  def getSelectedText(): js.Any = js.native
  
  def getText(): js.Any = js.native
  
  def hasSelection(): js.Any = js.native
  
  def replaceSelectedText(): js.Any = js.native
  
  def setScriptAssistMode(): js.Any = js.native
  
  def setSelection(): js.Any = js.native
  
  def setText(): js.Any = js.native
}
object FlashActionsPanel {
  
  @scala.inline
  def apply(
    getClassForObject: () => js.Any,
    getScriptAssistMode: () => js.Any,
    getSelectedText: () => js.Any,
    getText: () => js.Any,
    hasSelection: () => js.Any,
    replaceSelectedText: () => js.Any,
    setScriptAssistMode: () => js.Any,
    setSelection: () => js.Any,
    setText: () => js.Any
  ): FlashActionsPanel = {
    val __obj = js.Dynamic.literal(getClassForObject = js.Any.fromFunction0(getClassForObject), getScriptAssistMode = js.Any.fromFunction0(getScriptAssistMode), getSelectedText = js.Any.fromFunction0(getSelectedText), getText = js.Any.fromFunction0(getText), hasSelection = js.Any.fromFunction0(hasSelection), replaceSelectedText = js.Any.fromFunction0(replaceSelectedText), setScriptAssistMode = js.Any.fromFunction0(setScriptAssistMode), setSelection = js.Any.fromFunction0(setSelection), setText = js.Any.fromFunction0(setText))
    __obj.asInstanceOf[FlashActionsPanel]
  }
  
  @scala.inline
  implicit class FlashActionsPanelMutableBuilder[Self <: FlashActionsPanel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetClassForObject(value: () => js.Any): Self = StObject.set(x, "getClassForObject", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScriptAssistMode(value: () => js.Any): Self = StObject.set(x, "getScriptAssistMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectedText(value: () => js.Any): Self = StObject.set(x, "getSelectedText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetText(value: () => js.Any): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasSelection(value: () => js.Any): Self = StObject.set(x, "hasSelection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReplaceSelectedText(value: () => js.Any): Self = StObject.set(x, "replaceSelectedText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetScriptAssistMode(value: () => js.Any): Self = StObject.set(x, "setScriptAssistMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetSelection(value: () => js.Any): Self = StObject.set(x, "setSelection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetText(value: () => js.Any): Self = StObject.set(x, "setText", js.Any.fromFunction0(value))
  }
}
