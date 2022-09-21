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

@JSImport("googleapis/build/src/apis/games/v1", "games_v1.Resource$Applications")
@js.native
open class ResourceApplications protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaApplication] = js.native
  def get(callback: BodyResponseCallback[SchemaApplication]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApplication] = js.native
  def get(params: ParamsResourceApplicationsGet): GaxiosPromise[SchemaApplication] = js.native
  def get(params: ParamsResourceApplicationsGet, callback: BodyResponseCallback[SchemaApplication]): Unit = js.native
  def get(
    params: ParamsResourceApplicationsGet,
    options: BodyResponseCallback[Readable | SchemaApplication],
    callback: BodyResponseCallback[Readable | SchemaApplication]
  ): Unit = js.native
  def get(params: ParamsResourceApplicationsGet, options: MethodOptions): GaxiosPromise[SchemaApplication] = js.native
  def get(
    params: ParamsResourceApplicationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApplication]
  ): Unit = js.native
  /**
    * Retrieves the metadata of the application with the given ID. If the requested application is not available for the specified `platformType`, the returned response will not include any instance data.
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
    *   const res = await games.applications.get({
    *     // The application ID from the Google Play developer console.
    *     applicationId: 'placeholder-value',
    *     // The preferred language to use for strings returned by this method.
    *     language: 'placeholder-value',
    *     // Restrict application details returned to the specific platform.
    *     platformType: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "achievement_count": 0,
    *   //   "assets": [],
    *   //   "author": "my_author",
    *   //   "category": {},
    *   //   "description": "my_description",
    *   //   "enabledFeatures": [],
    *   //   "id": "my_id",
    *   //   "instances": [],
    *   //   "kind": "my_kind",
    *   //   "lastUpdatedTimestamp": "my_lastUpdatedTimestamp",
    *   //   "leaderboard_count": 0,
    *   //   "name": "my_name",
    *   //   "themeColor": "my_themeColor"
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
  def get(params: ParamsResourceApplicationsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceApplicationsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getEndPoint(): GaxiosPromise[SchemaEndPoint] = js.native
  def getEndPoint(callback: BodyResponseCallback[SchemaEndPoint]): Unit = js.native
  def getEndPoint(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEndPoint] = js.native
  def getEndPoint(params: ParamsResourceApplicationsGetendpoint): GaxiosPromise[SchemaEndPoint] = js.native
  def getEndPoint(params: ParamsResourceApplicationsGetendpoint, callback: BodyResponseCallback[SchemaEndPoint]): Unit = js.native
  def getEndPoint(
    params: ParamsResourceApplicationsGetendpoint,
    options: BodyResponseCallback[Readable | SchemaEndPoint],
    callback: BodyResponseCallback[Readable | SchemaEndPoint]
  ): Unit = js.native
  def getEndPoint(params: ParamsResourceApplicationsGetendpoint, options: MethodOptions): GaxiosPromise[SchemaEndPoint] = js.native
  def getEndPoint(
    params: ParamsResourceApplicationsGetendpoint,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEndPoint]
  ): Unit = js.native
  /**
    * Returns a URL for the requested end point type.
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
    *   const res = await games.applications.getEndPoint({
    *     // The application ID from the Google Play developer console.
    *     applicationId: 'placeholder-value',
    *     // Type of endpoint being requested.
    *     endPointType: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "url": "my_url"
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
  def getEndPoint(params: ParamsResourceApplicationsGetendpoint, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getEndPoint(
    params: ParamsResourceApplicationsGetendpoint,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def played(): GaxiosPromise[Unit] = js.native
  def played(callback: BodyResponseCallback[Unit]): Unit = js.native
  def played(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def played(params: ParamsResourceApplicationsPlayed): GaxiosPromise[Unit] = js.native
  def played(params: ParamsResourceApplicationsPlayed, callback: BodyResponseCallback[Unit]): Unit = js.native
  def played(
    params: ParamsResourceApplicationsPlayed,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def played(params: ParamsResourceApplicationsPlayed, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def played(
    params: ParamsResourceApplicationsPlayed,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Indicate that the currently authenticated user is playing your application.
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
    *   const res = await games.applications.played({});
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
  def played(params: ParamsResourceApplicationsPlayed, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def played(
    params: ParamsResourceApplicationsPlayed,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def verify(): GaxiosPromise[SchemaApplicationVerifyResponse] = js.native
  def verify(callback: BodyResponseCallback[SchemaApplicationVerifyResponse]): Unit = js.native
  def verify(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApplicationVerifyResponse] = js.native
  def verify(params: ParamsResourceApplicationsVerify): GaxiosPromise[SchemaApplicationVerifyResponse] = js.native
  def verify(
    params: ParamsResourceApplicationsVerify,
    callback: BodyResponseCallback[SchemaApplicationVerifyResponse]
  ): Unit = js.native
  def verify(
    params: ParamsResourceApplicationsVerify,
    options: BodyResponseCallback[Readable | SchemaApplicationVerifyResponse],
    callback: BodyResponseCallback[Readable | SchemaApplicationVerifyResponse]
  ): Unit = js.native
  def verify(params: ParamsResourceApplicationsVerify, options: MethodOptions): GaxiosPromise[SchemaApplicationVerifyResponse] = js.native
  def verify(
    params: ParamsResourceApplicationsVerify,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApplicationVerifyResponse]
  ): Unit = js.native
  /**
    * Verifies the auth token provided with this request is for the application with the specified ID, and returns the ID of the player it was granted for.
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
    *   const res = await games.applications.verify({
    *     // The application ID from the Google Play developer console.
    *     applicationId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "alternate_player_id": "my_alternate_player_id",
    *   //   "kind": "my_kind",
    *   //   "player_id": "my_player_id"
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
  def verify(params: ParamsResourceApplicationsVerify, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def verify(
    params: ParamsResourceApplicationsVerify,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
