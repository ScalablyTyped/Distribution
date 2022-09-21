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

@JSImport("googleapis/build/src/apis/games/v1", "games_v1.Resource$Metagame")
@js.native
open class ResourceMetagame protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def getMetagameConfig(): GaxiosPromise[SchemaMetagameConfig] = js.native
  def getMetagameConfig(callback: BodyResponseCallback[SchemaMetagameConfig]): Unit = js.native
  def getMetagameConfig(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMetagameConfig] = js.native
  def getMetagameConfig(params: ParamsResourceMetagameGetmetagameconfig): GaxiosPromise[SchemaMetagameConfig] = js.native
  def getMetagameConfig(
    params: ParamsResourceMetagameGetmetagameconfig,
    callback: BodyResponseCallback[SchemaMetagameConfig]
  ): Unit = js.native
  def getMetagameConfig(
    params: ParamsResourceMetagameGetmetagameconfig,
    options: BodyResponseCallback[Readable | SchemaMetagameConfig],
    callback: BodyResponseCallback[Readable | SchemaMetagameConfig]
  ): Unit = js.native
  def getMetagameConfig(params: ParamsResourceMetagameGetmetagameconfig, options: MethodOptions): GaxiosPromise[SchemaMetagameConfig] = js.native
  def getMetagameConfig(
    params: ParamsResourceMetagameGetmetagameconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMetagameConfig]
  ): Unit = js.native
  /**
    * Return the metagame configuration data for the calling application.
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
    *   const res = await games.metagame.getMetagameConfig({});
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "currentVersion": 0,
    *   //   "kind": "my_kind",
    *   //   "playerLevels": []
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
  def getMetagameConfig(params: ParamsResourceMetagameGetmetagameconfig, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getMetagameConfig(
    params: ParamsResourceMetagameGetmetagameconfig,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def listCategoriesByPlayer(): GaxiosPromise[SchemaCategoryListResponse] = js.native
  def listCategoriesByPlayer(callback: BodyResponseCallback[SchemaCategoryListResponse]): Unit = js.native
  def listCategoriesByPlayer(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCategoryListResponse] = js.native
  def listCategoriesByPlayer(params: ParamsResourceMetagameListcategoriesbyplayer): GaxiosPromise[SchemaCategoryListResponse] = js.native
  def listCategoriesByPlayer(
    params: ParamsResourceMetagameListcategoriesbyplayer,
    callback: BodyResponseCallback[SchemaCategoryListResponse]
  ): Unit = js.native
  def listCategoriesByPlayer(
    params: ParamsResourceMetagameListcategoriesbyplayer,
    options: BodyResponseCallback[Readable | SchemaCategoryListResponse],
    callback: BodyResponseCallback[Readable | SchemaCategoryListResponse]
  ): Unit = js.native
  def listCategoriesByPlayer(params: ParamsResourceMetagameListcategoriesbyplayer, options: MethodOptions): GaxiosPromise[SchemaCategoryListResponse] = js.native
  def listCategoriesByPlayer(
    params: ParamsResourceMetagameListcategoriesbyplayer,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCategoryListResponse]
  ): Unit = js.native
  /**
    * List play data aggregated per category for the player corresponding to `playerId`.
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
    *   const res = await games.metagame.listCategoriesByPlayer({
    *     // The collection of categories for which data will be returned.
    *     collection: 'placeholder-value',
    *     // The preferred language to use for strings returned by this method.
    *     language: 'placeholder-value',
    *     // The maximum number of category resources to return in the response, used for paging. For any response, the actual number of category resources returned may be less than the specified `maxResults`.
    *     maxResults: 'placeholder-value',
    *     // The token returned by the previous request.
    *     pageToken: 'placeholder-value',
    *     // A player ID. A value of `me` may be used in place of the authenticated player's ID.
    *     playerId: 'placeholder-value',
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
  def listCategoriesByPlayer(params: ParamsResourceMetagameListcategoriesbyplayer, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def listCategoriesByPlayer(
    params: ParamsResourceMetagameListcategoriesbyplayer,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
