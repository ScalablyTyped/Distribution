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

@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.4", "adexchangebuyer_v1_4.Resource$Products")
@js.native
open class ResourceProducts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaProduct] = js.native
  def get(callback: BodyResponseCallback[SchemaProduct]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProduct] = js.native
  def get(params: ParamsResourceProductsGet): GaxiosPromise[SchemaProduct] = js.native
  def get(params: ParamsResourceProductsGet, callback: BodyResponseCallback[SchemaProduct]): Unit = js.native
  def get(
    params: ParamsResourceProductsGet,
    options: BodyResponseCallback[Readable | SchemaProduct],
    callback: BodyResponseCallback[Readable | SchemaProduct]
  ): Unit = js.native
  def get(params: ParamsResourceProductsGet, options: MethodOptions): GaxiosPromise[SchemaProduct] = js.native
  def get(
    params: ParamsResourceProductsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProduct]
  ): Unit = js.native
  /**
    * Gets the requested product by id.
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
    *   const res = await adexchangebuyer.products.get({
    *     // The id for the product to get the head revision for.
    *     productId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "billedBuyer": {},
    *   //   "buyer": {},
    *   //   "creationTimeMs": "my_creationTimeMs",
    *   //   "creatorContacts": [],
    *   //   "creatorRole": "my_creatorRole",
    *   //   "deliveryControl": {},
    *   //   "flightEndTimeMs": "my_flightEndTimeMs",
    *   //   "flightStartTimeMs": "my_flightStartTimeMs",
    *   //   "hasCreatorSignedOff": false,
    *   //   "inventorySource": "my_inventorySource",
    *   //   "kind": "my_kind",
    *   //   "labels": [],
    *   //   "lastUpdateTimeMs": "my_lastUpdateTimeMs",
    *   //   "legacyOfferId": "my_legacyOfferId",
    *   //   "marketplacePublisherProfileId": "my_marketplacePublisherProfileId",
    *   //   "name": "my_name",
    *   //   "privateAuctionId": "my_privateAuctionId",
    *   //   "productId": "my_productId",
    *   //   "publisherProfileId": "my_publisherProfileId",
    *   //   "publisherProvidedForecast": {},
    *   //   "revisionNumber": "my_revisionNumber",
    *   //   "seller": {},
    *   //   "sharedTargetings": [],
    *   //   "state": "my_state",
    *   //   "syndicationProduct": "my_syndicationProduct",
    *   //   "terms": {},
    *   //   "webPropertyCode": "my_webPropertyCode"
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
  def get(params: ParamsResourceProductsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProductsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def search(): GaxiosPromise[SchemaGetOffersResponse] = js.native
  def search(callback: BodyResponseCallback[SchemaGetOffersResponse]): Unit = js.native
  def search(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGetOffersResponse] = js.native
  def search(params: ParamsResourceProductsSearch): GaxiosPromise[SchemaGetOffersResponse] = js.native
  def search(params: ParamsResourceProductsSearch, callback: BodyResponseCallback[SchemaGetOffersResponse]): Unit = js.native
  def search(
    params: ParamsResourceProductsSearch,
    options: BodyResponseCallback[Readable | SchemaGetOffersResponse],
    callback: BodyResponseCallback[Readable | SchemaGetOffersResponse]
  ): Unit = js.native
  def search(params: ParamsResourceProductsSearch, options: MethodOptions): GaxiosPromise[SchemaGetOffersResponse] = js.native
  def search(
    params: ParamsResourceProductsSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetOffersResponse]
  ): Unit = js.native
  /**
    * Gets the requested product.
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
    *   const res = await adexchangebuyer.products.search({
    *     // The pql query used to query for products.
    *     pqlQuery: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "products": []
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
  def search(params: ParamsResourceProductsSearch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def search(
    params: ParamsResourceProductsSearch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
