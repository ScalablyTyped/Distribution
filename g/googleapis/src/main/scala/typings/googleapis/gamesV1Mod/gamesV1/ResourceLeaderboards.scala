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

@JSImport("googleapis/build/src/apis/games/v1", "games_v1.Resource$Leaderboards")
@js.native
open class ResourceLeaderboards protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaLeaderboard] = js.native
  def get(callback: BodyResponseCallback[SchemaLeaderboard]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLeaderboard] = js.native
  def get(params: ParamsResourceLeaderboardsGet): GaxiosPromise[SchemaLeaderboard] = js.native
  def get(params: ParamsResourceLeaderboardsGet, callback: BodyResponseCallback[SchemaLeaderboard]): Unit = js.native
  def get(
    params: ParamsResourceLeaderboardsGet,
    options: BodyResponseCallback[Readable | SchemaLeaderboard],
    callback: BodyResponseCallback[Readable | SchemaLeaderboard]
  ): Unit = js.native
  def get(params: ParamsResourceLeaderboardsGet, options: MethodOptions): GaxiosPromise[SchemaLeaderboard] = js.native
  def get(
    params: ParamsResourceLeaderboardsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLeaderboard]
  ): Unit = js.native
  /**
    * Retrieves the metadata of the leaderboard with the given ID.
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
    *   const res = await games.leaderboards.get({
    *     // The preferred language to use for strings returned by this method.
    *     language: 'placeholder-value',
    *     // The ID of the leaderboard.
    *     leaderboardId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "iconUrl": "my_iconUrl",
    *   //   "id": "my_id",
    *   //   "isIconUrlDefault": false,
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "order": "my_order"
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
  def get(params: ParamsResourceLeaderboardsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceLeaderboardsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaLeaderboardListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaLeaderboardListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLeaderboardListResponse] = js.native
  def list(params: ParamsResourceLeaderboardsList): GaxiosPromise[SchemaLeaderboardListResponse] = js.native
  def list(
    params: ParamsResourceLeaderboardsList,
    callback: BodyResponseCallback[SchemaLeaderboardListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceLeaderboardsList,
    options: BodyResponseCallback[Readable | SchemaLeaderboardListResponse],
    callback: BodyResponseCallback[Readable | SchemaLeaderboardListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceLeaderboardsList, options: MethodOptions): GaxiosPromise[SchemaLeaderboardListResponse] = js.native
  def list(
    params: ParamsResourceLeaderboardsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLeaderboardListResponse]
  ): Unit = js.native
  /**
    * Lists all the leaderboard metadata for your application.
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
    *   const res = await games.leaderboards.list({
    *     // The preferred language to use for strings returned by this method.
    *     language: 'placeholder-value',
    *     // The maximum number of leaderboards to return in the response. For any response, the actual number of leaderboards returned may be less than the specified `maxResults`.
    *     maxResults: 'placeholder-value',
    *     // The token returned by the previous request.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "items": [],
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken"
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
  def list(params: ParamsResourceLeaderboardsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceLeaderboardsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
