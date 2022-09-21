package typings.googleapis.contentV2Mod.contentV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/content/v2", "content_v2.Resource$Accountstatuses")
@js.native
open class ResourceAccountstatuses protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def custombatch(): GaxiosPromise[SchemaAccountstatusesCustomBatchResponse] = js.native
  def custombatch(callback: BodyResponseCallback[SchemaAccountstatusesCustomBatchResponse]): Unit = js.native
  def custombatch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccountstatusesCustomBatchResponse] = js.native
  def custombatch(params: ParamsResourceAccountstatusesCustombatch): GaxiosPromise[SchemaAccountstatusesCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceAccountstatusesCustombatch,
    callback: BodyResponseCallback[SchemaAccountstatusesCustomBatchResponse]
  ): Unit = js.native
  def custombatch(
    params: ParamsResourceAccountstatusesCustombatch,
    options: BodyResponseCallback[Readable | SchemaAccountstatusesCustomBatchResponse],
    callback: BodyResponseCallback[Readable | SchemaAccountstatusesCustomBatchResponse]
  ): Unit = js.native
  def custombatch(params: ParamsResourceAccountstatusesCustombatch, options: MethodOptions): GaxiosPromise[SchemaAccountstatusesCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceAccountstatusesCustombatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountstatusesCustomBatchResponse]
  ): Unit = js.native
  /**
    * Retrieves multiple Merchant Center account statuses in a single request.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.accountstatuses.custombatch({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "entries": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "entries": [],
    *   //   "kind": "my_kind"
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
  def custombatch(params: ParamsResourceAccountstatusesCustombatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def custombatch(
    params: ParamsResourceAccountstatusesCustombatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaAccountStatus] = js.native
  def get(callback: BodyResponseCallback[SchemaAccountStatus]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccountStatus] = js.native
  def get(params: ParamsResourceAccountstatusesGet): GaxiosPromise[SchemaAccountStatus] = js.native
  def get(params: ParamsResourceAccountstatusesGet, callback: BodyResponseCallback[SchemaAccountStatus]): Unit = js.native
  def get(
    params: ParamsResourceAccountstatusesGet,
    options: BodyResponseCallback[Readable | SchemaAccountStatus],
    callback: BodyResponseCallback[Readable | SchemaAccountStatus]
  ): Unit = js.native
  def get(params: ParamsResourceAccountstatusesGet, options: MethodOptions): GaxiosPromise[SchemaAccountStatus] = js.native
  def get(
    params: ParamsResourceAccountstatusesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountStatus]
  ): Unit = js.native
  /**
    * Retrieves the status of a Merchant Center account. No itemLevelIssues are returned for multi-client accounts.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.accountstatuses.get({
    *     // The ID of the account.
    *     accountId: 'placeholder-value',
    *     // If set, only issues for the specified destinations are returned, otherwise only issues for the Shopping destination.
    *     destinations: 'placeholder-value',
    *     // The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and `accountId` must be the ID of a sub-account of this account.
    *     merchantId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "accountLevelIssues": [],
    *   //   "dataQualityIssues": [],
    *   //   "kind": "my_kind",
    *   //   "products": [],
    *   //   "websiteClaimed": false
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
  def get(params: ParamsResourceAccountstatusesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountstatusesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaAccountstatusesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaAccountstatusesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccountstatusesListResponse] = js.native
  def list(params: ParamsResourceAccountstatusesList): GaxiosPromise[SchemaAccountstatusesListResponse] = js.native
  def list(
    params: ParamsResourceAccountstatusesList,
    callback: BodyResponseCallback[SchemaAccountstatusesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountstatusesList,
    options: BodyResponseCallback[Readable | SchemaAccountstatusesListResponse],
    callback: BodyResponseCallback[Readable | SchemaAccountstatusesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountstatusesList, options: MethodOptions): GaxiosPromise[SchemaAccountstatusesListResponse] = js.native
  def list(
    params: ParamsResourceAccountstatusesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountstatusesListResponse]
  ): Unit = js.native
  /**
    * Lists the statuses of the sub-accounts in your Merchant Center account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.accountstatuses.list({
    *     // If set, only issues for the specified destinations are returned, otherwise only issues for the Shopping destination.
    *     destinations: 'placeholder-value',
    *     // The maximum number of account statuses to return in the response, used for paging.
    *     maxResults: 'placeholder-value',
    *     // The ID of the managing account. This must be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // The token returned by the previous request.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "resources": []
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
  def list(params: ParamsResourceAccountstatusesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountstatusesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
