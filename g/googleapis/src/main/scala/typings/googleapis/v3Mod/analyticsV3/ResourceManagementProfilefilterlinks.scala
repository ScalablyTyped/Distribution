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

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Profilefilterlinks")
@js.native
open class ResourceManagementProfilefilterlinks protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagementProfilefilterlinksDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagementProfilefilterlinksDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceManagementProfilefilterlinksDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceManagementProfilefilterlinksDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceManagementProfilefilterlinksDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Delete a profile filter link.
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
    *   const res = await analytics.management.profileFilterLinks.delete({
    *     // Account ID to which the profile filter link belongs.
    *     accountId: 'd+',
    *     // ID of the profile filter link to delete.
    *     linkId: 'd+:d+',
    *     // Profile ID to which the filter link belongs.
    *     profileId: 'd+',
    *     // Web property Id to which the profile filter link belongs.
    *     webPropertyId: 'UA-(d+)-(d+)',
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
  def delete(params: ParamsResourceManagementProfilefilterlinksDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceManagementProfilefilterlinksDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaProfileFilterLink] = js.native
  def get(callback: BodyResponseCallback[SchemaProfileFilterLink]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProfileFilterLink] = js.native
  def get(params: ParamsResourceManagementProfilefilterlinksGet): GaxiosPromise[SchemaProfileFilterLink] = js.native
  def get(
    params: ParamsResourceManagementProfilefilterlinksGet,
    callback: BodyResponseCallback[SchemaProfileFilterLink]
  ): Unit = js.native
  def get(
    params: ParamsResourceManagementProfilefilterlinksGet,
    options: BodyResponseCallback[Readable | SchemaProfileFilterLink],
    callback: BodyResponseCallback[Readable | SchemaProfileFilterLink]
  ): Unit = js.native
  def get(params: ParamsResourceManagementProfilefilterlinksGet, options: MethodOptions): GaxiosPromise[SchemaProfileFilterLink] = js.native
  def get(
    params: ParamsResourceManagementProfilefilterlinksGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProfileFilterLink]
  ): Unit = js.native
  /**
    * Returns a single profile filter link.
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
    *   const res = await analytics.management.profileFilterLinks.get({
    *     // Account ID to retrieve profile filter link for.
    *     accountId: 'd+',
    *     // ID of the profile filter link.
    *     linkId: 'd+:d+',
    *     // Profile ID to retrieve filter link for.
    *     profileId: 'd+',
    *     // Web property Id to retrieve profile filter link for.
    *     webPropertyId: 'UA-(d+)-(d+)',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "filterRef": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "profileRef": {},
    *   //   "rank": 0,
    *   //   "selfLink": "my_selfLink"
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
  def get(params: ParamsResourceManagementProfilefilterlinksGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceManagementProfilefilterlinksGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaProfileFilterLink] = js.native
  def insert(callback: BodyResponseCallback[SchemaProfileFilterLink]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProfileFilterLink] = js.native
  def insert(params: ParamsResourceManagementProfilefilterlinksInsert): GaxiosPromise[SchemaProfileFilterLink] = js.native
  def insert(
    params: ParamsResourceManagementProfilefilterlinksInsert,
    callback: BodyResponseCallback[SchemaProfileFilterLink]
  ): Unit = js.native
  def insert(
    params: ParamsResourceManagementProfilefilterlinksInsert,
    options: BodyResponseCallback[Readable | SchemaProfileFilterLink],
    callback: BodyResponseCallback[Readable | SchemaProfileFilterLink]
  ): Unit = js.native
  def insert(params: ParamsResourceManagementProfilefilterlinksInsert, options: MethodOptions): GaxiosPromise[SchemaProfileFilterLink] = js.native
  def insert(
    params: ParamsResourceManagementProfilefilterlinksInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProfileFilterLink]
  ): Unit = js.native
  /**
    * Create a new profile filter link.
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
    *   const res = await analytics.management.profileFilterLinks.insert({
    *     // Account ID to create profile filter link for.
    *     accountId: 'd+',
    *     // Profile ID to create filter link for.
    *     profileId: 'd+',
    *     // Web property Id to create profile filter link for.
    *     webPropertyId: 'UA-(d+)-(d+)',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "filterRef": {},
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "profileRef": {},
    *       //   "rank": 0,
    *       //   "selfLink": "my_selfLink"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "filterRef": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "profileRef": {},
    *   //   "rank": 0,
    *   //   "selfLink": "my_selfLink"
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
  def insert(params: ParamsResourceManagementProfilefilterlinksInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceManagementProfilefilterlinksInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaProfileFilterLinks] = js.native
  def list(callback: BodyResponseCallback[SchemaProfileFilterLinks]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProfileFilterLinks] = js.native
  def list(params: ParamsResourceManagementProfilefilterlinksList): GaxiosPromise[SchemaProfileFilterLinks] = js.native
  def list(
    params: ParamsResourceManagementProfilefilterlinksList,
    callback: BodyResponseCallback[SchemaProfileFilterLinks]
  ): Unit = js.native
  def list(
    params: ParamsResourceManagementProfilefilterlinksList,
    options: BodyResponseCallback[Readable | SchemaProfileFilterLinks],
    callback: BodyResponseCallback[Readable | SchemaProfileFilterLinks]
  ): Unit = js.native
  def list(params: ParamsResourceManagementProfilefilterlinksList, options: MethodOptions): GaxiosPromise[SchemaProfileFilterLinks] = js.native
  def list(
    params: ParamsResourceManagementProfilefilterlinksList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProfileFilterLinks]
  ): Unit = js.native
  /**
    * Lists all profile filter links for a profile.
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
    *   const res = await analytics.management.profileFilterLinks.list({
    *     // Account ID to retrieve profile filter links for.
    *     accountId: 'd+',
    *     // The maximum number of profile filter links to include in this response.
    *     'max-results': 'placeholder-value',
    *     // Profile ID to retrieve filter links for. Can either be a specific profile ID or '~all', which refers to all the profiles that user has access to.
    *     profileId: 'placeholder-value',
    *     // An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    *     'start-index': 'placeholder-value',
    *     // Web property Id for profile filter links for. Can either be a specific web property ID or '~all', which refers to all the web properties that user has access to.
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
  def list(params: ParamsResourceManagementProfilefilterlinksList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceManagementProfilefilterlinksList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaProfileFilterLink] = js.native
  def patch(callback: BodyResponseCallback[SchemaProfileFilterLink]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProfileFilterLink] = js.native
  def patch(params: ParamsResourceManagementProfilefilterlinksPatch): GaxiosPromise[SchemaProfileFilterLink] = js.native
  def patch(
    params: ParamsResourceManagementProfilefilterlinksPatch,
    callback: BodyResponseCallback[SchemaProfileFilterLink]
  ): Unit = js.native
  def patch(
    params: ParamsResourceManagementProfilefilterlinksPatch,
    options: BodyResponseCallback[Readable | SchemaProfileFilterLink],
    callback: BodyResponseCallback[Readable | SchemaProfileFilterLink]
  ): Unit = js.native
  def patch(params: ParamsResourceManagementProfilefilterlinksPatch, options: MethodOptions): GaxiosPromise[SchemaProfileFilterLink] = js.native
  def patch(
    params: ParamsResourceManagementProfilefilterlinksPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProfileFilterLink]
  ): Unit = js.native
  /**
    * Update an existing profile filter link. This method supports patch semantics.
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
    *   const res = await analytics.management.profileFilterLinks.patch({
    *     // Account ID to which profile filter link belongs.
    *     accountId: 'd+',
    *     // ID of the profile filter link to be updated.
    *     linkId: 'd+:d+',
    *     // Profile ID to which filter link belongs
    *     profileId: 'd+',
    *     // Web property Id to which profile filter link belongs
    *     webPropertyId: 'UA-(d+)-(d+)',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "filterRef": {},
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "profileRef": {},
    *       //   "rank": 0,
    *       //   "selfLink": "my_selfLink"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "filterRef": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "profileRef": {},
    *   //   "rank": 0,
    *   //   "selfLink": "my_selfLink"
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
  def patch(params: ParamsResourceManagementProfilefilterlinksPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceManagementProfilefilterlinksPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaProfileFilterLink] = js.native
  def update(callback: BodyResponseCallback[SchemaProfileFilterLink]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProfileFilterLink] = js.native
  def update(params: ParamsResourceManagementProfilefilterlinksUpdate): GaxiosPromise[SchemaProfileFilterLink] = js.native
  def update(
    params: ParamsResourceManagementProfilefilterlinksUpdate,
    callback: BodyResponseCallback[SchemaProfileFilterLink]
  ): Unit = js.native
  def update(
    params: ParamsResourceManagementProfilefilterlinksUpdate,
    options: BodyResponseCallback[Readable | SchemaProfileFilterLink],
    callback: BodyResponseCallback[Readable | SchemaProfileFilterLink]
  ): Unit = js.native
  def update(params: ParamsResourceManagementProfilefilterlinksUpdate, options: MethodOptions): GaxiosPromise[SchemaProfileFilterLink] = js.native
  def update(
    params: ParamsResourceManagementProfilefilterlinksUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProfileFilterLink]
  ): Unit = js.native
  /**
    * Update an existing profile filter link.
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
    *   const res = await analytics.management.profileFilterLinks.update({
    *     // Account ID to which profile filter link belongs.
    *     accountId: 'd+',
    *     // ID of the profile filter link to be updated.
    *     linkId: 'd+:d+',
    *     // Profile ID to which filter link belongs
    *     profileId: 'd+',
    *     // Web property Id to which profile filter link belongs
    *     webPropertyId: 'UA-(d+)-(d+)',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "filterRef": {},
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "profileRef": {},
    *       //   "rank": 0,
    *       //   "selfLink": "my_selfLink"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "filterRef": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "profileRef": {},
    *   //   "rank": 0,
    *   //   "selfLink": "my_selfLink"
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
  def update(params: ParamsResourceManagementProfilefilterlinksUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceManagementProfilefilterlinksUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
