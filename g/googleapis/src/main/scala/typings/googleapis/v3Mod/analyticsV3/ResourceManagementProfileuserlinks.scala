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

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Profileuserlinks")
@js.native
open class ResourceManagementProfileuserlinks protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagementProfileuserlinksDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagementProfileuserlinksDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceManagementProfileuserlinksDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceManagementProfileuserlinksDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceManagementProfileuserlinksDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Removes a user from the given view (profile).
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
    *     scopes: ['https://www.googleapis.com/auth/analytics.manage.users'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analytics.management.profileUserLinks.delete({
    *     // Account ID to delete the user link for.
    *     accountId: 'placeholder-value',
    *     // Link ID to delete the user link for.
    *     linkId: 'placeholder-value',
    *     // View (Profile) ID to delete the user link for.
    *     profileId: 'placeholder-value',
    *     // Web Property ID to delete the user link for.
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
  def delete(params: ParamsResourceManagementProfileuserlinksDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceManagementProfileuserlinksDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaEntityUserLink] = js.native
  def insert(callback: BodyResponseCallback[SchemaEntityUserLink]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEntityUserLink] = js.native
  def insert(params: ParamsResourceManagementProfileuserlinksInsert): GaxiosPromise[SchemaEntityUserLink] = js.native
  def insert(
    params: ParamsResourceManagementProfileuserlinksInsert,
    callback: BodyResponseCallback[SchemaEntityUserLink]
  ): Unit = js.native
  def insert(
    params: ParamsResourceManagementProfileuserlinksInsert,
    options: BodyResponseCallback[Readable | SchemaEntityUserLink],
    callback: BodyResponseCallback[Readable | SchemaEntityUserLink]
  ): Unit = js.native
  def insert(params: ParamsResourceManagementProfileuserlinksInsert, options: MethodOptions): GaxiosPromise[SchemaEntityUserLink] = js.native
  def insert(
    params: ParamsResourceManagementProfileuserlinksInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEntityUserLink]
  ): Unit = js.native
  /**
    * Adds a new user to the given view (profile).
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
    *     scopes: ['https://www.googleapis.com/auth/analytics.manage.users'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analytics.management.profileUserLinks.insert({
    *     // Account ID to create the user link for.
    *     accountId: 'placeholder-value',
    *     // View (Profile) ID to create the user link for.
    *     profileId: 'placeholder-value',
    *     // Web Property ID to create the user link for.
    *     webPropertyId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "entity": {},
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "permissions": {},
    *       //   "selfLink": "my_selfLink",
    *       //   "userRef": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "entity": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "permissions": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "userRef": {}
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
  def insert(params: ParamsResourceManagementProfileuserlinksInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceManagementProfileuserlinksInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaEntityUserLinks] = js.native
  def list(callback: BodyResponseCallback[SchemaEntityUserLinks]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEntityUserLinks] = js.native
  def list(params: ParamsResourceManagementProfileuserlinksList): GaxiosPromise[SchemaEntityUserLinks] = js.native
  def list(
    params: ParamsResourceManagementProfileuserlinksList,
    callback: BodyResponseCallback[SchemaEntityUserLinks]
  ): Unit = js.native
  def list(
    params: ParamsResourceManagementProfileuserlinksList,
    options: BodyResponseCallback[Readable | SchemaEntityUserLinks],
    callback: BodyResponseCallback[Readable | SchemaEntityUserLinks]
  ): Unit = js.native
  def list(params: ParamsResourceManagementProfileuserlinksList, options: MethodOptions): GaxiosPromise[SchemaEntityUserLinks] = js.native
  def list(
    params: ParamsResourceManagementProfileuserlinksList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEntityUserLinks]
  ): Unit = js.native
  /**
    * Lists profile-user links for a given view (profile).
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
    *       'https://www.googleapis.com/auth/analytics.manage.users',
    *       'https://www.googleapis.com/auth/analytics.manage.users.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analytics.management.profileUserLinks.list({
    *     // Account ID which the given view (profile) belongs to.
    *     accountId: 'placeholder-value',
    *     // The maximum number of profile-user links to include in this response.
    *     'max-results': 'placeholder-value',
    *     // View (Profile) ID to retrieve the profile-user links for. Can either be a specific profile ID or '~all', which refers to all the profiles that user has access to.
    *     profileId: 'placeholder-value',
    *     // An index of the first profile-user link to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    *     'start-index': 'placeholder-value',
    *     // Web Property ID which the given view (profile) belongs to. Can either be a specific web property ID or '~all', which refers to all the web properties that user has access to.
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
    *   //   "totalResults": 0
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
  def list(params: ParamsResourceManagementProfileuserlinksList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceManagementProfileuserlinksList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaEntityUserLink] = js.native
  def update(callback: BodyResponseCallback[SchemaEntityUserLink]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEntityUserLink] = js.native
  def update(params: ParamsResourceManagementProfileuserlinksUpdate): GaxiosPromise[SchemaEntityUserLink] = js.native
  def update(
    params: ParamsResourceManagementProfileuserlinksUpdate,
    callback: BodyResponseCallback[SchemaEntityUserLink]
  ): Unit = js.native
  def update(
    params: ParamsResourceManagementProfileuserlinksUpdate,
    options: BodyResponseCallback[Readable | SchemaEntityUserLink],
    callback: BodyResponseCallback[Readable | SchemaEntityUserLink]
  ): Unit = js.native
  def update(params: ParamsResourceManagementProfileuserlinksUpdate, options: MethodOptions): GaxiosPromise[SchemaEntityUserLink] = js.native
  def update(
    params: ParamsResourceManagementProfileuserlinksUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEntityUserLink]
  ): Unit = js.native
  /**
    * Updates permissions for an existing user on the given view (profile).
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
    *     scopes: ['https://www.googleapis.com/auth/analytics.manage.users'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analytics.management.profileUserLinks.update({
    *     // Account ID to update the user link for.
    *     accountId: 'placeholder-value',
    *     // Link ID to update the user link for.
    *     linkId: 'placeholder-value',
    *     // View (Profile ID) to update the user link for.
    *     profileId: 'placeholder-value',
    *     // Web Property ID to update the user link for.
    *     webPropertyId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "entity": {},
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "permissions": {},
    *       //   "selfLink": "my_selfLink",
    *       //   "userRef": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "entity": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "permissions": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "userRef": {}
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
  def update(params: ParamsResourceManagementProfileuserlinksUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceManagementProfileuserlinksUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
