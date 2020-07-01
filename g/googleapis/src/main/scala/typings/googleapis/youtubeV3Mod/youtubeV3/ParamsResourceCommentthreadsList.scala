package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    allThreadsRelatedToChannelId: String = null,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    channelId: String = null,
    fields: String = null,
    id: String = null,
    key: String = null,
    maxResults: js.UndefOr[Double] = js.undefined,
    moderationStatus: String = null,
    oauth_token: String = null,
    order: String = null,
    pageToken: String = null,
    part: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    searchTerms: String = null,
    textFormat: String = null,
    userIp: String = null,
    videoId: String = null
  ): ParamsResourceCommentthreadsList = {
    val __obj = js.Dynamic.literal()
    if (allThreadsRelatedToChannelId != null) __obj.updateDynamic("allThreadsRelatedToChannelId")(allThreadsRelatedToChannelId.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (moderationStatus != null) __obj.updateDynamic("moderationStatus")(moderationStatus.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (part != null) __obj.updateDynamic("part")(part.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (searchTerms != null) __obj.updateDynamic("searchTerms")(searchTerms.asInstanceOf[js.Any])
    if (textFormat != null) __obj.updateDynamic("textFormat")(textFormat.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    if (videoId != null) __obj.updateDynamic("videoId")(videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceCommentthreadsList]
  }
}

