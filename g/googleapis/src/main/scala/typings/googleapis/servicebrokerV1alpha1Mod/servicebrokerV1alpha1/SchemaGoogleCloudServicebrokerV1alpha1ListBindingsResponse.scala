package typings.googleapis.servicebrokerV1alpha1Mod.servicebrokerV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response for the `ListBindings()` method.
  */
@js.native
trait SchemaGoogleCloudServicebrokerV1alpha1ListBindingsResponse extends StObject {
  
  /**
    * The list of the bindings in the instance.
    */
  var bindings: js.UndefOr[js.Array[SchemaGoogleCloudServicebrokerV1alpha1Binding]] = js.native
  
  /**
    * Used to communicate description of the response. Usually for non-standard
    * error codes.
    * https://github.com/openservicebrokerapi/servicebroker/blob/master/spec.md#service-broker-errors
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * This token allows you to get the next page of results for list requests.
    * If the number of results is larger than `pageSize`, use the
    * `nextPageToken` as a value for the query parameter `pageToken` in the
    * next list request. Subsequent list requests will have their own
    * `nextPageToken` to continue paging through the results
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudServicebrokerV1alpha1ListBindingsResponse {
  
  @scala.inline
  def apply(): SchemaGoogleCloudServicebrokerV1alpha1ListBindingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudServicebrokerV1alpha1ListBindingsResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudServicebrokerV1alpha1ListBindingsResponseMutableBuilder[Self <: SchemaGoogleCloudServicebrokerV1alpha1ListBindingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindings(value: js.Array[SchemaGoogleCloudServicebrokerV1alpha1Binding]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
    
    @scala.inline
    def setBindingsVarargs(value: SchemaGoogleCloudServicebrokerV1alpha1Binding*): Self = StObject.set(x, "bindings", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
