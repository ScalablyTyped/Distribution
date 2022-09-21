package typings.googleapis.secretmanagerV1beta1Mod.secretmanagerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListSecretVersionsResponse extends StObject {
  
  /**
    * A token to retrieve the next page of results. Pass this value in ListSecretVersionsRequest.page_token to retrieve the next page.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The total number of SecretVersions.
    */
  var totalSize: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The list of SecretVersions sorted in reverse by create_time (newest first).
    */
  var versions: js.UndefOr[js.Array[SchemaSecretVersion]] = js.undefined
}
object SchemaListSecretVersionsResponse {
  
  inline def apply(): SchemaListSecretVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSecretVersionsResponse]
  }
  
  extension [Self <: SchemaListSecretVersionsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeNull: Self = StObject.set(x, "totalSize", null)
    
    inline def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
    
    inline def setVersions(value: js.Array[SchemaSecretVersion]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    inline def setVersionsVarargs(value: SchemaSecretVersion*): Self = StObject.set(x, "versions", js.Array(value*))
  }
}
