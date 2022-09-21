package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashActionsPanel extends StObject {
  
  def getClassForObject(): Any
  
  def getScriptAssistMode(): Any
  
  def getSelectedText(): Any
  
  def getText(): Any
  
  def hasSelection(): Any
  
  def replaceSelectedText(): Any
  
  def setScriptAssistMode(): Any
  
  def setSelection(): Any
  
  def setText(): Any
}
object FlashActionsPanel {
  
  inline def apply(
    getClassForObject: () => Any,
    getScriptAssistMode: () => Any,
    getSelectedText: () => Any,
    getText: () => Any,
    hasSelection: () => Any,
    replaceSelectedText: () => Any,
    setScriptAssistMode: () => Any,
    setSelection: () => Any,
    setText: () => Any
  ): FlashActionsPanel = {
    val __obj = js.Dynamic.literal(getClassForObject = js.Any.fromFunction0(getClassForObject), getScriptAssistMode = js.Any.fromFunction0(getScriptAssistMode), getSelectedText = js.Any.fromFunction0(getSelectedText), getText = js.Any.fromFunction0(getText), hasSelection = js.Any.fromFunction0(hasSelection), replaceSelectedText = js.Any.fromFunction0(replaceSelectedText), setScriptAssistMode = js.Any.fromFunction0(setScriptAssistMode), setSelection = js.Any.fromFunction0(setSelection), setText = js.Any.fromFunction0(setText))
    __obj.asInstanceOf[FlashActionsPanel]
  }
  
  extension [Self <: FlashActionsPanel](x: Self) {
    
    inline def setGetClassForObject(value: () => Any): Self = StObject.set(x, "getClassForObject", js.Any.fromFunction0(value))
    
    inline def setGetScriptAssistMode(value: () => Any): Self = StObject.set(x, "getScriptAssistMode", js.Any.fromFunction0(value))
    
    inline def setGetSelectedText(value: () => Any): Self = StObject.set(x, "getSelectedText", js.Any.fromFunction0(value))
    
    inline def setGetText(value: () => Any): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
    
    inline def setHasSelection(value: () => Any): Self = StObject.set(x, "hasSelection", js.Any.fromFunction0(value))
    
    inline def setReplaceSelectedText(value: () => Any): Self = StObject.set(x, "replaceSelectedText", js.Any.fromFunction0(value))
    
    inline def setSetScriptAssistMode(value: () => Any): Self = StObject.set(x, "setScriptAssistMode", js.Any.fromFunction0(value))
    
    inline def setSetSelection(value: () => Any): Self = StObject.set(x, "setSelection", js.Any.fromFunction0(value))
    
    inline def setSetText(value: () => Any): Self = StObject.set(x, "setText", js.Any.fromFunction0(value))
  }
}
