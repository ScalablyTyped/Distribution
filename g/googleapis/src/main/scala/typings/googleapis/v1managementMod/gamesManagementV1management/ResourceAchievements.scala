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

@JSImport("googleapis/build/src/apis/gamesManagement/v1management", "gamesManagement_v1management.Resource$Achievements")
@js.native
open class ResourceAchievements protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def reset(): GaxiosPromise[SchemaAchievementResetResponse] = js.native
  def reset(callback: BodyResponseCallback[SchemaAchievementResetResponse]): Unit = js.native
  def reset(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAchievementResetResponse] = js.native
  def reset(params: ParamsResourceAchievementsReset): GaxiosPromise[SchemaAchievementResetResponse] = js.native
  def reset(
    params: ParamsResourceAchievementsReset,
    callback: BodyResponseCallback[SchemaAchievementResetResponse]
  ): Unit = js.native
  def reset(
    params: ParamsResourceAchievementsReset,
    options: BodyResponseCallback[Readable | SchemaAchievementResetResponse],
    callback: BodyResponseCallback[Readable | SchemaAchievementResetResponse]
  ): Unit = js.native
  def reset(params: ParamsResourceAchievementsReset, options: MethodOptions): GaxiosPromise[SchemaAchievementResetResponse] = js.native
  def reset(
    params: ParamsResourceAchievementsReset,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAchievementResetResponse]
  ): Unit = js.native
  /**
    * Resets the achievement with the given ID for the currently authenticated player. This method is only accessible to whitelisted tester accounts for your application.
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
    *   const res = await gamesManagement.achievements.reset({
    *     // The ID of the achievement used by this method.
    *     achievementId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "currentState": "my_currentState",
    *   //   "definitionId": "my_definitionId",
    *   //   "kind": "my_kind",
    *   //   "updateOccurred": false
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
  def reset(params: ParamsResourceAchievementsReset, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def reset(
    params: ParamsResourceAchievementsReset,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def resetAll(): GaxiosPromise[SchemaAchievementResetAllResponse] = js.native
  def resetAll(callback: BodyResponseCallback[SchemaAchievementResetAllResponse]): Unit = js.native
  def resetAll(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAchievementResetAllResponse] = js.native
  def resetAll(params: ParamsResourceAchievementsResetall): GaxiosPromise[SchemaAchievementResetAllResponse] = js.native
  def resetAll(
    params: ParamsResourceAchievementsResetall,
    callback: BodyResponseCallback[SchemaAchievementResetAllResponse]
  ): Unit = js.native
  def resetAll(
    params: ParamsResourceAchievementsResetall,
    options: BodyResponseCallback[Readable | SchemaAchievementResetAllResponse],
    callback: BodyResponseCallback[Readable | SchemaAchievementResetAllResponse]
  ): Unit = js.native
  def resetAll(params: ParamsResourceAchievementsResetall, options: MethodOptions): GaxiosPromise[SchemaAchievementResetAllResponse] = js.native
  def resetAll(
    params: ParamsResourceAchievementsResetall,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAchievementResetAllResponse]
  ): Unit = js.native
  /**
    * Resets all achievements for the currently authenticated player for your application. This method is only accessible to whitelisted tester accounts for your application.
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
    *   const res = await gamesManagement.achievements.resetAll({});
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
  def resetAll(params: ParamsResourceAchievementsResetall, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def resetAll(
    params: ParamsResourceAchievementsResetall,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def resetAllForAllPlayers(): GaxiosPromise[Unit] = js.native
  def resetAllForAllPlayers(callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetAllForAllPlayers(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetAllForAllPlayers(params: ParamsResourceAchievementsResetallforallplayers): GaxiosPromise[Unit] = js.native
  def resetAllForAllPlayers(params: ParamsResourceAchievementsResetallforallplayers, callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetAllForAllPlayers(
    params: ParamsResourceAchievementsResetallforallplayers,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def resetAllForAllPlayers(params: ParamsResourceAchievementsResetallforallplayers, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetAllForAllPlayers(
    params: ParamsResourceAchievementsResetallforallplayers,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Resets all draft achievements for all players. This method is only available to user accounts for your developer console.
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
    *   const res = await gamesManagement.achievements.resetAllForAllPlayers({});
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
  def resetAllForAllPlayers(params: ParamsResourceAchievementsResetallforallplayers, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def resetAllForAllPlayers(
    params: ParamsResourceAchievementsResetallforallplayers,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def resetForAllPlayers(): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetForAllPlayers(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(params: ParamsResourceAchievementsResetforallplayers): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(params: ParamsResourceAchievementsResetforallplayers, callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetForAllPlayers(
    params: ParamsResourceAchievementsResetforallplayers,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def resetForAllPlayers(params: ParamsResourceAchievementsResetforallplayers, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(
    params: ParamsResourceAchievementsResetforallplayers,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Resets the achievement with the given ID for all players. This method is only available to user accounts for your developer console. Only draft achievements can be reset.
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
    *   const res = await gamesManagement.achievements.resetForAllPlayers({
    *     // The ID of the achievement used by this method.
    *     achievementId: 'placeholder-value',
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
  def resetForAllPlayers(params: ParamsResourceAchievementsResetforallplayers, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def resetForAllPlayers(
    params: ParamsResourceAchievementsResetforallplayers,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def resetMultipleForAllPlayers(): GaxiosPromise[Unit] = js.native
  def resetMultipleForAllPlayers(callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetMultipleForAllPlayers(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetMultipleForAllPlayers(params: ParamsResourceAchievementsResetmultipleforallplayers): GaxiosPromise[Unit] = js.native
  def resetMultipleForAllPlayers(params: ParamsResourceAchievementsResetmultipleforallplayers, callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetMultipleForAllPlayers(
    params: ParamsResourceAchievementsResetmultipleforallplayers,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def resetMultipleForAllPlayers(params: ParamsResourceAchievementsResetmultipleforallplayers, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetMultipleForAllPlayers(
    params: ParamsResourceAchievementsResetmultipleforallplayers,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Resets achievements with the given IDs for all players. This method is only available to user accounts for your developer console. Only draft achievements may be reset.
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
    *   const res = await gamesManagement.achievements.resetMultipleForAllPlayers({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "achievement_ids": [],
    *       //   "kind": "my_kind"
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
  def resetMultipleForAllPlayers(params: ParamsResourceAchievementsResetmultipleforallplayers, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def resetMultipleForAllPlayers(
    params: ParamsResourceAchievementsResetmultipleforallplayers,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
