package typings.googleapis.gamesV1Mod.gamesV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/games/v1", "games_v1.Resource$Scores")
@js.native
open class ResourceScores protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaPlayerLeaderboardScoreListResponse] = js.native
  def get(callback: BodyResponseCallback[SchemaPlayerLeaderboardScoreListResponse]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPlayerLeaderboardScoreListResponse] = js.native
  def get(params: ParamsResourceScoresGet): GaxiosPromise[SchemaPlayerLeaderboardScoreListResponse] = js.native
  def get(
    params: ParamsResourceScoresGet,
    callback: BodyResponseCallback[SchemaPlayerLeaderboardScoreListResponse]
  ): Unit = js.native
  def get(
    params: ParamsResourceScoresGet,
    options: BodyResponseCallback[Readable | SchemaPlayerLeaderboardScoreListResponse],
    callback: BodyResponseCallback[Readable | SchemaPlayerLeaderboardScoreListResponse]
  ): Unit = js.native
  def get(params: ParamsResourceScoresGet, options: MethodOptions): GaxiosPromise[SchemaPlayerLeaderboardScoreListResponse] = js.native
  def get(
    params: ParamsResourceScoresGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlayerLeaderboardScoreListResponse]
  ): Unit = js.native
  /**
    * Get high scores, and optionally ranks, in leaderboards for the currently authenticated player. For a specific time span, `leaderboardId` can be set to `ALL` to retrieve data for all leaderboards in a given time span. `NOTE: You cannot ask for 'ALL' leaderboards and 'ALL' timeSpans in the same request; only one parameter may be set to 'ALL'.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/games.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const games = google.games('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/games'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await games.scores.get({
    *     // The types of ranks to return. If the parameter is omitted, no ranks will be returned.
    *     includeRankType: 'placeholder-value',
    *     // The preferred language to use for strings returned by this method.
    *     language: 'placeholder-value',
    *     // The ID of the leaderboard. Can be set to 'ALL' to retrieve data for all leaderboards for this application.
    *     leaderboardId: 'placeholder-value',
    *     // The maximum number of leaderboard scores to return in the response. For any response, the actual number of leaderboard scores returned may be less than the specified `maxResults`.
    *     maxResults: 'placeholder-value',
    *     // The token returned by the previous request.
    *     pageToken: 'placeholder-value',
    *     // A player ID. A value of `me` may be used in place of the authenticated player's ID.
    *     playerId: 'placeholder-value',
    *     // The time span for the scores and ranks you're requesting.
    *     timeSpan: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "items": [],
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "player": {}
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def get(params: ParamsResourceScoresGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceScoresGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaLeaderboardScores] = js.native
  def list(callback: BodyResponseCallback[SchemaLeaderboardScores]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLeaderboardScores] = js.native
  def list(params: ParamsResourceScoresList): GaxiosPromise[SchemaLeaderboardScores] = js.native
  def list(params: ParamsResourceScoresList, callback: BodyResponseCallback[SchemaLeaderboardScores]): Unit = js.native
  def list(
    params: ParamsResourceScoresList,
    options: BodyResponseCallback[Readable | SchemaLeaderboardScores],
    callback: BodyResponseCallback[Readable | SchemaLeaderboardScores]
  ): Unit = js.native
  def list(params: ParamsResourceScoresList, options: MethodOptions): GaxiosPromise[SchemaLeaderboardScores] = js.native
  def list(
    params: ParamsResourceScoresList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLeaderboardScores]
  ): Unit = js.native
  /**
    * Lists the scores in a leaderboard, starting from the top.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/games.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const games = google.games('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/games'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await games.scores.list({
    *     // The collection of scores you're requesting.
    *     collection: 'placeholder-value',
    *     // The preferred language to use for strings returned by this method.
    *     language: 'placeholder-value',
    *     // The ID of the leaderboard.
    *     leaderboardId: 'placeholder-value',
    *     // The maximum number of leaderboard scores to return in the response. For any response, the actual number of leaderboard scores returned may be less than the specified `maxResults`.
    *     maxResults: 'placeholder-value',
    *     // The token returned by the previous request.
    *     pageToken: 'placeholder-value',
    *     // The time span for the scores and ranks you're requesting.
    *     timeSpan: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "items": [],
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "numScores": "my_numScores",
    *   //   "playerScore": {},
    *   //   "prevPageToken": "my_prevPageToken"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def list(params: ParamsResourceScoresList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceScoresList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def listWindow(): GaxiosPromise[SchemaLeaderboardScores] = js.native
  def listWindow(callback: BodyResponseCallback[SchemaLeaderboardScores]): Unit = js.native
  def listWindow(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLeaderboardScores] = js.native
  def listWindow(params: ParamsResourceScoresListwindow): GaxiosPromise[SchemaLeaderboardScores] = js.native
  def listWindow(params: ParamsResourceScoresListwindow, callback: BodyResponseCallback[SchemaLeaderboardScores]): Unit = js.native
  def listWindow(
    params: ParamsResourceScoresListwindow,
    options: BodyResponseCallback[Readable | SchemaLeaderboardScores],
    callback: BodyResponseCallback[Readable | SchemaLeaderboardScores]
  ): Unit = js.native
  def listWindow(params: ParamsResourceScoresListwindow, options: MethodOptions): GaxiosPromise[SchemaLeaderboardScores] = js.native
  def listWindow(
    params: ParamsResourceScoresListwindow,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLeaderboardScores]
  ): Unit = js.native
  /**
    * Lists the scores in a leaderboard around (and including) a player's score.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/games.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const games = google.games('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/games'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await games.scores.listWindow({
    *     // The collection of scores you're requesting.
    *     collection: 'placeholder-value',
    *     // The preferred language to use for strings returned by this method.
    *     language: 'placeholder-value',
    *     // The ID of the leaderboard.
    *     leaderboardId: 'placeholder-value',
    *     // The maximum number of leaderboard scores to return in the response. For any response, the actual number of leaderboard scores returned may be less than the specified `maxResults`.
    *     maxResults: 'placeholder-value',
    *     // The token returned by the previous request.
    *     pageToken: 'placeholder-value',
    *     // The preferred number of scores to return above the player's score. More scores may be returned if the player is at the bottom of the leaderboard; fewer may be returned if the player is at the top. Must be less than or equal to maxResults.
    *     resultsAbove: 'placeholder-value',
    *     // True if the top scores should be returned when the player is not in the leaderboard. Defaults to true.
    *     returnTopIfAbsent: 'placeholder-value',
    *     // The time span for the scores and ranks you're requesting.
    *     timeSpan: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "items": [],
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "numScores": "my_numScores",
    *   //   "playerScore": {},
    *   //   "prevPageToken": "my_prevPageToken"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def listWindow(params: ParamsResourceScoresListwindow, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def listWindow(
    params: ParamsResourceScoresListwindow,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def submit(): GaxiosPromise[SchemaPlayerScoreResponse] = js.native
  def submit(callback: BodyResponseCallback[SchemaPlayerScoreResponse]): Unit = js.native
  def submit(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPlayerScoreResponse] = js.native
  def submit(params: ParamsResourceScoresSubmit): GaxiosPromise[SchemaPlayerScoreResponse] = js.native
  def submit(params: ParamsResourceScoresSubmit, callback: BodyResponseCallback[SchemaPlayerScoreResponse]): Unit = js.native
  def submit(
    params: ParamsResourceScoresSubmit,
    options: BodyResponseCallback[Readable | SchemaPlayerScoreResponse],
    callback: BodyResponseCallback[Readable | SchemaPlayerScoreResponse]
  ): Unit = js.native
  def submit(params: ParamsResourceScoresSubmit, options: MethodOptions): GaxiosPromise[SchemaPlayerScoreResponse] = js.native
  def submit(
    params: ParamsResourceScoresSubmit,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlayerScoreResponse]
  ): Unit = js.native
  /**
    * Submits a score to the specified leaderboard.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/games.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const games = google.games('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/games'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await games.scores.submit({
    *     // The preferred language to use for strings returned by this method.
    *     language: 'placeholder-value',
    *     // The ID of the leaderboard.
    *     leaderboardId: 'placeholder-value',
    *     // The score you're submitting. The submitted score is ignored if it is worse than a previously submitted score, where worse depends on the leaderboard sort order. The meaning of the score value depends on the leaderboard format type. For fixed-point, the score represents the raw value. For time, the score represents elapsed time in milliseconds. For currency, the score represents a value in micro units.
    *     score: 'placeholder-value',
    *     // Additional information about the score you're submitting. Values must contain no more than 64 URI-safe characters as defined by section 2.3 of RFC 3986.
    *     scoreTag: '[a-zA-Z0-9-._~]{0,64}',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "beatenScoreTimeSpans": [],
    *   //   "formattedScore": "my_formattedScore",
    *   //   "kind": "my_kind",
    *   //   "leaderboardId": "my_leaderboardId",
    *   //   "scoreTag": "my_scoreTag",
    *   //   "unbeatenScores": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def submit(params: ParamsResourceScoresSubmit, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def submit(
    params: ParamsResourceScoresSubmit,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def submitMultiple(): GaxiosPromise[SchemaPlayerScoreListResponse] = js.native
  def submitMultiple(callback: BodyResponseCallback[SchemaPlayerScoreListResponse]): Unit = js.native
  def submitMultiple(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPlayerScoreListResponse] = js.native
  def submitMultiple(params: ParamsResourceScoresSubmitmultiple): GaxiosPromise[SchemaPlayerScoreListResponse] = js.native
  def submitMultiple(
    params: ParamsResourceScoresSubmitmultiple,
    callback: BodyResponseCallback[SchemaPlayerScoreListResponse]
  ): Unit = js.native
  def submitMultiple(
    params: ParamsResourceScoresSubmitmultiple,
    options: BodyResponseCallback[Readable | SchemaPlayerScoreListResponse],
    callback: BodyResponseCallback[Readable | SchemaPlayerScoreListResponse]
  ): Unit = js.native
  def submitMultiple(params: ParamsResourceScoresSubmitmultiple, options: MethodOptions): GaxiosPromise[SchemaPlayerScoreListResponse] = js.native
  def submitMultiple(
    params: ParamsResourceScoresSubmitmultiple,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlayerScoreListResponse]
  ): Unit = js.native
  /**
    * Submits multiple scores to leaderboards.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/games.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const games = google.games('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/games'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await games.scores.submitMultiple({
    *     // The preferred language to use for strings returned by this method.
    *     language: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "kind": "my_kind",
    *       //   "scores": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "submittedScores": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def submitMultiple(params: ParamsResourceScoresSubmitmultiple, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def submitMultiple(
    params: ParamsResourceScoresSubmitmultiple,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
