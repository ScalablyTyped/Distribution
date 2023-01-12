package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BitbucketServerSecrets extends StObject {
  
  /** Required. The resource name for the admin access token's secret version. */
  var adminAccessTokenVersionName: js.UndefOr[String] = js.undefined
  
  /** Required. The resource name for the read access token's secret version. */
  var readAccessTokenVersionName: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Immutable. The resource name for the webhook secret's secret version. Once this field has been set, it cannot be changed. If you need to change it, please create another
    * BitbucketServerConfig.
    */
  var webhookSecretVersionName: js.UndefOr[String] = js.undefined
}
object BitbucketServerSecrets {
  
  inline def apply(): BitbucketServerSecrets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BitbucketServerSecrets]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BitbucketServerSecrets] (val x: Self) extends AnyVal {
    
    inline def setAdminAccessTokenVersionName(value: String): Self = StObject.set(x, "adminAccessTokenVersionName", value.asInstanceOf[js.Any])
    
    inline def setAdminAccessTokenVersionNameUndefined: Self = StObject.set(x, "adminAccessTokenVersionName", js.undefined)
    
    inline def setReadAccessTokenVersionName(value: String): Self = StObject.set(x, "readAccessTokenVersionName", value.asInstanceOf[js.Any])
    
    inline def setReadAccessTokenVersionNameUndefined: Self = StObject.set(x, "readAccessTokenVersionName", js.undefined)
    
    inline def setWebhookSecretVersionName(value: String): Self = StObject.set(x, "webhookSecretVersionName", value.asInstanceOf[js.Any])
    
    inline def setWebhookSecretVersionNameUndefined: Self = StObject.set(x, "webhookSecretVersionName", js.undefined)
  }
}
