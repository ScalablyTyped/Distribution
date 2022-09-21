package typings.googleapis.v2Mod.adsenseV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListUrlChannelsResponse extends StObject {
  
  /**
    * Continuation token used to page through url channels. To retrieve the next page of the results, set the next request's "page_token" value to this.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The url channels returned in this list response.
    */
  var urlChannels: js.UndefOr[js.Array[SchemaUrlChannel]] = js.undefined
}
object SchemaListUrlChannelsResponse {
  
  inline def apply(): SchemaListUrlChannelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListUrlChannelsResponse]
  }
  
  extension [Self <: SchemaListUrlChannelsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUrlChannels(value: js.Array[SchemaUrlChannel]): Self = StObject.set(x, "urlChannels", value.asInstanceOf[js.Any])
    
    inline def setUrlChannelsUndefined: Self = StObject.set(x, "urlChannels", js.undefined)
    
    inline def setUrlChannelsVarargs(value: SchemaUrlChannel*): Self = StObject.set(x, "urlChannels", js.Array(value*))
  }
}
