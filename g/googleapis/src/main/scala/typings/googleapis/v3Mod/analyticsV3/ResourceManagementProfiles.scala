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

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Profiles")
@js.native
open class ResourceManagementProfiles protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagementProfilesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagementProfilesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceManagementProfilesDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceManagementProfilesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceManagementProfilesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes a view (profile).
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
    *   const res = await analytics.management.profiles.delete({
    *     // Account ID to delete the view (profile) for.
    *     accountId: 'placeholder-value',
    *     // ID of the view (profile) to be deleted.
    *     profileId: 'placeholder-value',
    *     // Web property ID to delete the view (profile) for.
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
  def delete(params: ParamsResourceManagementProfilesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceManagementProfilesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaProfile] = js.native
  def get(callback: BodyResponseCallback[SchemaProfile]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProfile] = js.native
  def get(params: ParamsResourceManagementProfilesGet): GaxiosPromise[SchemaProfile] = js.native
  def get(params: ParamsResourceManagementProfilesGet, callback: BodyResponseCallback[SchemaProfile]): Unit = js.native
  def get(
    params: ParamsResourceManagementProfilesGet,
    options: BodyResponseCallback[Readable | SchemaProfile],
    callback: BodyResponseCallback[Readable | SchemaProfile]
  ): Unit = js.native
  def get(params: ParamsResourceManagementProfilesGet, options: MethodOptions): GaxiosPromise[SchemaProfile] = js.native
  def get(
    params: ParamsResourceManagementProfilesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProfile]
  ): Unit = js.native
  /**
    * Gets a view (profile) to which the user has access.
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
    *   const res = await analytics.management.profiles.get({
    *     // Account ID to retrieve the view (profile) for.
    *     accountId: '[0-9]+',
    *     // View (Profile) ID to retrieve the view (profile) for.
    *     profileId: '[0-9]+',
    *     // Web property ID to retrieve the view (profile) for.
    *     webPropertyId: 'UA-[0-9]+-[0-9]+',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "botFilteringEnabled": false,
    *   //   "childLink": {},
    *   //   "created": "my_created",
    *   //   "currency": "my_currency",
    *   //   "defaultPage": "my_defaultPage",
    *   //   "eCommerceTracking": false,
    *   //   "enhancedECommerceTracking": false,
    *   //   "excludeQueryParameters": "my_excludeQueryParameters",
    *   //   "id": "my_id",
    *   //   "internalWebPropertyId": "my_internalWebPropertyId",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "parentLink": {},
    *   //   "permissions": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "siteSearchCategoryParameters": "my_siteSearchCategoryParameters",
    *   //   "siteSearchQueryParameters": "my_siteSearchQueryParameters",
    *   //   "starred": false,
    *   //   "stripSiteSearchCategoryParameters": false,
    *   //   "stripSiteSearchQueryParameters": false,
    *   //   "timezone": "my_timezone",
    *   //   "type": "my_type",
    *   //   "updated": "my_updated",
    *   //   "webPropertyId": "my_webPropertyId",
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
  def get(params: ParamsResourceManagementProfilesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceManagementProfilesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaProfile] = js.native
  def insert(callback: BodyResponseCallback[SchemaProfile]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProfile] = js.native
  def insert(params: ParamsResourceManagementProfilesInsert): GaxiosPromise[SchemaProfile] = js.native
  def insert(params: ParamsResourceManagementProfilesInsert, callback: BodyResponseCallback[SchemaProfile]): Unit = js.native
  def insert(
    params: ParamsResourceManagementProfilesInsert,
    options: BodyResponseCallback[Readable | SchemaProfile],
    callback: BodyResponseCallback[Readable | SchemaProfile]
  ): Unit = js.native
  def insert(params: ParamsResourceManagementProfilesInsert, options: MethodOptions): GaxiosPromise[SchemaProfile] = js.native
  def insert(
    params: ParamsResourceManagementProfilesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProfile]
  ): Unit = js.native
  /**
    * Create a new view (profile).
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
    *   const res = await analytics.management.profiles.insert({
    *     // Account ID to create the view (profile) for.
    *     accountId: 'placeholder-value',
    *     // Web property ID to create the view (profile) for.
    *     webPropertyId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "botFilteringEnabled": false,
    *       //   "childLink": {},
    *       //   "created": "my_created",
    *       //   "currency": "my_currency",
    *       //   "defaultPage": "my_defaultPage",
    *       //   "eCommerceTracking": false,
    *       //   "enhancedECommerceTracking": false,
    *       //   "excludeQueryParameters": "my_excludeQueryParameters",
    *       //   "id": "my_id",
    *       //   "internalWebPropertyId": "my_internalWebPropertyId",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "parentLink": {},
    *       //   "permissions": {},
    *       //   "selfLink": "my_selfLink",
    *       //   "siteSearchCategoryParameters": "my_siteSearchCategoryParameters",
    *       //   "siteSearchQueryParameters": "my_siteSearchQueryParameters",
    *       //   "starred": false,
    *       //   "stripSiteSearchCategoryParameters": false,
    *       //   "stripSiteSearchQueryParameters": false,
    *       //   "timezone": "my_timezone",
    *       //   "type": "my_type",
    *       //   "updated": "my_updated",
    *       //   "webPropertyId": "my_webPropertyId",
    *       //   "websiteUrl": "my_websiteUrl"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "botFilteringEnabled": false,
    *   //   "childLink": {},
    *   //   "created": "my_created",
    *   //   "currency": "my_currency",
    *   //   "defaultPage": "my_defaultPage",
    *   //   "eCommerceTracking": false,
    *   //   "enhancedECommerceTracking": false,
    *   //   "excludeQueryParameters": "my_excludeQueryParameters",
    *   //   "id": "my_id",
    *   //   "internalWebPropertyId": "my_internalWebPropertyId",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "parentLink": {},
    *   //   "permissions": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "siteSearchCategoryParameters": "my_siteSearchCategoryParameters",
    *   //   "siteSearchQueryParameters": "my_siteSearchQueryParameters",
    *   //   "starred": false,
    *   //   "stripSiteSearchCategoryParameters": false,
    *   //   "stripSiteSearchQueryParameters": false,
    *   //   "timezone": "my_timezone",
    *   //   "type": "my_type",
    *   //   "updated": "my_updated",
    *   //   "webPropertyId": "my_webPropertyId",
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
  def insert(params: ParamsResourceManagementProfilesInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceManagementProfilesInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaProfiles] = js.native
  def list(callback: BodyResponseCallback[SchemaProfiles]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProfiles] = js.native
  def list(params: ParamsResourceManagementProfilesList): GaxiosPromise[SchemaProfiles] = js.native
  def list(params: ParamsResourceManagementProfilesList, callback: BodyResponseCallback[SchemaProfiles]): Unit = js.native
  def list(
    params: ParamsResourceManagementProfilesList,
    options: BodyResponseCallback[Readable | SchemaProfiles],
    callback: BodyResponseCallback[Readable | SchemaProfiles]
  ): Unit = js.native
  def list(params: ParamsResourceManagementProfilesList, options: MethodOptions): GaxiosPromise[SchemaProfiles] = js.native
  def list(
    params: ParamsResourceManagementProfilesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProfiles]
  ): Unit = js.native
  /**
    * Lists views (profiles) to which the user has access.
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
    *   const res = await analytics.management.profiles.list({
    *     // Account ID for the view (profiles) to retrieve. Can either be a specific account ID or '~all', which refers to all the accounts to which the user has access.
    *     accountId: 'placeholder-value',
    *     // The maximum number of views (profiles) to include in this response.
    *     'max-results': 'placeholder-value',
    *     // An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    *     'start-index': 'placeholder-value',
    *     // Web property ID for the views (profiles) to retrieve. Can either be a specific web property ID or '~all', which refers to all the web properties to which the user has access.
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
  def list(params: ParamsResourceManagementProfilesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceManagementProfilesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaProfile] = js.native
  def patch(callback: BodyResponseCallback[SchemaProfile]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProfile] = js.native
  def patch(params: ParamsResourceManagementProfilesPatch): GaxiosPromise[SchemaProfile] = js.native
  def patch(params: ParamsResourceManagementProfilesPatch, callback: BodyResponseCallback[SchemaProfile]): Unit = js.native
  def patch(
    params: ParamsResourceManagementProfilesPatch,
    options: BodyResponseCallback[Readable | SchemaProfile],
    callback: BodyResponseCallback[Readable | SchemaProfile]
  ): Unit = js.native
  def patch(params: ParamsResourceManagementProfilesPatch, options: MethodOptions): GaxiosPromise[SchemaProfile] = js.native
  def patch(
    params: ParamsResourceManagementProfilesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProfile]
  ): Unit = js.native
  /**
    * Updates an existing view (profile). This method supports patch semantics.
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
    *   const res = await analytics.management.profiles.patch({
    *     // Account ID to which the view (profile) belongs
    *     accountId: 'placeholder-value',
    *     // ID of the view (profile) to be updated.
    *     profileId: 'placeholder-value',
    *     // Web property ID to which the view (profile) belongs
    *     webPropertyId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "botFilteringEnabled": false,
    *       //   "childLink": {},
    *       //   "created": "my_created",
    *       //   "currency": "my_currency",
    *       //   "defaultPage": "my_defaultPage",
    *       //   "eCommerceTracking": false,
    *       //   "enhancedECommerceTracking": false,
    *       //   "excludeQueryParameters": "my_excludeQueryParameters",
    *       //   "id": "my_id",
    *       //   "internalWebPropertyId": "my_internalWebPropertyId",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "parentLink": {},
    *       //   "permissions": {},
    *       //   "selfLink": "my_selfLink",
    *       //   "siteSearchCategoryParameters": "my_siteSearchCategoryParameters",
    *       //   "siteSearchQueryParameters": "my_siteSearchQueryParameters",
    *       //   "starred": false,
    *       //   "stripSiteSearchCategoryParameters": false,
    *       //   "stripSiteSearchQueryParameters": false,
    *       //   "timezone": "my_timezone",
    *       //   "type": "my_type",
    *       //   "updated": "my_updated",
    *       //   "webPropertyId": "my_webPropertyId",
    *       //   "websiteUrl": "my_websiteUrl"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "botFilteringEnabled": false,
    *   //   "childLink": {},
    *   //   "created": "my_created",
    *   //   "currency": "my_currency",
    *   //   "defaultPage": "my_defaultPage",
    *   //   "eCommerceTracking": false,
    *   //   "enhancedECommerceTracking": false,
    *   //   "excludeQueryParameters": "my_excludeQueryParameters",
    *   //   "id": "my_id",
    *   //   "internalWebPropertyId": "my_internalWebPropertyId",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "parentLink": {},
    *   //   "permissions": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "siteSearchCategoryParameters": "my_siteSearchCategoryParameters",
    *   //   "siteSearchQueryParameters": "my_siteSearchQueryParameters",
    *   //   "starred": false,
    *   //   "stripSiteSearchCategoryParameters": false,
    *   //   "stripSiteSearchQueryParameters": false,
    *   //   "timezone": "my_timezone",
    *   //   "type": "my_type",
    *   //   "updated": "my_updated",
    *   //   "webPropertyId": "my_webPropertyId",
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
  def patch(params: ParamsResourceManagementProfilesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceManagementProfilesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaProfile] = js.native
  def update(callback: BodyResponseCallback[SchemaProfile]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProfile] = js.native
  def update(params: ParamsResourceManagementProfilesUpdate): GaxiosPromise[SchemaProfile] = js.native
  def update(params: ParamsResourceManagementProfilesUpdate, callback: BodyResponseCallback[SchemaProfile]): Unit = js.native
  def update(
    params: ParamsResourceManagementProfilesUpdate,
    options: BodyResponseCallback[Readable | SchemaProfile],
    callback: BodyResponseCallback[Readable | SchemaProfile]
  ): Unit = js.native
  def update(params: ParamsResourceManagementProfilesUpdate, options: MethodOptions): GaxiosPromise[SchemaProfile] = js.native
  def update(
    params: ParamsResourceManagementProfilesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProfile]
  ): Unit = js.native
  /**
    * Updates an existing view (profile).
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
    *   const res = await analytics.management.profiles.update({
    *     // Account ID to which the view (profile) belongs
    *     accountId: 'placeholder-value',
    *     // ID of the view (profile) to be updated.
    *     profileId: 'placeholder-value',
    *     // Web property ID to which the view (profile) belongs
    *     webPropertyId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "botFilteringEnabled": false,
    *       //   "childLink": {},
    *       //   "created": "my_created",
    *       //   "currency": "my_currency",
    *       //   "defaultPage": "my_defaultPage",
    *       //   "eCommerceTracking": false,
    *       //   "enhancedECommerceTracking": false,
    *       //   "excludeQueryParameters": "my_excludeQueryParameters",
    *       //   "id": "my_id",
    *       //   "internalWebPropertyId": "my_internalWebPropertyId",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "parentLink": {},
    *       //   "permissions": {},
    *       //   "selfLink": "my_selfLink",
    *       //   "siteSearchCategoryParameters": "my_siteSearchCategoryParameters",
    *       //   "siteSearchQueryParameters": "my_siteSearchQueryParameters",
    *       //   "starred": false,
    *       //   "stripSiteSearchCategoryParameters": false,
    *       //   "stripSiteSearchQueryParameters": false,
    *       //   "timezone": "my_timezone",
    *       //   "type": "my_type",
    *       //   "updated": "my_updated",
    *       //   "webPropertyId": "my_webPropertyId",
    *       //   "websiteUrl": "my_websiteUrl"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "botFilteringEnabled": false,
    *   //   "childLink": {},
    *   //   "created": "my_created",
    *   //   "currency": "my_currency",
    *   //   "defaultPage": "my_defaultPage",
    *   //   "eCommerceTracking": false,
    *   //   "enhancedECommerceTracking": false,
    *   //   "excludeQueryParameters": "my_excludeQueryParameters",
    *   //   "id": "my_id",
    *   //   "internalWebPropertyId": "my_internalWebPropertyId",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "parentLink": {},
    *   //   "permissions": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "siteSearchCategoryParameters": "my_siteSearchCategoryParameters",
    *   //   "siteSearchQueryParameters": "my_siteSearchQueryParameters",
    *   //   "starred": false,
    *   //   "stripSiteSearchCategoryParameters": false,
    *   //   "stripSiteSearchQueryParameters": false,
    *   //   "timezone": "my_timezone",
    *   //   "type": "my_type",
    *   //   "updated": "my_updated",
    *   //   "webPropertyId": "my_webPropertyId",
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
  def update(params: ParamsResourceManagementProfilesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceManagementProfilesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
