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

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Accountuserlinks")
@js.native
open class ResourceManagementAccountuserlinks protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagementAccountuserlinksDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagementAccountuserlinksDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceManagementAccountuserlinksDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceManagementAccountuserlinksDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceManagementAccountuserlinksDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Removes a user from the given account.
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
    *   const res = await analytics.management.accountUserLinks.delete({
    *     // Account ID to delete the user link for.
    *     accountId: 'placeholder-value',
    *     // Link ID to delete the user link for.
    *     linkId: 'placeholder-value',
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
  def delete(params: ParamsResourceManagementAccountuserlinksDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceManagementAccountuserlinksDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaEntityUserLink] = js.native
  def insert(callback: BodyResponseCallback[SchemaEntityUserLink]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEntityUserLink] = js.native
  def insert(params: ParamsResourceManagementAccountuserlinksInsert): GaxiosPromise[SchemaEntityUserLink] = js.native
  def insert(
    params: ParamsResourceManagementAccountuserlinksInsert,
    callback: BodyResponseCallback[SchemaEntityUserLink]
  ): Unit = js.native
  def insert(
    params: ParamsResourceManagementAccountuserlinksInsert,
    options: BodyResponseCallback[Readable | SchemaEntityUserLink],
    callback: BodyResponseCallback[Readable | SchemaEntityUserLink]
  ): Unit = js.native
  def insert(params: ParamsResourceManagementAccountuserlinksInsert, options: MethodOptions): GaxiosPromise[SchemaEntityUserLink] = js.native
  def insert(
    params: ParamsResourceManagementAccountuserlinksInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEntityUserLink]
  ): Unit = js.native
  /**
    * Adds a new user to the given account.
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
    *   const res = await analytics.management.accountUserLinks.insert({
    *     // Account ID to create the user link for.
    *     accountId: 'placeholder-value',
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
  def insert(params: ParamsResourceManagementAccountuserlinksInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceManagementAccountuserlinksInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaEntityUserLinks] = js.native
  def list(callback: BodyResponseCallback[SchemaEntityUserLinks]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEntityUserLinks] = js.native
  def list(params: ParamsResourceManagementAccountuserlinksList): GaxiosPromise[SchemaEntityUserLinks] = js.native
  def list(
    params: ParamsResourceManagementAccountuserlinksList,
    callback: BodyResponseCallback[SchemaEntityUserLinks]
  ): Unit = js.native
  def list(
    params: ParamsResourceManagementAccountuserlinksList,
    options: BodyResponseCallback[Readable | SchemaEntityUserLinks],
    callback: BodyResponseCallback[Readable | SchemaEntityUserLinks]
  ): Unit = js.native
  def list(params: ParamsResourceManagementAccountuserlinksList, options: MethodOptions): GaxiosPromise[SchemaEntityUserLinks] = js.native
  def list(
    params: ParamsResourceManagementAccountuserlinksList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEntityUserLinks]
  ): Unit = js.native
  /**
    * Lists account-user links for a given account.
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
    *   const res = await analytics.management.accountUserLinks.list({
    *     // Account ID to retrieve the user links for.
    *     accountId: 'placeholder-value',
    *     // The maximum number of account-user links to include in this response.
    *     'max-results': 'placeholder-value',
    *     // An index of the first account-user link to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
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
  def list(params: ParamsResourceManagementAccountuserlinksList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceManagementAccountuserlinksList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaEntityUserLink] = js.native
  def update(callback: BodyResponseCallback[SchemaEntityUserLink]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEntityUserLink] = js.native
  def update(params: ParamsResourceManagementAccountuserlinksUpdate): GaxiosPromise[SchemaEntityUserLink] = js.native
  def update(
    params: ParamsResourceManagementAccountuserlinksUpdate,
    callback: BodyResponseCallback[SchemaEntityUserLink]
  ): Unit = js.native
  def update(
    params: ParamsResourceManagementAccountuserlinksUpdate,
    options: BodyResponseCallback[Readable | SchemaEntityUserLink],
    callback: BodyResponseCallback[Readable | SchemaEntityUserLink]
  ): Unit = js.native
  def update(params: ParamsResourceManagementAccountuserlinksUpdate, options: MethodOptions): GaxiosPromise[SchemaEntityUserLink] = js.native
  def update(
    params: ParamsResourceManagementAccountuserlinksUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEntityUserLink]
  ): Unit = js.native
  /**
    * Updates permissions for an existing user on the given account.
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
    *   const res = await analytics.management.accountUserLinks.update({
    *     // Account ID to update the account-user link for.
    *     accountId: 'placeholder-value',
    *     // Link ID to update the account-user link for.
    *     linkId: 'placeholder-value',
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
  def update(params: ParamsResourceManagementAccountuserlinksUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceManagementAccountuserlinksUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
