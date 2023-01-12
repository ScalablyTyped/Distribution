package typings.handlebars

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
* Implement this interface on your MVW/MVVM/MVC views such as Backbone.View
**/
trait HandlebarsTemplatable extends StObject {
  
  def template(context: Any): String
  def template(context: Any, options: typings.handlebars.Handlebars.RuntimeOptions): String
  @JSName("template")
  var template_Original: HandlebarsTemplateDelegate[Any]
}
object HandlebarsTemplatable {
  
  inline def apply(template: (Any, /* options */ js.UndefOr[typings.handlebars.Handlebars.RuntimeOptions]) => String): HandlebarsTemplatable = {
    val __obj = js.Dynamic.literal(template = js.Any.fromFunction2(template))
    __obj.asInstanceOf[HandlebarsTemplatable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HandlebarsTemplatable] (val x: Self) extends AnyVal {
    
    inline def setTemplate(value: (Any, /* options */ js.UndefOr[typings.handlebars.Handlebars.RuntimeOptions]) => String): Self = StObject.set(x, "template", js.Any.fromFunction2(value))
  }
}
