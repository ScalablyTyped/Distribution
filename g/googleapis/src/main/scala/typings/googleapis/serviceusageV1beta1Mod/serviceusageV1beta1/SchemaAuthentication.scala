package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
@js.native
trait SchemaAuthentication extends StObject {
  
  /**
    * Defines a set of authentication providers that a service supports.
    */
  var providers: js.UndefOr[js.Array[SchemaAuthProvider]] = js.native
  
  /**
    * A list of authentication rules that apply to individual API methods.
    * **NOTE:** All service configuration rules follow &quot;last one
    * wins&quot; order.
    */
  var rules: js.UndefOr[js.Array[SchemaAuthenticationRule]] = js.native
}
object SchemaAuthentication {
  
  @scala.inline
  def apply(): SchemaAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthentication]
  }
  
  @scala.inline
  implicit class SchemaAuthenticationMutableBuilder[Self <: SchemaAuthentication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProviders(value: js.Array[SchemaAuthProvider]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
    
    @scala.inline
    def setProvidersVarargs(value: SchemaAuthProvider*): Self = StObject.set(x, "providers", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: js.Array[SchemaAuthenticationRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: SchemaAuthenticationRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}
