package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import typings.googleapis.anon.Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCaptionsUpdate
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Media metadata
    */
  var media: js.UndefOr[Body] = js.undefined
  
  /**
    * ID of the Google+ Page for the channel that the request is be on behalf
    * of
    */
  var onBehalfOf: js.UndefOr[String] = js.undefined
  
  /**
    * Note: This parameter is intended exclusively for YouTube content
    * partners.  The onBehalfOfContentOwner parameter indicates that the
    * request's authorization credentials identify a YouTube CMS user who is
    * acting on behalf of the content owner specified in the parameter value.
    * This parameter is intended for YouTube content partners that own and
    * manage many different YouTube channels. It allows content owners to
    * authenticate once and get access to all their video and channel data,
    * without having to provide authentication credentials for each individual
    * channel. The actual CMS account that the user authenticates with must be
    * linked to the specified YouTube content owner.
    */
  var onBehalfOfContentOwner: js.UndefOr[String] = js.undefined
  
  /**
    * The part parameter serves two purposes in this operation. It identifies
    * the properties that the write operation will set as well as the
    * properties that the API response will include. Set the property value to
    * snippet if you are updating the track's draft status. Otherwise, set the
    * property value to id.
    */
  var part: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCaption] = js.undefined
  
  /**
    * Note: The API server only processes the parameter value if the request
    * contains an updated caption file.  The sync parameter indicates whether
    * YouTube should automatically synchronize the caption file with the audio
    * track of the video. If you set the value to true, YouTube will
    * automatically synchronize the caption track with the audio track.
    */
  var sync: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceCaptionsUpdate {
  
  @scala.inline
  def apply(): ParamsResourceCaptionsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCaptionsUpdate]
  }
  
  @scala.inline
  implicit class ParamsResourceCaptionsUpdateMutableBuilder[Self <: ParamsResourceCaptionsUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setMedia(value: Body): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    @scala.inline
    def setOnBehalfOf(value: String): Self = StObject.set(x, "onBehalfOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBehalfOfContentOwner(value: String): Self = StObject.set(x, "onBehalfOfContentOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBehalfOfContentOwnerUndefined: Self = StObject.set(x, "onBehalfOfContentOwner", js.undefined)
    
    @scala.inline
    def setOnBehalfOfUndefined: Self = StObject.set(x, "onBehalfOf", js.undefined)
    
    @scala.inline
    def setPart(value: String): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaCaption): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
  }
}
