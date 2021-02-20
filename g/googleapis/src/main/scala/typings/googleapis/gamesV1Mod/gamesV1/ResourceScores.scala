package typings.googleapis.gamesV1Mod.gamesV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/games/v1", "games_v1.Resource$Scores")
@js.native
class ResourceScores protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * games.scores.get
    * @desc Get high scores, and optionally ranks, in leaderboards for the
    * currently authenticated player. For a specific time span, leaderboardId
    * can be set to ALL to retrieve data for all leaderboards in a given time
    * span. NOTE: You cannot ask for 'ALL' leaderboards and 'ALL' timeSpans in
    * the same request; only one parameter may be set to 'ALL'.
    * @alias games.scores.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.includeRankType The types of ranks to return. If the parameter is omitted, no ranks will be returned.
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string} params.leaderboardId The ID of the leaderboard. Can be set to 'ALL' to retrieve data for all leaderboards for this application.
    * @param {integer=} params.maxResults The maximum number of leaderboard scores to return in the response. For any response, the actual number of leaderboard scores returned may be less than the specified maxResults.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {string} params.playerId A player ID. A value of me may be used in place of the authenticated player's ID.
    * @param {string} params.timeSpan The time span for the scores and ranks you're requesting.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaPlayerLeaderboardScoreListResponse] = js.native
  def get(callback: BodyResponseCallback[SchemaPlayerLeaderboardScoreListResponse]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPlayerLeaderboardScoreListResponse] = js.native
  def get(params: ParamsResourceScoresGet): GaxiosPromise[SchemaPlayerLeaderboardScoreListResponse] = js.native
  def get(
    params: ParamsResourceScoresGet,
    callback: BodyResponseCallback[SchemaPlayerLeaderboardScoreListResponse]
  ): Unit = js.native
  def get(
    params: ParamsResourceScoresGet,
    options: BodyResponseCallback[SchemaPlayerLeaderboardScoreListResponse],
    callback: BodyResponseCallback[SchemaPlayerLeaderboardScoreListResponse]
  ): Unit = js.native
  def get(params: ParamsResourceScoresGet, options: MethodOptions): GaxiosPromise[SchemaPlayerLeaderboardScoreListResponse] = js.native
  def get(
    params: ParamsResourceScoresGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlayerLeaderboardScoreListResponse]
  ): Unit = js.native
  
  /**
    * games.scores.list
    * @desc Lists the scores in a leaderboard, starting from the top.
    * @alias games.scores.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.collection The collection of scores you're requesting.
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string} params.leaderboardId The ID of the leaderboard.
    * @param {integer=} params.maxResults The maximum number of leaderboard scores to return in the response. For any response, the actual number of leaderboard scores returned may be less than the specified maxResults.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {string} params.timeSpan The time span for the scores and ranks you're requesting.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaLeaderboardScores] = js.native
  def list(callback: BodyResponseCallback[SchemaLeaderboardScores]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaLeaderboardScores] = js.native
  def list(params: ParamsResourceScoresList): GaxiosPromise[SchemaLeaderboardScores] = js.native
  def list(params: ParamsResourceScoresList, callback: BodyResponseCallback[SchemaLeaderboardScores]): Unit = js.native
  def list(
    params: ParamsResourceScoresList,
    options: BodyResponseCallback[SchemaLeaderboardScores],
    callback: BodyResponseCallback[SchemaLeaderboardScores]
  ): Unit = js.native
  def list(params: ParamsResourceScoresList, options: MethodOptions): GaxiosPromise[SchemaLeaderboardScores] = js.native
  def list(
    params: ParamsResourceScoresList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLeaderboardScores]
  ): Unit = js.native
  
  /**
    * games.scores.listWindow
    * @desc Lists the scores in a leaderboard around (and including) a player's
    * score.
    * @alias games.scores.listWindow
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.collection The collection of scores you're requesting.
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string} params.leaderboardId The ID of the leaderboard.
    * @param {integer=} params.maxResults The maximum number of leaderboard scores to return in the response. For any response, the actual number of leaderboard scores returned may be less than the specified maxResults.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {integer=} params.resultsAbove The preferred number of scores to return above the player's score. More scores may be returned if the player is at the bottom of the leaderboard; fewer may be returned if the player is at the top. Must be less than or equal to maxResults.
    * @param {boolean=} params.returnTopIfAbsent True if the top scores should be returned when the player is not in the leaderboard. Defaults to true.
    * @param {string} params.timeSpan The time span for the scores and ranks you're requesting.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listWindow(): GaxiosPromise[SchemaLeaderboardScores] = js.native
  def listWindow(callback: BodyResponseCallback[SchemaLeaderboardScores]): Unit = js.native
  def listWindow(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaLeaderboardScores] = js.native
  def listWindow(params: ParamsResourceScoresListwindow): GaxiosPromise[SchemaLeaderboardScores] = js.native
  def listWindow(params: ParamsResourceScoresListwindow, callback: BodyResponseCallback[SchemaLeaderboardScores]): Unit = js.native
  def listWindow(
    params: ParamsResourceScoresListwindow,
    options: BodyResponseCallback[SchemaLeaderboardScores],
    callback: BodyResponseCallback[SchemaLeaderboardScores]
  ): Unit = js.native
  def listWindow(params: ParamsResourceScoresListwindow, options: MethodOptions): GaxiosPromise[SchemaLeaderboardScores] = js.native
  def listWindow(
    params: ParamsResourceScoresListwindow,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLeaderboardScores]
  ): Unit = js.native
  
  /**
    * games.scores.submit
    * @desc Submits a score to the specified leaderboard.
    * @alias games.scores.submit
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string} params.leaderboardId The ID of the leaderboard.
    * @param {string} params.score The score you're submitting. The submitted score is ignored if it is worse than a previously submitted score, where worse depends on the leaderboard sort order. The meaning of the score value depends on the leaderboard format type. For fixed-point, the score represents the raw value. For time, the score represents elapsed time in milliseconds. For currency, the score represents a value in micro units.
    * @param {string=} params.scoreTag Additional information about the score you're submitting. Values must contain no more than 64 URI-safe characters as defined by section 2.3 of RFC 3986.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def submit(): GaxiosPromise[SchemaPlayerScoreResponse] = js.native
  def submit(callback: BodyResponseCallback[SchemaPlayerScoreResponse]): Unit = js.native
  def submit(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPlayerScoreResponse] = js.native
  def submit(params: ParamsResourceScoresSubmit): GaxiosPromise[SchemaPlayerScoreResponse] = js.native
  def submit(params: ParamsResourceScoresSubmit, callback: BodyResponseCallback[SchemaPlayerScoreResponse]): Unit = js.native
  def submit(
    params: ParamsResourceScoresSubmit,
    options: BodyResponseCallback[SchemaPlayerScoreResponse],
    callback: BodyResponseCallback[SchemaPlayerScoreResponse]
  ): Unit = js.native
  def submit(params: ParamsResourceScoresSubmit, options: MethodOptions): GaxiosPromise[SchemaPlayerScoreResponse] = js.native
  def submit(
    params: ParamsResourceScoresSubmit,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlayerScoreResponse]
  ): Unit = js.native
  
  /**
    * games.scores.submitMultiple
    * @desc Submits multiple scores to leaderboards.
    * @alias games.scores.submitMultiple
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {().PlayerScoreSubmissionList} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def submitMultiple(): GaxiosPromise[SchemaPlayerScoreListResponse] = js.native
  def submitMultiple(callback: BodyResponseCallback[SchemaPlayerScoreListResponse]): Unit = js.native
  def submitMultiple(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPlayerScoreListResponse] = js.native
  def submitMultiple(params: ParamsResourceScoresSubmitmultiple): GaxiosPromise[SchemaPlayerScoreListResponse] = js.native
  def submitMultiple(
    params: ParamsResourceScoresSubmitmultiple,
    callback: BodyResponseCallback[SchemaPlayerScoreListResponse]
  ): Unit = js.native
  def submitMultiple(
    params: ParamsResourceScoresSubmitmultiple,
    options: BodyResponseCallback[SchemaPlayerScoreListResponse],
    callback: BodyResponseCallback[SchemaPlayerScoreListResponse]
  ): Unit = js.native
  def submitMultiple(params: ParamsResourceScoresSubmitmultiple, options: MethodOptions): GaxiosPromise[SchemaPlayerScoreListResponse] = js.native
  def submitMultiple(
    params: ParamsResourceScoresSubmitmultiple,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlayerScoreListResponse]
  ): Unit = js.native
}
