package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRegionsResponse extends StObject {
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The regions from the specified merchant. */
  var regions: js.UndefOr[js.Array[Region]] = js.undefined
}
object ListRegionsResponse {
  
  inline def apply(): ListRegionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRegionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRegionsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRegions(value: js.Array[Region]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    inline def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
    
    inline def setRegionsVarargs(value: Region*): Self = StObject.set(x, "regions", js.Array(value*))
  }
}
