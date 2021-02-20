package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRegionsResponse extends StObject {
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The regions from the specified merchant. */
  var regions: js.UndefOr[js.Array[Region]] = js.native
}
object ListRegionsResponse {
  
  @scala.inline
  def apply(): ListRegionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRegionsResponse]
  }
  
  @scala.inline
  implicit class ListRegionsResponseMutableBuilder[Self <: ListRegionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setRegions(value: js.Array[Region]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
    
    @scala.inline
    def setRegionsVarargs(value: Region*): Self = StObject.set(x, "regions", js.Array(value :_*))
  }
}
