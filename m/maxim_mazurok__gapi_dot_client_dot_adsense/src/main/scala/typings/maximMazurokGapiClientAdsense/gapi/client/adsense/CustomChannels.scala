package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomChannels extends StObject {
  
  /** ETag of this response for caching purposes. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** The custom channels returned in this list response. */
  var items: js.UndefOr[js.Array[CustomChannel]] = js.undefined
  
  /** Kind of list this is, in this case adsense#customChannels. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Continuation token used to page through custom channels. To retrieve the next page of results, set the next request's "pageToken" value to this. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object CustomChannels {
  
  @scala.inline
  def apply(): CustomChannels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomChannels]
  }
  
  @scala.inline
  implicit class CustomChannelsMutableBuilder[Self <: CustomChannels] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[CustomChannel]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: CustomChannel*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
