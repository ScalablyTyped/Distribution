package typings.googleapis.gamesV1Mod.gamesV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceScoresListwindow extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The collection of scores you're requesting.
    */
  var collection: js.UndefOr[String] = js.native
  /**
    * The preferred language to use for strings returned by this method.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * The ID of the leaderboard.
    */
  var leaderboardId: js.UndefOr[String] = js.native
  /**
    * The maximum number of leaderboard scores to return in the response. For
    * any response, the actual number of leaderboard scores returned may be
    * less than the specified maxResults.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * The token returned by the previous request.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The preferred number of scores to return above the player's score. More
    * scores may be returned if the player is at the bottom of the leaderboard;
    * fewer may be returned if the player is at the top. Must be less than or
    * equal to maxResults.
    */
  var resultsAbove: js.UndefOr[Double] = js.native
  /**
    * True if the top scores should be returned when the player is not in the
    * leaderboard. Defaults to true.
    */
  var returnTopIfAbsent: js.UndefOr[Boolean] = js.native
  /**
    * The time span for the scores and ranks you're requesting.
    */
  var timeSpan: js.UndefOr[String] = js.native
}

object ParamsResourceScoresListwindow {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    collection: String = null,
    fields: String = null,
    key: String = null,
    language: String = null,
    leaderboardId: String = null,
    maxResults: Int | Double = null,
    oauth_token: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    resultsAbove: Int | Double = null,
    returnTopIfAbsent: js.UndefOr[Boolean] = js.undefined,
    timeSpan: String = null,
    userIp: String = null
  ): ParamsResourceScoresListwindow = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (collection != null) __obj.updateDynamic("collection")(collection.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (leaderboardId != null) __obj.updateDynamic("leaderboardId")(leaderboardId.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (resultsAbove != null) __obj.updateDynamic("resultsAbove")(resultsAbove.asInstanceOf[js.Any])
    if (!js.isUndefined(returnTopIfAbsent)) __obj.updateDynamic("returnTopIfAbsent")(returnTopIfAbsent.asInstanceOf[js.Any])
    if (timeSpan != null) __obj.updateDynamic("timeSpan")(timeSpan.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceScoresListwindow]
  }
}

