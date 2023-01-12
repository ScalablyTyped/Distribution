package typings.jqueryElang

import typings.jquery.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// interfaces for jQuery.fn.__plugin
trait IFnNewInstance extends StObject {
  
  def createInstance(el: HTMLElement, options: Any, pluginName: String): JQuery[HTMLElement]
}
object IFnNewInstance {
  
  inline def apply(createInstance: (HTMLElement, Any, String) => JQuery[HTMLElement]): IFnNewInstance = {
    val __obj = js.Dynamic.literal(createInstance = js.Any.fromFunction3(createInstance))
    __obj.asInstanceOf[IFnNewInstance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IFnNewInstance] (val x: Self) extends AnyVal {
    
    inline def setCreateInstance(value: (HTMLElement, Any, String) => JQuery[HTMLElement]): Self = StObject.set(x, "createInstance", js.Any.fromFunction3(value))
  }
}
