package typings.googleapis.servicebrokerV1alpha1Mod.servicebrokerV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response for the `ListServiceInstances()` method.
  */
trait SchemaGoogleCloudServicebrokerV1alpha1ListServiceInstancesResponse extends StObject {
  
  /**
    * Used to communicate description of the response. Usually for non-standard
    * error codes.
    * https://github.com/openservicebrokerapi/servicebroker/blob/master/spec.md#service-broker-errors
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The list of the instances in the broker.
    */
  var instances: js.UndefOr[js.Array[SchemaGoogleCloudServicebrokerV1alpha1ServiceInstance]] = js.undefined
  
  /**
    * This token allows you to get the next page of results for list requests.
    * If the number of results is larger than `pageSize`, use the
    * `nextPageToken` as a value for the query parameter `pageToken` in the
    * next list request. Subsequent list requests will have their own
    * `nextPageToken` to continue paging through the results
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudServicebrokerV1alpha1ListServiceInstancesResponse {
  
  inline def apply(): SchemaGoogleCloudServicebrokerV1alpha1ListServiceInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudServicebrokerV1alpha1ListServiceInstancesResponse]
  }
  
  extension [Self <: SchemaGoogleCloudServicebrokerV1alpha1ListServiceInstancesResponse](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setInstances(value: js.Array[SchemaGoogleCloudServicebrokerV1alpha1ServiceInstance]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: SchemaGoogleCloudServicebrokerV1alpha1ServiceInstance*): Self = StObject.set(x, "instances", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
