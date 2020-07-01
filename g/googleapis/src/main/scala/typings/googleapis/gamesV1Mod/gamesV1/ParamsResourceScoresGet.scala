package typings.googleapis.gamesV1Mod.gamesV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceScoresGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The types of ranks to return. If the parameter is omitted, no ranks will
    * be returned.
    */
  var includeRankType: js.UndefOr[String] = js.native
  /**
    * The preferred language to use for strings returned by this method.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * The ID of the leaderboard. Can be set to 'ALL' to retrieve data for all
    * leaderboards for this application.
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
    * A player ID. A value of me may be used in place of the authenticated
    * player's ID.
    */
  var playerId: js.UndefOr[String] = js.native
  /**
    * The time span for the scores and ranks you're requesting.
    */
  var timeSpan: js.UndefOr[String] = js.native
}

object ParamsResourceScoresGet {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    fields: String = null,
    includeRankType: String = null,
    key: String = null,
    language: String = null,
    leaderboardId: String = null,
    maxResults: js.UndefOr[Double] = js.undefined,
    oauth_token: String = null,
    pageToken: String = null,
    playerId: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    timeSpan: String = null,
    userIp: String = null
  ): ParamsResourceScoresGet = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (includeRankType != null) __obj.updateDynamic("includeRankType")(includeRankType.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (leaderboardId != null) __obj.updateDynamic("leaderboardId")(leaderboardId.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (playerId != null) __obj.updateDynamic("playerId")(playerId.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (timeSpan != null) __obj.updateDynamic("timeSpan")(timeSpan.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceScoresGet]
  }
}

