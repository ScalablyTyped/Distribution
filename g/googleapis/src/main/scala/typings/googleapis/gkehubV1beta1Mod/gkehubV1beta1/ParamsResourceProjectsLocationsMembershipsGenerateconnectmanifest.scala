package typings.googleapis.gkehubV1beta1Mod.gkehubV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsMembershipsGenerateconnectmanifest
  extends StObject
     with StandardParameters {
  
  /**
    * Do not set.
    */
  @JSName("connectAgent.name")
  var connectAgentDotname: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Namespace for GKE Connect agent resources. Defaults to `gke-connect`. The Connect Agent is authorized automatically when run in the default namespace. Otherwise, explicit authorization must be granted with an additional IAM binding.
    */
  @JSName("connectAgent.namespace")
  var connectAgentDotnamespace: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. URI of a proxy if connectivity from the agent to gkeconnect.googleapis.com requires the use of a proxy. Format must be in the form `http(s)://{proxy_address\}`, depending on the HTTP/HTTPS protocol supported by the proxy. This will direct the connect agent's outbound traffic through a HTTP(S) proxy.
    */
  @JSName("connectAgent.proxy")
  var connectAgentDotproxy: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The image pull secret content for the registry, if not public.
    */
  var imagePullSecretContent: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. If true, generate the resources for upgrade only. Some resources generated only for installation (e.g. secrets) will be excluded.
    */
  var isUpgrade: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. The Membership resource name the Agent will associate with, in the format `projects/x/locations/x/memberships/x`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The registry to fetch the connect agent image from. Defaults to gcr.io/gkeconnect.
    */
  var registry: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The Connect agent version to use. Defaults to the most current version.
    */
  var version: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsMembershipsGenerateconnectmanifest {
  
  inline def apply(): ParamsResourceProjectsLocationsMembershipsGenerateconnectmanifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsMembershipsGenerateconnectmanifest]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsMembershipsGenerateconnectmanifest](x: Self) {
    
    inline def setConnectAgentDotname(value: String): Self = StObject.set(x, "connectAgent.name", value.asInstanceOf[js.Any])
    
    inline def setConnectAgentDotnameUndefined: Self = StObject.set(x, "connectAgent.name", js.undefined)
    
    inline def setConnectAgentDotnamespace(value: String): Self = StObject.set(x, "connectAgent.namespace", value.asInstanceOf[js.Any])
    
    inline def setConnectAgentDotnamespaceUndefined: Self = StObject.set(x, "connectAgent.namespace", js.undefined)
    
    inline def setConnectAgentDotproxy(value: String): Self = StObject.set(x, "connectAgent.proxy", value.asInstanceOf[js.Any])
    
    inline def setConnectAgentDotproxyUndefined: Self = StObject.set(x, "connectAgent.proxy", js.undefined)
    
    inline def setImagePullSecretContent(value: String): Self = StObject.set(x, "imagePullSecretContent", value.asInstanceOf[js.Any])
    
    inline def setImagePullSecretContentUndefined: Self = StObject.set(x, "imagePullSecretContent", js.undefined)
    
    inline def setIsUpgrade(value: Boolean): Self = StObject.set(x, "isUpgrade", value.asInstanceOf[js.Any])
    
    inline def setIsUpgradeUndefined: Self = StObject.set(x, "isUpgrade", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRegistry(value: String): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    inline def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
