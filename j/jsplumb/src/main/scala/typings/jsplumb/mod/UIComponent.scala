package typings.jsplumb.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIComponent extends StObject {
  
  def getParameter(name: String): js.Any
  
  def getParameters(): Record[String, js.Any]
  
  def setParameter(name: String, value: js.Any): Unit
  
  def setParameters(parameters: Record[String, js.Any]): Unit
}
object UIComponent {
  
  @scala.inline
  def apply(
    getParameter: String => js.Any,
    getParameters: () => Record[String, js.Any],
    setParameter: (String, js.Any) => Unit,
    setParameters: Record[String, js.Any] => Unit
  ): UIComponent = {
    val __obj = js.Dynamic.literal(getParameter = js.Any.fromFunction1(getParameter), getParameters = js.Any.fromFunction0(getParameters), setParameter = js.Any.fromFunction2(setParameter), setParameters = js.Any.fromFunction1(setParameters))
    __obj.asInstanceOf[UIComponent]
  }
  
  @scala.inline
  implicit class UIComponentMutableBuilder[Self <: UIComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetParameter(value: String => js.Any): Self = StObject.set(x, "getParameter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetParameters(value: () => Record[String, js.Any]): Self = StObject.set(x, "getParameters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetParameter(value: (String, js.Any) => Unit): Self = StObject.set(x, "setParameter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetParameters(value: Record[String, js.Any] => Unit): Self = StObject.set(x, "setParameters", js.Any.fromFunction1(value))
  }
}
