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

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Settlementtransactions")
@js.native
open class ResourceSettlementtransactions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaSettlementtransactionsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaSettlementtransactionsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSettlementtransactionsListResponse] = js.native
  def list(params: ParamsResourceSettlementtransactionsList): GaxiosPromise[SchemaSettlementtransactionsListResponse] = js.native
  def list(
    params: ParamsResourceSettlementtransactionsList,
    callback: BodyResponseCallback[SchemaSettlementtransactionsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceSettlementtransactionsList,
    options: BodyResponseCallback[Readable | SchemaSettlementtransactionsListResponse],
    callback: BodyResponseCallback[Readable | SchemaSettlementtransactionsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceSettlementtransactionsList, options: MethodOptions): GaxiosPromise[SchemaSettlementtransactionsListResponse] = js.native
  def list(
    params: ParamsResourceSettlementtransactionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSettlementtransactionsListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of transactions for the settlement.
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
    *   const res = await content.settlementtransactions.list({
    *     // The maximum number of transactions to return in the response, used for paging. The default value is 200 transactions per page, and the maximum allowed value is 5000 transactions per page.
    *     maxResults: 'placeholder-value',
    *     // The Merchant Center account to list transactions for.
    *     merchantId: 'placeholder-value',
    *     // The token returned by the previous request.
    *     pageToken: 'placeholder-value',
    *     // The Google-provided ID of the settlement.
    *     settlementId: 'placeholder-value',
    *     // The list of transactions to return. If not set, all transactions will be returned.
    *     transactionIds: 'placeholder-value',
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
  def list(params: ParamsResourceSettlementtransactionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceSettlementtransactionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
