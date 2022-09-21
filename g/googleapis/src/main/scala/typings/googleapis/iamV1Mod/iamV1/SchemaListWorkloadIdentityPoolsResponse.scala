package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListWorkloadIdentityPoolsResponse extends StObject {
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of pools.
    */
  var workloadIdentityPools: js.UndefOr[js.Array[SchemaWorkloadIdentityPool]] = js.undefined
}
object SchemaListWorkloadIdentityPoolsResponse {
  
  inline def apply(): SchemaListWorkloadIdentityPoolsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListWorkloadIdentityPoolsResponse]
  }
  
  extension [Self <: SchemaListWorkloadIdentityPoolsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setWorkloadIdentityPools(value: js.Array[SchemaWorkloadIdentityPool]): Self = StObject.set(x, "workloadIdentityPools", value.asInstanceOf[js.Any])
    
    inline def setWorkloadIdentityPoolsUndefined: Self = StObject.set(x, "workloadIdentityPools", js.undefined)
    
    inline def setWorkloadIdentityPoolsVarargs(value: SchemaWorkloadIdentityPool*): Self = StObject.set(x, "workloadIdentityPools", js.Array(value*))
  }
}
