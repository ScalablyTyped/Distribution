package typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for AuthorizeEnvironment.
  */
trait SchemaAuthorizeEnvironmentRequest extends StObject {
  
  /**
    * The OAuth access token that should be sent to the environment.
    */
  var accessToken: js.UndefOr[String] = js.undefined
  
  /**
    * The time when the credentials expire. If not set, defaults to one hour
    * from when the server received the request.
    */
  var expireTime: js.UndefOr[String] = js.undefined
  
  /**
    * The OAuth ID token that should be sent to the environment.
    */
  var idToken: js.UndefOr[String] = js.undefined
}
object SchemaAuthorizeEnvironmentRequest {
  
  inline def apply(): SchemaAuthorizeEnvironmentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthorizeEnvironmentRequest]
  }
  
  extension [Self <: SchemaAuthorizeEnvironmentRequest](x: Self) {
    
    inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
  }
}
