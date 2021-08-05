package typings.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for the `GetBinding()` method.
  */
trait SchemaGoogleCloudServicebrokerV1beta1GetBindingResponse extends StObject {
  
  /**
    * Credentials to use the binding.
    */
  var credentials: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * String containing the Deployment Manager deployment name that was created
    * for this binding,
    */
  var deploymentName: js.UndefOr[String] = js.undefined
  
  /**
    * Used to communicate description of the response. Usually for non-standard
    * error codes.
    * https://github.com/openservicebrokerapi/servicebroker/blob/master/spec.md#service-broker-errors
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The resource name of the binding, e.g.
    * projects/project_id/brokers/broker_id/service_instances/instance_id/bindings/binding_id.
    */
  var resourceName: js.UndefOr[String] = js.undefined
  
  /**
    * A URL to which the platform may proxy requests for the address sent with
    * bind_resource.route
    */
  var route_service_url: js.UndefOr[String] = js.undefined
  
  /**
    * From where to read system logs.
    */
  var syslog_drain_url: js.UndefOr[String] = js.undefined
  
  /**
    * An array of configurations for mounting volumes.
    */
  var volume_mounts: js.UndefOr[js.Array[StringDictionary[js.Any]]] = js.undefined
}
object SchemaGoogleCloudServicebrokerV1beta1GetBindingResponse {
  
  inline def apply(): SchemaGoogleCloudServicebrokerV1beta1GetBindingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudServicebrokerV1beta1GetBindingResponse]
  }
  
  extension [Self <: SchemaGoogleCloudServicebrokerV1beta1GetBindingResponse](x: Self) {
    
    inline def setCredentials(value: StringDictionary[js.Any]): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    inline def setDeploymentName(value: String): Self = StObject.set(x, "deploymentName", value.asInstanceOf[js.Any])
    
    inline def setDeploymentNameUndefined: Self = StObject.set(x, "deploymentName", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    inline def setRoute_service_url(value: String): Self = StObject.set(x, "route_service_url", value.asInstanceOf[js.Any])
    
    inline def setRoute_service_urlUndefined: Self = StObject.set(x, "route_service_url", js.undefined)
    
    inline def setSyslog_drain_url(value: String): Self = StObject.set(x, "syslog_drain_url", value.asInstanceOf[js.Any])
    
    inline def setSyslog_drain_urlUndefined: Self = StObject.set(x, "syslog_drain_url", js.undefined)
    
    inline def setVolume_mounts(value: js.Array[StringDictionary[js.Any]]): Self = StObject.set(x, "volume_mounts", value.asInstanceOf[js.Any])
    
    inline def setVolume_mountsUndefined: Self = StObject.set(x, "volume_mounts", js.undefined)
    
    inline def setVolume_mountsVarargs(value: StringDictionary[js.Any]*): Self = StObject.set(x, "volume_mounts", js.Array(value :_*))
  }
}
