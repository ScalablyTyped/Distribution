package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1ListPolicyTagsResponse extends StObject {
  
  /**
    * Pagination token of the next results page. Empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The policy tags that belong to the taxonomy.
    */
  var policyTags: js.UndefOr[js.Array[SchemaGoogleCloudDatacatalogV1PolicyTag]] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1ListPolicyTagsResponse {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1ListPolicyTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1ListPolicyTagsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1ListPolicyTagsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPolicyTags(value: js.Array[SchemaGoogleCloudDatacatalogV1PolicyTag]): Self = StObject.set(x, "policyTags", value.asInstanceOf[js.Any])
    
    inline def setPolicyTagsUndefined: Self = StObject.set(x, "policyTags", js.undefined)
    
    inline def setPolicyTagsVarargs(value: SchemaGoogleCloudDatacatalogV1PolicyTag*): Self = StObject.set(x, "policyTags", js.Array(value*))
  }
}
