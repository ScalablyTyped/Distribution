package typings.ionicons.distTypesStencilPublicRuntimeMod.JSXBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeygenHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  
  var autofocus: js.UndefOr[Boolean | String] = js.undefined
  
  var challenge: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var form: js.UndefOr[String] = js.undefined
  
  var keyParams: js.UndefOr[String] = js.undefined
  
  var keyType: js.UndefOr[String] = js.undefined
  
  var keyparams: js.UndefOr[String] = js.undefined
  
  var keytype: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object KeygenHTMLAttributes {
  
  inline def apply[T](): KeygenHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeygenHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeygenHTMLAttributes[?], T] (val x: Self & KeygenHTMLAttributes[T]) extends AnyVal {
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    inline def setChallenge(value: String): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
    
    inline def setChallengeUndefined: Self = StObject.set(x, "challenge", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setKeyParams(value: String): Self = StObject.set(x, "keyParams", value.asInstanceOf[js.Any])
    
    inline def setKeyParamsUndefined: Self = StObject.set(x, "keyParams", js.undefined)
    
    inline def setKeyType(value: String): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
    
    inline def setKeyTypeUndefined: Self = StObject.set(x, "keyType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
