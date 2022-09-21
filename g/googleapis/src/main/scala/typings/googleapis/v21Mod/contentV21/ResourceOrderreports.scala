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

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Orderreports")
@js.native
open class ResourceOrderreports protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def listdisbursements(): GaxiosPromise[SchemaOrderreportsListDisbursementsResponse] = js.native
  def listdisbursements(callback: BodyResponseCallback[SchemaOrderreportsListDisbursementsResponse]): Unit = js.native
  def listdisbursements(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrderreportsListDisbursementsResponse] = js.native
  def listdisbursements(params: ParamsResourceOrderreportsListdisbursements): GaxiosPromise[SchemaOrderreportsListDisbursementsResponse] = js.native
  def listdisbursements(
    params: ParamsResourceOrderreportsListdisbursements,
    callback: BodyResponseCallback[SchemaOrderreportsListDisbursementsResponse]
  ): Unit = js.native
  def listdisbursements(
    params: ParamsResourceOrderreportsListdisbursements,
    options: BodyResponseCallback[Readable | SchemaOrderreportsListDisbursementsResponse],
    callback: BodyResponseCallback[Readable | SchemaOrderreportsListDisbursementsResponse]
  ): Unit = js.native
  def listdisbursements(params: ParamsResourceOrderreportsListdisbursements, options: MethodOptions): GaxiosPromise[SchemaOrderreportsListDisbursementsResponse] = js.native
  def listdisbursements(
    params: ParamsResourceOrderreportsListdisbursements,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrderreportsListDisbursementsResponse]
  ): Unit = js.native
  /**
    * Retrieves a report for disbursements from your Merchant Center account.
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
    *   const res = await content.orderreports.listdisbursements({
    *     // The last date which disbursements occurred. In ISO 8601 format. Default: current date.
    *     disbursementEndDate: 'placeholder-value',
    *     // The first date which disbursements occurred. In ISO 8601 format.
    *     disbursementStartDate: 'placeholder-value',
    *     // The maximum number of disbursements to return in the response, used for paging.
    *     maxResults: 'placeholder-value',
    *     // The ID of the account that manages the order. This cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // The token returned by the previous request.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "disbursements": [],
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken"
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
  def listdisbursements(params: ParamsResourceOrderreportsListdisbursements, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def listdisbursements(
    params: ParamsResourceOrderreportsListdisbursements,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def listtransactions(): GaxiosPromise[SchemaOrderreportsListTransactionsResponse] = js.native
  def listtransactions(callback: BodyResponseCallback[SchemaOrderreportsListTransactionsResponse]): Unit = js.native
  def listtransactions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrderreportsListTransactionsResponse] = js.native
  def listtransactions(params: ParamsResourceOrderreportsListtransactions): GaxiosPromise[SchemaOrderreportsListTransactionsResponse] = js.native
  def listtransactions(
    params: ParamsResourceOrderreportsListtransactions,
    callback: BodyResponseCallback[SchemaOrderreportsListTransactionsResponse]
  ): Unit = js.native
  def listtransactions(
    params: ParamsResourceOrderreportsListtransactions,
    options: BodyResponseCallback[Readable | SchemaOrderreportsListTransactionsResponse],
    callback: BodyResponseCallback[Readable | SchemaOrderreportsListTransactionsResponse]
  ): Unit = js.native
  def listtransactions(params: ParamsResourceOrderreportsListtransactions, options: MethodOptions): GaxiosPromise[SchemaOrderreportsListTransactionsResponse] = js.native
  def listtransactions(
    params: ParamsResourceOrderreportsListtransactions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrderreportsListTransactionsResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of transactions for a disbursement from your Merchant Center account.
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
    *   const res = await content.orderreports.listtransactions({
    *     // The Google-provided ID of the disbursement (found in Wallet).
    *     disbursementId: 'placeholder-value',
    *     // The maximum number of disbursements to return in the response, used for paging.
    *     maxResults: 'placeholder-value',
    *     // The ID of the account that manages the order. This cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // The token returned by the previous request.
    *     pageToken: 'placeholder-value',
    *     // The last date in which transaction occurred. In ISO 8601 format. Default: current date.
    *     transactionEndDate: 'placeholder-value',
    *     // The first date in which transaction occurred. In ISO 8601 format.
    *     transactionStartDate: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "transactions": []
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
  def listtransactions(params: ParamsResourceOrderreportsListtransactions, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def listtransactions(
    params: ParamsResourceOrderreportsListtransactions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
