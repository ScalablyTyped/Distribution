package typings.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response for the `ListBindings()` method.
  */
trait SchemaGoogleCloudServicebrokerV1beta1ListBindingsResponse extends StObject {
  
  /**
    * The list of bindings in the instance.
    */
  var bindings: js.UndefOr[js.Array[SchemaGoogleCloudServicebrokerV1beta1Binding]] = js.undefined
  
  /**
    * Used to communicate description of the response. Usually for non-standard
    * error codes.
    * https://github.com/openservicebrokerapi/servicebroker/blob/master/spec.md#service-broker-errors
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * This token allows you to get the next page of results for list requests.
    * If the number of results is larger than `pageSize`, use the
    * `nextPageToken` as a value for the query parameter `pageToken` in the
    * next list request. Subsequent list requests will have their own
    * `nextPageToken` to continue paging through the results
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudServicebrokerV1beta1ListBindingsResponse {
  
  inline def apply(): SchemaGoogleCloudServicebrokerV1beta1ListBindingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudServicebrokerV1beta1ListBindingsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudServicebrokerV1beta1ListBindingsResponse](x: Self) {
    
    inline def setBindings(value: js.Array[SchemaGoogleCloudServicebrokerV1beta1Binding]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    inline def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
    
    inline def setBindingsVarargs(value: SchemaGoogleCloudServicebrokerV1beta1Binding*): Self = StObject.set(x, "bindings", js.Array(value :_*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
