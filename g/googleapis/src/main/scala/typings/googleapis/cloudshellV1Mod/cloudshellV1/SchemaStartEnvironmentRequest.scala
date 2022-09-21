package typings.googleapis.cloudshellV1Mod.cloudshellV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStartEnvironmentRequest extends StObject {
  
  /**
    * The initial access token passed to the environment. If this is present and valid, the environment will be pre-authenticated with gcloud so that the user can run gcloud commands in Cloud Shell without having to log in. This code can be updated later by calling AuthorizeEnvironment.
    */
  var accessToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Public keys that should be added to the environment before it is started.
    */
  var publicKeys: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaStartEnvironmentRequest {
  
  inline def apply(): SchemaStartEnvironmentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStartEnvironmentRequest]
  }
  
  extension [Self <: SchemaStartEnvironmentRequest](x: Self) {
    
    inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenNull: Self = StObject.set(x, "accessToken", null)
    
    inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    inline def setPublicKeys(value: js.Array[String]): Self = StObject.set(x, "publicKeys", value.asInstanceOf[js.Any])
    
    inline def setPublicKeysNull: Self = StObject.set(x, "publicKeys", null)
    
    inline def setPublicKeysUndefined: Self = StObject.set(x, "publicKeys", js.undefined)
    
    inline def setPublicKeysVarargs(value: String*): Self = StObject.set(x, "publicKeys", js.Array(value*))
  }
}
