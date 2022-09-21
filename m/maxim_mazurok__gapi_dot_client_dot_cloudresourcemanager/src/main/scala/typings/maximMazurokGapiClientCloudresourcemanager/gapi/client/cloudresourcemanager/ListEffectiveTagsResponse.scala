package typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEffectiveTagsResponse extends StObject {
  
  /** A possibly paginated list of effective tags for the specified resource. */
  var effectiveTags: js.UndefOr[js.Array[EffectiveTag]] = js.undefined
  
  /**
    * Pagination token. If the result set is too large to fit in a single response, this token is returned. It encodes the position of the current result cursor. Feeding this value into a
    * new list request with the `page_token` parameter gives the next page of the results. When `next_page_token` is not filled in, there is no next page and the list returned is the last
    * page in the result set. Pagination tokens have a limited lifetime.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListEffectiveTagsResponse {
  
  inline def apply(): ListEffectiveTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEffectiveTagsResponse]
  }
  
  extension [Self <: ListEffectiveTagsResponse](x: Self) {
    
    inline def setEffectiveTags(value: js.Array[EffectiveTag]): Self = StObject.set(x, "effectiveTags", value.asInstanceOf[js.Any])
    
    inline def setEffectiveTagsUndefined: Self = StObject.set(x, "effectiveTags", js.undefined)
    
    inline def setEffectiveTagsVarargs(value: EffectiveTag*): Self = StObject.set(x, "effectiveTags", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
