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

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Productstatuses")
@js.native
open class ResourceProductstatuses protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def custombatch(): GaxiosPromise[SchemaProductstatusesCustomBatchResponse] = js.native
  def custombatch(callback: BodyResponseCallback[SchemaProductstatusesCustomBatchResponse]): Unit = js.native
  def custombatch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProductstatusesCustomBatchResponse] = js.native
  def custombatch(params: ParamsResourceProductstatusesCustombatch): GaxiosPromise[SchemaProductstatusesCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceProductstatusesCustombatch,
    callback: BodyResponseCallback[SchemaProductstatusesCustomBatchResponse]
  ): Unit = js.native
  def custombatch(
    params: ParamsResourceProductstatusesCustombatch,
    options: BodyResponseCallback[Readable | SchemaProductstatusesCustomBatchResponse],
    callback: BodyResponseCallback[Readable | SchemaProductstatusesCustomBatchResponse]
  ): Unit = js.native
  def custombatch(params: ParamsResourceProductstatusesCustombatch, options: MethodOptions): GaxiosPromise[SchemaProductstatusesCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceProductstatusesCustombatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProductstatusesCustomBatchResponse]
  ): Unit = js.native
  /**
    * Gets the statuses of multiple products in a single request.
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
    *   const res = await content.productstatuses.custombatch({
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
  def custombatch(params: ParamsResourceProductstatusesCustombatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def custombatch(
    params: ParamsResourceProductstatusesCustombatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaProductStatus] = js.native
  def get(callback: BodyResponseCallback[SchemaProductStatus]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProductStatus] = js.native
  def get(params: ParamsResourceProductstatusesGet): GaxiosPromise[SchemaProductStatus] = js.native
  def get(params: ParamsResourceProductstatusesGet, callback: BodyResponseCallback[SchemaProductStatus]): Unit = js.native
  def get(
    params: ParamsResourceProductstatusesGet,
    options: BodyResponseCallback[Readable | SchemaProductStatus],
    callback: BodyResponseCallback[Readable | SchemaProductStatus]
  ): Unit = js.native
  def get(params: ParamsResourceProductstatusesGet, options: MethodOptions): GaxiosPromise[SchemaProductStatus] = js.native
  def get(
    params: ParamsResourceProductstatusesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProductStatus]
  ): Unit = js.native
  /**
    * Gets the status of a product from your Merchant Center account.
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
    *   const res = await content.productstatuses.get({
    *     // If set, only issues for the specified destinations are returned, otherwise only issues for the Shopping destination.
    *     destinations: 'placeholder-value',
    *     // The ID of the account that contains the product. This account cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // The REST ID of the product.
    *     productId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "creationDate": "my_creationDate",
    *   //   "destinationStatuses": [],
    *   //   "googleExpirationDate": "my_googleExpirationDate",
    *   //   "itemLevelIssues": [],
    *   //   "kind": "my_kind",
    *   //   "lastUpdateDate": "my_lastUpdateDate",
    *   //   "link": "my_link",
    *   //   "productId": "my_productId",
    *   //   "title": "my_title"
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
  def get(params: ParamsResourceProductstatusesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProductstatusesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaProductstatusesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaProductstatusesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProductstatusesListResponse] = js.native
  def list(params: ParamsResourceProductstatusesList): GaxiosPromise[SchemaProductstatusesListResponse] = js.native
  def list(
    params: ParamsResourceProductstatusesList,
    callback: BodyResponseCallback[SchemaProductstatusesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProductstatusesList,
    options: BodyResponseCallback[Readable | SchemaProductstatusesListResponse],
    callback: BodyResponseCallback[Readable | SchemaProductstatusesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProductstatusesList, options: MethodOptions): GaxiosPromise[SchemaProductstatusesListResponse] = js.native
  def list(
    params: ParamsResourceProductstatusesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProductstatusesListResponse]
  ): Unit = js.native
  /**
    * Lists the statuses of the products in your Merchant Center account.
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
    *   const res = await content.productstatuses.list({
    *     // If set, only issues for the specified destinations are returned, otherwise only issues for the Shopping destination.
    *     destinations: 'placeholder-value',
    *     // The maximum number of product statuses to return in the response, used for paging.
    *     maxResults: 'placeholder-value',
    *     // The ID of the account that contains the products. This account cannot be a multi-client account.
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
  def list(params: ParamsResourceProductstatusesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProductstatusesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var repricingreports: ResourceProductstatusesRepricingreports = js.native
}
