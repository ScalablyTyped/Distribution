package typings.knockout.mod

import typings.knockout.mod.utils.MappingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateForeachOptions[T]
  extends StObject
     with TemplateOptions[js.Array[T]]
     with MappingOptions[T] {
  
  var as: js.UndefOr[String] = js.undefined
  
  var includeDestroyed: js.UndefOr[Boolean] = js.undefined
}
object TemplateForeachOptions {
  
  @scala.inline
  def apply[T](): TemplateForeachOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateForeachOptions[T]]
  }
  
  @scala.inline
  implicit class TemplateForeachOptionsMutableBuilder[Self <: TemplateForeachOptions[?], T] (val x: Self & TemplateForeachOptions[T]) extends AnyVal {
    
    @scala.inline
    def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setIncludeDestroyed(value: Boolean): Self = StObject.set(x, "includeDestroyed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDestroyedUndefined: Self = StObject.set(x, "includeDestroyed", js.undefined)
  }
}
