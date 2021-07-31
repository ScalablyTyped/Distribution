package typings.googleapis.servicebrokerV1alpha1Mod.servicebrokerV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for the `ListCatalog()` method.
  */
trait SchemaGoogleCloudServicebrokerV1alpha1ListCatalogResponse extends StObject {
  
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
  
  /**
    * The services available for the requested GCP project.
    */
  var services: js.UndefOr[js.Array[SchemaGoogleCloudServicebrokerV1alpha1Service]] = js.undefined
}
object SchemaGoogleCloudServicebrokerV1alpha1ListCatalogResponse {
  
  @scala.inline
  def apply(): SchemaGoogleCloudServicebrokerV1alpha1ListCatalogResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudServicebrokerV1alpha1ListCatalogResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudServicebrokerV1alpha1ListCatalogResponseMutableBuilder[Self <: SchemaGoogleCloudServicebrokerV1alpha1ListCatalogResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setServices(value: js.Array[SchemaGoogleCloudServicebrokerV1alpha1Service]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    @scala.inline
    def setServicesVarargs(value: SchemaGoogleCloudServicebrokerV1alpha1Service*): Self = StObject.set(x, "services", js.Array(value :_*))
  }
}
