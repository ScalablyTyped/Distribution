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

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Localinventory")
@js.native
open class ResourceLocalinventory protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def custombatch(): GaxiosPromise[SchemaLocalinventoryCustomBatchResponse] = js.native
  def custombatch(callback: BodyResponseCallback[SchemaLocalinventoryCustomBatchResponse]): Unit = js.native
  def custombatch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLocalinventoryCustomBatchResponse] = js.native
  def custombatch(params: ParamsResourceLocalinventoryCustombatch): GaxiosPromise[SchemaLocalinventoryCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceLocalinventoryCustombatch,
    callback: BodyResponseCallback[SchemaLocalinventoryCustomBatchResponse]
  ): Unit = js.native
  def custombatch(
    params: ParamsResourceLocalinventoryCustombatch,
    options: BodyResponseCallback[Readable | SchemaLocalinventoryCustomBatchResponse],
    callback: BodyResponseCallback[Readable | SchemaLocalinventoryCustomBatchResponse]
  ): Unit = js.native
  def custombatch(params: ParamsResourceLocalinventoryCustombatch, options: MethodOptions): GaxiosPromise[SchemaLocalinventoryCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceLocalinventoryCustombatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLocalinventoryCustomBatchResponse]
  ): Unit = js.native
  /**
    * Updates local inventory for multiple products or stores in a single request.
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
    *   const res = await content.localinventory.custombatch({
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
  def custombatch(params: ParamsResourceLocalinventoryCustombatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def custombatch(
    params: ParamsResourceLocalinventoryCustombatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaLocalInventory] = js.native
  def insert(callback: BodyResponseCallback[SchemaLocalInventory]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLocalInventory] = js.native
  def insert(params: ParamsResourceLocalinventoryInsert): GaxiosPromise[SchemaLocalInventory] = js.native
  def insert(params: ParamsResourceLocalinventoryInsert, callback: BodyResponseCallback[SchemaLocalInventory]): Unit = js.native
  def insert(
    params: ParamsResourceLocalinventoryInsert,
    options: BodyResponseCallback[Readable | SchemaLocalInventory],
    callback: BodyResponseCallback[Readable | SchemaLocalInventory]
  ): Unit = js.native
  def insert(params: ParamsResourceLocalinventoryInsert, options: MethodOptions): GaxiosPromise[SchemaLocalInventory] = js.native
  def insert(
    params: ParamsResourceLocalinventoryInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLocalInventory]
  ): Unit = js.native
  /**
    * Updates the local inventory of a product in your Merchant Center account.
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
    *   const res = await content.localinventory.insert({
    *     // The ID of the account that contains the product. This account cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // The REST ID of the product for which to update local inventory.
    *     productId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "availability": "my_availability",
    *       //   "instoreProductLocation": "my_instoreProductLocation",
    *       //   "kind": "my_kind",
    *       //   "pickupMethod": "my_pickupMethod",
    *       //   "pickupSla": "my_pickupSla",
    *       //   "price": {},
    *       //   "quantity": 0,
    *       //   "salePrice": {},
    *       //   "salePriceEffectiveDate": "my_salePriceEffectiveDate",
    *       //   "storeCode": "my_storeCode"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "availability": "my_availability",
    *   //   "instoreProductLocation": "my_instoreProductLocation",
    *   //   "kind": "my_kind",
    *   //   "pickupMethod": "my_pickupMethod",
    *   //   "pickupSla": "my_pickupSla",
    *   //   "price": {},
    *   //   "quantity": 0,
    *   //   "salePrice": {},
    *   //   "salePriceEffectiveDate": "my_salePriceEffectiveDate",
    *   //   "storeCode": "my_storeCode"
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
  def insert(params: ParamsResourceLocalinventoryInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceLocalinventoryInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
