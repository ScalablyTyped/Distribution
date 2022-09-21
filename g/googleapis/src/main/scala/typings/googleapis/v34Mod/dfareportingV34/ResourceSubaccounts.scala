package typings.googleapis.v34Mod.dfareportingV34

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.4", "dfareporting_v3_4.Resource$Subaccounts")
@js.native
open class ResourceSubaccounts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaSubaccount] = js.native
  def get(callback: BodyResponseCallback[SchemaSubaccount]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSubaccount] = js.native
  def get(params: ParamsResourceSubaccountsGet): GaxiosPromise[SchemaSubaccount] = js.native
  def get(params: ParamsResourceSubaccountsGet, callback: BodyResponseCallback[SchemaSubaccount]): Unit = js.native
  def get(
    params: ParamsResourceSubaccountsGet,
    options: BodyResponseCallback[Readable | SchemaSubaccount],
    callback: BodyResponseCallback[Readable | SchemaSubaccount]
  ): Unit = js.native
  def get(params: ParamsResourceSubaccountsGet, options: MethodOptions): GaxiosPromise[SchemaSubaccount] = js.native
  def get(
    params: ParamsResourceSubaccountsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubaccount]
  ): Unit = js.native
  /**
    * Gets one subaccount by ID.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v3.4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.subaccounts.get({
    *     // Subaccount ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "availablePermissionIds": [],
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name"
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
  def get(params: ParamsResourceSubaccountsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceSubaccountsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaSubaccount] = js.native
  def insert(callback: BodyResponseCallback[SchemaSubaccount]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSubaccount] = js.native
  def insert(params: ParamsResourceSubaccountsInsert): GaxiosPromise[SchemaSubaccount] = js.native
  def insert(params: ParamsResourceSubaccountsInsert, callback: BodyResponseCallback[SchemaSubaccount]): Unit = js.native
  def insert(
    params: ParamsResourceSubaccountsInsert,
    options: BodyResponseCallback[Readable | SchemaSubaccount],
    callback: BodyResponseCallback[Readable | SchemaSubaccount]
  ): Unit = js.native
  def insert(params: ParamsResourceSubaccountsInsert, options: MethodOptions): GaxiosPromise[SchemaSubaccount] = js.native
  def insert(
    params: ParamsResourceSubaccountsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubaccount]
  ): Unit = js.native
  /**
    * Inserts a new subaccount.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v3.4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.subaccounts.insert({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "availablePermissionIds": [],
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "availablePermissionIds": [],
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name"
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
  def insert(params: ParamsResourceSubaccountsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceSubaccountsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaSubaccountsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaSubaccountsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSubaccountsListResponse] = js.native
  def list(params: ParamsResourceSubaccountsList): GaxiosPromise[SchemaSubaccountsListResponse] = js.native
  def list(
    params: ParamsResourceSubaccountsList,
    callback: BodyResponseCallback[SchemaSubaccountsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceSubaccountsList,
    options: BodyResponseCallback[Readable | SchemaSubaccountsListResponse],
    callback: BodyResponseCallback[Readable | SchemaSubaccountsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceSubaccountsList, options: MethodOptions): GaxiosPromise[SchemaSubaccountsListResponse] = js.native
  def list(
    params: ParamsResourceSubaccountsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubaccountsListResponse]
  ): Unit = js.native
  /**
    * Gets a list of subaccounts, possibly filtered. This method supports paging.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v3.4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.subaccounts.list({
    *     // Select only subaccounts with these IDs.
    *     ids: 'placeholder-value',
    *     // Maximum number of results to return.
    *     maxResults: 'placeholder-value',
    *     // Value of the nextPageToken from the previous result page.
    *     pageToken: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *     // Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "subaccount*2015" will return objects with names like "subaccount June 2015", "subaccount April 2015", or simply "subaccount 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "subaccount" will match objects with name "my subaccount", "subaccount 2015", or simply "subaccount" .
    *     searchString: 'placeholder-value',
    *     // Field by which to sort the list.
    *     sortField: 'placeholder-value',
    *     // Order of sorted results.
    *     sortOrder: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "subaccounts": []
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
  def list(params: ParamsResourceSubaccountsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceSubaccountsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaSubaccount] = js.native
  def patch(callback: BodyResponseCallback[SchemaSubaccount]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSubaccount] = js.native
  def patch(params: ParamsResourceSubaccountsPatch): GaxiosPromise[SchemaSubaccount] = js.native
  def patch(params: ParamsResourceSubaccountsPatch, callback: BodyResponseCallback[SchemaSubaccount]): Unit = js.native
  def patch(
    params: ParamsResourceSubaccountsPatch,
    options: BodyResponseCallback[Readable | SchemaSubaccount],
    callback: BodyResponseCallback[Readable | SchemaSubaccount]
  ): Unit = js.native
  def patch(params: ParamsResourceSubaccountsPatch, options: MethodOptions): GaxiosPromise[SchemaSubaccount] = js.native
  def patch(
    params: ParamsResourceSubaccountsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubaccount]
  ): Unit = js.native
  /**
    * Updates an existing subaccount. This method supports patch semantics.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v3.4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.subaccounts.patch({
    *     // Subaccount ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "availablePermissionIds": [],
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "availablePermissionIds": [],
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name"
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
  def patch(params: ParamsResourceSubaccountsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceSubaccountsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaSubaccount] = js.native
  def update(callback: BodyResponseCallback[SchemaSubaccount]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSubaccount] = js.native
  def update(params: ParamsResourceSubaccountsUpdate): GaxiosPromise[SchemaSubaccount] = js.native
  def update(params: ParamsResourceSubaccountsUpdate, callback: BodyResponseCallback[SchemaSubaccount]): Unit = js.native
  def update(
    params: ParamsResourceSubaccountsUpdate,
    options: BodyResponseCallback[Readable | SchemaSubaccount],
    callback: BodyResponseCallback[Readable | SchemaSubaccount]
  ): Unit = js.native
  def update(params: ParamsResourceSubaccountsUpdate, options: MethodOptions): GaxiosPromise[SchemaSubaccount] = js.native
  def update(
    params: ParamsResourceSubaccountsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubaccount]
  ): Unit = js.native
  /**
    * Updates an existing subaccount.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v3.4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.subaccounts.update({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "availablePermissionIds": [],
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "availablePermissionIds": [],
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name"
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
  def update(params: ParamsResourceSubaccountsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceSubaccountsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
