package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePlaylistitemsList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The id parameter specifies a comma-separated list of one or more unique
    * playlist item IDs.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The maxResults parameter specifies the maximum number of items that
    * should be returned in the result set.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Note: This parameter is intended exclusively for YouTube content
    * partners.  The onBehalfOfContentOwner parameter indicates that the
    * request's authorization credentials identify a YouTube CMS user who is
    * acting on behalf of the content owner specified in the parameter value.
    * This parameter is intended for YouTube content partners that own and
    * manage many different YouTube channels. It allows content owners to
    * authenticate once and get access to all their video and channel data,
    * without having to provide authentication credentials for each individual
    * channel. The CMS account that the user authenticates with must be linked
    * to the specified YouTube content owner.
    */
  var onBehalfOfContentOwner: js.UndefOr[String] = js.undefined
  
  /**
    * The pageToken parameter identifies a specific page in the result set that
    * should be returned. In an API response, the nextPageToken and
    * prevPageToken properties identify other pages that could be retrieved.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The part parameter specifies a comma-separated list of one or more
    * playlistItem resource properties that the API response will include.  If
    * the parameter identifies a property that contains child properties, the
    * child properties will be included in the response. For example, in a
    * playlistItem resource, the snippet property contains numerous fields,
    * including the title, description, position, and resourceId properties. As
    * such, if you set part=snippet, the API response will contain all of those
    * properties.
    */
  var part: js.UndefOr[String] = js.undefined
  
  /**
    * The playlistId parameter specifies the unique ID of the playlist for
    * which you want to retrieve playlist items. Note that even though this is
    * an optional parameter, every request to retrieve playlist items must
    * specify a value for either the id parameter or the playlistId parameter.
    */
  var playlistId: js.UndefOr[String] = js.undefined
  
  /**
    * The videoId parameter specifies that the request should return only the
    * playlist items that contain the specified video.
    */
  var videoId: js.UndefOr[String] = js.undefined
}
object ParamsResourcePlaylistitemsList {
  
  @scala.inline
  def apply(): ParamsResourcePlaylistitemsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePlaylistitemsList]
  }
  
  @scala.inline
  implicit class ParamsResourcePlaylistitemsListMutableBuilder[Self <: ParamsResourcePlaylistitemsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setOnBehalfOfContentOwner(value: String): Self = StObject.set(x, "onBehalfOfContentOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBehalfOfContentOwnerUndefined: Self = StObject.set(x, "onBehalfOfContentOwner", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setPart(value: String): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
    
    @scala.inline
    def setPlaylistId(value: String): Self = StObject.set(x, "playlistId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaylistIdUndefined: Self = StObject.set(x, "playlistId", js.undefined)
    
    @scala.inline
    def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
  }
}
