package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1beta1ListPolicyTagsResponse extends StObject {
  
  /**
    * Token used to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The policy tags that are in the requested taxonomy.
    */
  var policyTags: js.UndefOr[js.Array[SchemaGoogleCloudDatacatalogV1beta1PolicyTag]] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1beta1ListPolicyTagsResponse {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1beta1ListPolicyTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1beta1ListPolicyTagsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1beta1ListPolicyTagsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPolicyTags(value: js.Array[SchemaGoogleCloudDatacatalogV1beta1PolicyTag]): Self = StObject.set(x, "policyTags", value.asInstanceOf[js.Any])
    
    inline def setPolicyTagsUndefined: Self = StObject.set(x, "policyTags", js.undefined)
    
    inline def setPolicyTagsVarargs(value: SchemaGoogleCloudDatacatalogV1beta1PolicyTag*): Self = StObject.set(x, "policyTags", js.Array(value*))
  }
}
