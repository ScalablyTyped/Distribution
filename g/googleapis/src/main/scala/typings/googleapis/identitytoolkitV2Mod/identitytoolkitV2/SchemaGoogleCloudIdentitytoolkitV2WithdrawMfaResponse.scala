package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitV2WithdrawMfaResponse extends StObject {
  
  /**
    * ID token updated to reflect removal of the second factor.
    */
  var idToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Refresh token updated to reflect removal of the second factor.
    */
  var refreshToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitV2WithdrawMfaResponse {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitV2WithdrawMfaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitV2WithdrawMfaResponse]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitV2WithdrawMfaResponse](x: Self) {
    
    inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    inline def setIdTokenNull: Self = StObject.set(x, "idToken", null)
    
    inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenNull: Self = StObject.set(x, "refreshToken", null)
    
    inline def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
  }
}
