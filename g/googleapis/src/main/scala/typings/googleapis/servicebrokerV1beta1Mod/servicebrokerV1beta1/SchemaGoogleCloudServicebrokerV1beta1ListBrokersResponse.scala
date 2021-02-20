package typings.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response for the `ListBrokers()` method.
  */
@js.native
trait SchemaGoogleCloudServicebrokerV1beta1ListBrokersResponse extends StObject {
  
  /**
    * The list of brokers in the container.
    */
  var brokers: js.UndefOr[js.Array[SchemaGoogleCloudServicebrokerV1beta1Broker]] = js.native
  
  /**
    * This token allows you to get the next page of results for list requests.
    * If the number of results is larger than `pageSize`, use the
    * `nextPageToken` as a value for the query parameter `pageToken` in the
    * next list request. Subsequent list requests will have their own
    * `nextPageToken` to continue paging through the results
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudServicebrokerV1beta1ListBrokersResponse {
  
  @scala.inline
  def apply(): SchemaGoogleCloudServicebrokerV1beta1ListBrokersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudServicebrokerV1beta1ListBrokersResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudServicebrokerV1beta1ListBrokersResponseMutableBuilder[Self <: SchemaGoogleCloudServicebrokerV1beta1ListBrokersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrokers(value: js.Array[SchemaGoogleCloudServicebrokerV1beta1Broker]): Self = StObject.set(x, "brokers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrokersUndefined: Self = StObject.set(x, "brokers", js.undefined)
    
    @scala.inline
    def setBrokersVarargs(value: SchemaGoogleCloudServicebrokerV1beta1Broker*): Self = StObject.set(x, "brokers", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
