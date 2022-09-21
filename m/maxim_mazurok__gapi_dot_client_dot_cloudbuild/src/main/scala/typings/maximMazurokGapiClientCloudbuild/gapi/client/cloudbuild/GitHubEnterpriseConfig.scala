package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitHubEnterpriseConfig extends StObject {
  
  /** Required. The GitHub app id of the Cloud Build app on the GitHub Enterprise server. */
  var appId: js.UndefOr[String] = js.undefined
  
  /** Output only. Time when the installation was associated with the project. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Name to display for this config. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** The URL of the github enterprise host the configuration is for. */
  var hostUrl: js.UndefOr[String] = js.undefined
  
  /** Optional. The full resource name for the GitHubEnterpriseConfig For example: "projects/{$project_id}/githubEnterpriseConfigs/{$config_id}" */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The network to be used when reaching out to the GitHub Enterprise server. The VPC network must be enabled for private service connection. This should be set if the GitHub
    * Enterprise server is hosted on-premises and not reachable by public internet. If this field is left empty, no network peering will occur and calls to the GitHub Enterprise server
    * will be made over the public internet. Must be in the format `projects/{project}/global/networks/{network}`, where {project} is a project number or id and {network} is the name of a
    * VPC network in the project.
    */
  var peeredNetwork: js.UndefOr[String] = js.undefined
  
  /** Names of secrets in Secret Manager. */
  var secrets: js.UndefOr[GitHubEnterpriseSecrets] = js.undefined
  
  /** Optional. SSL certificate to use for requests to GitHub Enterprise. */
  var sslCa: js.UndefOr[String] = js.undefined
  
  /** The key that should be attached to webhook calls to the ReceiveWebhook endpoint. */
  var webhookKey: js.UndefOr[String] = js.undefined
}
object GitHubEnterpriseConfig {
  
  inline def apply(): GitHubEnterpriseConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GitHubEnterpriseConfig]
  }
  
  extension [Self <: GitHubEnterpriseConfig](x: Self) {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setHostUrl(value: String): Self = StObject.set(x, "hostUrl", value.asInstanceOf[js.Any])
    
    inline def setHostUrlUndefined: Self = StObject.set(x, "hostUrl", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPeeredNetwork(value: String): Self = StObject.set(x, "peeredNetwork", value.asInstanceOf[js.Any])
    
    inline def setPeeredNetworkUndefined: Self = StObject.set(x, "peeredNetwork", js.undefined)
    
    inline def setSecrets(value: GitHubEnterpriseSecrets): Self = StObject.set(x, "secrets", value.asInstanceOf[js.Any])
    
    inline def setSecretsUndefined: Self = StObject.set(x, "secrets", js.undefined)
    
    inline def setSslCa(value: String): Self = StObject.set(x, "sslCa", value.asInstanceOf[js.Any])
    
    inline def setSslCaUndefined: Self = StObject.set(x, "sslCa", js.undefined)
    
    inline def setWebhookKey(value: String): Self = StObject.set(x, "webhookKey", value.asInstanceOf[js.Any])
    
    inline def setWebhookKeyUndefined: Self = StObject.set(x, "webhookKey", js.undefined)
  }
}
