package typings.googleapis.servicebrokerV1alpha1Mod.servicebrokerV1alpha1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for the `CreateBinding()` method.
  */
@js.native
trait SchemaGoogleCloudServicebrokerV1alpha1CreateBindingResponse extends StObject {
  
  /**
    * Credentials to use the binding.
    */
  var credentials: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * Used to communicate description of the response. Usually for non-standard
    * error codes.
    * https://github.com/openservicebrokerapi/servicebroker/blob/master/spec.md#service-broker-errors
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * If broker executes operation asynchronously, this is the operation ID
    * that can be polled to check the completion status of said operation. This
    * broker always executes all create/delete operations asynchronously.
    */
  var operation: js.UndefOr[String] = js.native
  
  /**
    * A URL to which the platform may proxy requests for the address sent with
    * bind_resource.route
    */
  var route_service_url: js.UndefOr[String] = js.native
  
  /**
    * From where to read system logs.
    */
  var syslog_drain_url: js.UndefOr[String] = js.native
  
  /**
    * An array of configuration for mounting volumes.
    */
  var volume_mounts: js.UndefOr[js.Array[StringDictionary[_]]] = js.native
}
object SchemaGoogleCloudServicebrokerV1alpha1CreateBindingResponse {
  
  @scala.inline
  def apply(): SchemaGoogleCloudServicebrokerV1alpha1CreateBindingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudServicebrokerV1alpha1CreateBindingResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudServicebrokerV1alpha1CreateBindingResponseMutableBuilder[Self <: SchemaGoogleCloudServicebrokerV1alpha1CreateBindingResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredentials(value: StringDictionary[js.Any]): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    @scala.inline
    def setRoute_service_url(value: String): Self = StObject.set(x, "route_service_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoute_service_urlUndefined: Self = StObject.set(x, "route_service_url", js.undefined)
    
    @scala.inline
    def setSyslog_drain_url(value: String): Self = StObject.set(x, "syslog_drain_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyslog_drain_urlUndefined: Self = StObject.set(x, "syslog_drain_url", js.undefined)
    
    @scala.inline
    def setVolume_mounts(value: js.Array[StringDictionary[_]]): Self = StObject.set(x, "volume_mounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolume_mountsUndefined: Self = StObject.set(x, "volume_mounts", js.undefined)
    
    @scala.inline
    def setVolume_mountsVarargs(value: StringDictionary[js.Any]*): Self = StObject.set(x, "volume_mounts", js.Array(value :_*))
  }
}
