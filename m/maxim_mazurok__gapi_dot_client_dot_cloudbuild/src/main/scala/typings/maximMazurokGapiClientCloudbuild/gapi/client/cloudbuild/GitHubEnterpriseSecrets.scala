package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitHubEnterpriseSecrets extends StObject {
  
  /** The resource name for the OAuth client ID secret in Secret Manager. */
  var oauthClientIdName: js.UndefOr[String] = js.undefined
  
  /** The resource name for the OAuth client ID secret version in Secret Manager. */
  var oauthClientIdVersionName: js.UndefOr[String] = js.undefined
  
  /** The resource name for the OAuth secret in Secret Manager. */
  var oauthSecretName: js.UndefOr[String] = js.undefined
  
  /** The resource name for the OAuth secret secret version in Secret Manager. */
  var oauthSecretVersionName: js.UndefOr[String] = js.undefined
  
  /** The resource name for the private key secret. */
  var privateKeyName: js.UndefOr[String] = js.undefined
  
  /** The resource name for the private key secret version. */
  var privateKeyVersionName: js.UndefOr[String] = js.undefined
  
  /** The resource name for the webhook secret in Secret Manager. */
  var webhookSecretName: js.UndefOr[String] = js.undefined
  
  /** The resource name for the webhook secret secret version in Secret Manager. */
  var webhookSecretVersionName: js.UndefOr[String] = js.undefined
}
object GitHubEnterpriseSecrets {
  
  inline def apply(): GitHubEnterpriseSecrets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GitHubEnterpriseSecrets]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GitHubEnterpriseSecrets] (val x: Self) extends AnyVal {
    
    inline def setOauthClientIdName(value: String): Self = StObject.set(x, "oauthClientIdName", value.asInstanceOf[js.Any])
    
    inline def setOauthClientIdNameUndefined: Self = StObject.set(x, "oauthClientIdName", js.undefined)
    
    inline def setOauthClientIdVersionName(value: String): Self = StObject.set(x, "oauthClientIdVersionName", value.asInstanceOf[js.Any])
    
    inline def setOauthClientIdVersionNameUndefined: Self = StObject.set(x, "oauthClientIdVersionName", js.undefined)
    
    inline def setOauthSecretName(value: String): Self = StObject.set(x, "oauthSecretName", value.asInstanceOf[js.Any])
    
    inline def setOauthSecretNameUndefined: Self = StObject.set(x, "oauthSecretName", js.undefined)
    
    inline def setOauthSecretVersionName(value: String): Self = StObject.set(x, "oauthSecretVersionName", value.asInstanceOf[js.Any])
    
    inline def setOauthSecretVersionNameUndefined: Self = StObject.set(x, "oauthSecretVersionName", js.undefined)
    
    inline def setPrivateKeyName(value: String): Self = StObject.set(x, "privateKeyName", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyNameUndefined: Self = StObject.set(x, "privateKeyName", js.undefined)
    
    inline def setPrivateKeyVersionName(value: String): Self = StObject.set(x, "privateKeyVersionName", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyVersionNameUndefined: Self = StObject.set(x, "privateKeyVersionName", js.undefined)
    
    inline def setWebhookSecretName(value: String): Self = StObject.set(x, "webhookSecretName", value.asInstanceOf[js.Any])
    
    inline def setWebhookSecretNameUndefined: Self = StObject.set(x, "webhookSecretName", js.undefined)
    
    inline def setWebhookSecretVersionName(value: String): Self = StObject.set(x, "webhookSecretVersionName", value.asInstanceOf[js.Any])
    
    inline def setWebhookSecretVersionNameUndefined: Self = StObject.set(x, "webhookSecretVersionName", js.undefined)
  }
}
