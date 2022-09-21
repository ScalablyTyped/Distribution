package typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagBindingsResponse extends StObject {
  
  /**
    * Pagination token. If the result set is too large to fit in a single response, this token is returned. It encodes the position of the current result cursor. Feeding this value into a
    * new list request with the `page_token` parameter gives the next page of the results. When `next_page_token` is not filled in, there is no next page and the list returned is the last
    * page in the result set. Pagination tokens have a limited lifetime.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** A possibly paginated list of TagBindings for the specified resource. */
  var tagBindings: js.UndefOr[js.Array[TagBinding]] = js.undefined
}
object ListTagBindingsResponse {
  
  inline def apply(): ListTagBindingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagBindingsResponse]
  }
  
  extension [Self <: ListTagBindingsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTagBindings(value: js.Array[TagBinding]): Self = StObject.set(x, "tagBindings", value.asInstanceOf[js.Any])
    
    inline def setTagBindingsUndefined: Self = StObject.set(x, "tagBindings", js.undefined)
    
    inline def setTagBindingsVarargs(value: TagBinding*): Self = StObject.set(x, "tagBindings", js.Array(value*))
  }
}
