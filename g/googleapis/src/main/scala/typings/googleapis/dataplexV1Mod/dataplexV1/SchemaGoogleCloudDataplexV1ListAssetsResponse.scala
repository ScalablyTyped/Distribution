package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1ListAssetsResponse extends StObject {
  
  /**
    * Asset under the given parent zone.
    */
  var assets: js.UndefOr[js.Array[SchemaGoogleCloudDataplexV1Asset]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1ListAssetsResponse {
  
  inline def apply(): SchemaGoogleCloudDataplexV1ListAssetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1ListAssetsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1ListAssetsResponse](x: Self) {
    
    inline def setAssets(value: js.Array[SchemaGoogleCloudDataplexV1Asset]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
    
    inline def setAssetsVarargs(value: SchemaGoogleCloudDataplexV1Asset*): Self = StObject.set(x, "assets", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
