package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLivebroadcastsControl
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The displaySlate parameter specifies whether the slate is being enabled
    * or disabled.
    */
  var displaySlate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The id parameter specifies the YouTube live broadcast ID that uniquely
    * identifies the broadcast in which the slate is being updated.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The offsetTimeMs parameter specifies a positive time offset when the
    * specified slate change will occur. The value is measured in milliseconds
    * from the beginning of the broadcast's monitor stream, which is the time
    * that the testing phase for the broadcast began. Even though it is
    * specified in milliseconds, the value is actually an approximation, and
    * YouTube completes the requested action as closely as possible to that
    * time.  If you do not specify a value for this parameter, then YouTube
    * performs the action as soon as possible. See the Getting started guide
    * for more details.  Important: You should only specify a value for this
    * parameter if your broadcast stream is delayed.
    */
  var offsetTimeMs: js.UndefOr[String] = js.undefined
  
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
    * The part parameter specifies a comma-separated list of one or more
    * liveBroadcast resource properties that the API response will include. The
    * part names that you can include in the parameter value are id, snippet,
    * contentDetails, and status.
    */
  var part: js.UndefOr[String] = js.undefined
  
  /**
    * The walltime parameter specifies the wall clock time at which the
    * specified slate change will occur. The value is specified in ISO 8601
    * (YYYY-MM-DDThh:mm:ss.sssZ) format.
    */
  var walltime: js.UndefOr[String] = js.undefined
}
object ParamsResourceLivebroadcastsControl {
  
  @scala.inline
  def apply(): ParamsResourceLivebroadcastsControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLivebroadcastsControl]
  }
  
  @scala.inline
  implicit class ParamsResourceLivebroadcastsControlMutableBuilder[Self <: ParamsResourceLivebroadcastsControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setDisplaySlate(value: Boolean): Self = StObject.set(x, "displaySlate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplaySlateUndefined: Self = StObject.set(x, "displaySlate", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setOffsetTimeMs(value: String): Self = StObject.set(x, "offsetTimeMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetTimeMsUndefined: Self = StObject.set(x, "offsetTimeMs", js.undefined)
    
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
    def setWalltime(value: String): Self = StObject.set(x, "walltime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWalltimeUndefined: Self = StObject.set(x, "walltime", js.undefined)
  }
}
