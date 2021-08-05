package typings.googleapis.polyV1Mod.polyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response message from a request to list.
  */
trait SchemaListUserAssetsResponse extends StObject {
  
  /**
    * The continuation token for retrieving the next page. If empty, indicates
    * that there are no more pages. To get the next page, submit the same
    * request specifying this value as the page_token.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The total number of assets in the list, without pagination.
    */
  var totalSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A list of UserAssets matching the request.
    */
  var userAssets: js.UndefOr[js.Array[SchemaUserAsset]] = js.undefined
}
object SchemaListUserAssetsResponse {
  
  inline def apply(): SchemaListUserAssetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListUserAssetsResponse]
  }
  
  extension [Self <: SchemaListUserAssetsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
    
    inline def setUserAssets(value: js.Array[SchemaUserAsset]): Self = StObject.set(x, "userAssets", value.asInstanceOf[js.Any])
    
    inline def setUserAssetsUndefined: Self = StObject.set(x, "userAssets", js.undefined)
    
    inline def setUserAssetsVarargs(value: SchemaUserAsset*): Self = StObject.set(x, "userAssets", js.Array(value :_*))
  }
}
