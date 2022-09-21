package typings.googleapis.v2Mod.adsenseV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListLinkedCustomChannelsResponse extends StObject {
  
  /**
    * The custom channels returned in this list response.
    */
  var customChannels: js.UndefOr[js.Array[SchemaCustomChannel]] = js.undefined
  
  /**
    * Continuation token used to page through alerts. To retrieve the next page of the results, set the next request's "page_token" value to this.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListLinkedCustomChannelsResponse {
  
  inline def apply(): SchemaListLinkedCustomChannelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListLinkedCustomChannelsResponse]
  }
  
  extension [Self <: SchemaListLinkedCustomChannelsResponse](x: Self) {
    
    inline def setCustomChannels(value: js.Array[SchemaCustomChannel]): Self = StObject.set(x, "customChannels", value.asInstanceOf[js.Any])
    
    inline def setCustomChannelsUndefined: Self = StObject.set(x, "customChannels", js.undefined)
    
    inline def setCustomChannelsVarargs(value: SchemaCustomChannel*): Self = StObject.set(x, "customChannels", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
