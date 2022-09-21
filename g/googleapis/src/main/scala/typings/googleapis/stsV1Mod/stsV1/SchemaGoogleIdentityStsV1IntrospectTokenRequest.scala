package typings.googleapis.stsV1Mod.stsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleIdentityStsV1IntrospectTokenRequest extends StObject {
  
  /**
    * Required. The OAuth 2.0 security token issued by the Security Token Service API.
    */
  var token: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The type of the given token. Supported values are `urn:ietf:params:oauth:token-type:access_token` and `access_token`.
    */
  var tokenTypeHint: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleIdentityStsV1IntrospectTokenRequest {
  
  inline def apply(): SchemaGoogleIdentityStsV1IntrospectTokenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleIdentityStsV1IntrospectTokenRequest]
  }
  
  extension [Self <: SchemaGoogleIdentityStsV1IntrospectTokenRequest](x: Self) {
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenNull: Self = StObject.set(x, "token", null)
    
    inline def setTokenTypeHint(value: String): Self = StObject.set(x, "tokenTypeHint", value.asInstanceOf[js.Any])
    
    inline def setTokenTypeHintNull: Self = StObject.set(x, "tokenTypeHint", null)
    
    inline def setTokenTypeHintUndefined: Self = StObject.set(x, "tokenTypeHint", js.undefined)
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
