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

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Ordertrackingsignals")
@js.native
open class ResourceOrdertrackingsignals protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOrderTrackingSignal] = js.native
  def create(callback: BodyResponseCallback[SchemaOrderTrackingSignal]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrderTrackingSignal] = js.native
  def create(params: ParamsResourceOrdertrackingsignalsCreate): GaxiosPromise[SchemaOrderTrackingSignal] = js.native
  def create(
    params: ParamsResourceOrdertrackingsignalsCreate,
    callback: BodyResponseCallback[SchemaOrderTrackingSignal]
  ): Unit = js.native
  def create(
    params: ParamsResourceOrdertrackingsignalsCreate,
    options: BodyResponseCallback[Readable | SchemaOrderTrackingSignal],
    callback: BodyResponseCallback[Readable | SchemaOrderTrackingSignal]
  ): Unit = js.native
  def create(params: ParamsResourceOrdertrackingsignalsCreate, options: MethodOptions): GaxiosPromise[SchemaOrderTrackingSignal] = js.native
  def create(
    params: ParamsResourceOrdertrackingsignalsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrderTrackingSignal]
  ): Unit = js.native
  /**
    * Creates new order tracking signal.
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
    *   const res = await content.ordertrackingsignals.create({
    *     // The ID of the merchant for which the order signal is created.
    *     merchantId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "customerShippingFee": {},
    *       //   "deliveryPostalCode": "my_deliveryPostalCode",
    *       //   "deliveryRegionCode": "my_deliveryRegionCode",
    *       //   "lineItems": [],
    *       //   "merchantId": "my_merchantId",
    *       //   "orderCreatedTime": {},
    *       //   "orderId": "my_orderId",
    *       //   "orderTrackingSignalId": "my_orderTrackingSignalId",
    *       //   "shipmentLineItemMapping": [],
    *       //   "shippingInfo": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "customerShippingFee": {},
    *   //   "deliveryPostalCode": "my_deliveryPostalCode",
    *   //   "deliveryRegionCode": "my_deliveryRegionCode",
    *   //   "lineItems": [],
    *   //   "merchantId": "my_merchantId",
    *   //   "orderCreatedTime": {},
    *   //   "orderId": "my_orderId",
    *   //   "orderTrackingSignalId": "my_orderTrackingSignalId",
    *   //   "shipmentLineItemMapping": [],
    *   //   "shippingInfo": []
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
  def create(params: ParamsResourceOrdertrackingsignalsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceOrdertrackingsignalsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
