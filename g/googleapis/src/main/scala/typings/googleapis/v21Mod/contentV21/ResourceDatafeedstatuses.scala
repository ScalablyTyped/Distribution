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

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Datafeedstatuses")
@js.native
open class ResourceDatafeedstatuses protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def custombatch(): GaxiosPromise[SchemaDatafeedstatusesCustomBatchResponse] = js.native
  def custombatch(callback: BodyResponseCallback[SchemaDatafeedstatusesCustomBatchResponse]): Unit = js.native
  def custombatch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDatafeedstatusesCustomBatchResponse] = js.native
  def custombatch(params: ParamsResourceDatafeedstatusesCustombatch): GaxiosPromise[SchemaDatafeedstatusesCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceDatafeedstatusesCustombatch,
    callback: BodyResponseCallback[SchemaDatafeedstatusesCustomBatchResponse]
  ): Unit = js.native
  def custombatch(
    params: ParamsResourceDatafeedstatusesCustombatch,
    options: BodyResponseCallback[Readable | SchemaDatafeedstatusesCustomBatchResponse],
    callback: BodyResponseCallback[Readable | SchemaDatafeedstatusesCustomBatchResponse]
  ): Unit = js.native
  def custombatch(params: ParamsResourceDatafeedstatusesCustombatch, options: MethodOptions): GaxiosPromise[SchemaDatafeedstatusesCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceDatafeedstatusesCustombatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDatafeedstatusesCustomBatchResponse]
  ): Unit = js.native
  /**
    * Gets multiple Merchant Center datafeed statuses in a single request.
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
    *   const res = await content.datafeedstatuses.custombatch({
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
  def custombatch(params: ParamsResourceDatafeedstatusesCustombatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def custombatch(
    params: ParamsResourceDatafeedstatusesCustombatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaDatafeedStatus] = js.native
  def get(callback: BodyResponseCallback[SchemaDatafeedStatus]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDatafeedStatus] = js.native
  def get(params: ParamsResourceDatafeedstatusesGet): GaxiosPromise[SchemaDatafeedStatus] = js.native
  def get(params: ParamsResourceDatafeedstatusesGet, callback: BodyResponseCallback[SchemaDatafeedStatus]): Unit = js.native
  def get(
    params: ParamsResourceDatafeedstatusesGet,
    options: BodyResponseCallback[Readable | SchemaDatafeedStatus],
    callback: BodyResponseCallback[Readable | SchemaDatafeedStatus]
  ): Unit = js.native
  def get(params: ParamsResourceDatafeedstatusesGet, options: MethodOptions): GaxiosPromise[SchemaDatafeedStatus] = js.native
  def get(
    params: ParamsResourceDatafeedstatusesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDatafeedStatus]
  ): Unit = js.native
  /**
    * Retrieves the status of a datafeed from your Merchant Center account.
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
    *   const res = await content.datafeedstatuses.get({
    *     // The country for which to get the datafeed status. If this parameter is provided then language must also be provided. Note that this parameter is required for feeds targeting multiple countries and languages, since a feed may have a different status for each target.
    *     country: 'placeholder-value',
    *     // The ID of the datafeed.
    *     datafeedId: 'placeholder-value',
    *     // The language for which to get the datafeed status. If this parameter is provided then country must also be provided. Note that this parameter is required for feeds targeting multiple countries and languages, since a feed may have a different status for each target.
    *     language: 'placeholder-value',
    *     // The ID of the account that manages the datafeed. This account cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "country": "my_country",
    *   //   "datafeedId": "my_datafeedId",
    *   //   "errors": [],
    *   //   "itemsTotal": "my_itemsTotal",
    *   //   "itemsValid": "my_itemsValid",
    *   //   "kind": "my_kind",
    *   //   "language": "my_language",
    *   //   "lastUploadDate": "my_lastUploadDate",
    *   //   "processingStatus": "my_processingStatus",
    *   //   "warnings": []
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
  def get(params: ParamsResourceDatafeedstatusesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceDatafeedstatusesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaDatafeedstatusesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaDatafeedstatusesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDatafeedstatusesListResponse] = js.native
  def list(params: ParamsResourceDatafeedstatusesList): GaxiosPromise[SchemaDatafeedstatusesListResponse] = js.native
  def list(
    params: ParamsResourceDatafeedstatusesList,
    callback: BodyResponseCallback[SchemaDatafeedstatusesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceDatafeedstatusesList,
    options: BodyResponseCallback[Readable | SchemaDatafeedstatusesListResponse],
    callback: BodyResponseCallback[Readable | SchemaDatafeedstatusesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceDatafeedstatusesList, options: MethodOptions): GaxiosPromise[SchemaDatafeedstatusesListResponse] = js.native
  def list(
    params: ParamsResourceDatafeedstatusesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDatafeedstatusesListResponse]
  ): Unit = js.native
  /**
    * Lists the statuses of the datafeeds in your Merchant Center account.
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
    *   const res = await content.datafeedstatuses.list({
    *     // The maximum number of products to return in the response, used for paging.
    *     maxResults: 'placeholder-value',
    *     // The ID of the account that manages the datafeeds. This account cannot be a multi-client account.
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
  def list(params: ParamsResourceDatafeedstatusesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceDatafeedstatusesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
