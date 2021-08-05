package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCommentsList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The id parameter specifies a comma-separated list of comment IDs for the
    * resources that are being retrieved. In a comment resource, the id
    * property specifies the comment's ID.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The maxResults parameter specifies the maximum number of items that
    * should be returned in the result set.  Note: This parameter is not
    * supported for use in conjunction with the id parameter.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * The pageToken parameter identifies a specific page in the result set that
    * should be returned. In an API response, the nextPageToken property
    * identifies the next page of the result that can be retrieved.  Note: This
    * parameter is not supported for use in conjunction with the id parameter.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The parentId parameter specifies the ID of the comment for which replies
    * should be retrieved.  Note: YouTube currently supports replies only for
    * top-level comments. However, replies to replies may be supported in the
    * future.
    */
  var parentId: js.UndefOr[String] = js.undefined
  
  /**
    * The part parameter specifies a comma-separated list of one or more
    * comment resource properties that the API response will include.
    */
  var part: js.UndefOr[String] = js.undefined
  
  /**
    * This parameter indicates whether the API should return comments formatted
    * as HTML or as plain text.
    */
  var textFormat: js.UndefOr[String] = js.undefined
}
object ParamsResourceCommentsList {
  
  inline def apply(): ParamsResourceCommentsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCommentsList]
  }
  
  extension [Self <: ParamsResourceCommentsList](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    
    inline def setPart(value: String): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
    
    inline def setTextFormat(value: String): Self = StObject.set(x, "textFormat", value.asInstanceOf[js.Any])
    
    inline def setTextFormatUndefined: Self = StObject.set(x, "textFormat", js.undefined)
  }
}
