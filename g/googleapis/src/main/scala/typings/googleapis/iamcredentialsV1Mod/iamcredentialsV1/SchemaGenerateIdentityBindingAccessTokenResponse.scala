package typings.googleapis.iamcredentialsV1Mod.iamcredentialsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGenerateIdentityBindingAccessTokenResponse extends StObject {
  
  /**
    * The OAuth 2.0 access token.
    */
  var accessToken: js.UndefOr[String] = js.undefined
  
  /**
    * Token expiration time. The expiration time is always set.
    */
  var expireTime: js.UndefOr[String] = js.undefined
}
object SchemaGenerateIdentityBindingAccessTokenResponse {
  
  inline def apply(): SchemaGenerateIdentityBindingAccessTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenerateIdentityBindingAccessTokenResponse]
  }
  
  extension [Self <: SchemaGenerateIdentityBindingAccessTokenResponse](x: Self) {
    
    inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
  }
}
