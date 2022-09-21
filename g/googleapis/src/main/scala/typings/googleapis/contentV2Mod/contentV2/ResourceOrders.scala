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

@JSImport("googleapis/build/src/apis/content/v2", "content_v2.Resource$Orders")
@js.native
open class ResourceOrders protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def acknowledge(): GaxiosPromise[SchemaOrdersAcknowledgeResponse] = js.native
  def acknowledge(callback: BodyResponseCallback[SchemaOrdersAcknowledgeResponse]): Unit = js.native
  def acknowledge(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrdersAcknowledgeResponse] = js.native
  def acknowledge(params: ParamsResourceOrdersAcknowledge): GaxiosPromise[SchemaOrdersAcknowledgeResponse] = js.native
  def acknowledge(
    params: ParamsResourceOrdersAcknowledge,
    callback: BodyResponseCallback[SchemaOrdersAcknowledgeResponse]
  ): Unit = js.native
  def acknowledge(
    params: ParamsResourceOrdersAcknowledge,
    options: BodyResponseCallback[Readable | SchemaOrdersAcknowledgeResponse],
    callback: BodyResponseCallback[Readable | SchemaOrdersAcknowledgeResponse]
  ): Unit = js.native
  def acknowledge(params: ParamsResourceOrdersAcknowledge, options: MethodOptions): GaxiosPromise[SchemaOrdersAcknowledgeResponse] = js.native
  def acknowledge(
    params: ParamsResourceOrdersAcknowledge,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrdersAcknowledgeResponse]
  ): Unit = js.native
  /**
    * Marks an order as acknowledged.
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
    *   const res = await content.orders.acknowledge({
    *     // The ID of the account that manages the order. This cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // The ID of the order.
    *     orderId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "operationId": "my_operationId"
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
  def acknowledge(params: ParamsResourceOrdersAcknowledge, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def acknowledge(
    params: ParamsResourceOrdersAcknowledge,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def advancetestorder(): GaxiosPromise[SchemaOrdersAdvanceTestOrderResponse] = js.native
  def advancetestorder(callback: BodyResponseCallback[SchemaOrdersAdvanceTestOrderResponse]): Unit = js.native
  def advancetestorder(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrdersAdvanceTestOrderResponse] = js.native
  def advancetestorder(params: ParamsResourceOrdersAdvancetestorder): GaxiosPromise[SchemaOrdersAdvanceTestOrderResponse] = js.native
  def advancetestorder(
    params: ParamsResourceOrdersAdvancetestorder,
    callback: BodyResponseCallback[SchemaOrdersAdvanceTestOrderResponse]
  ): Unit = js.native
  def advancetestorder(
    params: ParamsResourceOrdersAdvancetestorder,
    options: BodyResponseCallback[Readable | SchemaOrdersAdvanceTestOrderResponse],
    callback: BodyResponseCallback[Readable | SchemaOrdersAdvanceTestOrderResponse]
  ): Unit = js.native
  def advancetestorder(params: ParamsResourceOrdersAdvancetestorder, options: MethodOptions): GaxiosPromise[SchemaOrdersAdvanceTestOrderResponse] = js.native
  def advancetestorder(
    params: ParamsResourceOrdersAdvancetestorder,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrdersAdvanceTestOrderResponse]
  ): Unit = js.native
  /**
    * Sandbox only. Moves a test order from state "`inProgress`" to state "`pendingShipment`".
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
    *   const res = await content.orders.advancetestorder({
    *     // The ID of the account that manages the order. This cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // The ID of the test order to modify.
    *     orderId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
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
  def advancetestorder(params: ParamsResourceOrdersAdvancetestorder, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def advancetestorder(
    params: ParamsResourceOrdersAdvancetestorder,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def cancel(): GaxiosPromise[SchemaOrdersCancelResponse] = js.native
  def cancel(callback: BodyResponseCallback[SchemaOrdersCancelResponse]): Unit = js.native
  def cancel(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrdersCancelResponse] = js.native
  def cancel(params: ParamsResourceOrdersCancel): GaxiosPromise[SchemaOrdersCancelResponse] = js.native
  def cancel(params: ParamsResourceOrdersCancel, callback: BodyResponseCallback[SchemaOrdersCancelResponse]): Unit = js.native
  def cancel(
    params: ParamsResourceOrdersCancel,
    options: BodyResponseCallback[Readable | SchemaOrdersCancelResponse],
    callback: BodyResponseCallback[Readable | SchemaOrdersCancelResponse]
  ): Unit = js.native
  def cancel(params: ParamsResourceOrdersCancel, options: MethodOptions): GaxiosPromise[SchemaOrdersCancelResponse] = js.native
  def cancel(
    params: ParamsResourceOrdersCancel,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrdersCancelResponse]
  ): Unit = js.native
  /**
    * Cancels all line items in an order, making a full refund.
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
    *   const res = await content.orders.cancel({
    *     // The ID of the account that manages the order. This cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // The ID of the order to cancel.
    *     orderId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "operationId": "my_operationId",
    *       //   "reason": "my_reason",
    *       //   "reasonText": "my_reasonText"
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
  def cancel(params: ParamsResourceOrdersCancel, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def cancel(
    params: ParamsResourceOrdersCancel,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def cancellineitem(): GaxiosPromise[SchemaOrdersCancelLineItemResponse] = js.native
  def cancellineitem(callback: BodyResponseCallback[SchemaOrdersCancelLineItemResponse]): Unit = js.native
  def cancellineitem(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrdersCancelLineItemResponse] = js.native
  def cancellineitem(params: ParamsResourceOrdersCancellineitem): GaxiosPromise[SchemaOrdersCancelLineItemResponse] = js.native
  def cancellineitem(
    params: ParamsResourceOrdersCancellineitem,
    callback: BodyResponseCallback[SchemaOrdersCancelLineItemResponse]
  ): Unit = js.native
  def cancellineitem(
    params: ParamsResourceOrdersCancellineitem,
    options: BodyResponseCallback[Readable | SchemaOrdersCancelLineItemResponse],
    callback: BodyResponseCallback[Readable | SchemaOrdersCancelLineItemResponse]
  ): Unit = js.native
  def cancellineitem(params: ParamsResourceOrdersCancellineitem, options: MethodOptions): GaxiosPromise[SchemaOrdersCancelLineItemResponse] = js.native
  def cancellineitem(
    params: ParamsResourceOrdersCancellineitem,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrdersCancelLineItemResponse]
  ): Unit = js.native
  /**
    * Cancels a line item, making a full refund.
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
    *   const res = await content.orders.cancellineitem({
    *     // The ID of the account that manages the order. This cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // The ID of the order.
    *     orderId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "amount": {},
    *       //   "amountPretax": {},
    *       //   "amountTax": {},
    *       //   "lineItemId": "my_lineItemId",
    *       //   "operationId": "my_operationId",
    *       //   "productId": "my_productId",
    *       //   "quantity": 0,
    *       //   "reason": "my_reason",
    *       //   "reasonText": "my_reasonText"
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
  def cancellineitem(params: ParamsResourceOrdersCancellineitem, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def cancellineitem(
    params: ParamsResourceOrdersCancellineitem,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def canceltestorderbycustomer(): GaxiosPromise[SchemaOrdersCancelTestOrderByCustomerResponse] = js.native
  def canceltestorderbycustomer(callback: BodyResponseCallback[SchemaOrdersCancelTestOrderByCustomerResponse]): Unit = js.native
  def canceltestorderbycustomer(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrdersCancelTestOrderByCustomerResponse] = js.native
  def canceltestorderbycustomer(params: ParamsResourceOrdersCanceltestorderbycustomer): GaxiosPromise[SchemaOrdersCancelTestOrderByCustomerResponse] = js.native
  def canceltestorderbycustomer(
    params: ParamsResourceOrdersCanceltestorderbycustomer,
    callback: BodyResponseCallback[SchemaOrdersCancelTestOrderByCustomerResponse]
  ): Unit = js.native
  def canceltestorderbycustomer(
    params: ParamsResourceOrdersCanceltestorderbycustomer,
    options: BodyResponseCallback[Readable | SchemaOrdersCancelTestOrderByCustomerResponse],
    callback: BodyResponseCallback[Readable | SchemaOrdersCancelTestOrderByCustomerResponse]
  ): Unit = js.native
  def canceltestorderbycustomer(params: ParamsResourceOrdersCanceltestorderbycustomer, options: MethodOptions): GaxiosPromise[SchemaOrdersCancelTestOrderByCustomerResponse] = js.native
  def canceltestorderbycustomer(
    params: ParamsResourceOrdersCanceltestorderbycustomer,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrdersCancelTestOrderByCustomerResponse]
  ): Unit = js.native
  /**
    * Sandbox only. Cancels a test order for customer-initiated cancellation.
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
    *   const res = await content.orders.canceltestorderbycustomer({
    *     // The ID of the account that manages the order. This cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // The ID of the test order to cancel.
    *     orderId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "reason": "my_reason"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
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
  def canceltestorderbycustomer(params: ParamsResourceOrdersCanceltestorderbycustomer, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def canceltestorderbycustomer(
    params: ParamsResourceOrdersCanceltestorderbycustomer,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def createtestorder(): GaxiosPromise[SchemaOrdersCreateTestOrderResponse] = js.native
  def createtestorder(callback: BodyResponseCallback[SchemaOrdersCreateTestOrderResponse]): Unit = js.native
  def createtestorder(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrdersCreateTestOrderResponse] = js.native
  def createtestorder(params: ParamsResourceOrdersCreatetestorder): GaxiosPromise[SchemaOrdersCreateTestOrderResponse] = js.native
  def createtestorder(
    params: ParamsResourceOrdersCreatetestorder,
    callback: BodyResponseCallback[SchemaOrdersCreateTestOrderResponse]
  ): Unit = js.native
  def createtestorder(
    params: ParamsResourceOrdersCreatetestorder,
    options: BodyResponseCallback[Readable | SchemaOrdersCreateTestOrderResponse],
    callback: BodyResponseCallback[Readable | SchemaOrdersCreateTestOrderResponse]
  ): Unit = js.native
  def createtestorder(params: ParamsResourceOrdersCreatetestorder, options: MethodOptions): GaxiosPromise[SchemaOrdersCreateTestOrderResponse] = js.native
  def createtestorder(
    params: ParamsResourceOrdersCreatetestorder,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrdersCreateTestOrderResponse]
  ): Unit = js.native
  /**
    * Sandbox only. Creates a test order.
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
    *   const res = await content.orders.createtestorder({
    *     // The ID of the account that should manage the order. This cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "country": "my_country",
    *       //   "templateName": "my_templateName",
    *       //   "testOrder": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "orderId": "my_orderId"
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
  def createtestorder(params: ParamsResourceOrdersCreatetestorder, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def createtestorder(
    params: ParamsResourceOrdersCreatetestorder,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def createtestreturn(): GaxiosPromise[SchemaOrdersCreateTestReturnResponse] = js.native
  def createtestreturn(callback: BodyResponseCallback[SchemaOrdersCreateTestReturnResponse]): Unit = js.native
  def createtestreturn(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrdersCreateTestReturnResponse] = js.native
  def createtestreturn(params: ParamsResourceOrdersCreatetestreturn): GaxiosPromise[SchemaOrdersCreateTestReturnResponse] = js.native
  def createtestreturn(
    params: ParamsResourceOrdersCreatetestreturn,
    callback: BodyResponseCallback[SchemaOrdersCreateTestReturnResponse]
  ): Unit = js.native
  def createtestreturn(
    params: ParamsResourceOrdersCreatetestreturn,
    options: BodyResponseCallback[Readable | SchemaOrdersCreateTestReturnResponse],
    callback: BodyResponseCallback[Readable | SchemaOrdersCreateTestReturnResponse]
  ): Unit = js.native
  def createtestreturn(params: ParamsResourceOrdersCreatetestreturn, options: MethodOptions): GaxiosPromise[SchemaOrdersCreateTestReturnResponse] = js.native
  def createtestreturn(
    params: ParamsResourceOrdersCreatetestreturn,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrdersCreateTestReturnResponse]
  ): Unit = js.native
  /**
    * Sandbox only. Creates a test return.
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
    *   const res = await content.orders.createtestreturn({
    *     // The ID of the account that manages the order. This cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // The ID of the order.
    *     orderId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "items": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "returnId": "my_returnId"
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
  def createtestreturn(params: ParamsResourceOrdersCreatetestreturn, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def createtestreturn(
    params: ParamsResourceOrdersCreatetestreturn,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def custombatch(): GaxiosPromise[SchemaOrdersCustomBatchResponse] = js.native
  def custombatch(callback: BodyResponseCallback[SchemaOrdersCustomBatchResponse]): Unit = js.native
  def custombatch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrdersCustomBatchResponse] = js.native
  def custombatch(params: ParamsResourceOrdersCustombatch): GaxiosPromise[SchemaOrdersCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceOrdersCustombatch,
    callback: BodyResponseCallback[SchemaOrdersCustomBatchResponse]
  ): Unit = js.native
  def custombatch(
    params: ParamsResourceOrdersCustombatch,
    options: BodyResponseCallback[Readable | SchemaOrdersCustomBatchResponse],
    callback: BodyResponseCallback[Readable | SchemaOrdersCustomBatchResponse]
  ): Unit = js.native
  def custombatch(params: ParamsResourceOrdersCustombatch, options: MethodOptions): GaxiosPromise[SchemaOrdersCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceOrdersCustombatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrdersCustomBatchResponse]
  ): Unit = js.native
  /**
    * Retrieves or modifies multiple orders in a single request.
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
    *   const res = await content.orders.custombatch({
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
  def custombatch(params: ParamsResourceOrdersCustombatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def custombatch(
    params: ParamsResourceOrdersCustombatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaOrder] = js.native
  def get(callback: BodyResponseCallback[SchemaOrder]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrder] = js.native
  def get(params: ParamsResourceOrdersGet): GaxiosPromise[SchemaOrder] = js.native
  def get(params: ParamsResourceOrdersGet, callback: BodyResponseCallback[SchemaOrder]): Unit = js.native
  def get(
    params: ParamsResourceOrdersGet,
    options: BodyResponseCallback[Readable | SchemaOrder],
    callback: BodyResponseCallback[Readable | SchemaOrder]
  ): Unit = js.native
  def get(params: ParamsResourceOrdersGet, options: MethodOptions): GaxiosPromise[SchemaOrder] = js.native
  def get(
    params: ParamsResourceOrdersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrder]
  ): Unit = js.native
  /**
    * Retrieves an order from your Merchant Center account.
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
    *   const res = await content.orders.get({
    *     // The ID of the account that manages the order. This cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // The ID of the order.
    *     orderId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "acknowledged": false,
    *   //   "channelType": "my_channelType",
    *   //   "customer": {},
    *   //   "deliveryDetails": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "lineItems": [],
    *   //   "merchantId": "my_merchantId",
    *   //   "merchantOrderId": "my_merchantOrderId",
    *   //   "netAmount": {},
    *   //   "paymentMethod": {},
    *   //   "paymentStatus": "my_paymentStatus",
    *   //   "pickupDetails": {},
    *   //   "placedDate": "my_placedDate",
    *   //   "promotions": [],
    *   //   "refunds": [],
    *   //   "shipments": [],
    *   //   "shippingCost": {},
    *   //   "shippingCostTax": {},
    *   //   "shippingOption": "my_shippingOption",
    *   //   "status": "my_status",
    *   //   "taxCollector": "my_taxCollector"
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
  def get(params: ParamsResourceOrdersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceOrdersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getbymerchantorderid(): GaxiosPromise[SchemaOrdersGetByMerchantOrderIdResponse] = js.native
  def getbymerchantorderid(callback: BodyResponseCallback[SchemaOrdersGetByMerchantOrderIdResponse]): Unit = js.native
  def getbymerchantorderid(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrdersGetByMerchantOrderIdResponse] = js.native
  def getbymerchantorderid(params: ParamsResourceOrdersGetbymerchantorderid): GaxiosPromise[SchemaOrdersGetByMerchantOrderIdResponse] = js.native
  def getbymerchantorderid(
    params: ParamsResourceOrdersGetbymerchantorderid,
    callback: BodyResponseCallback[SchemaOrdersGetByMerchantOrderIdResponse]
  ): Unit = js.native
  def getbymerchantorderid(
    params: ParamsResourceOrdersGetbymerchantorderid,
    options: BodyResponseCallback[Readable | SchemaOrdersGetByMerchantOrderIdResponse],
    callback: BodyResponseCallback[Readable | SchemaOrdersGetByMerchantOrderIdResponse]
  ): Unit = js.native
  def getbymerchantorderid(params: ParamsResourceOrdersGetbymerchantorderid, options: MethodOptions): GaxiosPromise[SchemaOrdersGetByMerchantOrderIdResponse] = js.native
  def getbymerchantorderid(
    params: ParamsResourceOrdersGetbymerchantorderid,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrdersGetByMerchantOrderIdResponse]
  ): Unit = js.native
  /**
    * Retrieves an order using merchant order ID.
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
    *   const res = await content.orders.getbymerchantorderid({
    *     // The ID of the account that manages the order. This cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // The merchant order ID to be looked for.
    *     merchantOrderId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "order": {}
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
  def getbymerchantorderid(params: ParamsResourceOrdersGetbymerchantorderid, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getbymerchantorderid(
    params: ParamsResourceOrdersGetbymerchantorderid,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def gettestordertemplate(): GaxiosPromise[SchemaOrdersGetTestOrderTemplateResponse] = js.native
  def gettestordertemplate(callback: BodyResponseCallback[SchemaOrdersGetTestOrderTemplateResponse]): Unit = js.native
  def gettestordertemplate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrdersGetTestOrderTemplateResponse] = js.native
  def gettestordertemplate(params: ParamsResourceOrdersGettestordertemplate): GaxiosPromise[SchemaOrdersGetTestOrderTemplateResponse] = js.native
  def gettestordertemplate(
    params: ParamsResourceOrdersGettestordertemplate,
    callback: BodyResponseCallback[SchemaOrdersGetTestOrderTemplateResponse]
  ): Unit = js.native
  def gettestordertemplate(
    params: ParamsResourceOrdersGettestordertemplate,
    options: BodyResponseCallback[Readable | SchemaOrdersGetTestOrderTemplateResponse],
    callback: BodyResponseCallback[Readable | SchemaOrdersGetTestOrderTemplateResponse]
  ): Unit = js.native
  def gettestordertemplate(params: ParamsResourceOrdersGettestordertemplate, options: MethodOptions): GaxiosPromise[SchemaOrdersGetTestOrderTemplateResponse] = js.native
  def gettestordertemplate(
    params: ParamsResourceOrdersGettestordertemplate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrdersGetTestOrderTemplateResponse]
  ): Unit = js.native
  /**
    * Sandbox only. Retrieves an order template that can be used to quickly create a new order in sandbox.
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
    *   const res = await content.orders.gettestordertemplate({
    *     // The country of the template to retrieve. Defaults to `US`.
    *     country: 'placeholder-value',
    *     // The ID of the account that should manage the order. This cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // The name of the template to retrieve.
    *     templateName: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "template": {}
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
  def gettestordertemplate(params: ParamsResourceOrdersGettestordertemplate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def gettestordertemplate(
    params: ParamsResourceOrdersGettestordertemplate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def instorerefundlineitem(): GaxiosPromise[SchemaOrdersInStoreRefundLineItemResponse] = js.native
  def instorerefundlineitem(callback: BodyResponseCallback[SchemaOrdersInStoreRefundLineItemResponse]): Unit = js.native
  def instorerefundlineitem(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrdersInStoreRefundLineItemResponse] = js.native
  def instorerefundlineitem(params: ParamsResourceOrdersInstorerefundlineitem): GaxiosPromise[SchemaOrdersInStoreRefundLineItemResponse] = js.native
  def instorerefundlineitem(
    params: ParamsResourceOrdersInstorerefundlineitem,
    callback: BodyResponseCallback[SchemaOrdersInStoreRefundLineItemResponse]
  ): Unit = js.native
  def instorerefundlineitem(
    params: ParamsResourceOrdersInstorerefundlineitem,
    options: BodyResponseCallback[Readable | SchemaOrdersInStoreRefundLineItemResponse],
    callback: BodyResponseCallback[Readable | SchemaOrdersInStoreRefundLineItemResponse]
  ): Unit = js.native
  def instorerefundlineitem(params: ParamsResourceOrdersInstorerefundlineitem, options: MethodOptions): GaxiosPromise[SchemaOrdersInStoreRefundLineItemResponse] = js.native
  def instorerefundlineitem(
    params: ParamsResourceOrdersInstorerefundlineitem,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrdersInStoreRefundLineItemResponse]
  ): Unit = js.native
  /**
    * Deprecated. Notifies that item return and refund was handled directly by merchant outside of Google payments processing (e.g. cash refund done in store). Note: We recommend calling the returnrefundlineitem method to refund in-store returns. We will issue the refund directly to the customer. This helps to prevent possible differences arising between merchant and Google transaction records. We also recommend having the point of sale system communicate with Google to ensure that customers do not receive a double refund by first refunding via Google then via an in-store return.
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
    *   const res = await content.orders.instorerefundlineitem({
    *     // The ID of the account that manages the order. This cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // The ID of the order.
    *     orderId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "amountPretax": {},
    *       //   "amountTax": {},
    *       //   "lineItemId": "my_lineItemId",
    *       //   "operationId": "my_operationId",
    *       //   "productId": "my_productId",
    *       //   "quantity": 0,
    *       //   "reason": "my_reason",
    *       //   "reasonText": "my_reasonText"
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
  def instorerefundlineitem(params: ParamsResourceOrdersInstorerefundlineitem, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def instorerefundlineitem(
    params: ParamsResourceOrdersInstorerefundlineitem,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaOrdersListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaOrdersListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrdersListResponse] = js.native
  def list(params: ParamsResourceOrdersList): GaxiosPromise[SchemaOrdersListResponse] = js.native
  def list(params: ParamsResourceOrdersList, callback: BodyResponseCallback[SchemaOrdersListResponse]): Unit = js.native
  def list(
    params: ParamsResourceOrdersList,
    options: BodyResponseCallback[Readable | SchemaOrdersListResponse],
    callback: BodyResponseCallback[Readable | SchemaOrdersListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceOrdersList, options: MethodOptions): GaxiosPromise[SchemaOrdersListResponse] = js.native
  def list(
    params: ParamsResourceOrdersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrdersListResponse]
  ): Unit = js.native
  /**
    * Lists the orders in your Merchant Center account.
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
    *   const res = await content.orders.list({
    *     // Obtains orders that match the acknowledgement status. When set to true, obtains orders that have been acknowledged. When false, obtains orders that have not been acknowledged. We recommend using this filter set to `false`, in conjunction with the `acknowledge` call, such that only un-acknowledged orders are returned.
    *     acknowledged: 'placeholder-value',
    *     // The maximum number of orders to return in the response, used for paging. The default value is 25 orders per page, and the maximum allowed value is 250 orders per page.
    *     maxResults: 'placeholder-value',
    *     // The ID of the account that manages the order. This cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // Order results by placement date in descending or ascending order. Acceptable values are: - placedDateAsc - placedDateDesc
    *     orderBy: 'placeholder-value',
    *     // The token returned by the previous request.
    *     pageToken: 'placeholder-value',
    *     // Obtains orders placed before this date (exclusively), in ISO 8601 format.
    *     placedDateEnd: 'placeholder-value',
    *     // Obtains orders placed after this date (inclusively), in ISO 8601 format.
    *     placedDateStart: 'placeholder-value',
    *     // Obtains orders that match any of the specified statuses. Please note that `active` is a shortcut for `pendingShipment` and `partiallyShipped`, and `completed` is a shortcut for `shipped`, `partiallyDelivered`, `delivered`, `partiallyReturned`, `returned`, and `canceled`.
    *     statuses: 'placeholder-value',
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
  def list(params: ParamsResourceOrdersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceOrdersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def refund(): GaxiosPromise[SchemaOrdersRefundResponse] = js.native
  def refund(callback: BodyResponseCallback[SchemaOrdersRefundResponse]): Unit = js.native
  def refund(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrdersRefundResponse] = js.native
  def refund(params: ParamsResourceOrdersRefund): GaxiosPromise[SchemaOrdersRefundResponse] = js.native
  def refund(params: ParamsResourceOrdersRefund, callback: BodyResponseCallback[SchemaOrdersRefundResponse]): Unit = js.native
  def refund(
    params: ParamsResourceOrdersRefund,
    options: BodyResponseCallback[Readable | SchemaOrdersRefundResponse],
    callback: BodyResponseCallback[Readable | SchemaOrdersRefundResponse]
  ): Unit = js.native
  def refund(params: ParamsResourceOrdersRefund, options: MethodOptions): GaxiosPromise[SchemaOrdersRefundResponse] = js.native
  def refund(
    params: ParamsResourceOrdersRefund,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrdersRefundResponse]
  ): Unit = js.native
  /**
    * Deprecated, please use returnRefundLineItem instead.
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
    *   const res = await content.orders.refund({
    *     // The ID of the account that manages the order. This cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // The ID of the order to refund.
    *     orderId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "amount": {},
    *       //   "amountPretax": {},
    *       //   "amountTax": {},
    *       //   "operationId": "my_operationId",
    *       //   "reason": "my_reason",
    *       //   "reasonText": "my_reasonText"
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
  def refund(params: ParamsResourceOrdersRefund, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def refund(
    params: ParamsResourceOrdersRefund,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def rejectreturnlineitem(): GaxiosPromise[SchemaOrdersRejectReturnLineItemResponse] = js.native
  def rejectreturnlineitem(callback: BodyResponseCallback[SchemaOrdersRejectReturnLineItemResponse]): Unit = js.native
  def rejectreturnlineitem(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrdersRejectReturnLineItemResponse] = js.native
  def rejectreturnlineitem(params: ParamsResourceOrdersRejectreturnlineitem): GaxiosPromise[SchemaOrdersRejectReturnLineItemResponse] = js.native
  def rejectreturnlineitem(
    params: ParamsResourceOrdersRejectreturnlineitem,
    callback: BodyResponseCallback[SchemaOrdersRejectReturnLineItemResponse]
  ): Unit = js.native
  def rejectreturnlineitem(
    params: ParamsResourceOrdersRejectreturnlineitem,
    options: BodyResponseCallback[Readable | SchemaOrdersRejectReturnLineItemResponse],
    callback: BodyResponseCallback[Readable | SchemaOrdersRejectReturnLineItemResponse]
  ): Unit = js.native
  def rejectreturnlineitem(params: ParamsResourceOrdersRejectreturnlineitem, options: MethodOptions): GaxiosPromise[SchemaOrdersRejectReturnLineItemResponse] = js.native
  def rejectreturnlineitem(
    params: ParamsResourceOrdersRejectreturnlineitem,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrdersRejectReturnLineItemResponse]
  ): Unit = js.native
  /**
    * Rejects return on an line item.
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
    *   const res = await content.orders.rejectreturnlineitem({
    *     // The ID of the account that manages the order. This cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // The ID of the order.
    *     orderId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "lineItemId": "my_lineItemId",
    *       //   "operationId": "my_operationId",
    *       //   "productId": "my_productId",
    *       //   "quantity": 0,
    *       //   "reason": "my_reason",
    *       //   "reasonText": "my_reasonText"
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
  def rejectreturnlineitem(params: ParamsResourceOrdersRejectreturnlineitem, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def rejectreturnlineitem(
    params: ParamsResourceOrdersRejectreturnlineitem,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def returnlineitem(): GaxiosPromise[SchemaOrdersReturnLineItemResponse] = js.native
  def returnlineitem(callback: BodyResponseCallback[SchemaOrdersReturnLineItemResponse]): Unit = js.native
  def returnlineitem(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrdersReturnLineItemResponse] = js.native
  def returnlineitem(params: ParamsResourceOrdersReturnlineitem): GaxiosPromise[SchemaOrdersReturnLineItemResponse] = js.native
  def returnlineitem(
    params: ParamsResourceOrdersReturnlineitem,
    callback: BodyResponseCallback[SchemaOrdersReturnLineItemResponse]
  ): Unit = js.native
  def returnlineitem(
    params: ParamsResourceOrdersReturnlineitem,
    options: BodyResponseCallback[Readable | SchemaOrdersReturnLineItemResponse],
    callback: BodyResponseCallback[Readable | SchemaOrdersReturnLineItemResponse]
  ): Unit = js.native
  def returnlineitem(params: ParamsResourceOrdersReturnlineitem, options: MethodOptions): GaxiosPromise[SchemaOrdersReturnLineItemResponse] = js.native
  def returnlineitem(
    params: ParamsResourceOrdersReturnlineitem,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrdersReturnLineItemResponse]
  ): Unit = js.native
  /**
    * Returns a line item.
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
    *   const res = await content.orders.returnlineitem({
    *     // The ID of the account that manages the order. This cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // The ID of the order.
    *     orderId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "lineItemId": "my_lineItemId",
    *       //   "operationId": "my_operationId",
    *       //   "productId": "my_productId",
    *       //   "quantity": 0,
    *       //   "reason": "my_reason",
    *       //   "reasonText": "my_reasonText"
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
  def returnlineitem(params: ParamsResourceOrdersReturnlineitem, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def returnlineitem(
    params: ParamsResourceOrdersReturnlineitem,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def returnrefundlineitem(): GaxiosPromise[SchemaOrdersReturnRefundLineItemResponse] = js.native
  def returnrefundlineitem(callback: BodyResponseCallback[SchemaOrdersReturnRefundLineItemResponse]): Unit = js.native
  def returnrefundlineitem(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrdersReturnRefundLineItemResponse] = js.native
  def returnrefundlineitem(params: ParamsResourceOrdersReturnrefundlineitem): GaxiosPromise[SchemaOrdersReturnRefundLineItemResponse] = js.native
  def returnrefundlineitem(
    params: ParamsResourceOrdersReturnrefundlineitem,
    callback: BodyResponseCallback[SchemaOrdersReturnRefundLineItemResponse]
  ): Unit = js.native
  def returnrefundlineitem(
    params: ParamsResourceOrdersReturnrefundlineitem,
    options: BodyResponseCallback[Readable | SchemaOrdersReturnRefundLineItemResponse],
    callback: BodyResponseCallback[Readable | SchemaOrdersReturnRefundLineItemResponse]
  ): Unit = js.native
  def returnrefundlineitem(params: ParamsResourceOrdersReturnrefundlineitem, options: MethodOptions): GaxiosPromise[SchemaOrdersReturnRefundLineItemResponse] = js.native
  def returnrefundlineitem(
    params: ParamsResourceOrdersReturnrefundlineitem,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrdersReturnRefundLineItemResponse]
  ): Unit = js.native
  /**
    * Returns and refunds a line item. Note that this method can only be called on fully shipped orders. Please also note that the Orderreturns API is the preferred way to handle returns after you receive a return from a customer. You can use Orderreturns.list or Orderreturns.get to search for the return, and then use Orderreturns.processreturn to issue the refund. If the return cannot be found, then we recommend using this API to issue a refund.
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
    *   const res = await content.orders.returnrefundlineitem({
    *     // The ID of the account that manages the order. This cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // The ID of the order.
    *     orderId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "amountPretax": {},
    *       //   "amountTax": {},
    *       //   "lineItemId": "my_lineItemId",
    *       //   "operationId": "my_operationId",
    *       //   "productId": "my_productId",
    *       //   "quantity": 0,
    *       //   "reason": "my_reason",
    *       //   "reasonText": "my_reasonText"
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
  def returnrefundlineitem(params: ParamsResourceOrdersReturnrefundlineitem, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def returnrefundlineitem(
    params: ParamsResourceOrdersReturnrefundlineitem,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setlineitemmetadata(): GaxiosPromise[SchemaOrdersSetLineItemMetadataResponse] = js.native
  def setlineitemmetadata(callback: BodyResponseCallback[SchemaOrdersSetLineItemMetadataResponse]): Unit = js.native
  def setlineitemmetadata(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrdersSetLineItemMetadataResponse] = js.native
  def setlineitemmetadata(params: ParamsResourceOrdersSetlineitemmetadata): GaxiosPromise[SchemaOrdersSetLineItemMetadataResponse] = js.native
  def setlineitemmetadata(
    params: ParamsResourceOrdersSetlineitemmetadata,
    callback: BodyResponseCallback[SchemaOrdersSetLineItemMetadataResponse]
  ): Unit = js.native
  def setlineitemmetadata(
    params: ParamsResourceOrdersSetlineitemmetadata,
    options: BodyResponseCallback[Readable | SchemaOrdersSetLineItemMetadataResponse],
    callback: BodyResponseCallback[Readable | SchemaOrdersSetLineItemMetadataResponse]
  ): Unit = js.native
  def setlineitemmetadata(params: ParamsResourceOrdersSetlineitemmetadata, options: MethodOptions): GaxiosPromise[SchemaOrdersSetLineItemMetadataResponse] = js.native
  def setlineitemmetadata(
    params: ParamsResourceOrdersSetlineitemmetadata,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrdersSetLineItemMetadataResponse]
  ): Unit = js.native
  /**
    * Sets (or overrides if it already exists) merchant provided annotations in the form of key-value pairs. A common use case would be to supply us with additional structured information about a line item that cannot be provided via other methods. Submitted key-value pairs can be retrieved as part of the orders resource.
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
    *   const res = await content.orders.setlineitemmetadata({
    *     // The ID of the account that manages the order. This cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // The ID of the order.
    *     orderId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "annotations": [],
    *       //   "lineItemId": "my_lineItemId",
    *       //   "operationId": "my_operationId",
    *       //   "productId": "my_productId"
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
  def setlineitemmetadata(params: ParamsResourceOrdersSetlineitemmetadata, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setlineitemmetadata(
    params: ParamsResourceOrdersSetlineitemmetadata,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def shiplineitems(): GaxiosPromise[SchemaOrdersShipLineItemsResponse] = js.native
  def shiplineitems(callback: BodyResponseCallback[SchemaOrdersShipLineItemsResponse]): Unit = js.native
  def shiplineitems(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrdersShipLineItemsResponse] = js.native
  def shiplineitems(params: ParamsResourceOrdersShiplineitems): GaxiosPromise[SchemaOrdersShipLineItemsResponse] = js.native
  def shiplineitems(
    params: ParamsResourceOrdersShiplineitems,
    callback: BodyResponseCallback[SchemaOrdersShipLineItemsResponse]
  ): Unit = js.native
  def shiplineitems(
    params: ParamsResourceOrdersShiplineitems,
    options: BodyResponseCallback[Readable | SchemaOrdersShipLineItemsResponse],
    callback: BodyResponseCallback[Readable | SchemaOrdersShipLineItemsResponse]
  ): Unit = js.native
  def shiplineitems(params: ParamsResourceOrdersShiplineitems, options: MethodOptions): GaxiosPromise[SchemaOrdersShipLineItemsResponse] = js.native
  def shiplineitems(
    params: ParamsResourceOrdersShiplineitems,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrdersShipLineItemsResponse]
  ): Unit = js.native
  /**
    * Marks line item(s) as shipped.
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
    *   const res = await content.orders.shiplineitems({
    *     // The ID of the account that manages the order. This cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // The ID of the order.
    *     orderId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "carrier": "my_carrier",
    *       //   "lineItems": [],
    *       //   "operationId": "my_operationId",
    *       //   "shipmentGroupId": "my_shipmentGroupId",
    *       //   "shipmentId": "my_shipmentId",
    *       //   "shipmentInfos": [],
    *       //   "trackingId": "my_trackingId"
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
  def shiplineitems(params: ParamsResourceOrdersShiplineitems, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def shiplineitems(
    params: ParamsResourceOrdersShiplineitems,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updatelineitemshippingdetails(): GaxiosPromise[SchemaOrdersUpdateLineItemShippingDetailsResponse] = js.native
  def updatelineitemshippingdetails(callback: BodyResponseCallback[SchemaOrdersUpdateLineItemShippingDetailsResponse]): Unit = js.native
  def updatelineitemshippingdetails(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrdersUpdateLineItemShippingDetailsResponse] = js.native
  def updatelineitemshippingdetails(params: ParamsResourceOrdersUpdatelineitemshippingdetails): GaxiosPromise[SchemaOrdersUpdateLineItemShippingDetailsResponse] = js.native
  def updatelineitemshippingdetails(
    params: ParamsResourceOrdersUpdatelineitemshippingdetails,
    callback: BodyResponseCallback[SchemaOrdersUpdateLineItemShippingDetailsResponse]
  ): Unit = js.native
  def updatelineitemshippingdetails(
    params: ParamsResourceOrdersUpdatelineitemshippingdetails,
    options: BodyResponseCallback[Readable | SchemaOrdersUpdateLineItemShippingDetailsResponse],
    callback: BodyResponseCallback[Readable | SchemaOrdersUpdateLineItemShippingDetailsResponse]
  ): Unit = js.native
  def updatelineitemshippingdetails(params: ParamsResourceOrdersUpdatelineitemshippingdetails, options: MethodOptions): GaxiosPromise[SchemaOrdersUpdateLineItemShippingDetailsResponse] = js.native
  def updatelineitemshippingdetails(
    params: ParamsResourceOrdersUpdatelineitemshippingdetails,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrdersUpdateLineItemShippingDetailsResponse]
  ): Unit = js.native
  /**
    * Updates ship by and delivery by dates for a line item.
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
    *   const res = await content.orders.updatelineitemshippingdetails({
    *     // The ID of the account that manages the order. This cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // The ID of the order.
    *     orderId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "deliverByDate": "my_deliverByDate",
    *       //   "lineItemId": "my_lineItemId",
    *       //   "operationId": "my_operationId",
    *       //   "productId": "my_productId",
    *       //   "shipByDate": "my_shipByDate"
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
  def updatelineitemshippingdetails(params: ParamsResourceOrdersUpdatelineitemshippingdetails, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updatelineitemshippingdetails(
    params: ParamsResourceOrdersUpdatelineitemshippingdetails,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updatemerchantorderid(): GaxiosPromise[SchemaOrdersUpdateMerchantOrderIdResponse] = js.native
  def updatemerchantorderid(callback: BodyResponseCallback[SchemaOrdersUpdateMerchantOrderIdResponse]): Unit = js.native
  def updatemerchantorderid(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrdersUpdateMerchantOrderIdResponse] = js.native
  def updatemerchantorderid(params: ParamsResourceOrdersUpdatemerchantorderid): GaxiosPromise[SchemaOrdersUpdateMerchantOrderIdResponse] = js.native
  def updatemerchantorderid(
    params: ParamsResourceOrdersUpdatemerchantorderid,
    callback: BodyResponseCallback[SchemaOrdersUpdateMerchantOrderIdResponse]
  ): Unit = js.native
  def updatemerchantorderid(
    params: ParamsResourceOrdersUpdatemerchantorderid,
    options: BodyResponseCallback[Readable | SchemaOrdersUpdateMerchantOrderIdResponse],
    callback: BodyResponseCallback[Readable | SchemaOrdersUpdateMerchantOrderIdResponse]
  ): Unit = js.native
  def updatemerchantorderid(params: ParamsResourceOrdersUpdatemerchantorderid, options: MethodOptions): GaxiosPromise[SchemaOrdersUpdateMerchantOrderIdResponse] = js.native
  def updatemerchantorderid(
    params: ParamsResourceOrdersUpdatemerchantorderid,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrdersUpdateMerchantOrderIdResponse]
  ): Unit = js.native
  /**
    * Updates the merchant order ID for a given order.
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
    *   const res = await content.orders.updatemerchantorderid({
    *     // The ID of the account that manages the order. This cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // The ID of the order.
    *     orderId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "merchantOrderId": "my_merchantOrderId",
    *       //   "operationId": "my_operationId"
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
  def updatemerchantorderid(params: ParamsResourceOrdersUpdatemerchantorderid, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updatemerchantorderid(
    params: ParamsResourceOrdersUpdatemerchantorderid,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateshipment(): GaxiosPromise[SchemaOrdersUpdateShipmentResponse] = js.native
  def updateshipment(callback: BodyResponseCallback[SchemaOrdersUpdateShipmentResponse]): Unit = js.native
  def updateshipment(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrdersUpdateShipmentResponse] = js.native
  def updateshipment(params: ParamsResourceOrdersUpdateshipment): GaxiosPromise[SchemaOrdersUpdateShipmentResponse] = js.native
  def updateshipment(
    params: ParamsResourceOrdersUpdateshipment,
    callback: BodyResponseCallback[SchemaOrdersUpdateShipmentResponse]
  ): Unit = js.native
  def updateshipment(
    params: ParamsResourceOrdersUpdateshipment,
    options: BodyResponseCallback[Readable | SchemaOrdersUpdateShipmentResponse],
    callback: BodyResponseCallback[Readable | SchemaOrdersUpdateShipmentResponse]
  ): Unit = js.native
  def updateshipment(params: ParamsResourceOrdersUpdateshipment, options: MethodOptions): GaxiosPromise[SchemaOrdersUpdateShipmentResponse] = js.native
  def updateshipment(
    params: ParamsResourceOrdersUpdateshipment,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrdersUpdateShipmentResponse]
  ): Unit = js.native
  /**
    * Updates a shipment's status, carrier, and/or tracking ID.
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
    *   const res = await content.orders.updateshipment({
    *     // The ID of the account that manages the order. This cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // The ID of the order.
    *     orderId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "carrier": "my_carrier",
    *       //   "deliveryDate": "my_deliveryDate",
    *       //   "operationId": "my_operationId",
    *       //   "shipmentId": "my_shipmentId",
    *       //   "status": "my_status",
    *       //   "trackingId": "my_trackingId"
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
  def updateshipment(params: ParamsResourceOrdersUpdateshipment, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateshipment(
    params: ParamsResourceOrdersUpdateshipment,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
