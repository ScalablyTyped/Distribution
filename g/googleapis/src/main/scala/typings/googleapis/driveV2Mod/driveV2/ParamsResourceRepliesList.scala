package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRepliesList
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the comment.
    */
  var commentId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the file.
    */
  var fileId: js.UndefOr[String] = js.undefined
  
  /**
    * If set, all replies, including deleted replies (with content stripped) will be returned.
    */
  var includeDeleted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum number of replies to include in the response, used for paging.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * The continuation token, used to page through large result sets. To get the next page of results, set this parameter to the value of "nextPageToken" from the previous response.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceRepliesList {
  
  inline def apply(): ParamsResourceRepliesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRepliesList]
  }
  
  extension [Self <: ParamsResourceRepliesList](x: Self) {
    
    inline def setCommentId(value: String): Self = StObject.set(x, "commentId", value.asInstanceOf[js.Any])
    
    inline def setCommentIdUndefined: Self = StObject.set(x, "commentId", js.undefined)
    
    inline def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    inline def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
    
    inline def setIncludeDeleted(value: Boolean): Self = StObject.set(x, "includeDeleted", value.asInstanceOf[js.Any])
    
    inline def setIncludeDeletedUndefined: Self = StObject.set(x, "includeDeleted", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
