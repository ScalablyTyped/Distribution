package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackendServiceIAP extends StObject {
  
  /** Whether the serving infrastructure will authenticate and authorize all incoming requests. If true, the oauth2ClientId and oauth2ClientSecret fields must be non-empty. */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /** OAuth2 client ID to use for the authentication flow. */
  var oauth2ClientId: js.UndefOr[String] = js.undefined
  
  /**
    * OAuth2 client secret to use for the authentication flow. For security reasons, this value cannot be retrieved via the API. Instead, the SHA-256 hash of the value is returned in the
    * oauth2ClientSecretSha256 field.
    */
  var oauth2ClientSecret: js.UndefOr[String] = js.undefined
  
  /** [Output Only] SHA256 hash value for the field oauth2_client_secret above. */
  var oauth2ClientSecretSha256: js.UndefOr[String] = js.undefined
}
object BackendServiceIAP {
  
  @scala.inline
  def apply(): BackendServiceIAP = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendServiceIAP]
  }
  
  @scala.inline
  implicit class BackendServiceIAPMutableBuilder[Self <: BackendServiceIAP] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setOauth2ClientId(value: String): Self = StObject.set(x, "oauth2ClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth2ClientIdUndefined: Self = StObject.set(x, "oauth2ClientId", js.undefined)
    
    @scala.inline
    def setOauth2ClientSecret(value: String): Self = StObject.set(x, "oauth2ClientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth2ClientSecretSha256(value: String): Self = StObject.set(x, "oauth2ClientSecretSha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth2ClientSecretSha256Undefined: Self = StObject.set(x, "oauth2ClientSecretSha256", js.undefined)
    
    @scala.inline
    def setOauth2ClientSecretUndefined: Self = StObject.set(x, "oauth2ClientSecret", js.undefined)
  }
}
