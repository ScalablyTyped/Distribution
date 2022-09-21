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

@JSImport("googleapis/build/src/apis/games/v1", "games_v1.Resource$Achievements")
@js.native
open class ResourceAchievements protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def increment(): GaxiosPromise[SchemaAchievementIncrementResponse] = js.native
  def increment(callback: BodyResponseCallback[SchemaAchievementIncrementResponse]): Unit = js.native
  def increment(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAchievementIncrementResponse] = js.native
  def increment(params: ParamsResourceAchievementsIncrement): GaxiosPromise[SchemaAchievementIncrementResponse] = js.native
  def increment(
    params: ParamsResourceAchievementsIncrement,
    callback: BodyResponseCallback[SchemaAchievementIncrementResponse]
  ): Unit = js.native
  def increment(
    params: ParamsResourceAchievementsIncrement,
    options: BodyResponseCallback[Readable | SchemaAchievementIncrementResponse],
    callback: BodyResponseCallback[Readable | SchemaAchievementIncrementResponse]
  ): Unit = js.native
  def increment(params: ParamsResourceAchievementsIncrement, options: MethodOptions): GaxiosPromise[SchemaAchievementIncrementResponse] = js.native
  def increment(
    params: ParamsResourceAchievementsIncrement,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAchievementIncrementResponse]
  ): Unit = js.native
  /**
    * Increments the steps of the achievement with the given ID for the currently authenticated player.
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
    *   const res = await games.achievements.increment({
    *     // The ID of the achievement used by this method.
    *     achievementId: 'placeholder-value',
    *     // A randomly generated numeric ID for each request specified by the caller. This number is used at the server to ensure that the request is handled correctly across retries.
    *     requestId: 'placeholder-value',
    *     // The number of steps to increment.
    *     stepsToIncrement: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "currentSteps": 0,
    *   //   "kind": "my_kind",
    *   //   "newlyUnlocked": false
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
  def increment(params: ParamsResourceAchievementsIncrement, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def increment(
    params: ParamsResourceAchievementsIncrement,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaPlayerAchievementListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaPlayerAchievementListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPlayerAchievementListResponse] = js.native
  def list(params: ParamsResourceAchievementsList): GaxiosPromise[SchemaPlayerAchievementListResponse] = js.native
  def list(
    params: ParamsResourceAchievementsList,
    callback: BodyResponseCallback[SchemaPlayerAchievementListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAchievementsList,
    options: BodyResponseCallback[Readable | SchemaPlayerAchievementListResponse],
    callback: BodyResponseCallback[Readable | SchemaPlayerAchievementListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAchievementsList, options: MethodOptions): GaxiosPromise[SchemaPlayerAchievementListResponse] = js.native
  def list(
    params: ParamsResourceAchievementsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlayerAchievementListResponse]
  ): Unit = js.native
  /**
    * Lists the progress for all your application's achievements for the currently authenticated player.
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
    *   const res = await games.achievements.list({
    *     // The preferred language to use for strings returned by this method.
    *     language: 'placeholder-value',
    *     // The maximum number of achievement resources to return in the response, used for paging. For any response, the actual number of achievement resources returned may be less than the specified `maxResults`.
    *     maxResults: 'placeholder-value',
    *     // The token returned by the previous request.
    *     pageToken: 'placeholder-value',
    *     // A player ID. A value of `me` may be used in place of the authenticated player's ID.
    *     playerId: 'placeholder-value',
    *     // Tells the server to return only achievements with the specified state. If this parameter isn't specified, all achievements are returned.
    *     state: 'placeholder-value',
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
  def list(params: ParamsResourceAchievementsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAchievementsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def reveal(): GaxiosPromise[SchemaAchievementRevealResponse] = js.native
  def reveal(callback: BodyResponseCallback[SchemaAchievementRevealResponse]): Unit = js.native
  def reveal(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAchievementRevealResponse] = js.native
  def reveal(params: ParamsResourceAchievementsReveal): GaxiosPromise[SchemaAchievementRevealResponse] = js.native
  def reveal(
    params: ParamsResourceAchievementsReveal,
    callback: BodyResponseCallback[SchemaAchievementRevealResponse]
  ): Unit = js.native
  def reveal(
    params: ParamsResourceAchievementsReveal,
    options: BodyResponseCallback[Readable | SchemaAchievementRevealResponse],
    callback: BodyResponseCallback[Readable | SchemaAchievementRevealResponse]
  ): Unit = js.native
  def reveal(params: ParamsResourceAchievementsReveal, options: MethodOptions): GaxiosPromise[SchemaAchievementRevealResponse] = js.native
  def reveal(
    params: ParamsResourceAchievementsReveal,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAchievementRevealResponse]
  ): Unit = js.native
  /**
    * Sets the state of the achievement with the given ID to `REVEALED` for the currently authenticated player.
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
    *   const res = await games.achievements.reveal({
    *     // The ID of the achievement used by this method.
    *     achievementId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "currentState": "my_currentState",
    *   //   "kind": "my_kind"
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
  def reveal(params: ParamsResourceAchievementsReveal, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def reveal(
    params: ParamsResourceAchievementsReveal,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setStepsAtLeast(): GaxiosPromise[SchemaAchievementSetStepsAtLeastResponse] = js.native
  def setStepsAtLeast(callback: BodyResponseCallback[SchemaAchievementSetStepsAtLeastResponse]): Unit = js.native
  def setStepsAtLeast(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAchievementSetStepsAtLeastResponse] = js.native
  def setStepsAtLeast(params: ParamsResourceAchievementsSetstepsatleast): GaxiosPromise[SchemaAchievementSetStepsAtLeastResponse] = js.native
  def setStepsAtLeast(
    params: ParamsResourceAchievementsSetstepsatleast,
    callback: BodyResponseCallback[SchemaAchievementSetStepsAtLeastResponse]
  ): Unit = js.native
  def setStepsAtLeast(
    params: ParamsResourceAchievementsSetstepsatleast,
    options: BodyResponseCallback[Readable | SchemaAchievementSetStepsAtLeastResponse],
    callback: BodyResponseCallback[Readable | SchemaAchievementSetStepsAtLeastResponse]
  ): Unit = js.native
  def setStepsAtLeast(params: ParamsResourceAchievementsSetstepsatleast, options: MethodOptions): GaxiosPromise[SchemaAchievementSetStepsAtLeastResponse] = js.native
  def setStepsAtLeast(
    params: ParamsResourceAchievementsSetstepsatleast,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAchievementSetStepsAtLeastResponse]
  ): Unit = js.native
  /**
    * Sets the steps for the currently authenticated player towards unlocking an achievement. If the steps parameter is less than the current number of steps that the player already gained for the achievement, the achievement is not modified.
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
    *   const res = await games.achievements.setStepsAtLeast({
    *     // The ID of the achievement used by this method.
    *     achievementId: 'placeholder-value',
    *     // The minimum value to set the steps to.
    *     steps: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "currentSteps": 0,
    *   //   "kind": "my_kind",
    *   //   "newlyUnlocked": false
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
  def setStepsAtLeast(params: ParamsResourceAchievementsSetstepsatleast, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setStepsAtLeast(
    params: ParamsResourceAchievementsSetstepsatleast,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def unlock(): GaxiosPromise[SchemaAchievementUnlockResponse] = js.native
  def unlock(callback: BodyResponseCallback[SchemaAchievementUnlockResponse]): Unit = js.native
  def unlock(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAchievementUnlockResponse] = js.native
  def unlock(params: ParamsResourceAchievementsUnlock): GaxiosPromise[SchemaAchievementUnlockResponse] = js.native
  def unlock(
    params: ParamsResourceAchievementsUnlock,
    callback: BodyResponseCallback[SchemaAchievementUnlockResponse]
  ): Unit = js.native
  def unlock(
    params: ParamsResourceAchievementsUnlock,
    options: BodyResponseCallback[Readable | SchemaAchievementUnlockResponse],
    callback: BodyResponseCallback[Readable | SchemaAchievementUnlockResponse]
  ): Unit = js.native
  def unlock(params: ParamsResourceAchievementsUnlock, options: MethodOptions): GaxiosPromise[SchemaAchievementUnlockResponse] = js.native
  def unlock(
    params: ParamsResourceAchievementsUnlock,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAchievementUnlockResponse]
  ): Unit = js.native
  /**
    * Unlocks this achievement for the currently authenticated player.
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
    *   const res = await games.achievements.unlock({
    *     // The ID of the achievement used by this method.
    *     achievementId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "newlyUnlocked": false
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
  def unlock(params: ParamsResourceAchievementsUnlock, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def unlock(
    params: ParamsResourceAchievementsUnlock,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateMultiple(): GaxiosPromise[SchemaAchievementUpdateMultipleResponse] = js.native
  def updateMultiple(callback: BodyResponseCallback[SchemaAchievementUpdateMultipleResponse]): Unit = js.native
  def updateMultiple(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAchievementUpdateMultipleResponse] = js.native
  def updateMultiple(params: ParamsResourceAchievementsUpdatemultiple): GaxiosPromise[SchemaAchievementUpdateMultipleResponse] = js.native
  def updateMultiple(
    params: ParamsResourceAchievementsUpdatemultiple,
    callback: BodyResponseCallback[SchemaAchievementUpdateMultipleResponse]
  ): Unit = js.native
  def updateMultiple(
    params: ParamsResourceAchievementsUpdatemultiple,
    options: BodyResponseCallback[Readable | SchemaAchievementUpdateMultipleResponse],
    callback: BodyResponseCallback[Readable | SchemaAchievementUpdateMultipleResponse]
  ): Unit = js.native
  def updateMultiple(params: ParamsResourceAchievementsUpdatemultiple, options: MethodOptions): GaxiosPromise[SchemaAchievementUpdateMultipleResponse] = js.native
  def updateMultiple(
    params: ParamsResourceAchievementsUpdatemultiple,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAchievementUpdateMultipleResponse]
  ): Unit = js.native
  /**
    * Updates multiple achievements for the currently authenticated player.
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
    *   const res = await games.achievements.updateMultiple({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "kind": "my_kind",
    *       //   "updates": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "updatedAchievements": []
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
  def updateMultiple(params: ParamsResourceAchievementsUpdatemultiple, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateMultiple(
    params: ParamsResourceAchievementsUpdatemultiple,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
