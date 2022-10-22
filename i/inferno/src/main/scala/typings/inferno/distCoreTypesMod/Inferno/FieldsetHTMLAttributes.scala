package typings.inferno.distCoreTypesMod.Inferno

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldsetHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var disabled: js.UndefOr[Boolean | Null] = js.undefined
  
  var form: js.UndefOr[String | Null] = js.undefined
  
  var name: js.UndefOr[String | Null] = js.undefined
}
object FieldsetHTMLAttributes {
  
  inline def apply[T](): FieldsetHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldsetHTMLAttributes[T]]
  }
  
  extension [Self <: FieldsetHTMLAttributes[?], T](x: Self & FieldsetHTMLAttributes[T]) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledNull: Self = StObject.set(x, "disabled", null)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormNull: Self = StObject.set(x, "form", null)
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
