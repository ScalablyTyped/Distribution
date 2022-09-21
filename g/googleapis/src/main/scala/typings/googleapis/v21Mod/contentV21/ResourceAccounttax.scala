package typings.googleapis.v21Mod.contentV21

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Accounttax")
@js.native
open class ResourceAccounttax protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def custombatch(): GaxiosPromise[SchemaAccounttaxCustomBatchResponse] = js.native
  def custombatch(callback: BodyResponseCallback[SchemaAccounttaxCustomBatchResponse]): Unit = js.native
  def custombatch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccounttaxCustomBatchResponse] = js.native
  def custombatch(params: ParamsResourceAccounttaxCustombatch): GaxiosPromise[SchemaAccounttaxCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceAccounttaxCustombatch,
    callback: BodyResponseCallback[SchemaAccounttaxCustomBatchResponse]
  ): Unit = js.native
  def custombatch(
    params: ParamsResourceAccounttaxCustombatch,
    options: BodyResponseCallback[Readable | SchemaAccounttaxCustomBatchResponse],
    callback: BodyResponseCallback[Readable | SchemaAccounttaxCustomBatchResponse]
  ): Unit = js.native
  def custombatch(params: ParamsResourceAccounttaxCustombatch, options: MethodOptions): GaxiosPromise[SchemaAccounttaxCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceAccounttaxCustombatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccounttaxCustomBatchResponse]
  ): Unit = js.native
  /**
    * Retrieves and updates tax settings of multiple accounts in a single request.
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
    * const content = google.content('v2.1');
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
    *   const res = await content.accounttax.custombatch({
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
  def custombatch(params: ParamsResourceAccounttaxCustombatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def custombatch(
    params: ParamsResourceAccounttaxCustombatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaAccountTax] = js.native
  def get(callback: BodyResponseCallback[SchemaAccountTax]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccountTax] = js.native
  def get(params: ParamsResourceAccounttaxGet): GaxiosPromise[SchemaAccountTax] = js.native
  def get(params: ParamsResourceAccounttaxGet, callback: BodyResponseCallback[SchemaAccountTax]): Unit = js.native
  def get(
    params: ParamsResourceAccounttaxGet,
    options: BodyResponseCallback[Readable | SchemaAccountTax],
    callback: BodyResponseCallback[Readable | SchemaAccountTax]
  ): Unit = js.native
  def get(params: ParamsResourceAccounttaxGet, options: MethodOptions): GaxiosPromise[SchemaAccountTax] = js.native
  def get(
    params: ParamsResourceAccounttaxGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountTax]
  ): Unit = js.native
  /**
    * Retrieves the tax settings of the account.
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
    * const content = google.content('v2.1');
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
    *   const res = await content.accounttax.get({
    *     // The ID of the account for which to get/update account tax settings.
    *     accountId: 'placeholder-value',
    *     // The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and `accountId` must be the ID of a sub-account of this account.
    *     merchantId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "kind": "my_kind",
    *   //   "rules": []
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
  def get(params: ParamsResourceAccounttaxGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccounttaxGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaAccounttaxListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaAccounttaxListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccounttaxListResponse] = js.native
  def list(params: ParamsResourceAccounttaxList): GaxiosPromise[SchemaAccounttaxListResponse] = js.native
  def list(params: ParamsResourceAccounttaxList, callback: BodyResponseCallback[SchemaAccounttaxListResponse]): Unit = js.native
  def list(
    params: ParamsResourceAccounttaxList,
    options: BodyResponseCallback[Readable | SchemaAccounttaxListResponse],
    callback: BodyResponseCallback[Readable | SchemaAccounttaxListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccounttaxList, options: MethodOptions): GaxiosPromise[SchemaAccounttaxListResponse] = js.native
  def list(
    params: ParamsResourceAccounttaxList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccounttaxListResponse]
  ): Unit = js.native
  /**
    * Lists the tax settings of the sub-accounts in your Merchant Center account.
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
    * const content = google.content('v2.1');
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
    *   const res = await content.accounttax.list({
    *     // The maximum number of tax settings to return in the response, used for paging.
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
  def list(params: ParamsResourceAccounttaxList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccounttaxList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaAccountTax] = js.native
  def update(callback: BodyResponseCallback[SchemaAccountTax]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccountTax] = js.native
  def update(params: ParamsResourceAccounttaxUpdate): GaxiosPromise[SchemaAccountTax] = js.native
  def update(params: ParamsResourceAccounttaxUpdate, callback: BodyResponseCallback[SchemaAccountTax]): Unit = js.native
  def update(
    params: ParamsResourceAccounttaxUpdate,
    options: BodyResponseCallback[Readable | SchemaAccountTax],
    callback: BodyResponseCallback[Readable | SchemaAccountTax]
  ): Unit = js.native
  def update(params: ParamsResourceAccounttaxUpdate, options: MethodOptions): GaxiosPromise[SchemaAccountTax] = js.native
  def update(
    params: ParamsResourceAccounttaxUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountTax]
  ): Unit = js.native
  /**
    * Updates the tax settings of the account. Any fields that are not provided are deleted from the resource.
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
    * const content = google.content('v2.1');
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
    *   const res = await content.accounttax.update({
    *     // The ID of the account for which to get/update account tax settings.
    *     accountId: 'placeholder-value',
    *     // The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and `accountId` must be the ID of a sub-account of this account.
    *     merchantId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "kind": "my_kind",
    *       //   "rules": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "kind": "my_kind",
    *   //   "rules": []
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
  def update(params: ParamsResourceAccounttaxUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceAccounttaxUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
