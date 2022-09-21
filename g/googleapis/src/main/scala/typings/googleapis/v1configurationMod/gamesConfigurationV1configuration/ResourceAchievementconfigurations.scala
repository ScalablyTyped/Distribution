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

@JSImport("googleapis/build/src/apis/gamesConfiguration/v1configuration", "gamesConfiguration_v1configuration.Resource$Achievementconfigurations")
@js.native
open class ResourceAchievementconfigurations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAchievementconfigurationsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAchievementconfigurationsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceAchievementconfigurationsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAchievementconfigurationsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAchievementconfigurationsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Delete the achievement configuration with the given ID.
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
    *   const res = await gamesConfiguration.achievementConfigurations.delete({
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
  def delete(params: ParamsResourceAchievementconfigurationsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAchievementconfigurationsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaAchievementConfiguration] = js.native
  def get(callback: BodyResponseCallback[SchemaAchievementConfiguration]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAchievementConfiguration] = js.native
  def get(params: ParamsResourceAchievementconfigurationsGet): GaxiosPromise[SchemaAchievementConfiguration] = js.native
  def get(
    params: ParamsResourceAchievementconfigurationsGet,
    callback: BodyResponseCallback[SchemaAchievementConfiguration]
  ): Unit = js.native
  def get(
    params: ParamsResourceAchievementconfigurationsGet,
    options: BodyResponseCallback[Readable | SchemaAchievementConfiguration],
    callback: BodyResponseCallback[Readable | SchemaAchievementConfiguration]
  ): Unit = js.native
  def get(params: ParamsResourceAchievementconfigurationsGet, options: MethodOptions): GaxiosPromise[SchemaAchievementConfiguration] = js.native
  def get(
    params: ParamsResourceAchievementconfigurationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAchievementConfiguration]
  ): Unit = js.native
  /**
    * Retrieves the metadata of the achievement configuration with the given ID.
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
    *   const res = await gamesConfiguration.achievementConfigurations.get({
    *     // The ID of the achievement used by this method.
    *     achievementId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "achievementType": "my_achievementType",
    *   //   "draft": {},
    *   //   "id": "my_id",
    *   //   "initialState": "my_initialState",
    *   //   "kind": "my_kind",
    *   //   "published": {},
    *   //   "stepsToUnlock": 0,
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
  def get(params: ParamsResourceAchievementconfigurationsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAchievementconfigurationsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaAchievementConfiguration] = js.native
  def insert(callback: BodyResponseCallback[SchemaAchievementConfiguration]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAchievementConfiguration] = js.native
  def insert(params: ParamsResourceAchievementconfigurationsInsert): GaxiosPromise[SchemaAchievementConfiguration] = js.native
  def insert(
    params: ParamsResourceAchievementconfigurationsInsert,
    callback: BodyResponseCallback[SchemaAchievementConfiguration]
  ): Unit = js.native
  def insert(
    params: ParamsResourceAchievementconfigurationsInsert,
    options: BodyResponseCallback[Readable | SchemaAchievementConfiguration],
    callback: BodyResponseCallback[Readable | SchemaAchievementConfiguration]
  ): Unit = js.native
  def insert(params: ParamsResourceAchievementconfigurationsInsert, options: MethodOptions): GaxiosPromise[SchemaAchievementConfiguration] = js.native
  def insert(
    params: ParamsResourceAchievementconfigurationsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAchievementConfiguration]
  ): Unit = js.native
  /**
    * Insert a new achievement configuration in this application.
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
    *   const res = await gamesConfiguration.achievementConfigurations.insert({
    *     // The application ID from the Google Play developer console.
    *     applicationId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "achievementType": "my_achievementType",
    *       //   "draft": {},
    *       //   "id": "my_id",
    *       //   "initialState": "my_initialState",
    *       //   "kind": "my_kind",
    *       //   "published": {},
    *       //   "stepsToUnlock": 0,
    *       //   "token": "my_token"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "achievementType": "my_achievementType",
    *   //   "draft": {},
    *   //   "id": "my_id",
    *   //   "initialState": "my_initialState",
    *   //   "kind": "my_kind",
    *   //   "published": {},
    *   //   "stepsToUnlock": 0,
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
  def insert(params: ParamsResourceAchievementconfigurationsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceAchievementconfigurationsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaAchievementConfigurationListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaAchievementConfigurationListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAchievementConfigurationListResponse] = js.native
  def list(params: ParamsResourceAchievementconfigurationsList): GaxiosPromise[SchemaAchievementConfigurationListResponse] = js.native
  def list(
    params: ParamsResourceAchievementconfigurationsList,
    callback: BodyResponseCallback[SchemaAchievementConfigurationListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAchievementconfigurationsList,
    options: BodyResponseCallback[Readable | SchemaAchievementConfigurationListResponse],
    callback: BodyResponseCallback[Readable | SchemaAchievementConfigurationListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAchievementconfigurationsList, options: MethodOptions): GaxiosPromise[SchemaAchievementConfigurationListResponse] = js.native
  def list(
    params: ParamsResourceAchievementconfigurationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAchievementConfigurationListResponse]
  ): Unit = js.native
  /**
    * Returns a list of the achievement configurations in this application.
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
    *   const res = await gamesConfiguration.achievementConfigurations.list({
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
  def list(params: ParamsResourceAchievementconfigurationsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAchievementconfigurationsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaAchievementConfiguration] = js.native
  def update(callback: BodyResponseCallback[SchemaAchievementConfiguration]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAchievementConfiguration] = js.native
  def update(params: ParamsResourceAchievementconfigurationsUpdate): GaxiosPromise[SchemaAchievementConfiguration] = js.native
  def update(
    params: ParamsResourceAchievementconfigurationsUpdate,
    callback: BodyResponseCallback[SchemaAchievementConfiguration]
  ): Unit = js.native
  def update(
    params: ParamsResourceAchievementconfigurationsUpdate,
    options: BodyResponseCallback[Readable | SchemaAchievementConfiguration],
    callback: BodyResponseCallback[Readable | SchemaAchievementConfiguration]
  ): Unit = js.native
  def update(params: ParamsResourceAchievementconfigurationsUpdate, options: MethodOptions): GaxiosPromise[SchemaAchievementConfiguration] = js.native
  def update(
    params: ParamsResourceAchievementconfigurationsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAchievementConfiguration]
  ): Unit = js.native
  /**
    * Update the metadata of the achievement configuration with the given ID.
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
    *   const res = await gamesConfiguration.achievementConfigurations.update({
    *     // The ID of the achievement used by this method.
    *     achievementId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "achievementType": "my_achievementType",
    *       //   "draft": {},
    *       //   "id": "my_id",
    *       //   "initialState": "my_initialState",
    *       //   "kind": "my_kind",
    *       //   "published": {},
    *       //   "stepsToUnlock": 0,
    *       //   "token": "my_token"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "achievementType": "my_achievementType",
    *   //   "draft": {},
    *   //   "id": "my_id",
    *   //   "initialState": "my_initialState",
    *   //   "kind": "my_kind",
    *   //   "published": {},
    *   //   "stepsToUnlock": 0,
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
  def update(params: ParamsResourceAchievementconfigurationsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceAchievementconfigurationsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
