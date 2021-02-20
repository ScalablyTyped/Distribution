package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Template for a single idp configuration.
  */
@js.native
trait SchemaIdpConfig extends StObject {
  
  /**
    * OAuth2 client ID.
    */
  var clientId: js.UndefOr[String] = js.native
  
  /**
    * Whether this IDP is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Percent of users who will be prompted/redirected federated login for this
    * IDP.
    */
  var experimentPercent: js.UndefOr[Double] = js.native
  
  /**
    * OAuth2 provider.
    */
  var provider: js.UndefOr[String] = js.native
  
  /**
    * OAuth2 client secret.
    */
  var secret: js.UndefOr[String] = js.native
  
  /**
    * Whitelisted client IDs for audience check.
    */
  var whitelistedAudiences: js.UndefOr[js.Array[String]] = js.native
}
object SchemaIdpConfig {
  
  @scala.inline
  def apply(): SchemaIdpConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdpConfig]
  }
  
  @scala.inline
  implicit class SchemaIdpConfigMutableBuilder[Self <: SchemaIdpConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setExperimentPercent(value: Double): Self = StObject.set(x, "experimentPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentPercentUndefined: Self = StObject.set(x, "experimentPercent", js.undefined)
    
    @scala.inline
    def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    @scala.inline
    def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    
    @scala.inline
    def setWhitelistedAudiences(value: js.Array[String]): Self = StObject.set(x, "whitelistedAudiences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhitelistedAudiencesUndefined: Self = StObject.set(x, "whitelistedAudiences", js.undefined)
    
    @scala.inline
    def setWhitelistedAudiencesVarargs(value: String*): Self = StObject.set(x, "whitelistedAudiences", js.Array(value :_*))
  }
}
