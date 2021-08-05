package typings.knockout.mod

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateOptions[T] extends StObject {
  
  var afterRender: js.UndefOr[js.Function2[/* elements */ js.Array[Node], /* dataItem */ T, Unit]] = js.undefined
  
  var templateEngine: js.UndefOr[typings.knockout.mod.templateEngine] = js.undefined
}
object TemplateOptions {
  
  inline def apply[T](): TemplateOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateOptions[T]]
  }
  
  extension [Self <: TemplateOptions[?], T](x: Self & TemplateOptions[T]) {
    
    inline def setAfterRender(value: (/* elements */ js.Array[Node], /* dataItem */ T) => Unit): Self = StObject.set(x, "afterRender", js.Any.fromFunction2(value))
    
    inline def setAfterRenderUndefined: Self = StObject.set(x, "afterRender", js.undefined)
    
    inline def setTemplateEngine(value: templateEngine): Self = StObject.set(x, "templateEngine", value.asInstanceOf[js.Any])
    
    inline def setTemplateEngineUndefined: Self = StObject.set(x, "templateEngine", js.undefined)
  }
}
