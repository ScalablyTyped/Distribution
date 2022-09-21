package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BitbucketServerConfig extends StObject {
  
  /**
    * Required. Immutable. API Key that will be attached to webhook. Once this field has been set, it cannot be changed. If you need to change it, please create another
    * BitbucketServerConfig.
    */
  var apiKey: js.UndefOr[String] = js.undefined
  
  /** Output only. Connected Bitbucket Server repositories for this config. */
  var connectedRepositories: js.UndefOr[js.Array[BitbucketServerRepositoryId]] = js.undefined
  
  /** Time when the config was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Required. Immutable. The URI of the Bitbucket Server host. Once this field has been set, it cannot be changed. If you need to change it, please create another BitbucketServerConfig. */
  var hostUri: js.UndefOr[String] = js.undefined
  
  /** The resource name for the config. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The network to be used when reaching out to the Bitbucket Server instance. The VPC network must be enabled for private service connection. This should be set if the
    * Bitbucket Server instance is hosted on-premises and not reachable by public internet. If this field is left empty, no network peering will occur and calls to the Bitbucket Server
    * instance will be made over the public internet. Must be in the format `projects/{project}/global/networks/{network}`, where {project} is a project number or id and {network} is the
    * name of a VPC network in the project.
    */
  var peeredNetwork: js.UndefOr[String] = js.undefined
  
  /** Required. Secret Manager secrets needed by the config. */
  var secrets: js.UndefOr[BitbucketServerSecrets] = js.undefined
  
  /** Optional. SSL certificate to use for requests to Bitbucket Server. The format should be PEM format but the extension can be one of .pem, .cer, or .crt. */
  var sslCa: js.UndefOr[String] = js.undefined
  
  /** Username of the account Cloud Build will use on Bitbucket Server. */
  var username: js.UndefOr[String] = js.undefined
  
  /** Output only. UUID included in webhook requests. The UUID is used to look up the corresponding config. */
  var webhookKey: js.UndefOr[String] = js.undefined
}
object BitbucketServerConfig {
  
  inline def apply(): BitbucketServerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BitbucketServerConfig]
  }
  
  extension [Self <: BitbucketServerConfig](x: Self) {
    
    inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
    
    inline def setConnectedRepositories(value: js.Array[BitbucketServerRepositoryId]): Self = StObject.set(x, "connectedRepositories", value.asInstanceOf[js.Any])
    
    inline def setConnectedRepositoriesUndefined: Self = StObject.set(x, "connectedRepositories", js.undefined)
    
    inline def setConnectedRepositoriesVarargs(value: BitbucketServerRepositoryId*): Self = StObject.set(x, "connectedRepositories", js.Array(value*))
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setHostUri(value: String): Self = StObject.set(x, "hostUri", value.asInstanceOf[js.Any])
    
    inline def setHostUriUndefined: Self = StObject.set(x, "hostUri", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPeeredNetwork(value: String): Self = StObject.set(x, "peeredNetwork", value.asInstanceOf[js.Any])
    
    inline def setPeeredNetworkUndefined: Self = StObject.set(x, "peeredNetwork", js.undefined)
    
    inline def setSecrets(value: BitbucketServerSecrets): Self = StObject.set(x, "secrets", value.asInstanceOf[js.Any])
    
    inline def setSecretsUndefined: Self = StObject.set(x, "secrets", js.undefined)
    
    inline def setSslCa(value: String): Self = StObject.set(x, "sslCa", value.asInstanceOf[js.Any])
    
    inline def setSslCaUndefined: Self = StObject.set(x, "sslCa", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    inline def setWebhookKey(value: String): Self = StObject.set(x, "webhookKey", value.asInstanceOf[js.Any])
    
    inline def setWebhookKeyUndefined: Self = StObject.set(x, "webhookKey", js.undefined)
  }
}
