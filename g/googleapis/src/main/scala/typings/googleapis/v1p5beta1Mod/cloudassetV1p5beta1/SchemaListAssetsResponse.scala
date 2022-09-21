package typings.googleapis.v1p5beta1Mod.cloudassetV1p5beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListAssetsResponse extends StObject {
  
  /**
    * Assets.
    */
  var assets: js.UndefOr[js.Array[SchemaAsset]] = js.undefined
  
  /**
    * Token to retrieve the next page of results. It expires 72 hours after the page token for the first page is generated. Set to empty if there are no remaining results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time the snapshot was taken.
    */
  var readTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaListAssetsResponse {
  
  inline def apply(): SchemaListAssetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAssetsResponse]
  }
  
  extension [Self <: SchemaListAssetsResponse](x: Self) {
    
    inline def setAssets(value: js.Array[SchemaAsset]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
    
    inline def setAssetsVarargs(value: SchemaAsset*): Self = StObject.set(x, "assets", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeNull: Self = StObject.set(x, "readTime", null)
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
  }
}
