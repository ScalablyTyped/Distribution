package typings.inferno.distCoreTypesMod.Inferno

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var acceptCharset: js.UndefOr[String | Null] = js.undefined
  
  var action: js.UndefOr[String | Null] = js.undefined
  
  var autoComplete: js.UndefOr[String | Null] = js.undefined
  
  var encType: js.UndefOr[String | Null] = js.undefined
  
  var method: js.UndefOr[String | Null] = js.undefined
  
  var name: js.UndefOr[String | Null] = js.undefined
  
  var noValidate: js.UndefOr[Boolean | Null] = js.undefined
  
  var target: js.UndefOr[String | Null] = js.undefined
}
object FormHTMLAttributes {
  
  inline def apply[T](): FormHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormHTMLAttributes[T]]
  }
  
  extension [Self <: FormHTMLAttributes[?], T](x: Self & FormHTMLAttributes[T]) {
    
    inline def setAcceptCharset(value: String): Self = StObject.set(x, "acceptCharset", value.asInstanceOf[js.Any])
    
    inline def setAcceptCharsetNull: Self = StObject.set(x, "acceptCharset", null)
    
    inline def setAcceptCharsetUndefined: Self = StObject.set(x, "acceptCharset", js.undefined)
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    inline def setAutoCompleteNull: Self = StObject.set(x, "autoComplete", null)
    
    inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
    
    inline def setEncType(value: String): Self = StObject.set(x, "encType", value.asInstanceOf[js.Any])
    
    inline def setEncTypeNull: Self = StObject.set(x, "encType", null)
    
    inline def setEncTypeUndefined: Self = StObject.set(x, "encType", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodNull: Self = StObject.set(x, "method", null)
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNoValidate(value: Boolean): Self = StObject.set(x, "noValidate", value.asInstanceOf[js.Any])
    
    inline def setNoValidateNull: Self = StObject.set(x, "noValidate", null)
    
    inline def setNoValidateUndefined: Self = StObject.set(x, "noValidate", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
