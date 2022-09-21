package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitAdminV2BlockingFunctionsConfig extends StObject {
  
  /**
    * The user credentials to include in the JWT payload that is sent to the registered Blocking Functions.
    */
  var forwardInboundCredentials: js.UndefOr[SchemaGoogleCloudIdentitytoolkitAdminV2ForwardInboundCredentials] = js.undefined
  
  /**
    * Map of Trigger to event type. Key should be one of the supported event types: "beforeCreate", "beforeSignIn"
    */
  var triggers: js.UndefOr[StringDictionary[SchemaGoogleCloudIdentitytoolkitAdminV2Trigger] | Null] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitAdminV2BlockingFunctionsConfig {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitAdminV2BlockingFunctionsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitAdminV2BlockingFunctionsConfig]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitAdminV2BlockingFunctionsConfig](x: Self) {
    
    inline def setForwardInboundCredentials(value: SchemaGoogleCloudIdentitytoolkitAdminV2ForwardInboundCredentials): Self = StObject.set(x, "forwardInboundCredentials", value.asInstanceOf[js.Any])
    
    inline def setForwardInboundCredentialsUndefined: Self = StObject.set(x, "forwardInboundCredentials", js.undefined)
    
    inline def setTriggers(value: StringDictionary[SchemaGoogleCloudIdentitytoolkitAdminV2Trigger]): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
    
    inline def setTriggersNull: Self = StObject.set(x, "triggers", null)
    
    inline def setTriggersUndefined: Self = StObject.set(x, "triggers", js.undefined)
  }
}
