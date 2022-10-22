package typings.inferno.distCoreTypesMod.Inferno

import typings.inferno.infernoStrings.button
import typings.inferno.infernoStrings.reset
import typings.inferno.infernoStrings.submit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var autoFocus: js.UndefOr[Boolean | Null] = js.undefined
  
  var disabled: js.UndefOr[Boolean | Null] = js.undefined
  
  var form: js.UndefOr[String | Null] = js.undefined
  
  var formAction: js.UndefOr[String | Null] = js.undefined
  
  var formEncType: js.UndefOr[String | Null] = js.undefined
  
  var formMethod: js.UndefOr[String | Null] = js.undefined
  
  var formNoValidate: js.UndefOr[Boolean | Null] = js.undefined
  
  var formTarget: js.UndefOr[String | Null] = js.undefined
  
  var name: js.UndefOr[String | Null] = js.undefined
  
  var `type`: js.UndefOr[submit | reset | button | Null] = js.undefined
  
  var value: js.UndefOr[String | js.Array[String] | Double | Null] = js.undefined
}
object ButtonHTMLAttributes {
  
  inline def apply[T](): ButtonHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonHTMLAttributes[T]]
  }
  
  extension [Self <: ButtonHTMLAttributes[?], T](x: Self & ButtonHTMLAttributes[T]) {
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusNull: Self = StObject.set(x, "autoFocus", null)
    
    inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledNull: Self = StObject.set(x, "disabled", null)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
    
    inline def setFormActionNull: Self = StObject.set(x, "formAction", null)
    
    inline def setFormActionUndefined: Self = StObject.set(x, "formAction", js.undefined)
    
    inline def setFormEncType(value: String): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
    
    inline def setFormEncTypeNull: Self = StObject.set(x, "formEncType", null)
    
    inline def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
    
    inline def setFormMethod(value: String): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
    
    inline def setFormMethodNull: Self = StObject.set(x, "formMethod", null)
    
    inline def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
    
    inline def setFormNoValidate(value: Boolean): Self = StObject.set(x, "formNoValidate", value.asInstanceOf[js.Any])
    
    inline def setFormNoValidateNull: Self = StObject.set(x, "formNoValidate", null)
    
    inline def setFormNoValidateUndefined: Self = StObject.set(x, "formNoValidate", js.undefined)
    
    inline def setFormNull: Self = StObject.set(x, "form", null)
    
    inline def setFormTarget(value: String): Self = StObject.set(x, "formTarget", value.asInstanceOf[js.Any])
    
    inline def setFormTargetNull: Self = StObject.set(x, "formTarget", null)
    
    inline def setFormTargetUndefined: Self = StObject.set(x, "formTarget", js.undefined)
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: submit | reset | button): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
