package typings.joi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<joi.joi.DataUriOptions, 'paddingRequired'> */
trait Base64Options extends StObject {
  
  var paddingRequired: js.UndefOr[Boolean] = js.undefined
  
  /**
    * if true, uses the URI-safe base64 format which replaces `+` with `-` and `\` with `_`.
    *
    * @default false
    */
  var urlSafe: js.UndefOr[Boolean] = js.undefined
}
object Base64Options {
  
  inline def apply(): Base64Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Base64Options]
  }
  
  extension [Self <: Base64Options](x: Self) {
    
    inline def setPaddingRequired(value: Boolean): Self = StObject.set(x, "paddingRequired", value.asInstanceOf[js.Any])
    
    inline def setPaddingRequiredUndefined: Self = StObject.set(x, "paddingRequired", js.undefined)
    
    inline def setUrlSafe(value: Boolean): Self = StObject.set(x, "urlSafe", value.asInstanceOf[js.Any])
    
    inline def setUrlSafeUndefined: Self = StObject.set(x, "urlSafe", js.undefined)
  }
}
