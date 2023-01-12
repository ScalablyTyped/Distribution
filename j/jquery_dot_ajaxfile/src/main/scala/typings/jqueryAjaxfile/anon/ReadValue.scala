package typings.jqueryAjaxfile.anon

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadValue extends StObject {
  
  def readValue(element: HTMLElement): Any
  
  def writeValue(element: HTMLElement, value: Any): Unit
}
object ReadValue {
  
  inline def apply(readValue: HTMLElement => Any, writeValue: (HTMLElement, Any) => Unit): ReadValue = {
    val __obj = js.Dynamic.literal(readValue = js.Any.fromFunction1(readValue), writeValue = js.Any.fromFunction2(writeValue))
    __obj.asInstanceOf[ReadValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadValue] (val x: Self) extends AnyVal {
    
    inline def setReadValue(value: HTMLElement => Any): Self = StObject.set(x, "readValue", js.Any.fromFunction1(value))
    
    inline def setWriteValue(value: (HTMLElement, Any) => Unit): Self = StObject.set(x, "writeValue", js.Any.fromFunction2(value))
  }
}
