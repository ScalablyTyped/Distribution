package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIdpConfig extends StObject {
  
  /**
    * OAuth2 client ID.
    */
  var clientId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether this IDP is enabled.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Percent of users who will be prompted/redirected federated login for this IDP.
    */
  var experimentPercent: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * OAuth2 provider.
    */
  var provider: js.UndefOr[String | Null] = js.undefined
  
  /**
    * OAuth2 client secret.
    */
  var secret: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whitelisted client IDs for audience check.
    */
  var whitelistedAudiences: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaIdpConfig {
  
  inline def apply(): SchemaIdpConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdpConfig]
  }
  
  extension [Self <: SchemaIdpConfig](x: Self) {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdNull: Self = StObject.set(x, "clientId", null)
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setExperimentPercent(value: Double): Self = StObject.set(x, "experimentPercent", value.asInstanceOf[js.Any])
    
    inline def setExperimentPercentNull: Self = StObject.set(x, "experimentPercent", null)
    
    inline def setExperimentPercentUndefined: Self = StObject.set(x, "experimentPercent", js.undefined)
    
    inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderNull: Self = StObject.set(x, "provider", null)
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretNull: Self = StObject.set(x, "secret", null)
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    
    inline def setWhitelistedAudiences(value: js.Array[String]): Self = StObject.set(x, "whitelistedAudiences", value.asInstanceOf[js.Any])
    
    inline def setWhitelistedAudiencesNull: Self = StObject.set(x, "whitelistedAudiences", null)
    
    inline def setWhitelistedAudiencesUndefined: Self = StObject.set(x, "whitelistedAudiences", js.undefined)
    
    inline def setWhitelistedAudiencesVarargs(value: String*): Self = StObject.set(x, "whitelistedAudiences", js.Array(value*))
  }
}
