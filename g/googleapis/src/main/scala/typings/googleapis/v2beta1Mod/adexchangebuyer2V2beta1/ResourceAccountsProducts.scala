package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adexchangebuyer2/v2beta1", "adexchangebuyer2_v2beta1.Resource$Accounts$Products")
@js.native
open class ResourceAccountsProducts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaProduct] = js.native
  def get(callback: BodyResponseCallback[SchemaProduct]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProduct] = js.native
  def get(params: ParamsResourceAccountsProductsGet): GaxiosPromise[SchemaProduct] = js.native
  def get(params: ParamsResourceAccountsProductsGet, callback: BodyResponseCallback[SchemaProduct]): Unit = js.native
  def get(
    params: ParamsResourceAccountsProductsGet,
    options: BodyResponseCallback[Readable | SchemaProduct],
    callback: BodyResponseCallback[Readable | SchemaProduct]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsProductsGet, options: MethodOptions): GaxiosPromise[SchemaProduct] = js.native
  def get(
    params: ParamsResourceAccountsProductsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProduct]
  ): Unit = js.native
  /**
    * Gets the requested product by ID.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer2.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer2 = google.adexchangebuyer2('v2beta1');
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
    *   const res = await adexchangebuyer2.accounts.products.get({
    *     // Account ID of the buyer.
    *     accountId: 'placeholder-value',
    *     // The ID for the product to get the head revision for.
    *     productId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "availableEndTime": "my_availableEndTime",
    *   //   "availableStartTime": "my_availableStartTime",
    *   //   "createTime": "my_createTime",
    *   //   "creatorContacts": [],
    *   //   "displayName": "my_displayName",
    *   //   "hasCreatorSignedOff": false,
    *   //   "productId": "my_productId",
    *   //   "productRevision": "my_productRevision",
    *   //   "publisherProfileId": "my_publisherProfileId",
    *   //   "seller": {},
    *   //   "syndicationProduct": "my_syndicationProduct",
    *   //   "targetingCriterion": [],
    *   //   "terms": {},
    *   //   "updateTime": "my_updateTime",
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
  def get(params: ParamsResourceAccountsProductsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsProductsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListProductsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListProductsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListProductsResponse] = js.native
  def list(params: ParamsResourceAccountsProductsList): GaxiosPromise[SchemaListProductsResponse] = js.native
  def list(
    params: ParamsResourceAccountsProductsList,
    callback: BodyResponseCallback[SchemaListProductsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsProductsList,
    options: BodyResponseCallback[Readable | SchemaListProductsResponse],
    callback: BodyResponseCallback[Readable | SchemaListProductsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsProductsList, options: MethodOptions): GaxiosPromise[SchemaListProductsResponse] = js.native
  def list(
    params: ParamsResourceAccountsProductsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListProductsResponse]
  ): Unit = js.native
  /**
    * List all products visible to the buyer (optionally filtered by the specified PQL query).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer2.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer2 = google.adexchangebuyer2('v2beta1');
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
    *   const res = await adexchangebuyer2.accounts.products.list({
    *     // Account ID of the buyer.
    *     accountId: 'placeholder-value',
    *     // An optional PQL query used to query for products. See https://developers.google.com/ad-manager/docs/pqlreference for documentation about PQL and examples. Nested repeated fields, such as product.targetingCriterion.inclusions, cannot be filtered.
    *     filter: 'placeholder-value',
    *     // Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default.
    *     pageSize: 'placeholder-value',
    *     // The page token as returned from ListProductsResponse.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
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
  def list(params: ParamsResourceAccountsProductsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsProductsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
