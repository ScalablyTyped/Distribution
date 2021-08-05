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
  
  inline def apply[T](): TemplateForeachOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateForeachOptions[T]]
  }
  
  extension [Self <: TemplateForeachOptions[?], T](x: Self & TemplateForeachOptions[T]) {
    
    inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setIncludeDestroyed(value: Boolean): Self = StObject.set(x, "includeDestroyed", value.asInstanceOf[js.Any])
    
    inline def setIncludeDestroyedUndefined: Self = StObject.set(x, "includeDestroyed", js.undefined)
  }
}
