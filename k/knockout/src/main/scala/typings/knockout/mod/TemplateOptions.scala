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
  
  @scala.inline
  def apply[T](): TemplateOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateOptions[T]]
  }
  
  @scala.inline
  implicit class TemplateOptionsMutableBuilder[Self <: TemplateOptions[?], T] (val x: Self & TemplateOptions[T]) extends AnyVal {
    
    @scala.inline
    def setAfterRender(value: (/* elements */ js.Array[Node], /* dataItem */ T) => Unit): Self = StObject.set(x, "afterRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterRenderUndefined: Self = StObject.set(x, "afterRender", js.undefined)
    
    @scala.inline
    def setTemplateEngine(value: templateEngine): Self = StObject.set(x, "templateEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateEngineUndefined: Self = StObject.set(x, "templateEngine", js.undefined)
  }
}
