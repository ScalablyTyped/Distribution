package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUrlChannelsResponse extends StObject {
  
  /** Continuation token used to page through url channels. To retrieve the next page of the results, set the next request's "page_token" value to this. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The url channels returned in this list response. */
  var urlChannels: js.UndefOr[js.Array[UrlChannel]] = js.undefined
}
object ListUrlChannelsResponse {
  
  inline def apply(): ListUrlChannelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUrlChannelsResponse]
  }
  
  extension [Self <: ListUrlChannelsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUrlChannels(value: js.Array[UrlChannel]): Self = StObject.set(x, "urlChannels", value.asInstanceOf[js.Any])
    
    inline def setUrlChannelsUndefined: Self = StObject.set(x, "urlChannels", js.undefined)
    
    inline def setUrlChannelsVarargs(value: UrlChannel*): Self = StObject.set(x, "urlChannels", js.Array(value*))
  }
}
