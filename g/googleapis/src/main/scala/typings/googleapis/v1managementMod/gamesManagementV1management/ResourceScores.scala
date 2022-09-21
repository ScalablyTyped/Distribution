package typings.googleapis.v1managementMod.gamesManagementV1management

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/gamesManagement/v1management", "gamesManagement_v1management.Resource$Scores")
@js.native
open class ResourceScores protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def reset(): GaxiosPromise[SchemaPlayerScoreResetResponse] = js.native
  def reset(callback: BodyResponseCallback[SchemaPlayerScoreResetResponse]): Unit = js.native
  def reset(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPlayerScoreResetResponse] = js.native
  def reset(params: ParamsResourceScoresReset): GaxiosPromise[SchemaPlayerScoreResetResponse] = js.native
  def reset(params: ParamsResourceScoresReset, callback: BodyResponseCallback[SchemaPlayerScoreResetResponse]): Unit = js.native
  def reset(
    params: ParamsResourceScoresReset,
    options: BodyResponseCallback[Readable | SchemaPlayerScoreResetResponse],
    callback: BodyResponseCallback[Readable | SchemaPlayerScoreResetResponse]
  ): Unit = js.native
  def reset(params: ParamsResourceScoresReset, options: MethodOptions): GaxiosPromise[SchemaPlayerScoreResetResponse] = js.native
  def reset(
    params: ParamsResourceScoresReset,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlayerScoreResetResponse]
  ): Unit = js.native
  /**
    * Resets scores for the leaderboard with the given ID for the currently authenticated player. This method is only accessible to whitelisted tester accounts for your application.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/gamesManagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const gamesManagement = google.gamesManagement('v1management');
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
    *   const res = await gamesManagement.scores.reset({
    *     // The ID of the leaderboard.
    *     leaderboardId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "definitionId": "my_definitionId",
    *   //   "kind": "my_kind",
    *   //   "resetScoreTimeSpans": []
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
  def reset(params: ParamsResourceScoresReset, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def reset(
    params: ParamsResourceScoresReset,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def resetAll(): GaxiosPromise[SchemaPlayerScoreResetAllResponse] = js.native
  def resetAll(callback: BodyResponseCallback[SchemaPlayerScoreResetAllResponse]): Unit = js.native
  def resetAll(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPlayerScoreResetAllResponse] = js.native
  def resetAll(params: ParamsResourceScoresResetall): GaxiosPromise[SchemaPlayerScoreResetAllResponse] = js.native
  def resetAll(
    params: ParamsResourceScoresResetall,
    callback: BodyResponseCallback[SchemaPlayerScoreResetAllResponse]
  ): Unit = js.native
  def resetAll(
    params: ParamsResourceScoresResetall,
    options: BodyResponseCallback[Readable | SchemaPlayerScoreResetAllResponse],
    callback: BodyResponseCallback[Readable | SchemaPlayerScoreResetAllResponse]
  ): Unit = js.native
  def resetAll(params: ParamsResourceScoresResetall, options: MethodOptions): GaxiosPromise[SchemaPlayerScoreResetAllResponse] = js.native
  def resetAll(
    params: ParamsResourceScoresResetall,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlayerScoreResetAllResponse]
  ): Unit = js.native
  /**
    * Resets all scores for all leaderboards for the currently authenticated players. This method is only accessible to whitelisted tester accounts for your application.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/gamesManagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const gamesManagement = google.gamesManagement('v1management');
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
    *   const res = await gamesManagement.scores.resetAll({});
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "results": []
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
  def resetAll(params: ParamsResourceScoresResetall, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def resetAll(
    params: ParamsResourceScoresResetall,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def resetAllForAllPlayers(): GaxiosPromise[Unit] = js.native
  def resetAllForAllPlayers(callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetAllForAllPlayers(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetAllForAllPlayers(params: ParamsResourceScoresResetallforallplayers): GaxiosPromise[Unit] = js.native
  def resetAllForAllPlayers(params: ParamsResourceScoresResetallforallplayers, callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetAllForAllPlayers(
    params: ParamsResourceScoresResetallforallplayers,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def resetAllForAllPlayers(params: ParamsResourceScoresResetallforallplayers, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetAllForAllPlayers(
    params: ParamsResourceScoresResetallforallplayers,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Resets scores for all draft leaderboards for all players. This method is only available to user accounts for your developer console.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/gamesManagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const gamesManagement = google.gamesManagement('v1management');
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
    *   const res = await gamesManagement.scores.resetAllForAllPlayers({});
    *   console.log(res.data);
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
  def resetAllForAllPlayers(params: ParamsResourceScoresResetallforallplayers, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def resetAllForAllPlayers(
    params: ParamsResourceScoresResetallforallplayers,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def resetForAllPlayers(): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetForAllPlayers(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(params: ParamsResourceScoresResetforallplayers): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(params: ParamsResourceScoresResetforallplayers, callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetForAllPlayers(
    params: ParamsResourceScoresResetforallplayers,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def resetForAllPlayers(params: ParamsResourceScoresResetforallplayers, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(
    params: ParamsResourceScoresResetforallplayers,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Resets scores for the leaderboard with the given ID for all players. This method is only available to user accounts for your developer console. Only draft leaderboards can be reset.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/gamesManagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const gamesManagement = google.gamesManagement('v1management');
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
    *   const res = await gamesManagement.scores.resetForAllPlayers({
    *     // The ID of the leaderboard.
    *     leaderboardId: 'placeholder-value',
    *   });
    *   console.log(res.data);
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
  def resetForAllPlayers(params: ParamsResourceScoresResetforallplayers, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def resetForAllPlayers(
    params: ParamsResourceScoresResetforallplayers,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def resetMultipleForAllPlayers(): GaxiosPromise[Unit] = js.native
  def resetMultipleForAllPlayers(callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetMultipleForAllPlayers(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetMultipleForAllPlayers(params: ParamsResourceScoresResetmultipleforallplayers): GaxiosPromise[Unit] = js.native
  def resetMultipleForAllPlayers(params: ParamsResourceScoresResetmultipleforallplayers, callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetMultipleForAllPlayers(
    params: ParamsResourceScoresResetmultipleforallplayers,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def resetMultipleForAllPlayers(params: ParamsResourceScoresResetmultipleforallplayers, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetMultipleForAllPlayers(
    params: ParamsResourceScoresResetmultipleforallplayers,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Resets scores for the leaderboards with the given IDs for all players. This method is only available to user accounts for your developer console. Only draft leaderboards may be reset.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/gamesManagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const gamesManagement = google.gamesManagement('v1management');
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
    *   const res = await gamesManagement.scores.resetMultipleForAllPlayers({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "kind": "my_kind",
    *       //   "leaderboard_ids": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
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
  def resetMultipleForAllPlayers(params: ParamsResourceScoresResetmultipleforallplayers, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def resetMultipleForAllPlayers(
    params: ParamsResourceScoresResetmultipleforallplayers,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
