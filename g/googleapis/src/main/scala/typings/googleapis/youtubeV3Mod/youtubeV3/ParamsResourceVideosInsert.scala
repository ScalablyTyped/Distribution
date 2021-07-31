package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import typings.googleapis.anon.Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceVideosInsert
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The autoLevels parameter indicates whether YouTube should automatically
    * enhance the video's lighting and color.
    */
  var autoLevels: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Media metadata
    */
  var media: js.UndefOr[Body] = js.undefined
  
  /**
    * The notifySubscribers parameter indicates whether YouTube should send a
    * notification about the new video to users who subscribe to the video's
    * channel. A parameter value of True indicates that subscribers will be
    * notified of newly uploaded videos. However, a channel owner who is
    * uploading many videos might prefer to set the value to False to avoid
    * sending a notification about each new video to the channel's subscribers.
    */
  var notifySubscribers: js.UndefOr[Boolean] = js.undefined
  
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
    * This parameter can only be used in a properly authorized request. Note:
    * This parameter is intended exclusively for YouTube content partners.  The
    * onBehalfOfContentOwnerChannel parameter specifies the YouTube channel ID
    * of the channel to which a video is being added. This parameter is
    * required when a request specifies a value for the onBehalfOfContentOwner
    * parameter, and it can only be used in conjunction with that parameter. In
    * addition, the request must be authorized using a CMS account that is
    * linked to the content owner that the onBehalfOfContentOwner parameter
    * specifies. Finally, the channel that the onBehalfOfContentOwnerChannel
    * parameter value specifies must be linked to the content owner that the
    * onBehalfOfContentOwner parameter specifies.  This parameter is intended
    * for YouTube content partners that own and manage many different YouTube
    * channels. It allows content owners to authenticate once and perform
    * actions on behalf of the channel specified in the parameter value,
    * without having to provide authentication credentials for each separate
    * channel.
    */
  var onBehalfOfContentOwnerChannel: js.UndefOr[String] = js.undefined
  
  /**
    * The part parameter serves two purposes in this operation. It identifies
    * the properties that the write operation will set as well as the
    * properties that the API response will include.  Note that not all parts
    * contain properties that can be set when inserting or updating a video.
    * For example, the statistics object encapsulates statistics that YouTube
    * calculates for a video and does not contain values that you can set or
    * modify. If the parameter value specifies a part that does not contain
    * mutable values, that part will still be included in the API response.
    */
  var part: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaVideo] = js.undefined
  
  /**
    * The stabilize parameter indicates whether YouTube should adjust the video
    * to remove shaky camera motions.
    */
  var stabilize: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceVideosInsert {
  
  @scala.inline
  def apply(): ParamsResourceVideosInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceVideosInsert]
  }
  
  @scala.inline
  implicit class ParamsResourceVideosInsertMutableBuilder[Self <: ParamsResourceVideosInsert] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setAutoLevels(value: Boolean): Self = StObject.set(x, "autoLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoLevelsUndefined: Self = StObject.set(x, "autoLevels", js.undefined)
    
    @scala.inline
    def setMedia(value: Body): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    @scala.inline
    def setNotifySubscribers(value: Boolean): Self = StObject.set(x, "notifySubscribers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotifySubscribersUndefined: Self = StObject.set(x, "notifySubscribers", js.undefined)
    
    @scala.inline
    def setOnBehalfOfContentOwner(value: String): Self = StObject.set(x, "onBehalfOfContentOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBehalfOfContentOwnerChannel(value: String): Self = StObject.set(x, "onBehalfOfContentOwnerChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBehalfOfContentOwnerChannelUndefined: Self = StObject.set(x, "onBehalfOfContentOwnerChannel", js.undefined)
    
    @scala.inline
    def setOnBehalfOfContentOwnerUndefined: Self = StObject.set(x, "onBehalfOfContentOwner", js.undefined)
    
    @scala.inline
    def setPart(value: String): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaVideo): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setStabilize(value: Boolean): Self = StObject.set(x, "stabilize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStabilizeUndefined: Self = StObject.set(x, "stabilize", js.undefined)
  }
}
