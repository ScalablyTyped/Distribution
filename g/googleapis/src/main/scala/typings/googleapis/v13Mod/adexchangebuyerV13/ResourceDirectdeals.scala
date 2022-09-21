package typings.googleapis.v13Mod.adexchangebuyerV13

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.3", "adexchangebuyer_v1_3.Resource$Directdeals")
@js.native
open class ResourceDirectdeals protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaDirectDeal] = js.native
  def get(callback: BodyResponseCallback[SchemaDirectDeal]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDirectDeal] = js.native
  def get(params: ParamsResourceDirectdealsGet): GaxiosPromise[SchemaDirectDeal] = js.native
  def get(params: ParamsResourceDirectdealsGet, callback: BodyResponseCallback[SchemaDirectDeal]): Unit = js.native
  def get(
    params: ParamsResourceDirectdealsGet,
    options: BodyResponseCallback[Readable | SchemaDirectDeal],
    callback: BodyResponseCallback[Readable | SchemaDirectDeal]
  ): Unit = js.native
  def get(params: ParamsResourceDirectdealsGet, options: MethodOptions): GaxiosPromise[SchemaDirectDeal] = js.native
  def get(
    params: ParamsResourceDirectdealsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDirectDeal]
  ): Unit = js.native
  /**
    * Gets one direct deal by ID.
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
    * const adexchangebuyer = google.adexchangebuyer('v1.3');
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
    *   const res = await adexchangebuyer.directDeals.get({
    *     // The direct deal id
    *     id: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": 0,
    *   //   "advertiser": "my_advertiser",
    *   //   "allowsAlcohol": false,
    *   //   "buyerAccountId": "my_buyerAccountId",
    *   //   "currencyCode": "my_currencyCode",
    *   //   "dealTier": "my_dealTier",
    *   //   "endTime": "my_endTime",
    *   //   "fixedCpm": "my_fixedCpm",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "privateExchangeMinCpm": "my_privateExchangeMinCpm",
    *   //   "publisherBlocksOverriden": false,
    *   //   "sellerNetwork": "my_sellerNetwork",
    *   //   "startTime": "my_startTime"
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
  def get(params: ParamsResourceDirectdealsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceDirectdealsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaDirectDealsList] = js.native
  def list(callback: BodyResponseCallback[SchemaDirectDealsList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDirectDealsList] = js.native
  def list(params: ParamsResourceDirectdealsList): GaxiosPromise[SchemaDirectDealsList] = js.native
  def list(params: ParamsResourceDirectdealsList, callback: BodyResponseCallback[SchemaDirectDealsList]): Unit = js.native
  def list(
    params: ParamsResourceDirectdealsList,
    options: BodyResponseCallback[Readable | SchemaDirectDealsList],
    callback: BodyResponseCallback[Readable | SchemaDirectDealsList]
  ): Unit = js.native
  def list(params: ParamsResourceDirectdealsList, options: MethodOptions): GaxiosPromise[SchemaDirectDealsList] = js.native
  def list(
    params: ParamsResourceDirectdealsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDirectDealsList]
  ): Unit = js.native
  /**
    * Retrieves the authenticated user's list of direct deals.
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
    * const adexchangebuyer = google.adexchangebuyer('v1.3');
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
    *   const res = await adexchangebuyer.directDeals.list({});
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "directDeals": [],
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
  def list(params: ParamsResourceDirectdealsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceDirectdealsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
