package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceVideosList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The chart parameter identifies the chart that you want to retrieve.
    */
  var chart: js.UndefOr[String] = js.native
  /**
    * The hl parameter instructs the API to retrieve localized resource
    * metadata for a specific application language that the YouTube website
    * supports. The parameter value must be a language code included in the
    * list returned by the i18nLanguages.list method.  If localized resource
    * details are available in that language, the resource's snippet.localized
    * object will contain the localized values. However, if localized details
    * are not available, the snippet.localized object will contain resource
    * details in the resource's default language.
    */
  var hl: js.UndefOr[String] = js.native
  /**
    * The id parameter specifies a comma-separated list of the YouTube video
    * ID(s) for the resource(s) that are being retrieved. In a video resource,
    * the id property specifies the video's ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * DEPRECATED
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * The maxHeight parameter specifies a maximum height of the embedded
    * player. If maxWidth is provided, maxHeight may not be reached in order to
    * not violate the width request.
    */
  var maxHeight: js.UndefOr[Double] = js.native
  /**
    * The maxResults parameter specifies the maximum number of items that
    * should be returned in the result set.  Note: This parameter is supported
    * for use in conjunction with the myRating and chart parameters, but it is
    * not supported for use in conjunction with the id parameter.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * The maxWidth parameter specifies a maximum width of the embedded player.
    * If maxHeight is provided, maxWidth may not be reached in order to not
    * violate the height request.
    */
  var maxWidth: js.UndefOr[Double] = js.native
  /**
    * Set this parameter's value to like or dislike to instruct the API to only
    * return videos liked or disliked by the authenticated user.
    */
  var myRating: js.UndefOr[String] = js.native
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
    * Note: This parameter is supported for use in conjunction with the
    * myRating and chart parameters, but it is not supported for use in
    * conjunction with the id parameter.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The part parameter specifies a comma-separated list of one or more video
    * resource properties that the API response will include.  If the parameter
    * identifies a property that contains child properties, the child
    * properties will be included in the response. For example, in a video
    * resource, the snippet property contains the channelId, title,
    * description, tags, and categoryId properties. As such, if you set
    * part=snippet, the API response will contain all of those properties.
    */
  var part: js.UndefOr[String] = js.native
  /**
    * The regionCode parameter instructs the API to select a video chart
    * available in the specified region. This parameter can only be used in
    * conjunction with the chart parameter. The parameter value is an ISO
    * 3166-1 alpha-2 country code.
    */
  var regionCode: js.UndefOr[String] = js.native
  /**
    * The videoCategoryId parameter identifies the video category for which the
    * chart should be retrieved. This parameter can only be used in conjunction
    * with the chart parameter. By default, charts are not restricted to a
    * particular category.
    */
  var videoCategoryId: js.UndefOr[String] = js.native
}

object ParamsResourceVideosList {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    chart: String = null,
    fields: String = null,
    hl: String = null,
    id: String = null,
    key: String = null,
    locale: String = null,
    maxHeight: js.UndefOr[Double] = js.undefined,
    maxResults: js.UndefOr[Double] = js.undefined,
    maxWidth: js.UndefOr[Double] = js.undefined,
    myRating: String = null,
    oauth_token: String = null,
    onBehalfOfContentOwner: String = null,
    pageToken: String = null,
    part: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    regionCode: String = null,
    userIp: String = null,
    videoCategoryId: String = null
  ): ParamsResourceVideosList = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (chart != null) __obj.updateDynamic("chart")(chart.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (hl != null) __obj.updateDynamic("hl")(hl.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (myRating != null) __obj.updateDynamic("myRating")(myRating.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (onBehalfOfContentOwner != null) __obj.updateDynamic("onBehalfOfContentOwner")(onBehalfOfContentOwner.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (part != null) __obj.updateDynamic("part")(part.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (regionCode != null) __obj.updateDynamic("regionCode")(regionCode.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    if (videoCategoryId != null) __obj.updateDynamic("videoCategoryId")(videoCategoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceVideosList]
  }
}

