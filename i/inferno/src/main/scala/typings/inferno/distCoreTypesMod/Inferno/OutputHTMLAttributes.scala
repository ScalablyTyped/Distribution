package typings.inferno.distCoreTypesMod.Inferno

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var form: js.UndefOr[String | Null] = js.undefined
  
  var htmlFor: js.UndefOr[String | Null] = js.undefined
  
  var name: js.UndefOr[String | Null] = js.undefined
}
object OutputHTMLAttributes {
  
  inline def apply[T](): OutputHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutputHTMLAttributes[?], T] (val x: Self & OutputHTMLAttributes[T]) extends AnyVal {
    
    inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormNull: Self = StObject.set(x, "form", null)
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setHtmlFor(value: String): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
    
    inline def setHtmlForNull: Self = StObject.set(x, "htmlFor", null)
    
    inline def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
