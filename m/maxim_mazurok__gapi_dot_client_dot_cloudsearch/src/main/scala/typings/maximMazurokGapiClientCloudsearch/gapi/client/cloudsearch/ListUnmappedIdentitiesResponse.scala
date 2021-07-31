package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUnmappedIdentitiesResponse extends StObject {
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  var unmappedIdentities: js.UndefOr[js.Array[UnmappedIdentity]] = js.undefined
}
object ListUnmappedIdentitiesResponse {
  
  @scala.inline
  def apply(): ListUnmappedIdentitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUnmappedIdentitiesResponse]
  }
  
  @scala.inline
  implicit class ListUnmappedIdentitiesResponseMutableBuilder[Self <: ListUnmappedIdentitiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setUnmappedIdentities(value: js.Array[UnmappedIdentity]): Self = StObject.set(x, "unmappedIdentities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnmappedIdentitiesUndefined: Self = StObject.set(x, "unmappedIdentities", js.undefined)
    
    @scala.inline
    def setUnmappedIdentitiesVarargs(value: UnmappedIdentity*): Self = StObject.set(x, "unmappedIdentities", js.Array(value :_*))
  }
}
