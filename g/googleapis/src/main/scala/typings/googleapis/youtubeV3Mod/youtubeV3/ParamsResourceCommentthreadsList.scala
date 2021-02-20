package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceCommentthreadsList extends StandardParameters {
  
  /**
    * The allThreadsRelatedToChannelId parameter instructs the API to return
    * all comment threads associated with the specified channel. The response
    * can include comments about the channel or about the channel's videos.
    */
  var allThreadsRelatedToChannelId: js.UndefOr[String] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The channelId parameter instructs the API to return comment threads
    * containing comments about the specified channel. (The response will not
    * include comments left on videos that the channel uploaded.)
    */
  var channelId: js.UndefOr[String] = js.native
  
  /**
    * The id parameter specifies a comma-separated list of comment thread IDs
    * for the resources that should be retrieved.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The maxResults parameter specifies the maximum number of items that
    * should be returned in the result set.  Note: This parameter is not
    * supported for use in conjunction with the id parameter.
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * Set this parameter to limit the returned comment threads to a particular
    * moderation state.  Note: This parameter is not supported for use in
    * conjunction with the id parameter.
    */
  var moderationStatus: js.UndefOr[String] = js.native
  
  /**
    * The order parameter specifies the order in which the API response should
    * list comment threads. Valid values are:  - time - Comment threads are
    * ordered by time. This is the default behavior. - relevance - Comment
    * threads are ordered by relevance.Note: This parameter is not supported
    * for use in conjunction with the id parameter.
    */
  var order: js.UndefOr[String] = js.native
  
  /**
    * The pageToken parameter identifies a specific page in the result set that
    * should be returned. In an API response, the nextPageToken property
    * identifies the next page of the result that can be retrieved.  Note: This
    * parameter is not supported for use in conjunction with the id parameter.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * The part parameter specifies a comma-separated list of one or more
    * commentThread resource properties that the API response will include.
    */
  var part: js.UndefOr[String] = js.native
  
  /**
    * The searchTerms parameter instructs the API to limit the API response to
    * only contain comments that contain the specified search terms.  Note:
    * This parameter is not supported for use in conjunction with the id
    * parameter.
    */
  var searchTerms: js.UndefOr[String] = js.native
  
  /**
    * Set this parameter's value to html or plainText to instruct the API to
    * return the comments left by users in html formatted or in plain text.
    */
  var textFormat: js.UndefOr[String] = js.native
  
  /**
    * The videoId parameter instructs the API to return comment threads
    * associated with the specified video ID.
    */
  var videoId: js.UndefOr[String] = js.native
}
object ParamsResourceCommentthreadsList {
  
  @scala.inline
  def apply(): ParamsResourceCommentthreadsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCommentthreadsList]
  }
  
  @scala.inline
  implicit class ParamsResourceCommentthreadsListMutableBuilder[Self <: ParamsResourceCommentthreadsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllThreadsRelatedToChannelId(value: String): Self = StObject.set(x, "allThreadsRelatedToChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllThreadsRelatedToChannelIdUndefined: Self = StObject.set(x, "allThreadsRelatedToChannelId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setModerationStatus(value: String): Self = StObject.set(x, "moderationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModerationStatusUndefined: Self = StObject.set(x, "moderationStatus", js.undefined)
    
    @scala.inline
    def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setPart(value: String): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
    
    @scala.inline
    def setSearchTerms(value: String): Self = StObject.set(x, "searchTerms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchTermsUndefined: Self = StObject.set(x, "searchTerms", js.undefined)
    
    @scala.inline
    def setTextFormat(value: String): Self = StObject.set(x, "textFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextFormatUndefined: Self = StObject.set(x, "textFormat", js.undefined)
    
    @scala.inline
    def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
  }
}
