package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1ListPolicyTagsResponse extends StObject {
  
  /** Pagination token of the next results page. Empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The policy tags that belong to the taxonomy. */
  var policyTags: js.UndefOr[js.Array[GoogleCloudDatacatalogV1PolicyTag]] = js.undefined
}
object GoogleCloudDatacatalogV1ListPolicyTagsResponse {
  
  inline def apply(): GoogleCloudDatacatalogV1ListPolicyTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1ListPolicyTagsResponse]
  }
  
  extension [Self <: GoogleCloudDatacatalogV1ListPolicyTagsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPolicyTags(value: js.Array[GoogleCloudDatacatalogV1PolicyTag]): Self = StObject.set(x, "policyTags", value.asInstanceOf[js.Any])
    
    inline def setPolicyTagsUndefined: Self = StObject.set(x, "policyTags", js.undefined)
    
    inline def setPolicyTagsVarargs(value: GoogleCloudDatacatalogV1PolicyTag*): Self = StObject.set(x, "policyTags", js.Array(value*))
  }
}
