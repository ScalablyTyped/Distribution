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
trait ParamsResourceChannelsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The categoryId parameter specifies a YouTube guide category, thereby
    * requesting YouTube channels associated with that category.
    */
  var categoryId: js.UndefOr[String] = js.native
  
  /**
    * The forUsername parameter specifies a YouTube username, thereby
    * requesting the channel associated with that username.
    */
  var forUsername: js.UndefOr[String] = js.native
  
  /**
    * The hl parameter should be used for filter out the properties that are
    * not in the given language. Used for the brandingSettings part.
    */
  var hl: js.UndefOr[String] = js.native
  
  /**
    * The id parameter specifies a comma-separated list of the YouTube channel
    * ID(s) for the resource(s) that are being retrieved. In a channel
    * resource, the id property specifies the channel's YouTube channel ID.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Note: This parameter is intended exclusively for YouTube content
    * partners.  Set this parameter's value to true to instruct the API to only
    * return channels managed by the content owner that the
    * onBehalfOfContentOwner parameter specifies. The user must be
    * authenticated as a CMS account linked to the specified content owner and
    * onBehalfOfContentOwner must be provided.
    */
  var managedByMe: js.UndefOr[Boolean] = js.native
  
  /**
    * The maxResults parameter specifies the maximum number of items that
    * should be returned in the result set.
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * Set this parameter's value to true to instruct the API to only return
    * channels owned by the authenticated user.
    */
  var mine: js.UndefOr[Boolean] = js.native
  
  /**
    * Use the subscriptions.list method and its mySubscribers parameter to
    * retrieve a list of subscribers to the authenticated user's channel.
    */
  var mySubscribers: js.UndefOr[Boolean] = js.native
  
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
  var onBehalfOfContentOwner: js.UndefOr[String] = js.native
  
  /**
    * The pageToken parameter identifies a specific page in the result set that
    * should be returned. In an API response, the nextPageToken and
    * prevPageToken properties identify other pages that could be retrieved.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * The part parameter specifies a comma-separated list of one or more
    * channel resource properties that the API response will include.  If the
    * parameter identifies a property that contains child properties, the child
    * properties will be included in the response. For example, in a channel
    * resource, the contentDetails property contains other properties, such as
    * the uploads properties. As such, if you set part=contentDetails, the API
    * response will also contain all of those nested properties.
    */
  var part: js.UndefOr[String] = js.native
}
object ParamsResourceChannelsList {
  
  @scala.inline
  def apply(): ParamsResourceChannelsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceChannelsList]
  }
  
  @scala.inline
  implicit class ParamsResourceChannelsListMutableBuilder[Self <: ParamsResourceChannelsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCategoryId(value: String): Self = StObject.set(x, "categoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryIdUndefined: Self = StObject.set(x, "categoryId", js.undefined)
    
    @scala.inline
    def setForUsername(value: String): Self = StObject.set(x, "forUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForUsernameUndefined: Self = StObject.set(x, "forUsername", js.undefined)
    
    @scala.inline
    def setHl(value: String): Self = StObject.set(x, "hl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHlUndefined: Self = StObject.set(x, "hl", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setManagedByMe(value: Boolean): Self = StObject.set(x, "managedByMe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedByMeUndefined: Self = StObject.set(x, "managedByMe", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setMine(value: Boolean): Self = StObject.set(x, "mine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMineUndefined: Self = StObject.set(x, "mine", js.undefined)
    
    @scala.inline
    def setMySubscribers(value: Boolean): Self = StObject.set(x, "mySubscribers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMySubscribersUndefined: Self = StObject.set(x, "mySubscribers", js.undefined)
    
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
  }
}
