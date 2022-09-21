package typings.googleapis.v14Mod.adexchangebuyerV14

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.4", "adexchangebuyer_v1_4.Resource$Marketplacedeals")
@js.native
open class ResourceMarketplacedeals protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[SchemaDeleteOrderDealsResponse] = js.native
  def delete(callback: BodyResponseCallback[SchemaDeleteOrderDealsResponse]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDeleteOrderDealsResponse] = js.native
  def delete(params: ParamsResourceMarketplacedealsDelete): GaxiosPromise[SchemaDeleteOrderDealsResponse] = js.native
  def delete(
    params: ParamsResourceMarketplacedealsDelete,
    callback: BodyResponseCallback[SchemaDeleteOrderDealsResponse]
  ): Unit = js.native
  def delete(
    params: ParamsResourceMarketplacedealsDelete,
    options: BodyResponseCallback[Readable | SchemaDeleteOrderDealsResponse],
    callback: BodyResponseCallback[Readable | SchemaDeleteOrderDealsResponse]
  ): Unit = js.native
  def delete(params: ParamsResourceMarketplacedealsDelete, options: MethodOptions): GaxiosPromise[SchemaDeleteOrderDealsResponse] = js.native
  def delete(
    params: ParamsResourceMarketplacedealsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDeleteOrderDealsResponse]
  ): Unit = js.native
  /**
    * Delete the specified deals from the proposal
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer = google.adexchangebuyer('v1.4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adexchange.buyer'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adexchangebuyer.marketplacedeals.delete({
    *     // The proposalId to delete deals from.
    *     proposalId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "dealIds": [],
    *       //   "proposalRevisionNumber": "my_proposalRevisionNumber",
    *       //   "updateAction": "my_updateAction"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "deals": [],
    *   //   "proposalRevisionNumber": "my_proposalRevisionNumber"
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
  def delete(params: ParamsResourceMarketplacedealsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceMarketplacedealsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaAddOrderDealsResponse] = js.native
  def insert(callback: BodyResponseCallback[SchemaAddOrderDealsResponse]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAddOrderDealsResponse] = js.native
  def insert(params: ParamsResourceMarketplacedealsInsert): GaxiosPromise[SchemaAddOrderDealsResponse] = js.native
  def insert(
    params: ParamsResourceMarketplacedealsInsert,
    callback: BodyResponseCallback[SchemaAddOrderDealsResponse]
  ): Unit = js.native
  def insert(
    params: ParamsResourceMarketplacedealsInsert,
    options: BodyResponseCallback[Readable | SchemaAddOrderDealsResponse],
    callback: BodyResponseCallback[Readable | SchemaAddOrderDealsResponse]
  ): Unit = js.native
  def insert(params: ParamsResourceMarketplacedealsInsert, options: MethodOptions): GaxiosPromise[SchemaAddOrderDealsResponse] = js.native
  def insert(
    params: ParamsResourceMarketplacedealsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAddOrderDealsResponse]
  ): Unit = js.native
  /**
    * Add new deals for the specified proposal
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer = google.adexchangebuyer('v1.4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adexchange.buyer'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adexchangebuyer.marketplacedeals.insert({
    *     // proposalId for which deals need to be added.
    *     proposalId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "deals": [],
    *       //   "proposalRevisionNumber": "my_proposalRevisionNumber",
    *       //   "updateAction": "my_updateAction"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "deals": [],
    *   //   "proposalRevisionNumber": "my_proposalRevisionNumber"
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
  def insert(params: ParamsResourceMarketplacedealsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceMarketplacedealsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGetOrderDealsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGetOrderDealsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGetOrderDealsResponse] = js.native
  def list(params: ParamsResourceMarketplacedealsList): GaxiosPromise[SchemaGetOrderDealsResponse] = js.native
  def list(
    params: ParamsResourceMarketplacedealsList,
    callback: BodyResponseCallback[SchemaGetOrderDealsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceMarketplacedealsList,
    options: BodyResponseCallback[Readable | SchemaGetOrderDealsResponse],
    callback: BodyResponseCallback[Readable | SchemaGetOrderDealsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceMarketplacedealsList, options: MethodOptions): GaxiosPromise[SchemaGetOrderDealsResponse] = js.native
  def list(
    params: ParamsResourceMarketplacedealsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetOrderDealsResponse]
  ): Unit = js.native
  /**
    * List all the deals for a given proposal
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer = google.adexchangebuyer('v1.4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adexchange.buyer'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adexchangebuyer.marketplacedeals.list({
    *     // Query string to retrieve specific deals.
    *     pqlQuery: 'placeholder-value',
    *     // The proposalId to get deals for. To search across all proposals specify order_id = '-' as part of the URL.
    *     proposalId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "deals": []
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
  def list(params: ParamsResourceMarketplacedealsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceMarketplacedealsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaEditAllOrderDealsResponse] = js.native
  def update(callback: BodyResponseCallback[SchemaEditAllOrderDealsResponse]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEditAllOrderDealsResponse] = js.native
  def update(params: ParamsResourceMarketplacedealsUpdate): GaxiosPromise[SchemaEditAllOrderDealsResponse] = js.native
  def update(
    params: ParamsResourceMarketplacedealsUpdate,
    callback: BodyResponseCallback[SchemaEditAllOrderDealsResponse]
  ): Unit = js.native
  def update(
    params: ParamsResourceMarketplacedealsUpdate,
    options: BodyResponseCallback[Readable | SchemaEditAllOrderDealsResponse],
    callback: BodyResponseCallback[Readable | SchemaEditAllOrderDealsResponse]
  ): Unit = js.native
  def update(params: ParamsResourceMarketplacedealsUpdate, options: MethodOptions): GaxiosPromise[SchemaEditAllOrderDealsResponse] = js.native
  def update(
    params: ParamsResourceMarketplacedealsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEditAllOrderDealsResponse]
  ): Unit = js.native
  /**
    * Replaces all the deals in the proposal with the passed in deals
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer = google.adexchangebuyer('v1.4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adexchange.buyer'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adexchangebuyer.marketplacedeals.update({
    *     // The proposalId to edit deals on.
    *     proposalId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "deals": [],
    *       //   "proposal": {},
    *       //   "proposalRevisionNumber": "my_proposalRevisionNumber",
    *       //   "updateAction": "my_updateAction"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "deals": [],
    *   //   "orderRevisionNumber": "my_orderRevisionNumber"
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
  def update(params: ParamsResourceMarketplacedealsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceMarketplacedealsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
