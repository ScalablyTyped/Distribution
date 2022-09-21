package typings.googleapis.v3Mod.analyticsV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Webproperties")
@js.native
open class ResourceManagementWebproperties protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaWebproperty] = js.native
  def get(callback: BodyResponseCallback[SchemaWebproperty]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWebproperty] = js.native
  def get(params: ParamsResourceManagementWebpropertiesGet): GaxiosPromise[SchemaWebproperty] = js.native
  def get(
    params: ParamsResourceManagementWebpropertiesGet,
    callback: BodyResponseCallback[SchemaWebproperty]
  ): Unit = js.native
  def get(
    params: ParamsResourceManagementWebpropertiesGet,
    options: BodyResponseCallback[Readable | SchemaWebproperty],
    callback: BodyResponseCallback[Readable | SchemaWebproperty]
  ): Unit = js.native
  def get(params: ParamsResourceManagementWebpropertiesGet, options: MethodOptions): GaxiosPromise[SchemaWebproperty] = js.native
  def get(
    params: ParamsResourceManagementWebpropertiesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWebproperty]
  ): Unit = js.native
  /**
    * Gets a web property to which the user has access.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analytics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analytics = google.analytics('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/analytics.edit',
    *       'https://www.googleapis.com/auth/analytics.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analytics.management.webproperties.get({
    *     // Account ID to retrieve the web property for.
    *     accountId: '[0-9]+',
    *     // ID to retrieve the web property for.
    *     webPropertyId: 'UA-[0-9]+-[0-9]+',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "childLink": {},
    *   //   "created": "my_created",
    *   //   "dataRetentionResetOnNewActivity": false,
    *   //   "dataRetentionTtl": "my_dataRetentionTtl",
    *   //   "defaultProfileId": "my_defaultProfileId",
    *   //   "id": "my_id",
    *   //   "industryVertical": "my_industryVertical",
    *   //   "internalWebPropertyId": "my_internalWebPropertyId",
    *   //   "kind": "my_kind",
    *   //   "level": "my_level",
    *   //   "name": "my_name",
    *   //   "parentLink": {},
    *   //   "permissions": {},
    *   //   "profileCount": 0,
    *   //   "selfLink": "my_selfLink",
    *   //   "starred": false,
    *   //   "updated": "my_updated",
    *   //   "websiteUrl": "my_websiteUrl"
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
  def get(params: ParamsResourceManagementWebpropertiesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceManagementWebpropertiesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaWebproperty] = js.native
  def insert(callback: BodyResponseCallback[SchemaWebproperty]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWebproperty] = js.native
  def insert(params: ParamsResourceManagementWebpropertiesInsert): GaxiosPromise[SchemaWebproperty] = js.native
  def insert(
    params: ParamsResourceManagementWebpropertiesInsert,
    callback: BodyResponseCallback[SchemaWebproperty]
  ): Unit = js.native
  def insert(
    params: ParamsResourceManagementWebpropertiesInsert,
    options: BodyResponseCallback[Readable | SchemaWebproperty],
    callback: BodyResponseCallback[Readable | SchemaWebproperty]
  ): Unit = js.native
  def insert(params: ParamsResourceManagementWebpropertiesInsert, options: MethodOptions): GaxiosPromise[SchemaWebproperty] = js.native
  def insert(
    params: ParamsResourceManagementWebpropertiesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWebproperty]
  ): Unit = js.native
  /**
    * Create a new property if the account has fewer than 20 properties. Web properties are visible in the Google Analytics interface only if they have at least one profile.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analytics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analytics = google.analytics('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/analytics.edit'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analytics.management.webproperties.insert({
    *     // Account ID to create the web property for.
    *     accountId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "childLink": {},
    *       //   "created": "my_created",
    *       //   "dataRetentionResetOnNewActivity": false,
    *       //   "dataRetentionTtl": "my_dataRetentionTtl",
    *       //   "defaultProfileId": "my_defaultProfileId",
    *       //   "id": "my_id",
    *       //   "industryVertical": "my_industryVertical",
    *       //   "internalWebPropertyId": "my_internalWebPropertyId",
    *       //   "kind": "my_kind",
    *       //   "level": "my_level",
    *       //   "name": "my_name",
    *       //   "parentLink": {},
    *       //   "permissions": {},
    *       //   "profileCount": 0,
    *       //   "selfLink": "my_selfLink",
    *       //   "starred": false,
    *       //   "updated": "my_updated",
    *       //   "websiteUrl": "my_websiteUrl"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "childLink": {},
    *   //   "created": "my_created",
    *   //   "dataRetentionResetOnNewActivity": false,
    *   //   "dataRetentionTtl": "my_dataRetentionTtl",
    *   //   "defaultProfileId": "my_defaultProfileId",
    *   //   "id": "my_id",
    *   //   "industryVertical": "my_industryVertical",
    *   //   "internalWebPropertyId": "my_internalWebPropertyId",
    *   //   "kind": "my_kind",
    *   //   "level": "my_level",
    *   //   "name": "my_name",
    *   //   "parentLink": {},
    *   //   "permissions": {},
    *   //   "profileCount": 0,
    *   //   "selfLink": "my_selfLink",
    *   //   "starred": false,
    *   //   "updated": "my_updated",
    *   //   "websiteUrl": "my_websiteUrl"
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
  def insert(params: ParamsResourceManagementWebpropertiesInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceManagementWebpropertiesInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaWebproperties] = js.native
  def list(callback: BodyResponseCallback[SchemaWebproperties]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWebproperties] = js.native
  def list(params: ParamsResourceManagementWebpropertiesList): GaxiosPromise[SchemaWebproperties] = js.native
  def list(
    params: ParamsResourceManagementWebpropertiesList,
    callback: BodyResponseCallback[SchemaWebproperties]
  ): Unit = js.native
  def list(
    params: ParamsResourceManagementWebpropertiesList,
    options: BodyResponseCallback[Readable | SchemaWebproperties],
    callback: BodyResponseCallback[Readable | SchemaWebproperties]
  ): Unit = js.native
  def list(params: ParamsResourceManagementWebpropertiesList, options: MethodOptions): GaxiosPromise[SchemaWebproperties] = js.native
  def list(
    params: ParamsResourceManagementWebpropertiesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWebproperties]
  ): Unit = js.native
  /**
    * Lists web properties to which the user has access.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analytics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analytics = google.analytics('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/analytics',
    *       'https://www.googleapis.com/auth/analytics.edit',
    *       'https://www.googleapis.com/auth/analytics.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analytics.management.webproperties.list({
    *     // Account ID to retrieve web properties for. Can either be a specific account ID or '~all', which refers to all the accounts that user has access to.
    *     accountId: 'placeholder-value',
    *     // The maximum number of web properties to include in this response.
    *     'max-results': 'placeholder-value',
    *     // An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    *     'start-index': 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "items": [],
    *   //   "itemsPerPage": 0,
    *   //   "kind": "my_kind",
    *   //   "nextLink": "my_nextLink",
    *   //   "previousLink": "my_previousLink",
    *   //   "startIndex": 0,
    *   //   "totalResults": 0,
    *   //   "username": "my_username"
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
  def list(params: ParamsResourceManagementWebpropertiesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceManagementWebpropertiesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaWebproperty] = js.native
  def patch(callback: BodyResponseCallback[SchemaWebproperty]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWebproperty] = js.native
  def patch(params: ParamsResourceManagementWebpropertiesPatch): GaxiosPromise[SchemaWebproperty] = js.native
  def patch(
    params: ParamsResourceManagementWebpropertiesPatch,
    callback: BodyResponseCallback[SchemaWebproperty]
  ): Unit = js.native
  def patch(
    params: ParamsResourceManagementWebpropertiesPatch,
    options: BodyResponseCallback[Readable | SchemaWebproperty],
    callback: BodyResponseCallback[Readable | SchemaWebproperty]
  ): Unit = js.native
  def patch(params: ParamsResourceManagementWebpropertiesPatch, options: MethodOptions): GaxiosPromise[SchemaWebproperty] = js.native
  def patch(
    params: ParamsResourceManagementWebpropertiesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWebproperty]
  ): Unit = js.native
  /**
    * Updates an existing web property. This method supports patch semantics.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analytics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analytics = google.analytics('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/analytics.edit'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analytics.management.webproperties.patch({
    *     // Account ID to which the web property belongs
    *     accountId: 'placeholder-value',
    *     // Web property ID
    *     webPropertyId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "childLink": {},
    *       //   "created": "my_created",
    *       //   "dataRetentionResetOnNewActivity": false,
    *       //   "dataRetentionTtl": "my_dataRetentionTtl",
    *       //   "defaultProfileId": "my_defaultProfileId",
    *       //   "id": "my_id",
    *       //   "industryVertical": "my_industryVertical",
    *       //   "internalWebPropertyId": "my_internalWebPropertyId",
    *       //   "kind": "my_kind",
    *       //   "level": "my_level",
    *       //   "name": "my_name",
    *       //   "parentLink": {},
    *       //   "permissions": {},
    *       //   "profileCount": 0,
    *       //   "selfLink": "my_selfLink",
    *       //   "starred": false,
    *       //   "updated": "my_updated",
    *       //   "websiteUrl": "my_websiteUrl"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "childLink": {},
    *   //   "created": "my_created",
    *   //   "dataRetentionResetOnNewActivity": false,
    *   //   "dataRetentionTtl": "my_dataRetentionTtl",
    *   //   "defaultProfileId": "my_defaultProfileId",
    *   //   "id": "my_id",
    *   //   "industryVertical": "my_industryVertical",
    *   //   "internalWebPropertyId": "my_internalWebPropertyId",
    *   //   "kind": "my_kind",
    *   //   "level": "my_level",
    *   //   "name": "my_name",
    *   //   "parentLink": {},
    *   //   "permissions": {},
    *   //   "profileCount": 0,
    *   //   "selfLink": "my_selfLink",
    *   //   "starred": false,
    *   //   "updated": "my_updated",
    *   //   "websiteUrl": "my_websiteUrl"
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
  def patch(params: ParamsResourceManagementWebpropertiesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceManagementWebpropertiesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaWebproperty] = js.native
  def update(callback: BodyResponseCallback[SchemaWebproperty]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWebproperty] = js.native
  def update(params: ParamsResourceManagementWebpropertiesUpdate): GaxiosPromise[SchemaWebproperty] = js.native
  def update(
    params: ParamsResourceManagementWebpropertiesUpdate,
    callback: BodyResponseCallback[SchemaWebproperty]
  ): Unit = js.native
  def update(
    params: ParamsResourceManagementWebpropertiesUpdate,
    options: BodyResponseCallback[Readable | SchemaWebproperty],
    callback: BodyResponseCallback[Readable | SchemaWebproperty]
  ): Unit = js.native
  def update(params: ParamsResourceManagementWebpropertiesUpdate, options: MethodOptions): GaxiosPromise[SchemaWebproperty] = js.native
  def update(
    params: ParamsResourceManagementWebpropertiesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWebproperty]
  ): Unit = js.native
  /**
    * Updates an existing web property.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analytics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analytics = google.analytics('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/analytics.edit'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analytics.management.webproperties.update({
    *     // Account ID to which the web property belongs
    *     accountId: 'placeholder-value',
    *     // Web property ID
    *     webPropertyId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "childLink": {},
    *       //   "created": "my_created",
    *       //   "dataRetentionResetOnNewActivity": false,
    *       //   "dataRetentionTtl": "my_dataRetentionTtl",
    *       //   "defaultProfileId": "my_defaultProfileId",
    *       //   "id": "my_id",
    *       //   "industryVertical": "my_industryVertical",
    *       //   "internalWebPropertyId": "my_internalWebPropertyId",
    *       //   "kind": "my_kind",
    *       //   "level": "my_level",
    *       //   "name": "my_name",
    *       //   "parentLink": {},
    *       //   "permissions": {},
    *       //   "profileCount": 0,
    *       //   "selfLink": "my_selfLink",
    *       //   "starred": false,
    *       //   "updated": "my_updated",
    *       //   "websiteUrl": "my_websiteUrl"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "childLink": {},
    *   //   "created": "my_created",
    *   //   "dataRetentionResetOnNewActivity": false,
    *   //   "dataRetentionTtl": "my_dataRetentionTtl",
    *   //   "defaultProfileId": "my_defaultProfileId",
    *   //   "id": "my_id",
    *   //   "industryVertical": "my_industryVertical",
    *   //   "internalWebPropertyId": "my_internalWebPropertyId",
    *   //   "kind": "my_kind",
    *   //   "level": "my_level",
    *   //   "name": "my_name",
    *   //   "parentLink": {},
    *   //   "permissions": {},
    *   //   "profileCount": 0,
    *   //   "selfLink": "my_selfLink",
    *   //   "starred": false,
    *   //   "updated": "my_updated",
    *   //   "websiteUrl": "my_websiteUrl"
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
  def update(params: ParamsResourceManagementWebpropertiesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceManagementWebpropertiesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
