package typings.googleapis.stsV1Mod.stsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleIdentityStsV1ExchangeTokenResponse extends StObject {
  
  /**
    * An OAuth 2.0 security token, issued by Google, in response to the token exchange request. Tokens can vary in size, depending in part on the size of mapped claims, up to a maximum of 12288 bytes (12 KB). Google reserves the right to change the token size and the maximum length at any time.
    */
  var access_token: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The amount of time, in seconds, between the time when the access token was issued and the time when the access token will expire. This field is absent when the `subject_token` in the request is a Google-issued, short-lived access token. In this case, the access token has the same expiration time as the `subject_token`.
    */
  var expires_in: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The token type. Always matches the value of `requested_token_type` from the request.
    */
  var issued_token_type: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of access token. Always has the value `Bearer`.
    */
  var token_type: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleIdentityStsV1ExchangeTokenResponse {
  
  inline def apply(): SchemaGoogleIdentityStsV1ExchangeTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleIdentityStsV1ExchangeTokenResponse]
  }
  
  extension [Self <: SchemaGoogleIdentityStsV1ExchangeTokenResponse](x: Self) {
    
    inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    inline def setAccess_tokenNull: Self = StObject.set(x, "access_token", null)
    
    inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    
    inline def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
    
    inline def setExpires_inNull: Self = StObject.set(x, "expires_in", null)
    
    inline def setExpires_inUndefined: Self = StObject.set(x, "expires_in", js.undefined)
    
    inline def setIssued_token_type(value: String): Self = StObject.set(x, "issued_token_type", value.asInstanceOf[js.Any])
    
    inline def setIssued_token_typeNull: Self = StObject.set(x, "issued_token_type", null)
    
    inline def setIssued_token_typeUndefined: Self = StObject.set(x, "issued_token_type", js.undefined)
    
    inline def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
    
    inline def setToken_typeNull: Self = StObject.set(x, "token_type", null)
    
    inline def setToken_typeUndefined: Self = StObject.set(x, "token_type", js.undefined)
  }
}
