package typings.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsBrokersV2ServiceInstancesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Value indicating that API client supports asynchronous operations. If
    * Broker cannot execute the request synchronously HTTP 422 code will be
    * returned to HTTP clients along with FAILED_PRECONDITION error. If true
    * and broker will execute request asynchronously 202 HTTP code will be
    * returned. This broker always requires this to be true as all mutator
    * operations are asynchronous.
    */
  var acceptsIncomplete: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The id of the service instance. Must be unique within GCP project.
    * Maximum length is 64, GUID recommended. Required.
    */
  var instance_id: js.UndefOr[String] = js.undefined
  
  /**
    * Parent must match `projects/[PROJECT_ID]/brokers/[BROKER_ID]`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudServicebrokerV1beta1ServiceInstance] = js.undefined
}
object ParamsResourceProjectsBrokersV2ServiceInstancesCreate {
  
  @scala.inline
  def apply(): ParamsResourceProjectsBrokersV2ServiceInstancesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsBrokersV2ServiceInstancesCreate]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsBrokersV2ServiceInstancesCreateMutableBuilder[Self <: ParamsResourceProjectsBrokersV2ServiceInstancesCreate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptsIncomplete(value: Boolean): Self = StObject.set(x, "acceptsIncomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptsIncompleteUndefined: Self = StObject.set(x, "acceptsIncomplete", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setInstance_id(value: String): Self = StObject.set(x, "instance_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstance_idUndefined: Self = StObject.set(x, "instance_id", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaGoogleCloudServicebrokerV1beta1ServiceInstance): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
