package typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagHoldsResponse extends StObject {
  
  /**
    * Pagination token. If the result set is too large to fit in a single response, this token is returned. It encodes the position of the current result cursor. Feeding this value into a
    * new list request with the `page_token` parameter gives the next page of the results. When `next_page_token` is not filled in, there is no next page and the list returned is the last
    * page in the result set. Pagination tokens have a limited lifetime.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** A possibly paginated list of TagHolds. */
  var tagHolds: js.UndefOr[js.Array[TagHold]] = js.undefined
}
object ListTagHoldsResponse {
  
  inline def apply(): ListTagHoldsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagHoldsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTagHoldsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTagHolds(value: js.Array[TagHold]): Self = StObject.set(x, "tagHolds", value.asInstanceOf[js.Any])
    
    inline def setTagHoldsUndefined: Self = StObject.set(x, "tagHolds", js.undefined)
    
    inline def setTagHoldsVarargs(value: TagHold*): Self = StObject.set(x, "tagHolds", js.Array(value*))
  }
}
