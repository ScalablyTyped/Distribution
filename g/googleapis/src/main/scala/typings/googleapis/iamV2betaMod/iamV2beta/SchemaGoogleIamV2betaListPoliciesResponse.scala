package typings.googleapis.iamV2betaMod.iamV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleIamV2betaListPoliciesResponse extends StObject {
  
  /**
    * A page token that you can use in a ListPoliciesRequest to retrieve the next page. If this field is omitted, there are no additional pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Metadata for the policies that are attached to the resource.
    */
  var policies: js.UndefOr[js.Array[SchemaGoogleIamV2betaPolicy]] = js.undefined
}
object SchemaGoogleIamV2betaListPoliciesResponse {
  
  inline def apply(): SchemaGoogleIamV2betaListPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleIamV2betaListPoliciesResponse]
  }
  
  extension [Self <: SchemaGoogleIamV2betaListPoliciesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPolicies(value: js.Array[SchemaGoogleIamV2betaPolicy]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    inline def setPoliciesVarargs(value: SchemaGoogleIamV2betaPolicy*): Self = StObject.set(x, "policies", js.Array(value*))
  }
}
