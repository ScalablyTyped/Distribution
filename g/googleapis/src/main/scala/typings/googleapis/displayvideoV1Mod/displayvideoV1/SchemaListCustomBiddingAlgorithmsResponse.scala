package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListCustomBiddingAlgorithmsResponse extends StObject {
  
  /**
    * The list of custom bidding algorithms. This list will be absent if empty.
    */
  var customBiddingAlgorithms: js.UndefOr[js.Array[SchemaCustomBiddingAlgorithm]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListCustomBiddingAlgorithmsRequest` method to retrieve the next page of results. If this field is null, it means this is the last page.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListCustomBiddingAlgorithmsResponse {
  
  inline def apply(): SchemaListCustomBiddingAlgorithmsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCustomBiddingAlgorithmsResponse]
  }
  
  extension [Self <: SchemaListCustomBiddingAlgorithmsResponse](x: Self) {
    
    inline def setCustomBiddingAlgorithms(value: js.Array[SchemaCustomBiddingAlgorithm]): Self = StObject.set(x, "customBiddingAlgorithms", value.asInstanceOf[js.Any])
    
    inline def setCustomBiddingAlgorithmsUndefined: Self = StObject.set(x, "customBiddingAlgorithms", js.undefined)
    
    inline def setCustomBiddingAlgorithmsVarargs(value: SchemaCustomBiddingAlgorithm*): Self = StObject.set(x, "customBiddingAlgorithms", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
