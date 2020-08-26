package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceChannelsectionsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The channelId parameter specifies a YouTube channel ID. The API will only
    * return that channel's channelSections.
    */
  var channelId: js.UndefOr[String] = js.native
  /**
    * The hl parameter indicates that the snippet.localized property values in
    * the returned channelSection resources should be in the specified language
    * if localized values for that language are available. For example, if the
    * API request specifies hl=de, the snippet.localized properties in the API
    * response will contain German titles if German titles are available.
    * Channel owners can provide localized channel section titles using either
    * the channelSections.insert or channelSections.update method.
    */
  var hl: js.UndefOr[String] = js.native
  /**
    * The id parameter specifies a comma-separated list of the YouTube
    * channelSection ID(s) for the resource(s) that are being retrieved. In a
    * channelSection resource, the id property specifies the YouTube
    * channelSection ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Set this parameter's value to true to retrieve a feed of the
    * authenticated user's channelSections.
    */
  var mine: js.UndefOr[Boolean] = js.native
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
    * The part parameter specifies a comma-separated list of one or more
    * channelSection resource properties that the API response will include.
    * The part names that you can include in the parameter value are id,
    * snippet, and contentDetails.  If the parameter identifies a property that
    * contains child properties, the child properties will be included in the
    * response. For example, in a channelSection resource, the snippet property
    * contains other properties, such as a display title for the
    * channelSection. If you set part=snippet, the API response will also
    * contain all of those nested properties.
    */
  var part: js.UndefOr[String] = js.native
}

object ParamsResourceChannelsectionsList {
  @scala.inline
  def apply(): ParamsResourceChannelsectionsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceChannelsectionsList]
  }
  @scala.inline
  implicit class ParamsResourceChannelsectionsListOps[Self <: ParamsResourceChannelsectionsList] (val x: Self) extends AnyVal {
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
    def setChannelId(value: String): Self = this.set("channelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelId: Self = this.set("channelId", js.undefined)
    @scala.inline
    def setHl(value: String): Self = this.set("hl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHl: Self = this.set("hl", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setMine(value: Boolean): Self = this.set("mine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMine: Self = this.set("mine", js.undefined)
    @scala.inline
    def setOnBehalfOfContentOwner(value: String): Self = this.set("onBehalfOfContentOwner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnBehalfOfContentOwner: Self = this.set("onBehalfOfContentOwner", js.undefined)
    @scala.inline
    def setPart(value: String): Self = this.set("part", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePart: Self = this.set("part", js.undefined)
  }
  
}

