package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListWorkloadIdentityPoolProvidersResponse extends StObject {
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of providers.
    */
  var workloadIdentityPoolProviders: js.UndefOr[js.Array[SchemaWorkloadIdentityPoolProvider]] = js.undefined
}
object SchemaListWorkloadIdentityPoolProvidersResponse {
  
  inline def apply(): SchemaListWorkloadIdentityPoolProvidersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListWorkloadIdentityPoolProvidersResponse]
  }
  
  extension [Self <: SchemaListWorkloadIdentityPoolProvidersResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setWorkloadIdentityPoolProviders(value: js.Array[SchemaWorkloadIdentityPoolProvider]): Self = StObject.set(x, "workloadIdentityPoolProviders", value.asInstanceOf[js.Any])
    
    inline def setWorkloadIdentityPoolProvidersUndefined: Self = StObject.set(x, "workloadIdentityPoolProviders", js.undefined)
    
    inline def setWorkloadIdentityPoolProvidersVarargs(value: SchemaWorkloadIdentityPoolProvider*): Self = StObject.set(x, "workloadIdentityPoolProviders", js.Array(value*))
  }
}
