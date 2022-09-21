package typings.googleapis.cloudsupportV2betaMod.cloudsupportV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListCommentsResponse extends StObject {
  
  /**
    * The list of Comments associated with the given Case.
    */
  var comments: js.UndefOr[js.Array[SchemaComment]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. This should be set in the `page_token` field of subsequent `ListCommentsRequest` message that is issued. If unspecified, there are no more results to retrieve.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListCommentsResponse {
  
  inline def apply(): SchemaListCommentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCommentsResponse]
  }
  
  extension [Self <: SchemaListCommentsResponse](x: Self) {
    
    inline def setComments(value: js.Array[SchemaComment]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: SchemaComment*): Self = StObject.set(x, "comments", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
