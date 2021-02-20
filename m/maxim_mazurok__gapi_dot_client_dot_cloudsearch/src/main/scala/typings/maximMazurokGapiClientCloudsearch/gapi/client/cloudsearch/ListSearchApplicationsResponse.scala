package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSearchApplicationsResponse extends StObject {
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  var searchApplications: js.UndefOr[js.Array[SearchApplication]] = js.native
}
object ListSearchApplicationsResponse {
  
  @scala.inline
  def apply(): ListSearchApplicationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSearchApplicationsResponse]
  }
  
  @scala.inline
  implicit class ListSearchApplicationsResponseMutableBuilder[Self <: ListSearchApplicationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setSearchApplications(value: js.Array[SearchApplication]): Self = StObject.set(x, "searchApplications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchApplicationsUndefined: Self = StObject.set(x, "searchApplications", js.undefined)
    
    @scala.inline
    def setSearchApplicationsVarargs(value: SearchApplication*): Self = StObject.set(x, "searchApplications", js.Array(value :_*))
  }
}
