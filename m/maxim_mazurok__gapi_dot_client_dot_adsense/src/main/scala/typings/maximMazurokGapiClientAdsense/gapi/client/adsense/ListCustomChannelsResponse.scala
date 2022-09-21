package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCustomChannelsResponse extends StObject {
  
  /** The custom channels returned in this list response. */
  var customChannels: js.UndefOr[js.Array[CustomChannel]] = js.undefined
  
  /** Continuation token used to page through alerts. To retrieve the next page of the results, set the next request's "page_token" value to this. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListCustomChannelsResponse {
  
  inline def apply(): ListCustomChannelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCustomChannelsResponse]
  }
  
  extension [Self <: ListCustomChannelsResponse](x: Self) {
    
    inline def setCustomChannels(value: js.Array[CustomChannel]): Self = StObject.set(x, "customChannels", value.asInstanceOf[js.Any])
    
    inline def setCustomChannelsUndefined: Self = StObject.set(x, "customChannels", js.undefined)
    
    inline def setCustomChannelsVarargs(value: CustomChannel*): Self = StObject.set(x, "customChannels", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
