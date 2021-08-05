package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashXMLUI extends StObject {
  
  def accept(): js.Any
  
  def cancel(): js.Any
  
  def get(): js.Any
  
  def getControlItemElement(): js.Any
  
  def getEnabled(): js.Any
  
  def getVisible(): js.Any
  
  def set(): js.Any
  
  def setControItemElement(): js.Any
  
  def setControItemElements(): js.Any
  
  def setEnabled(): js.Any
  
  def setVisible(): js.Any
}
object FlashXMLUI {
  
  inline def apply(
    accept: () => js.Any,
    cancel: () => js.Any,
    get: () => js.Any,
    getControlItemElement: () => js.Any,
    getEnabled: () => js.Any,
    getVisible: () => js.Any,
    set: () => js.Any,
    setControItemElement: () => js.Any,
    setControItemElements: () => js.Any,
    setEnabled: () => js.Any,
    setVisible: () => js.Any
  ): FlashXMLUI = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction0(accept), cancel = js.Any.fromFunction0(cancel), get = js.Any.fromFunction0(get), getControlItemElement = js.Any.fromFunction0(getControlItemElement), getEnabled = js.Any.fromFunction0(getEnabled), getVisible = js.Any.fromFunction0(getVisible), set = js.Any.fromFunction0(set), setControItemElement = js.Any.fromFunction0(setControItemElement), setControItemElements = js.Any.fromFunction0(setControItemElements), setEnabled = js.Any.fromFunction0(setEnabled), setVisible = js.Any.fromFunction0(setVisible))
    __obj.asInstanceOf[FlashXMLUI]
  }
  
  extension [Self <: FlashXMLUI](x: Self) {
    
    inline def setAccept(value: () => js.Any): Self = StObject.set(x, "accept", js.Any.fromFunction0(value))
    
    inline def setCancel(value: () => js.Any): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    inline def setGet(value: () => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    inline def setGetControlItemElement(value: () => js.Any): Self = StObject.set(x, "getControlItemElement", js.Any.fromFunction0(value))
    
    inline def setGetEnabled(value: () => js.Any): Self = StObject.set(x, "getEnabled", js.Any.fromFunction0(value))
    
    inline def setGetVisible(value: () => js.Any): Self = StObject.set(x, "getVisible", js.Any.fromFunction0(value))
    
    inline def setSet(value: () => js.Any): Self = StObject.set(x, "set", js.Any.fromFunction0(value))
    
    inline def setSetControItemElement(value: () => js.Any): Self = StObject.set(x, "setControItemElement", js.Any.fromFunction0(value))
    
    inline def setSetControItemElements(value: () => js.Any): Self = StObject.set(x, "setControItemElements", js.Any.fromFunction0(value))
    
    inline def setSetEnabled(value: () => js.Any): Self = StObject.set(x, "setEnabled", js.Any.fromFunction0(value))
    
    inline def setSetVisible(value: () => js.Any): Self = StObject.set(x, "setVisible", js.Any.fromFunction0(value))
  }
}
