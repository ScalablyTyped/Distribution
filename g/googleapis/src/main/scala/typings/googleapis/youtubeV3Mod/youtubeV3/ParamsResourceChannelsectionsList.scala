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
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    channelId: String = null,
    fields: String = null,
    hl: String = null,
    id: String = null,
    key: String = null,
    mine: js.UndefOr[Boolean] = js.undefined,
    oauth_token: String = null,
    onBehalfOfContentOwner: String = null,
    part: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    userIp: String = null
  ): ParamsResourceChannelsectionsList = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (hl != null) __obj.updateDynamic("hl")(hl.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(mine)) __obj.updateDynamic("mine")(mine.get.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (onBehalfOfContentOwner != null) __obj.updateDynamic("onBehalfOfContentOwner")(onBehalfOfContentOwner.asInstanceOf[js.Any])
    if (part != null) __obj.updateDynamic("part")(part.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceChannelsectionsList]
  }
}

