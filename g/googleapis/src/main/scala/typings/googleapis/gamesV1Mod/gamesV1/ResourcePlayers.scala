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

@JSImport("googleapis/build/src/apis/games/v1", "games_v1.Resource$Players")
@js.native
open class ResourcePlayers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaPlayer] = js.native
  def get(callback: BodyResponseCallback[SchemaPlayer]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPlayer] = js.native
  def get(params: ParamsResourcePlayersGet): GaxiosPromise[SchemaPlayer] = js.native
  def get(params: ParamsResourcePlayersGet, callback: BodyResponseCallback[SchemaPlayer]): Unit = js.native
  def get(
    params: ParamsResourcePlayersGet,
    options: BodyResponseCallback[Readable | SchemaPlayer],
    callback: BodyResponseCallback[Readable | SchemaPlayer]
  ): Unit = js.native
  def get(params: ParamsResourcePlayersGet, options: MethodOptions): GaxiosPromise[SchemaPlayer] = js.native
  def get(
    params: ParamsResourcePlayersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlayer]
  ): Unit = js.native
  /**
    * Retrieves the Player resource with the given ID. To retrieve the player for the currently authenticated user, set `playerId` to `me`.
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
    *   const res = await games.players.get({
    *     // The preferred language to use for strings returned by this method.
    *     language: 'placeholder-value',
    *     // A player ID. A value of `me` may be used in place of the authenticated player's ID.
    *     playerId: 'placeholder-value',
    *     // Consistency token of the player id. The call returns a 'not found' result when the token is present and invalid. Empty value is ignored. See also GlobalPlayerIdConsistencyTokenProto
    *     playerIdConsistencyToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "avatarImageUrl": "my_avatarImageUrl",
    *   //   "bannerUrlLandscape": "my_bannerUrlLandscape",
    *   //   "bannerUrlPortrait": "my_bannerUrlPortrait",
    *   //   "displayName": "my_displayName",
    *   //   "experienceInfo": {},
    *   //   "friendStatus": "my_friendStatus",
    *   //   "gamePlayerId": "my_gamePlayerId",
    *   //   "kind": "my_kind",
    *   //   "name": {},
    *   //   "originalPlayerId": "my_originalPlayerId",
    *   //   "playerId": "my_playerId",
    *   //   "profileSettings": {},
    *   //   "title": "my_title"
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
  def get(params: ParamsResourcePlayersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourcePlayersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getScopedPlayerIds(): GaxiosPromise[SchemaScopedPlayerIds] = js.native
  def getScopedPlayerIds(callback: BodyResponseCallback[SchemaScopedPlayerIds]): Unit = js.native
  def getScopedPlayerIds(params: Unit, options: MethodOptions): GaxiosPromise[SchemaScopedPlayerIds] = js.native
  def getScopedPlayerIds(params: ParamsResourcePlayersGetscopedplayerids): GaxiosPromise[SchemaScopedPlayerIds] = js.native
  def getScopedPlayerIds(
    params: ParamsResourcePlayersGetscopedplayerids,
    callback: BodyResponseCallback[SchemaScopedPlayerIds]
  ): Unit = js.native
  def getScopedPlayerIds(
    params: ParamsResourcePlayersGetscopedplayerids,
    options: BodyResponseCallback[Readable | SchemaScopedPlayerIds],
    callback: BodyResponseCallback[Readable | SchemaScopedPlayerIds]
  ): Unit = js.native
  def getScopedPlayerIds(params: ParamsResourcePlayersGetscopedplayerids, options: MethodOptions): GaxiosPromise[SchemaScopedPlayerIds] = js.native
  def getScopedPlayerIds(
    params: ParamsResourcePlayersGetscopedplayerids,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaScopedPlayerIds]
  ): Unit = js.native
  /**
    * Retrieves scoped player identifiers for currently authenticated user.
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
    *   const res = await games.players.getScopedPlayerIds({});
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "developerPlayerKey": "my_developerPlayerKey",
    *   //   "gamePlayerId": "my_gamePlayerId"
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
  def getScopedPlayerIds(params: ParamsResourcePlayersGetscopedplayerids, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getScopedPlayerIds(
    params: ParamsResourcePlayersGetscopedplayerids,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaPlayerListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaPlayerListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPlayerListResponse] = js.native
  def list(params: ParamsResourcePlayersList): GaxiosPromise[SchemaPlayerListResponse] = js.native
  def list(params: ParamsResourcePlayersList, callback: BodyResponseCallback[SchemaPlayerListResponse]): Unit = js.native
  def list(
    params: ParamsResourcePlayersList,
    options: BodyResponseCallback[Readable | SchemaPlayerListResponse],
    callback: BodyResponseCallback[Readable | SchemaPlayerListResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePlayersList, options: MethodOptions): GaxiosPromise[SchemaPlayerListResponse] = js.native
  def list(
    params: ParamsResourcePlayersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlayerListResponse]
  ): Unit = js.native
  /**
    * Get the collection of players for the currently authenticated user.
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
    *   const res = await games.players.list({
    *     // Collection of players being retrieved
    *     collection: 'placeholder-value',
    *     // The preferred language to use for strings returned by this method.
    *     language: 'placeholder-value',
    *     // The maximum number of player resources to return in the response, used for paging. For any response, the actual number of player resources returned may be less than the specified `maxResults`.
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
  def list(params: ParamsResourcePlayersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePlayersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
