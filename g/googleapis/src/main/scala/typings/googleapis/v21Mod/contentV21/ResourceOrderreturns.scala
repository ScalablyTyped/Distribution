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

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Orderreturns")
@js.native
open class ResourceOrderreturns protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def acknowledge(): GaxiosPromise[SchemaOrderreturnsAcknowledgeResponse] = js.native
  def acknowledge(callback: BodyResponseCallback[SchemaOrderreturnsAcknowledgeResponse]): Unit = js.native
  def acknowledge(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrderreturnsAcknowledgeResponse] = js.native
  def acknowledge(params: ParamsResourceOrderreturnsAcknowledge): GaxiosPromise[SchemaOrderreturnsAcknowledgeResponse] = js.native
  def acknowledge(
    params: ParamsResourceOrderreturnsAcknowledge,
    callback: BodyResponseCallback[SchemaOrderreturnsAcknowledgeResponse]
  ): Unit = js.native
  def acknowledge(
    params: ParamsResourceOrderreturnsAcknowledge,
    options: BodyResponseCallback[Readable | SchemaOrderreturnsAcknowledgeResponse],
    callback: BodyResponseCallback[Readable | SchemaOrderreturnsAcknowledgeResponse]
  ): Unit = js.native
  def acknowledge(params: ParamsResourceOrderreturnsAcknowledge, options: MethodOptions): GaxiosPromise[SchemaOrderreturnsAcknowledgeResponse] = js.native
  def acknowledge(
    params: ParamsResourceOrderreturnsAcknowledge,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrderreturnsAcknowledgeResponse]
  ): Unit = js.native
  /**
    * Acks an order return in your Merchant Center account.
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
    *   const res = await content.orderreturns.acknowledge({
    *     // The ID of the account that manages the order. This cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // The ID of the return.
    *     returnId: 'placeholder-value',
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
  def acknowledge(params: ParamsResourceOrderreturnsAcknowledge, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def acknowledge(
    params: ParamsResourceOrderreturnsAcknowledge,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def createorderreturn(): GaxiosPromise[SchemaOrderreturnsCreateOrderReturnResponse] = js.native
  def createorderreturn(callback: BodyResponseCallback[SchemaOrderreturnsCreateOrderReturnResponse]): Unit = js.native
  def createorderreturn(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrderreturnsCreateOrderReturnResponse] = js.native
  def createorderreturn(params: ParamsResourceOrderreturnsCreateorderreturn): GaxiosPromise[SchemaOrderreturnsCreateOrderReturnResponse] = js.native
  def createorderreturn(
    params: ParamsResourceOrderreturnsCreateorderreturn,
    callback: BodyResponseCallback[SchemaOrderreturnsCreateOrderReturnResponse]
  ): Unit = js.native
  def createorderreturn(
    params: ParamsResourceOrderreturnsCreateorderreturn,
    options: BodyResponseCallback[Readable | SchemaOrderreturnsCreateOrderReturnResponse],
    callback: BodyResponseCallback[Readable | SchemaOrderreturnsCreateOrderReturnResponse]
  ): Unit = js.native
  def createorderreturn(params: ParamsResourceOrderreturnsCreateorderreturn, options: MethodOptions): GaxiosPromise[SchemaOrderreturnsCreateOrderReturnResponse] = js.native
  def createorderreturn(
    params: ParamsResourceOrderreturnsCreateorderreturn,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrderreturnsCreateOrderReturnResponse]
  ): Unit = js.native
  /**
    * Create return in your Merchant Center account.
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
    *   const res = await content.orderreturns.createorderreturn({
    *     // The ID of the account that manages the order. This cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "lineItems": [],
    *       //   "operationId": "my_operationId",
    *       //   "orderId": "my_orderId",
    *       //   "returnMethodType": "my_returnMethodType"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "executionStatus": "my_executionStatus",
    *   //   "kind": "my_kind",
    *   //   "orderReturn": {}
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
  def createorderreturn(params: ParamsResourceOrderreturnsCreateorderreturn, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def createorderreturn(
    params: ParamsResourceOrderreturnsCreateorderreturn,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaMerchantOrderReturn] = js.native
  def get(callback: BodyResponseCallback[SchemaMerchantOrderReturn]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMerchantOrderReturn] = js.native
  def get(params: ParamsResourceOrderreturnsGet): GaxiosPromise[SchemaMerchantOrderReturn] = js.native
  def get(params: ParamsResourceOrderreturnsGet, callback: BodyResponseCallback[SchemaMerchantOrderReturn]): Unit = js.native
  def get(
    params: ParamsResourceOrderreturnsGet,
    options: BodyResponseCallback[Readable | SchemaMerchantOrderReturn],
    callback: BodyResponseCallback[Readable | SchemaMerchantOrderReturn]
  ): Unit = js.native
  def get(params: ParamsResourceOrderreturnsGet, options: MethodOptions): GaxiosPromise[SchemaMerchantOrderReturn] = js.native
  def get(
    params: ParamsResourceOrderreturnsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMerchantOrderReturn]
  ): Unit = js.native
  /**
    * Retrieves an order return from your Merchant Center account.
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
    *   const res = await content.orderreturns.get({
    *     // The ID of the account that manages the order. This cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // Merchant order return ID generated by Google.
    *     returnId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "creationDate": "my_creationDate",
    *   //   "merchantOrderId": "my_merchantOrderId",
    *   //   "orderId": "my_orderId",
    *   //   "orderReturnId": "my_orderReturnId",
    *   //   "returnItems": [],
    *   //   "returnPricingInfo": {},
    *   //   "returnShipments": []
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
  def get(params: ParamsResourceOrderreturnsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceOrderreturnsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var labels: ResourceOrderreturnsLabels = js.native
  
  def list(): GaxiosPromise[SchemaOrderreturnsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaOrderreturnsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrderreturnsListResponse] = js.native
  def list(params: ParamsResourceOrderreturnsList): GaxiosPromise[SchemaOrderreturnsListResponse] = js.native
  def list(
    params: ParamsResourceOrderreturnsList,
    callback: BodyResponseCallback[SchemaOrderreturnsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceOrderreturnsList,
    options: BodyResponseCallback[Readable | SchemaOrderreturnsListResponse],
    callback: BodyResponseCallback[Readable | SchemaOrderreturnsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceOrderreturnsList, options: MethodOptions): GaxiosPromise[SchemaOrderreturnsListResponse] = js.native
  def list(
    params: ParamsResourceOrderreturnsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrderreturnsListResponse]
  ): Unit = js.native
  /**
    * Lists order returns in your Merchant Center account.
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
    *   const res = await content.orderreturns.list({
    *     // Obtains order returns that match the acknowledgement status. When set to true, obtains order returns that have been acknowledged. When false, obtains order returns that have not been acknowledged. When not provided, obtains order returns regardless of their acknowledgement status. We recommend using this filter set to `false`, in conjunction with the `acknowledge` call, such that only un-acknowledged order returns are returned.
    *     acknowledged: 'placeholder-value',
    *     // Obtains order returns created before this date (inclusively), in ISO 8601 format.
    *     createdEndDate: 'placeholder-value',
    *     // Obtains order returns created after this date (inclusively), in ISO 8601 format.
    *     createdStartDate: 'placeholder-value',
    *     // Obtains order returns with the specified order ids. If this parameter is provided, createdStartDate, createdEndDate, shipmentType, shipmentStatus, shipmentState and acknowledged parameters must be not set. Note: if googleOrderId and shipmentTrackingNumber parameters are provided, the obtained results will include all order returns that either match the specified order id or the specified tracking number.
    *     googleOrderIds: 'placeholder-value',
    *     // The maximum number of order returns to return in the response, used for paging. The default value is 25 returns per page, and the maximum allowed value is 250 returns per page.
    *     maxResults: 'placeholder-value',
    *     // The ID of the account that manages the order. This cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // Return the results in the specified order.
    *     orderBy: 'placeholder-value',
    *     // The token returned by the previous request.
    *     pageToken: 'placeholder-value',
    *     // Obtains order returns that match any shipment state provided in this parameter. When this parameter is not provided, order returns are obtained regardless of their shipment states.
    *     shipmentStates: 'placeholder-value',
    *     // Obtains order returns that match any shipment status provided in this parameter. When this parameter is not provided, order returns are obtained regardless of their shipment statuses.
    *     shipmentStatus: 'placeholder-value',
    *     // Obtains order returns with the specified tracking numbers. If this parameter is provided, createdStartDate, createdEndDate, shipmentType, shipmentStatus, shipmentState and acknowledged parameters must be not set. Note: if googleOrderId and shipmentTrackingNumber parameters are provided, the obtained results will include all order returns that either match the specified order id or the specified tracking number.
    *     shipmentTrackingNumbers: 'placeholder-value',
    *     // Obtains order returns that match any shipment type provided in this parameter. When this parameter is not provided, order returns are obtained regardless of their shipment types.
    *     shipmentTypes: 'placeholder-value',
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
  def list(params: ParamsResourceOrderreturnsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceOrderreturnsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def process(): GaxiosPromise[SchemaOrderreturnsProcessResponse] = js.native
  def process(callback: BodyResponseCallback[SchemaOrderreturnsProcessResponse]): Unit = js.native
  def process(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrderreturnsProcessResponse] = js.native
  def process(params: ParamsResourceOrderreturnsProcess): GaxiosPromise[SchemaOrderreturnsProcessResponse] = js.native
  def process(
    params: ParamsResourceOrderreturnsProcess,
    callback: BodyResponseCallback[SchemaOrderreturnsProcessResponse]
  ): Unit = js.native
  def process(
    params: ParamsResourceOrderreturnsProcess,
    options: BodyResponseCallback[Readable | SchemaOrderreturnsProcessResponse],
    callback: BodyResponseCallback[Readable | SchemaOrderreturnsProcessResponse]
  ): Unit = js.native
  def process(params: ParamsResourceOrderreturnsProcess, options: MethodOptions): GaxiosPromise[SchemaOrderreturnsProcessResponse] = js.native
  def process(
    params: ParamsResourceOrderreturnsProcess,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrderreturnsProcessResponse]
  ): Unit = js.native
  /**
    * Processes return in your Merchant Center account.
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
    *   const res = await content.orderreturns.process({
    *     // The ID of the account that manages the order. This cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // The ID of the return.
    *     returnId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "fullChargeReturnShippingCost": false,
    *       //   "operationId": "my_operationId",
    *       //   "refundShippingFee": {},
    *       //   "returnItems": []
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
  def process(params: ParamsResourceOrderreturnsProcess, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def process(
    params: ParamsResourceOrderreturnsProcess,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
