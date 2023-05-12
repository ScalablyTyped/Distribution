package typings.inferno.distCoreTypesMod.Inferno

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var `for`: js.UndefOr[String | Null] = js.undefined
  
  var form: js.UndefOr[String | Null] = js.undefined
  
  var htmlFor: js.UndefOr[String | Null] = js.undefined
}
object LabelHTMLAttributes {
  
  inline def apply[T](): LabelHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelHTMLAttributes[?], T] (val x: Self & LabelHTMLAttributes[T]) extends AnyVal {
    
    inline def setFor(value: String): Self = StObject.set(x, "for", value.asInstanceOf[js.Any])
    
    inline def setForNull: Self = StObject.set(x, "for", null)
    
    inline def setForUndefined: Self = StObject.set(x, "for", js.undefined)
    
    inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormNull: Self = StObject.set(x, "form", null)
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setHtmlFor(value: String): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
    
    inline def setHtmlForNull: Self = StObject.set(x, "htmlFor", null)
    
    inline def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", js.undefined)
  }
}
