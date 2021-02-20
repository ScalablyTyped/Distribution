package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListQuerySourcesResponse extends StObject {
  
  var nextPageToken: js.UndefOr[String] = js.native
  
  var sources: js.UndefOr[js.Array[QuerySource]] = js.native
}
object ListQuerySourcesResponse {
  
  @scala.inline
  def apply(): ListQuerySourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQuerySourcesResponse]
  }
  
  @scala.inline
  implicit class ListQuerySourcesResponseMutableBuilder[Self <: ListQuerySourcesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setSources(value: js.Array[QuerySource]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: QuerySource*): Self = StObject.set(x, "sources", js.Array(value :_*))
  }
}
