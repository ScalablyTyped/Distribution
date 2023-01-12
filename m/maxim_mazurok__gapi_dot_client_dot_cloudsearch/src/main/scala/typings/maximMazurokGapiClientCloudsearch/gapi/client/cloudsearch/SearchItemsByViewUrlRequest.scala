package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchItemsByViewUrlRequest extends StObject {
  
  /** Common debug options. */
  var debugOptions: js.UndefOr[DebugOptions] = js.undefined
  
  /** The next_page_token value returned from a previous request, if any. */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /** Specify the full view URL to find the corresponding item. The maximum length is 2048 characters. */
  var viewUrl: js.UndefOr[String] = js.undefined
}
object SearchItemsByViewUrlRequest {
  
  inline def apply(): SearchItemsByViewUrlRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchItemsByViewUrlRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchItemsByViewUrlRequest] (val x: Self) extends AnyVal {
    
    inline def setDebugOptions(value: DebugOptions): Self = StObject.set(x, "debugOptions", value.asInstanceOf[js.Any])
    
    inline def setDebugOptionsUndefined: Self = StObject.set(x, "debugOptions", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setViewUrl(value: String): Self = StObject.set(x, "viewUrl", value.asInstanceOf[js.Any])
    
    inline def setViewUrlUndefined: Self = StObject.set(x, "viewUrl", js.undefined)
  }
}
