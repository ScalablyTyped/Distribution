package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceLivebroadcastsBind extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The id parameter specifies the unique ID of the broadcast that is being
    * bound to a video stream.
    */
  var id: js.UndefOr[String] = js.native
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
  var onBehalfOfContentOwnerChannel: js.UndefOr[String] = js.native
  /**
    * The part parameter specifies a comma-separated list of one or more
    * liveBroadcast resource properties that the API response will include. The
    * part names that you can include in the parameter value are id, snippet,
    * contentDetails, and status.
    */
  var part: js.UndefOr[String] = js.native
  /**
    * The streamId parameter specifies the unique ID of the video stream that
    * is being bound to a broadcast. If this parameter is omitted, the API will
    * remove any existing binding between the broadcast and a video stream.
    */
  var streamId: js.UndefOr[String] = js.native
}

object ParamsResourceLivebroadcastsBind {
  @scala.inline
  def apply(): ParamsResourceLivebroadcastsBind = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLivebroadcastsBind]
  }
  @scala.inline
  implicit class ParamsResourceLivebroadcastsBindOps[Self <: ParamsResourceLivebroadcastsBind] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setOnBehalfOfContentOwner(value: String): Self = this.set("onBehalfOfContentOwner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnBehalfOfContentOwner: Self = this.set("onBehalfOfContentOwner", js.undefined)
    @scala.inline
    def setOnBehalfOfContentOwnerChannel(value: String): Self = this.set("onBehalfOfContentOwnerChannel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnBehalfOfContentOwnerChannel: Self = this.set("onBehalfOfContentOwnerChannel", js.undefined)
    @scala.inline
    def setPart(value: String): Self = this.set("part", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePart: Self = this.set("part", js.undefined)
    @scala.inline
    def setStreamId(value: String): Self = this.set("streamId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamId: Self = this.set("streamId", js.undefined)
  }
  
}

