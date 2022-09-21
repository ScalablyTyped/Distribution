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

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Regionalinventory")
@js.native
open class ResourceRegionalinventory protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def custombatch(): GaxiosPromise[SchemaRegionalinventoryCustomBatchResponse] = js.native
  def custombatch(callback: BodyResponseCallback[SchemaRegionalinventoryCustomBatchResponse]): Unit = js.native
  def custombatch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRegionalinventoryCustomBatchResponse] = js.native
  def custombatch(params: ParamsResourceRegionalinventoryCustombatch): GaxiosPromise[SchemaRegionalinventoryCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceRegionalinventoryCustombatch,
    callback: BodyResponseCallback[SchemaRegionalinventoryCustomBatchResponse]
  ): Unit = js.native
  def custombatch(
    params: ParamsResourceRegionalinventoryCustombatch,
    options: BodyResponseCallback[Readable | SchemaRegionalinventoryCustomBatchResponse],
    callback: BodyResponseCallback[Readable | SchemaRegionalinventoryCustomBatchResponse]
  ): Unit = js.native
  def custombatch(params: ParamsResourceRegionalinventoryCustombatch, options: MethodOptions): GaxiosPromise[SchemaRegionalinventoryCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceRegionalinventoryCustombatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRegionalinventoryCustomBatchResponse]
  ): Unit = js.native
  /**
    * Updates regional inventory for multiple products or regions in a single request.
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
    *   const res = await content.regionalinventory.custombatch({
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
  def custombatch(params: ParamsResourceRegionalinventoryCustombatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def custombatch(
    params: ParamsResourceRegionalinventoryCustombatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaRegionalInventory] = js.native
  def insert(callback: BodyResponseCallback[SchemaRegionalInventory]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRegionalInventory] = js.native
  def insert(params: ParamsResourceRegionalinventoryInsert): GaxiosPromise[SchemaRegionalInventory] = js.native
  def insert(
    params: ParamsResourceRegionalinventoryInsert,
    callback: BodyResponseCallback[SchemaRegionalInventory]
  ): Unit = js.native
  def insert(
    params: ParamsResourceRegionalinventoryInsert,
    options: BodyResponseCallback[Readable | SchemaRegionalInventory],
    callback: BodyResponseCallback[Readable | SchemaRegionalInventory]
  ): Unit = js.native
  def insert(params: ParamsResourceRegionalinventoryInsert, options: MethodOptions): GaxiosPromise[SchemaRegionalInventory] = js.native
  def insert(
    params: ParamsResourceRegionalinventoryInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRegionalInventory]
  ): Unit = js.native
  /**
    * Updates the regional inventory of a product in your Merchant Center account. If a regional inventory with the same region ID already exists, this method updates that entry.
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
    *   const res = await content.regionalinventory.insert({
    *     // The ID of the account that contains the product. This account cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // The REST ID of the product for which to update the regional inventory.
    *     productId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "availability": "my_availability",
    *       //   "customAttributes": [],
    *       //   "kind": "my_kind",
    *       //   "price": {},
    *       //   "regionId": "my_regionId",
    *       //   "salePrice": {},
    *       //   "salePriceEffectiveDate": "my_salePriceEffectiveDate"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "availability": "my_availability",
    *   //   "customAttributes": [],
    *   //   "kind": "my_kind",
    *   //   "price": {},
    *   //   "regionId": "my_regionId",
    *   //   "salePrice": {},
    *   //   "salePriceEffectiveDate": "my_salePriceEffectiveDate"
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
  def insert(params: ParamsResourceRegionalinventoryInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceRegionalinventoryInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
