package typings.jsplumb.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIComponent extends StObject {
  
  def getParameter(name: String): Any
  
  def getParameters(): Record[String, Any]
  
  def setParameter(name: String, value: Any): Unit
  
  def setParameters(parameters: Record[String, Any]): Unit
}
object UIComponent {
  
  inline def apply(
    getParameter: String => Any,
    getParameters: () => Record[String, Any],
    setParameter: (String, Any) => Unit,
    setParameters: Record[String, Any] => Unit
  ): UIComponent = {
    val __obj = js.Dynamic.literal(getParameter = js.Any.fromFunction1(getParameter), getParameters = js.Any.fromFunction0(getParameters), setParameter = js.Any.fromFunction2(setParameter), setParameters = js.Any.fromFunction1(setParameters))
    __obj.asInstanceOf[UIComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UIComponent] (val x: Self) extends AnyVal {
    
    inline def setGetParameter(value: String => Any): Self = StObject.set(x, "getParameter", js.Any.fromFunction1(value))
    
    inline def setGetParameters(value: () => Record[String, Any]): Self = StObject.set(x, "getParameters", js.Any.fromFunction0(value))
    
    inline def setSetParameter(value: (String, Any) => Unit): Self = StObject.set(x, "setParameter", js.Any.fromFunction2(value))
    
    inline def setSetParameters(value: Record[String, Any] => Unit): Self = StObject.set(x, "setParameters", js.Any.fromFunction1(value))
  }
}
