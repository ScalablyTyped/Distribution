package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashXMLUI extends StObject {
  
  def accept(): Any
  
  def cancel(): Any
  
  def get(): Any
  
  def getControlItemElement(): Any
  
  def getEnabled(): Any
  
  def getVisible(): Any
  
  def set(): Any
  
  def setControItemElement(): Any
  
  def setControItemElements(): Any
  
  def setEnabled(): Any
  
  def setVisible(): Any
}
object FlashXMLUI {
  
  inline def apply(
    accept: () => Any,
    cancel: () => Any,
    get: () => Any,
    getControlItemElement: () => Any,
    getEnabled: () => Any,
    getVisible: () => Any,
    set: () => Any,
    setControItemElement: () => Any,
    setControItemElements: () => Any,
    setEnabled: () => Any,
    setVisible: () => Any
  ): FlashXMLUI = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction0(accept), cancel = js.Any.fromFunction0(cancel), get = js.Any.fromFunction0(get), getControlItemElement = js.Any.fromFunction0(getControlItemElement), getEnabled = js.Any.fromFunction0(getEnabled), getVisible = js.Any.fromFunction0(getVisible), set = js.Any.fromFunction0(set), setControItemElement = js.Any.fromFunction0(setControItemElement), setControItemElements = js.Any.fromFunction0(setControItemElements), setEnabled = js.Any.fromFunction0(setEnabled), setVisible = js.Any.fromFunction0(setVisible))
    __obj.asInstanceOf[FlashXMLUI]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlashXMLUI] (val x: Self) extends AnyVal {
    
    inline def setAccept(value: () => Any): Self = StObject.set(x, "accept", js.Any.fromFunction0(value))
    
    inline def setCancel(value: () => Any): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    inline def setGet(value: () => Any): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    inline def setGetControlItemElement(value: () => Any): Self = StObject.set(x, "getControlItemElement", js.Any.fromFunction0(value))
    
    inline def setGetEnabled(value: () => Any): Self = StObject.set(x, "getEnabled", js.Any.fromFunction0(value))
    
    inline def setGetVisible(value: () => Any): Self = StObject.set(x, "getVisible", js.Any.fromFunction0(value))
    
    inline def setSet(value: () => Any): Self = StObject.set(x, "set", js.Any.fromFunction0(value))
    
    inline def setSetControItemElement(value: () => Any): Self = StObject.set(x, "setControItemElement", js.Any.fromFunction0(value))
    
    inline def setSetControItemElements(value: () => Any): Self = StObject.set(x, "setControItemElements", js.Any.fromFunction0(value))
    
    inline def setSetEnabled(value: () => Any): Self = StObject.set(x, "setEnabled", js.Any.fromFunction0(value))
    
    inline def setSetVisible(value: () => Any): Self = StObject.set(x, "setVisible", js.Any.fromFunction0(value))
  }
}
