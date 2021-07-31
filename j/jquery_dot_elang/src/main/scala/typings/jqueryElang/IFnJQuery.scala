package typings.jqueryElang

import typings.jquery.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFnJQuery extends StObject {
  
  def fnPlugin(
    context: JQuery[HTMLElement],
    options: js.Any,
    command: String,
    pluginName: String,
    pluginDataAttribute: String
  ): JQuery[HTMLElement]
}
object IFnJQuery {
  
  @scala.inline
  def apply(fnPlugin: (JQuery[HTMLElement], js.Any, String, String, String) => JQuery[HTMLElement]): IFnJQuery = {
    val __obj = js.Dynamic.literal(fnPlugin = js.Any.fromFunction5(fnPlugin))
    __obj.asInstanceOf[IFnJQuery]
  }
  
  @scala.inline
  implicit class IFnJQueryMutableBuilder[Self <: IFnJQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFnPlugin(value: (JQuery[HTMLElement], js.Any, String, String, String) => JQuery[HTMLElement]): Self = StObject.set(x, "fnPlugin", js.Any.fromFunction5(value))
  }
}
