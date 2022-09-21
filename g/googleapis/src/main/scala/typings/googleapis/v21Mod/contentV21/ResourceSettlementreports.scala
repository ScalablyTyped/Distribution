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

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Settlementreports")
@js.native
open class ResourceSettlementreports protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaSettlementReport] = js.native
  def get(callback: BodyResponseCallback[SchemaSettlementReport]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSettlementReport] = js.native
  def get(params: ParamsResourceSettlementreportsGet): GaxiosPromise[SchemaSettlementReport] = js.native
  def get(params: ParamsResourceSettlementreportsGet, callback: BodyResponseCallback[SchemaSettlementReport]): Unit = js.native
  def get(
    params: ParamsResourceSettlementreportsGet,
    options: BodyResponseCallback[Readable | SchemaSettlementReport],
    callback: BodyResponseCallback[Readable | SchemaSettlementReport]
  ): Unit = js.native
  def get(params: ParamsResourceSettlementreportsGet, options: MethodOptions): GaxiosPromise[SchemaSettlementReport] = js.native
  def get(
    params: ParamsResourceSettlementreportsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSettlementReport]
  ): Unit = js.native
  /**
    * Retrieves a settlement report from your Merchant Center account.
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
    *   const res = await content.settlementreports.get({
    *     // The Merchant Center account of the settlement report.
    *     merchantId: 'placeholder-value',
    *     // The Google-provided ID of the settlement.
    *     settlementId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "endDate": "my_endDate",
    *   //   "kind": "my_kind",
    *   //   "previousBalance": {},
    *   //   "settlementId": "my_settlementId",
    *   //   "startDate": "my_startDate",
    *   //   "transferAmount": {},
    *   //   "transferDate": "my_transferDate",
    *   //   "transferIds": []
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
  def get(params: ParamsResourceSettlementreportsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceSettlementreportsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaSettlementreportsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaSettlementreportsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSettlementreportsListResponse] = js.native
  def list(params: ParamsResourceSettlementreportsList): GaxiosPromise[SchemaSettlementreportsListResponse] = js.native
  def list(
    params: ParamsResourceSettlementreportsList,
    callback: BodyResponseCallback[SchemaSettlementreportsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceSettlementreportsList,
    options: BodyResponseCallback[Readable | SchemaSettlementreportsListResponse],
    callback: BodyResponseCallback[Readable | SchemaSettlementreportsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceSettlementreportsList, options: MethodOptions): GaxiosPromise[SchemaSettlementreportsListResponse] = js.native
  def list(
    params: ParamsResourceSettlementreportsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSettlementreportsListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of settlement reports from your Merchant Center account.
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
    *   const res = await content.settlementreports.list({
    *     // The maximum number of settlements to return in the response, used for paging. The default value is 200 returns per page, and the maximum allowed value is 5000 returns per page.
    *     maxResults: 'placeholder-value',
    *     // The Merchant Center account to list settlements for.
    *     merchantId: 'placeholder-value',
    *     // The token returned by the previous request.
    *     pageToken: 'placeholder-value',
    *     // Obtains settlements which have transactions before this date (inclusively), in ISO 8601 format.
    *     transferEndDate: 'placeholder-value',
    *     // Obtains settlements which have transactions after this date (inclusively), in ISO 8601 format.
    *     transferStartDate: 'placeholder-value',
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
  def list(params: ParamsResourceSettlementreportsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceSettlementreportsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
