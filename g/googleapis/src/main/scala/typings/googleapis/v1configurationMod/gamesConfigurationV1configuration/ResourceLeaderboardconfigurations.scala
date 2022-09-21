package typings.googleapis.v1configurationMod.gamesConfigurationV1configuration

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/gamesConfiguration/v1configuration", "gamesConfiguration_v1configuration.Resource$Leaderboardconfigurations")
@js.native
open class ResourceLeaderboardconfigurations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceLeaderboardconfigurationsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceLeaderboardconfigurationsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceLeaderboardconfigurationsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceLeaderboardconfigurationsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceLeaderboardconfigurationsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Delete the leaderboard configuration with the given ID.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/gamesConfiguration.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const gamesConfiguration = google.gamesConfiguration('v1configuration');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidpublisher'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gamesConfiguration.leaderboardConfigurations.delete({
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
  def delete(params: ParamsResourceLeaderboardconfigurationsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceLeaderboardconfigurationsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaLeaderboardConfiguration] = js.native
  def get(callback: BodyResponseCallback[SchemaLeaderboardConfiguration]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLeaderboardConfiguration] = js.native
  def get(params: ParamsResourceLeaderboardconfigurationsGet): GaxiosPromise[SchemaLeaderboardConfiguration] = js.native
  def get(
    params: ParamsResourceLeaderboardconfigurationsGet,
    callback: BodyResponseCallback[SchemaLeaderboardConfiguration]
  ): Unit = js.native
  def get(
    params: ParamsResourceLeaderboardconfigurationsGet,
    options: BodyResponseCallback[Readable | SchemaLeaderboardConfiguration],
    callback: BodyResponseCallback[Readable | SchemaLeaderboardConfiguration]
  ): Unit = js.native
  def get(params: ParamsResourceLeaderboardconfigurationsGet, options: MethodOptions): GaxiosPromise[SchemaLeaderboardConfiguration] = js.native
  def get(
    params: ParamsResourceLeaderboardconfigurationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLeaderboardConfiguration]
  ): Unit = js.native
  /**
    * Retrieves the metadata of the leaderboard configuration with the given ID.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/gamesConfiguration.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const gamesConfiguration = google.gamesConfiguration('v1configuration');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidpublisher'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gamesConfiguration.leaderboardConfigurations.get({
    *     // The ID of the leaderboard.
    *     leaderboardId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "draft": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "published": {},
    *   //   "scoreMax": "my_scoreMax",
    *   //   "scoreMin": "my_scoreMin",
    *   //   "scoreOrder": "my_scoreOrder",
    *   //   "token": "my_token"
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
  def get(params: ParamsResourceLeaderboardconfigurationsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceLeaderboardconfigurationsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaLeaderboardConfiguration] = js.native
  def insert(callback: BodyResponseCallback[SchemaLeaderboardConfiguration]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLeaderboardConfiguration] = js.native
  def insert(params: ParamsResourceLeaderboardconfigurationsInsert): GaxiosPromise[SchemaLeaderboardConfiguration] = js.native
  def insert(
    params: ParamsResourceLeaderboardconfigurationsInsert,
    callback: BodyResponseCallback[SchemaLeaderboardConfiguration]
  ): Unit = js.native
  def insert(
    params: ParamsResourceLeaderboardconfigurationsInsert,
    options: BodyResponseCallback[Readable | SchemaLeaderboardConfiguration],
    callback: BodyResponseCallback[Readable | SchemaLeaderboardConfiguration]
  ): Unit = js.native
  def insert(params: ParamsResourceLeaderboardconfigurationsInsert, options: MethodOptions): GaxiosPromise[SchemaLeaderboardConfiguration] = js.native
  def insert(
    params: ParamsResourceLeaderboardconfigurationsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLeaderboardConfiguration]
  ): Unit = js.native
  /**
    * Insert a new leaderboard configuration in this application.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/gamesConfiguration.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const gamesConfiguration = google.gamesConfiguration('v1configuration');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidpublisher'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gamesConfiguration.leaderboardConfigurations.insert({
    *     // The application ID from the Google Play developer console.
    *     applicationId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "draft": {},
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "published": {},
    *       //   "scoreMax": "my_scoreMax",
    *       //   "scoreMin": "my_scoreMin",
    *       //   "scoreOrder": "my_scoreOrder",
    *       //   "token": "my_token"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "draft": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "published": {},
    *   //   "scoreMax": "my_scoreMax",
    *   //   "scoreMin": "my_scoreMin",
    *   //   "scoreOrder": "my_scoreOrder",
    *   //   "token": "my_token"
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
  def insert(params: ParamsResourceLeaderboardconfigurationsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceLeaderboardconfigurationsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaLeaderboardConfigurationListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaLeaderboardConfigurationListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLeaderboardConfigurationListResponse] = js.native
  def list(params: ParamsResourceLeaderboardconfigurationsList): GaxiosPromise[SchemaLeaderboardConfigurationListResponse] = js.native
  def list(
    params: ParamsResourceLeaderboardconfigurationsList,
    callback: BodyResponseCallback[SchemaLeaderboardConfigurationListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceLeaderboardconfigurationsList,
    options: BodyResponseCallback[Readable | SchemaLeaderboardConfigurationListResponse],
    callback: BodyResponseCallback[Readable | SchemaLeaderboardConfigurationListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceLeaderboardconfigurationsList, options: MethodOptions): GaxiosPromise[SchemaLeaderboardConfigurationListResponse] = js.native
  def list(
    params: ParamsResourceLeaderboardconfigurationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLeaderboardConfigurationListResponse]
  ): Unit = js.native
  /**
    * Returns a list of the leaderboard configurations in this application.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/gamesConfiguration.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const gamesConfiguration = google.gamesConfiguration('v1configuration');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidpublisher'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gamesConfiguration.leaderboardConfigurations.list({
    *     // The application ID from the Google Play developer console.
    *     applicationId: 'placeholder-value',
    *     // The maximum number of resource configurations to return in the response, used for paging. For any response, the actual number of resources returned may be less than the specified `maxResults`.
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
  def list(params: ParamsResourceLeaderboardconfigurationsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceLeaderboardconfigurationsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaLeaderboardConfiguration] = js.native
  def update(callback: BodyResponseCallback[SchemaLeaderboardConfiguration]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLeaderboardConfiguration] = js.native
  def update(params: ParamsResourceLeaderboardconfigurationsUpdate): GaxiosPromise[SchemaLeaderboardConfiguration] = js.native
  def update(
    params: ParamsResourceLeaderboardconfigurationsUpdate,
    callback: BodyResponseCallback[SchemaLeaderboardConfiguration]
  ): Unit = js.native
  def update(
    params: ParamsResourceLeaderboardconfigurationsUpdate,
    options: BodyResponseCallback[Readable | SchemaLeaderboardConfiguration],
    callback: BodyResponseCallback[Readable | SchemaLeaderboardConfiguration]
  ): Unit = js.native
  def update(params: ParamsResourceLeaderboardconfigurationsUpdate, options: MethodOptions): GaxiosPromise[SchemaLeaderboardConfiguration] = js.native
  def update(
    params: ParamsResourceLeaderboardconfigurationsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLeaderboardConfiguration]
  ): Unit = js.native
  /**
    * Update the metadata of the leaderboard configuration with the given ID.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/gamesConfiguration.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const gamesConfiguration = google.gamesConfiguration('v1configuration');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidpublisher'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gamesConfiguration.leaderboardConfigurations.update({
    *     // The ID of the leaderboard.
    *     leaderboardId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "draft": {},
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "published": {},
    *       //   "scoreMax": "my_scoreMax",
    *       //   "scoreMin": "my_scoreMin",
    *       //   "scoreOrder": "my_scoreOrder",
    *       //   "token": "my_token"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "draft": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "published": {},
    *   //   "scoreMax": "my_scoreMax",
    *   //   "scoreMin": "my_scoreMin",
    *   //   "scoreOrder": "my_scoreOrder",
    *   //   "token": "my_token"
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
  def update(params: ParamsResourceLeaderboardconfigurationsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceLeaderboardconfigurationsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
