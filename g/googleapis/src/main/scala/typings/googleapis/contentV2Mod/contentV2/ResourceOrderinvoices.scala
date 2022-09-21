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

@JSImport("googleapis/build/src/apis/content/v2", "content_v2.Resource$Orderinvoices")
@js.native
open class ResourceOrderinvoices protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def createchargeinvoice(): GaxiosPromise[SchemaOrderinvoicesCreateChargeInvoiceResponse] = js.native
  def createchargeinvoice(callback: BodyResponseCallback[SchemaOrderinvoicesCreateChargeInvoiceResponse]): Unit = js.native
  def createchargeinvoice(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrderinvoicesCreateChargeInvoiceResponse] = js.native
  def createchargeinvoice(params: ParamsResourceOrderinvoicesCreatechargeinvoice): GaxiosPromise[SchemaOrderinvoicesCreateChargeInvoiceResponse] = js.native
  def createchargeinvoice(
    params: ParamsResourceOrderinvoicesCreatechargeinvoice,
    callback: BodyResponseCallback[SchemaOrderinvoicesCreateChargeInvoiceResponse]
  ): Unit = js.native
  def createchargeinvoice(
    params: ParamsResourceOrderinvoicesCreatechargeinvoice,
    options: BodyResponseCallback[Readable | SchemaOrderinvoicesCreateChargeInvoiceResponse],
    callback: BodyResponseCallback[Readable | SchemaOrderinvoicesCreateChargeInvoiceResponse]
  ): Unit = js.native
  def createchargeinvoice(params: ParamsResourceOrderinvoicesCreatechargeinvoice, options: MethodOptions): GaxiosPromise[SchemaOrderinvoicesCreateChargeInvoiceResponse] = js.native
  def createchargeinvoice(
    params: ParamsResourceOrderinvoicesCreatechargeinvoice,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrderinvoicesCreateChargeInvoiceResponse]
  ): Unit = js.native
  /**
    * Creates a charge invoice for a shipment group, and triggers a charge capture for orderinvoice enabled orders.
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
    *   const res = await content.orderinvoices.createchargeinvoice({
    *     // The ID of the account that manages the order. This cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // The ID of the order.
    *     orderId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "invoiceId": "my_invoiceId",
    *       //   "invoiceSummary": {},
    *       //   "lineItemInvoices": [],
    *       //   "operationId": "my_operationId",
    *       //   "shipmentGroupId": "my_shipmentGroupId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "executionStatus": "my_executionStatus",
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
  def createchargeinvoice(params: ParamsResourceOrderinvoicesCreatechargeinvoice, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def createchargeinvoice(
    params: ParamsResourceOrderinvoicesCreatechargeinvoice,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def createrefundinvoice(): GaxiosPromise[SchemaOrderinvoicesCreateRefundInvoiceResponse] = js.native
  def createrefundinvoice(callback: BodyResponseCallback[SchemaOrderinvoicesCreateRefundInvoiceResponse]): Unit = js.native
  def createrefundinvoice(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrderinvoicesCreateRefundInvoiceResponse] = js.native
  def createrefundinvoice(params: ParamsResourceOrderinvoicesCreaterefundinvoice): GaxiosPromise[SchemaOrderinvoicesCreateRefundInvoiceResponse] = js.native
  def createrefundinvoice(
    params: ParamsResourceOrderinvoicesCreaterefundinvoice,
    callback: BodyResponseCallback[SchemaOrderinvoicesCreateRefundInvoiceResponse]
  ): Unit = js.native
  def createrefundinvoice(
    params: ParamsResourceOrderinvoicesCreaterefundinvoice,
    options: BodyResponseCallback[Readable | SchemaOrderinvoicesCreateRefundInvoiceResponse],
    callback: BodyResponseCallback[Readable | SchemaOrderinvoicesCreateRefundInvoiceResponse]
  ): Unit = js.native
  def createrefundinvoice(params: ParamsResourceOrderinvoicesCreaterefundinvoice, options: MethodOptions): GaxiosPromise[SchemaOrderinvoicesCreateRefundInvoiceResponse] = js.native
  def createrefundinvoice(
    params: ParamsResourceOrderinvoicesCreaterefundinvoice,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrderinvoicesCreateRefundInvoiceResponse]
  ): Unit = js.native
  /**
    * Creates a refund invoice for one or more shipment groups, and triggers a refund for orderinvoice enabled orders. This can only be used for line items that have previously been charged using `createChargeInvoice`. All amounts (except for the summary) are incremental with respect to the previous invoice.
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
    *   const res = await content.orderinvoices.createrefundinvoice({
    *     // The ID of the account that manages the order. This cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // The ID of the order.
    *     orderId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "invoiceId": "my_invoiceId",
    *       //   "operationId": "my_operationId",
    *       //   "refundOnlyOption": {},
    *       //   "returnOption": {},
    *       //   "shipmentInvoices": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "executionStatus": "my_executionStatus",
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
  def createrefundinvoice(params: ParamsResourceOrderinvoicesCreaterefundinvoice, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def createrefundinvoice(
    params: ParamsResourceOrderinvoicesCreaterefundinvoice,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
