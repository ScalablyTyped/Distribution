package typings.googleapis.polyV1Mod.polyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response message from a request to list.
  */
trait SchemaListAssetsResponse extends StObject {
  
  /**
    * A list of assets that match the criteria specified in the request.
    */
  var assets: js.UndefOr[js.Array[SchemaAsset]] = js.undefined
  
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
}
object SchemaListAssetsResponse {
  
  @scala.inline
  def apply(): SchemaListAssetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAssetsResponse]
  }
  
  @scala.inline
  implicit class SchemaListAssetsResponseMutableBuilder[Self <: SchemaListAssetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssets(value: js.Array[SchemaAsset]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
    
    @scala.inline
    def setAssetsVarargs(value: SchemaAsset*): Self = StObject.set(x, "assets", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
