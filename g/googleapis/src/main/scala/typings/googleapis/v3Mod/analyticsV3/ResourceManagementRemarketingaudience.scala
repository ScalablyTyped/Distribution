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

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Remarketingaudience")
@js.native
open class ResourceManagementRemarketingaudience protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagementRemarketingaudienceDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagementRemarketingaudienceDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceManagementRemarketingaudienceDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceManagementRemarketingaudienceDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceManagementRemarketingaudienceDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Delete a remarketing audience.
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
    *   const res = await analytics.management.remarketingAudience.delete({
    *     // Account ID to which the remarketing audience belongs.
    *     accountId: 'placeholder-value',
    *     // The ID of the remarketing audience to delete.
    *     remarketingAudienceId: 'placeholder-value',
    *     // Web property ID to which the remarketing audience belongs.
    *     webPropertyId: 'placeholder-value',
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
  def delete(params: ParamsResourceManagementRemarketingaudienceDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceManagementRemarketingaudienceDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaRemarketingAudience] = js.native
  def get(callback: BodyResponseCallback[SchemaRemarketingAudience]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRemarketingAudience] = js.native
  def get(params: ParamsResourceManagementRemarketingaudienceGet): GaxiosPromise[SchemaRemarketingAudience] = js.native
  def get(
    params: ParamsResourceManagementRemarketingaudienceGet,
    callback: BodyResponseCallback[SchemaRemarketingAudience]
  ): Unit = js.native
  def get(
    params: ParamsResourceManagementRemarketingaudienceGet,
    options: BodyResponseCallback[Readable | SchemaRemarketingAudience],
    callback: BodyResponseCallback[Readable | SchemaRemarketingAudience]
  ): Unit = js.native
  def get(params: ParamsResourceManagementRemarketingaudienceGet, options: MethodOptions): GaxiosPromise[SchemaRemarketingAudience] = js.native
  def get(
    params: ParamsResourceManagementRemarketingaudienceGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRemarketingAudience]
  ): Unit = js.native
  /**
    * Gets a remarketing audience to which the user has access.
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
    *   const res = await analytics.management.remarketingAudience.get({
    *     // The account ID of the remarketing audience to retrieve.
    *     accountId: 'placeholder-value',
    *     // The ID of the remarketing audience to retrieve.
    *     remarketingAudienceId: 'placeholder-value',
    *     // The web property ID of the remarketing audience to retrieve.
    *     webPropertyId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "audienceDefinition": {},
    *   //   "audienceType": "my_audienceType",
    *   //   "created": "my_created",
    *   //   "description": "my_description",
    *   //   "id": "my_id",
    *   //   "internalWebPropertyId": "my_internalWebPropertyId",
    *   //   "kind": "my_kind",
    *   //   "linkedAdAccounts": [],
    *   //   "linkedViews": [],
    *   //   "name": "my_name",
    *   //   "stateBasedAudienceDefinition": {},
    *   //   "updated": "my_updated",
    *   //   "webPropertyId": "my_webPropertyId"
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
  def get(params: ParamsResourceManagementRemarketingaudienceGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceManagementRemarketingaudienceGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaRemarketingAudience] = js.native
  def insert(callback: BodyResponseCallback[SchemaRemarketingAudience]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRemarketingAudience] = js.native
  def insert(params: ParamsResourceManagementRemarketingaudienceInsert): GaxiosPromise[SchemaRemarketingAudience] = js.native
  def insert(
    params: ParamsResourceManagementRemarketingaudienceInsert,
    callback: BodyResponseCallback[SchemaRemarketingAudience]
  ): Unit = js.native
  def insert(
    params: ParamsResourceManagementRemarketingaudienceInsert,
    options: BodyResponseCallback[Readable | SchemaRemarketingAudience],
    callback: BodyResponseCallback[Readable | SchemaRemarketingAudience]
  ): Unit = js.native
  def insert(params: ParamsResourceManagementRemarketingaudienceInsert, options: MethodOptions): GaxiosPromise[SchemaRemarketingAudience] = js.native
  def insert(
    params: ParamsResourceManagementRemarketingaudienceInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRemarketingAudience]
  ): Unit = js.native
  /**
    * Creates a new remarketing audience.
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
    *   const res = await analytics.management.remarketingAudience.insert({
    *     // The account ID for which to create the remarketing audience.
    *     accountId: 'placeholder-value',
    *     // Web property ID for which to create the remarketing audience.
    *     webPropertyId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "audienceDefinition": {},
    *       //   "audienceType": "my_audienceType",
    *       //   "created": "my_created",
    *       //   "description": "my_description",
    *       //   "id": "my_id",
    *       //   "internalWebPropertyId": "my_internalWebPropertyId",
    *       //   "kind": "my_kind",
    *       //   "linkedAdAccounts": [],
    *       //   "linkedViews": [],
    *       //   "name": "my_name",
    *       //   "stateBasedAudienceDefinition": {},
    *       //   "updated": "my_updated",
    *       //   "webPropertyId": "my_webPropertyId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "audienceDefinition": {},
    *   //   "audienceType": "my_audienceType",
    *   //   "created": "my_created",
    *   //   "description": "my_description",
    *   //   "id": "my_id",
    *   //   "internalWebPropertyId": "my_internalWebPropertyId",
    *   //   "kind": "my_kind",
    *   //   "linkedAdAccounts": [],
    *   //   "linkedViews": [],
    *   //   "name": "my_name",
    *   //   "stateBasedAudienceDefinition": {},
    *   //   "updated": "my_updated",
    *   //   "webPropertyId": "my_webPropertyId"
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
  def insert(params: ParamsResourceManagementRemarketingaudienceInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceManagementRemarketingaudienceInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaRemarketingAudiences] = js.native
  def list(callback: BodyResponseCallback[SchemaRemarketingAudiences]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRemarketingAudiences] = js.native
  def list(params: ParamsResourceManagementRemarketingaudienceList): GaxiosPromise[SchemaRemarketingAudiences] = js.native
  def list(
    params: ParamsResourceManagementRemarketingaudienceList,
    callback: BodyResponseCallback[SchemaRemarketingAudiences]
  ): Unit = js.native
  def list(
    params: ParamsResourceManagementRemarketingaudienceList,
    options: BodyResponseCallback[Readable | SchemaRemarketingAudiences],
    callback: BodyResponseCallback[Readable | SchemaRemarketingAudiences]
  ): Unit = js.native
  def list(params: ParamsResourceManagementRemarketingaudienceList, options: MethodOptions): GaxiosPromise[SchemaRemarketingAudiences] = js.native
  def list(
    params: ParamsResourceManagementRemarketingaudienceList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRemarketingAudiences]
  ): Unit = js.native
  /**
    * Lists remarketing audiences to which the user has access.
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
    *   const res = await analytics.management.remarketingAudience.list({
    *     // The account ID of the remarketing audiences to retrieve.
    *     accountId: 'placeholder-value',
    *     // The maximum number of remarketing audiences to include in this response.
    *     'max-results': 'placeholder-value',
    *     // An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    *     'start-index': 'placeholder-value',
    *
    *     type: 'placeholder-value',
    *     // The web property ID of the remarketing audiences to retrieve.
    *     webPropertyId: 'placeholder-value',
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
  def list(params: ParamsResourceManagementRemarketingaudienceList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceManagementRemarketingaudienceList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaRemarketingAudience] = js.native
  def patch(callback: BodyResponseCallback[SchemaRemarketingAudience]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRemarketingAudience] = js.native
  def patch(params: ParamsResourceManagementRemarketingaudiencePatch): GaxiosPromise[SchemaRemarketingAudience] = js.native
  def patch(
    params: ParamsResourceManagementRemarketingaudiencePatch,
    callback: BodyResponseCallback[SchemaRemarketingAudience]
  ): Unit = js.native
  def patch(
    params: ParamsResourceManagementRemarketingaudiencePatch,
    options: BodyResponseCallback[Readable | SchemaRemarketingAudience],
    callback: BodyResponseCallback[Readable | SchemaRemarketingAudience]
  ): Unit = js.native
  def patch(params: ParamsResourceManagementRemarketingaudiencePatch, options: MethodOptions): GaxiosPromise[SchemaRemarketingAudience] = js.native
  def patch(
    params: ParamsResourceManagementRemarketingaudiencePatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRemarketingAudience]
  ): Unit = js.native
  /**
    * Updates an existing remarketing audience. This method supports patch semantics.
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
    *   const res = await analytics.management.remarketingAudience.patch({
    *     // The account ID of the remarketing audience to update.
    *     accountId: 'placeholder-value',
    *     // The ID of the remarketing audience to update.
    *     remarketingAudienceId: 'placeholder-value',
    *     // The web property ID of the remarketing audience to update.
    *     webPropertyId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "audienceDefinition": {},
    *       //   "audienceType": "my_audienceType",
    *       //   "created": "my_created",
    *       //   "description": "my_description",
    *       //   "id": "my_id",
    *       //   "internalWebPropertyId": "my_internalWebPropertyId",
    *       //   "kind": "my_kind",
    *       //   "linkedAdAccounts": [],
    *       //   "linkedViews": [],
    *       //   "name": "my_name",
    *       //   "stateBasedAudienceDefinition": {},
    *       //   "updated": "my_updated",
    *       //   "webPropertyId": "my_webPropertyId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "audienceDefinition": {},
    *   //   "audienceType": "my_audienceType",
    *   //   "created": "my_created",
    *   //   "description": "my_description",
    *   //   "id": "my_id",
    *   //   "internalWebPropertyId": "my_internalWebPropertyId",
    *   //   "kind": "my_kind",
    *   //   "linkedAdAccounts": [],
    *   //   "linkedViews": [],
    *   //   "name": "my_name",
    *   //   "stateBasedAudienceDefinition": {},
    *   //   "updated": "my_updated",
    *   //   "webPropertyId": "my_webPropertyId"
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
  def patch(params: ParamsResourceManagementRemarketingaudiencePatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceManagementRemarketingaudiencePatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaRemarketingAudience] = js.native
  def update(callback: BodyResponseCallback[SchemaRemarketingAudience]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRemarketingAudience] = js.native
  def update(params: ParamsResourceManagementRemarketingaudienceUpdate): GaxiosPromise[SchemaRemarketingAudience] = js.native
  def update(
    params: ParamsResourceManagementRemarketingaudienceUpdate,
    callback: BodyResponseCallback[SchemaRemarketingAudience]
  ): Unit = js.native
  def update(
    params: ParamsResourceManagementRemarketingaudienceUpdate,
    options: BodyResponseCallback[Readable | SchemaRemarketingAudience],
    callback: BodyResponseCallback[Readable | SchemaRemarketingAudience]
  ): Unit = js.native
  def update(params: ParamsResourceManagementRemarketingaudienceUpdate, options: MethodOptions): GaxiosPromise[SchemaRemarketingAudience] = js.native
  def update(
    params: ParamsResourceManagementRemarketingaudienceUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRemarketingAudience]
  ): Unit = js.native
  /**
    * Updates an existing remarketing audience.
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
    *   const res = await analytics.management.remarketingAudience.update({
    *     // The account ID of the remarketing audience to update.
    *     accountId: 'placeholder-value',
    *     // The ID of the remarketing audience to update.
    *     remarketingAudienceId: 'placeholder-value',
    *     // The web property ID of the remarketing audience to update.
    *     webPropertyId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "audienceDefinition": {},
    *       //   "audienceType": "my_audienceType",
    *       //   "created": "my_created",
    *       //   "description": "my_description",
    *       //   "id": "my_id",
    *       //   "internalWebPropertyId": "my_internalWebPropertyId",
    *       //   "kind": "my_kind",
    *       //   "linkedAdAccounts": [],
    *       //   "linkedViews": [],
    *       //   "name": "my_name",
    *       //   "stateBasedAudienceDefinition": {},
    *       //   "updated": "my_updated",
    *       //   "webPropertyId": "my_webPropertyId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "audienceDefinition": {},
    *   //   "audienceType": "my_audienceType",
    *   //   "created": "my_created",
    *   //   "description": "my_description",
    *   //   "id": "my_id",
    *   //   "internalWebPropertyId": "my_internalWebPropertyId",
    *   //   "kind": "my_kind",
    *   //   "linkedAdAccounts": [],
    *   //   "linkedViews": [],
    *   //   "name": "my_name",
    *   //   "stateBasedAudienceDefinition": {},
    *   //   "updated": "my_updated",
    *   //   "webPropertyId": "my_webPropertyId"
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
  def update(params: ParamsResourceManagementRemarketingaudienceUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceManagementRemarketingaudienceUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
