package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `Authentication` defines the authentication configuration for an API.
  * Example for an API targeted for external use:      name:
  * calendar.googleapis.com     authentication:       providers:       - id:
  * google_calendar_auth         jwks_uri:
  * https://www.googleapis.com/oauth2/v1/certs         issuer:
  * https://securetoken.google.com       rules:       - selector: &quot;*&quot;
  * requirements:           provider_id: google_calendar_auth
  */
trait SchemaAuthentication extends StObject {
  
  /**
    * Defines a set of authentication providers that a service supports.
    */
  var providers: js.UndefOr[js.Array[SchemaAuthProvider]] = js.undefined
  
  /**
    * A list of authentication rules that apply to individual API methods.
    * **NOTE:** All service configuration rules follow &quot;last one
    * wins&quot; order.
    */
  var rules: js.UndefOr[js.Array[SchemaAuthenticationRule]] = js.undefined
}
object SchemaAuthentication {
  
  inline def apply(): SchemaAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthentication]
  }
  
  extension [Self <: SchemaAuthentication](x: Self) {
    
    inline def setProviders(value: js.Array[SchemaAuthProvider]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
    
    inline def setProvidersVarargs(value: SchemaAuthProvider*): Self = StObject.set(x, "providers", js.Array(value :_*))
    
    inline def setRules(value: js.Array[SchemaAuthenticationRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: SchemaAuthenticationRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}
