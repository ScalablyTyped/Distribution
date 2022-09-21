package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitAdminV2OAuthResponseType extends StObject {
  
  /**
    * If true, authorization code is returned from IdP's authorization endpoint.
    */
  var code: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If true, ID token is returned from IdP's authorization endpoint.
    */
  var idToken: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Do not use. The `token` response type is not supported at the moment.
    */
  var token: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitAdminV2OAuthResponseType {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitAdminV2OAuthResponseType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitAdminV2OAuthResponseType]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitAdminV2OAuthResponseType](x: Self) {
    
    inline def setCode(value: Boolean): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setIdToken(value: Boolean): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    inline def setIdTokenNull: Self = StObject.set(x, "idToken", null)
    
    inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    inline def setToken(value: Boolean): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenNull: Self = StObject.set(x, "token", null)
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
