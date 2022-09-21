package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListCustomBiddingScriptsResponse extends StObject {
  
  /**
    * The list of custom bidding scripts. This list will be absent if empty.
    */
  var customBiddingScripts: js.UndefOr[js.Array[SchemaCustomBiddingScript]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListCustomBiddingScriptsRequest` method to retrieve the next page of results. If this field is null, it means this is the last page.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListCustomBiddingScriptsResponse {
  
  inline def apply(): SchemaListCustomBiddingScriptsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCustomBiddingScriptsResponse]
  }
  
  extension [Self <: SchemaListCustomBiddingScriptsResponse](x: Self) {
    
    inline def setCustomBiddingScripts(value: js.Array[SchemaCustomBiddingScript]): Self = StObject.set(x, "customBiddingScripts", value.asInstanceOf[js.Any])
    
    inline def setCustomBiddingScriptsUndefined: Self = StObject.set(x, "customBiddingScripts", js.undefined)
    
    inline def setCustomBiddingScriptsVarargs(value: SchemaCustomBiddingScript*): Self = StObject.set(x, "customBiddingScripts", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
