package typings.googleapis.secretmanagerV1Mod.secretmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListSecretsResponse extends StObject {
  
  /**
    * A token to retrieve the next page of results. Pass this value in ListSecretsRequest.page_token to retrieve the next page.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of Secrets sorted in reverse by create_time (newest first).
    */
  var secrets: js.UndefOr[js.Array[SchemaSecret]] = js.undefined
  
  /**
    * The total number of Secrets but 0 when the ListSecretsRequest.filter field is set.
    */
  var totalSize: js.UndefOr[Double | Null] = js.undefined
}
object SchemaListSecretsResponse {
  
  inline def apply(): SchemaListSecretsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSecretsResponse]
  }
  
  extension [Self <: SchemaListSecretsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSecrets(value: js.Array[SchemaSecret]): Self = StObject.set(x, "secrets", value.asInstanceOf[js.Any])
    
    inline def setSecretsUndefined: Self = StObject.set(x, "secrets", js.undefined)
    
    inline def setSecretsVarargs(value: SchemaSecret*): Self = StObject.set(x, "secrets", js.Array(value*))
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeNull: Self = StObject.set(x, "totalSize", null)
    
    inline def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
